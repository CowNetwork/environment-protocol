package network.cow.environment.protocol

import kotlin.reflect.KProperty0

/**
 * @author Benedikt Wüller
 */
interface Payload {

    val type: String; get() = PayloadRegistry.getType(this)

}
