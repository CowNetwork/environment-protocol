package network.cow.environment.protocol.consumer

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class FadeAudioPayload(consumerId: UUID, val id: UUID, val volume: Double, val duration: Int) : ConsumerBoundPayload(consumerId)
