// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_events.proto

package network.cow.environment.protocol.v1;

public interface ConsumerRegisteredEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.environment.v1.ConsumerRegisteredEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string context_id = 1;</code>
   * @return The contextId.
   */
  java.lang.String getContextId();
  /**
   * <code>string context_id = 1;</code>
   * @return The bytes for contextId.
   */
  com.google.protobuf.ByteString
      getContextIdBytes();

  /**
   * <code>string consumer_id = 2;</code>
   * @return The consumerId.
   */
  java.lang.String getConsumerId();
  /**
   * <code>string consumer_id = 2;</code>
   * @return The bytes for consumerId.
   */
  com.google.protobuf.ByteString
      getConsumerIdBytes();

  /**
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
