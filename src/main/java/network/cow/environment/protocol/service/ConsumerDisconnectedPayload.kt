package network.cow.environment.protocol.service

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class ConsumerDisconnectedPayload(val consumerId: UUID) : ProducerBoundPayload
