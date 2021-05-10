package network.cow.environment.protocol.service

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class ConsumerConnectedPayload(val consumerId: UUID) : ProducerBoundPayload
