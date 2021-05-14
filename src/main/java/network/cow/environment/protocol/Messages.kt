package network.cow.environment.protocol

import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat
import network.cow.environment.protocol.v1.AudioDefinition
import network.cow.environment.protocol.v1.AudioStartedEvent
import network.cow.environment.protocol.v1.AudioStoppedEvent
import network.cow.environment.protocol.v1.ConsumerConnectedEvent
import network.cow.environment.protocol.v1.ConsumerDisconnectedEvent
import network.cow.environment.protocol.v1.ConsumerRegisteredEvent
import network.cow.environment.protocol.v1.FadeAudioRequest
import network.cow.environment.protocol.v1.PannerAttributes
import network.cow.environment.protocol.v1.PlayAudioRequest
import network.cow.environment.protocol.v1.RegisterConsumerRequest
import network.cow.environment.protocol.v1.Sprite
import network.cow.environment.protocol.v1.StopAudioRequest
import network.cow.environment.protocol.v1.UnregisterConsumerRequest
import network.cow.environment.protocol.v1.UpdateAudioRequest
import network.cow.environment.protocol.v1.Vector
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.lang.reflect.Method

/**
 * @author Benedikt Wüller
 */
object Messages {

    private val parseMethods = mutableMapOf<String, Method>()
    private val builderMethods = mutableMapOf<String, Method>()

    fun toBytes(message: Message) : ByteArray {
        val outputStream = ByteArrayOutputStream()
        val data = DataOutputStream(outputStream)
        val type = message.javaClass.name
        data.writeInt(type.length)
        data.write(type.toByteArray(Charsets.UTF_8))
        data.write(message.toByteArray())

        val bytes = outputStream.toByteArray()
        data.close()
        return bytes
    }

    fun fromBytes(bytes: ByteArray) : Message {
        val inputStream = ByteArrayInputStream(bytes)
        val data = DataInputStream(inputStream)

        val typeLength = data.readInt()
        val typeBytes = ByteArray(typeLength)
        data.readFully(typeBytes)
        val type = String(typeBytes, Charsets.UTF_8)

        val method = this.parseMethods.getOrPut(type) {
            val javaClass = Class.forName(type)
            javaClass.getDeclaredMethod("parseFrom", ByteArray::class.java)
        }

        val messageBytes = data.readAllBytes()
        val message = method.invoke(null, messageBytes) as Message
        data.close()
        return message
    }

    fun toJsonWithTypePrefix(message: Message) : String {
        return message.javaClass.name + ";" + JsonFormat.printer().omittingInsignificantWhitespace().includingDefaultValueFields().print(message)
    }

    fun fromJsonWithTypePrefix(json: String) : Message {
        val parts = json.split(";", limit = 2)
        val type = parts.first()
        val method = this.builderMethods.getOrPut(type) { Class.forName(parts.first()).getDeclaredMethod("newBuilder") }
        val builder = method.invoke(null) as Message.Builder
        JsonFormat.parser().merge(parts.last(), builder)
        return builder.build()
    }

    fun validate(message: Message) : Boolean {
        return when (message) {
            is RegisterConsumerRequest -> message.contextId.isNotEmpty()
            is UnregisterConsumerRequest -> message.consumerId.isNotEmpty()
            is AudioStartedEvent -> message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            is AudioStoppedEvent -> message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            is ConsumerConnectedEvent -> message.consumerId.isNotEmpty()
            is ConsumerDisconnectedEvent -> message.consumerId.isNotEmpty()
            is ConsumerRegisteredEvent -> message.consumerId.isNotEmpty() && message.contextId.isNotEmpty() && message.url.isNotEmpty()
            is FadeAudioRequest -> message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            is StopAudioRequest -> message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            is PlayAudioRequest -> {
                if (message.hasSprite() && !this.validateSprite(message.sprite)) return false
                if (message.hasPosition() && !this.validateVector(message.position)) return false
                if (message.hasPannerAttributes() && !this.validatePannerAttributes(message.pannerAttributes)) return false
                if (message.hasDefinition() && !this.validateDefinition(message.definition)) return false
                if (message.hasKey() && message.key.isNotEmpty()) return false
                if (!message.hasDefinition() && !message.hasKey()) return false
                return message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            }
            is UpdateAudioRequest -> {
                if (message.hasPosition() && !this.validateVector(message.position)) return false
                if (message.hasPannerAttributes() && !this.validatePannerAttributes(message.pannerAttributes)) return false
                return message.consumerId.isNotEmpty() && message.id.isNotEmpty()
            }
            else -> error("The message type ${message.javaClass.name} is not supported.")
        }
    }

    fun validateSprite(sprite: Sprite) = true

    fun validateVector(vector: Vector) = true

    fun validatePannerAttributes(pannerAttributes: PannerAttributes) : Boolean {
        return pannerAttributes.distanceModel.isNotEmpty()
    }

    fun validateDefinition(definition: AudioDefinition) : Boolean {
        return definition.key.isNotEmpty() && definition.name.isNotEmpty() && definition.url.isNotEmpty()
    }

}
