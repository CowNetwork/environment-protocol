package network.cow.environment.protocol

import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.lang.reflect.Method

/**
 * @author Benedikt Wüller
 */
object ProtocolConverter {

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

}
