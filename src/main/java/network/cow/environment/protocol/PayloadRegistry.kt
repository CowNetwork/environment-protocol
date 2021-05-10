package network.cow.environment.protocol

import com.google.gson.GsonBuilder
import network.cow.environment.protocol.consumer.FadeAudioPayload
import network.cow.environment.protocol.consumer.PlayAudioPayload
import network.cow.environment.protocol.consumer.SetPositionPayload
import network.cow.environment.protocol.consumer.StopAudioPayload
import network.cow.environment.protocol.consumer.UpdateAudioPayload
import network.cow.environment.protocol.service.ConsumerConnectedPayload
import network.cow.environment.protocol.service.ConsumerDisconnectedPayload
import network.cow.environment.protocol.service.ConsumerRegisteredPayload
import network.cow.environment.protocol.service.RegisterConsumerPayload
import network.cow.environment.protocol.service.UnregisterConsumerPayload

/**
 * @author Benedikt Wüller
 */
object PayloadRegistry {

    private val gson = GsonBuilder().create()

    private val types = mapOf(
            "register_consumer" to RegisterConsumerPayload::class.java,
            "unregister_consumer" to UnregisterConsumerPayload::class.java,
            "consumer_registered" to ConsumerRegisteredPayload::class.java,
            "consumer_connected" to ConsumerConnectedPayload::class.java,
            "consumer_disconnected" to ConsumerDisconnectedPayload::class.java,
            "set_position" to SetPositionPayload::class.java,
            "play_audio" to PlayAudioPayload::class.java,
            "update_audio" to UpdateAudioPayload::class.java,
            "fade_audio" to FadeAudioPayload::class.java,
            "stop_audio" to StopAudioPayload::class.java
    )

    fun getType(payload: Payload) = types.entries.first { it.value == payload.javaClass }.key

    fun parsePayload(type: String, json: String) : Payload {
        val javaClass = types[type] ?: TODO("error")
        return gson.fromJson(json, javaClass)
    }

}
