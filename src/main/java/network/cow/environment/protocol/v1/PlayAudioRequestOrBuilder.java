// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consumer_requests.proto

package network.cow.environment.protocol.v1;

public interface PlayAudioRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.environment.v1.PlayAudioRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string consumer_id = 1;</code>
   * @return The consumerId.
   */
  java.lang.String getConsumerId();
  /**
   * <code>string consumer_id = 1;</code>
   * @return The bytes for consumerId.
   */
  com.google.protobuf.ByteString
      getConsumerIdBytes();

  /**
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>double volume = 4;</code>
   * @return The volume.
   */
  double getVolume();

  /**
   * <code>double rate = 5;</code>
   * @return The rate.
   */
  double getRate();

  /**
   * <code>bool loop = 6;</code>
   * @return The loop.
   */
  boolean getLoop();

  /**
   * <code>int32 loopFadeDuration = 7;</code>
   * @return The loopFadeDuration.
   */
  int getLoopFadeDuration();

  /**
   * <code>.cow.environment.v1.Sprite sprite = 8;</code>
   * @return Whether the sprite field is set.
   */
  boolean hasSprite();
  /**
   * <code>.cow.environment.v1.Sprite sprite = 8;</code>
   * @return The sprite.
   */
  network.cow.environment.protocol.v1.Sprite getSprite();
  /**
   * <code>.cow.environment.v1.Sprite sprite = 8;</code>
   */
  network.cow.environment.protocol.v1.SpriteOrBuilder getSpriteOrBuilder();

  /**
   * <code>.cow.environment.v1.Vector position = 9;</code>
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <code>.cow.environment.v1.Vector position = 9;</code>
   * @return The position.
   */
  network.cow.environment.protocol.v1.Vector getPosition();
  /**
   * <code>.cow.environment.v1.Vector position = 9;</code>
   */
  network.cow.environment.protocol.v1.VectorOrBuilder getPositionOrBuilder();

  /**
   * <code>.cow.environment.v1.PannerAttributes pannerAttributes = 10;</code>
   * @return Whether the pannerAttributes field is set.
   */
  boolean hasPannerAttributes();
  /**
   * <code>.cow.environment.v1.PannerAttributes pannerAttributes = 10;</code>
   * @return The pannerAttributes.
   */
  network.cow.environment.protocol.v1.PannerAttributes getPannerAttributes();
  /**
   * <code>.cow.environment.v1.PannerAttributes pannerAttributes = 10;</code>
   */
  network.cow.environment.protocol.v1.PannerAttributesOrBuilder getPannerAttributesOrBuilder();
}