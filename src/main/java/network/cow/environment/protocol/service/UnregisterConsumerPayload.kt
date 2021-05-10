package network.cow.environment.protocol.service

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class UnregisterConsumerPayload(val consumerId: UUID) : ServiceBoundPayload
