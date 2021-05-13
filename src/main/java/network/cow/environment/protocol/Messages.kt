package network.cow.environment.protocol

import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat
import network.cow.environment.protocol.v1.AudioStartedEvent
import network.cow.environment.protocol.v1.AudioStoppedEvent
import network.cow.environment.protocol.v1.ConsumerConnectedEvent
import network.cow.environment.protocol.v1.ConsumerDisconnectedEvent
import network.cow.environment.protocol.v1.ConsumerRegisteredEvent
import network.cow.environment.protocol.v1.FadeAudioRequest
import network.cow.environment.protocol.v1.PannerAttributes
import network.cow.environment.protocol.v1.PlayAudioRequest
import network.cow.environment.protocol.v1.Sprite
import network.cow.environment.protocol.v1.StopAudioRequest
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
        return message.javaClass.name + ";" + JsonFormat.printer().omittingInsignificantWhitespace().print(message)
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
            is AudioStartedEvent -> message.consumerId != null && message.id != null
            is AudioStoppedEvent -> message.consumerId != null && message.id != null
            is ConsumerConnectedEvent -> message.consumerId != null
            is ConsumerDisconnectedEvent -> message.consumerId != null
            is ConsumerRegisteredEvent -> message.consumerId != null && message.contextId != null && message.url != null
            is FadeAudioRequest -> message.consumerId != null && message.id != null
            is StopAudioRequest -> message.consumerId != null && message.id != null
            is PlayAudioRequest -> {
                message.consumerId != null && message.id != null && message.key != null
                        && (message.sprite?.let { this.validateSprite(it) } ?: true)
                        && (message.position?.let { this.validateVector(it) } ?: true)
                        && (message.pannerAttributes?.let { this.validatePannerAttributes(it) } ?: true)
            }
            is UpdateAudioRequest -> {
                message.consumerId != null && message.id != null
                        && (message.position?.let { this.validateVector(it) } ?: true)
                        && (message.pannerAttributes?.let { this.validatePannerAttributes(it) } ?: true)
            }
            else -> error("The message type ${message.javaClass.name} is not supported.")
        }
    }

    fun validateSprite(sprite: Sprite) = true

    fun validateVector(vector: Vector) = true

    fun validatePannerAttributes(pannerAttributes: PannerAttributes) = pannerAttributes.distanceModel != null

}
