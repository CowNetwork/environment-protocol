package network.cow.environment.protocol.consumer

import network.cow.environment.protocol.Point3D
import java.util.UUID

/**
 * @author Benedikt Wüller
 */
class SetPositionPayload(consumerId: UUID, val position: Point3D, val vectorFront: Point3D, val vectorUp: Point3D)
    : ConsumerBoundPayload(consumerId)
