package network.cow.environment.protocol.service

import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class RegisterConsumerPayload(val contextId: UUID) : ServiceBoundPayload
