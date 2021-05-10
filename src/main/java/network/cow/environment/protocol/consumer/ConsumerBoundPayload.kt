package network.cow.environment.protocol.consumer

import network.cow.environment.protocol.Payload
import java.util.UUID

/**
 * @author Benedikt Wüller
 */
open class ConsumerBoundPayload(val consumerId: UUID) : Payload
