package network.cow.environment.protocol

/**
 * @author Benedikt Wüller
 */
interface Payload {

    val type: String; get() = PayloadRegistry.getType(this)

}
