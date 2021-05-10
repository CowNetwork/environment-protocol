package network.cow.environment.protocol.consumer

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class AudioStartedPayload(consumerId: UUID, val id: UUID) : ProducerBoundPayload(consumerId)
