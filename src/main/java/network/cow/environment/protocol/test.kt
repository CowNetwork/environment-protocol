package network.cow.environment.protocol

import network.cow.environment.protocol.v1.AudioStartedEvent
import java.util.UUID

/**
 * @author Benedikt Wüller
 */

fun main() {
    val message = AudioStartedEvent.newBuilder().setId(UUID.randomUUID().toString()).setConsumerId(UUID.randomUUID().toString()).build()

    val json = ProtocolConverter.toJsonWithTypePrefix(message)
    val fromJson = ProtocolConverter.fromJsonWithTypePrefix(json)

    val bytes = ProtocolConverter.toBytes(message)
    val fromBytes = ProtocolConverter.fromBytes(bytes)

    val foo = "bar"
}
