package network.cow.environment.protocol

/**
 * @author Benedikt Wüller
 */
open class Message(val type: String, val payload: Payload) {
    val apiVersion: Int = 1
}
