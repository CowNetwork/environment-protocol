// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_events.proto

package network.cow.environment.protocol.v1;

/**
 * Protobuf type {@code cow.environment.v1.ConsumerChangedInstanceEvent}
 */
public final class ConsumerChangedInstanceEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.environment.v1.ConsumerChangedInstanceEvent)
    ConsumerChangedInstanceEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumerChangedInstanceEvent.newBuilder() to construct.
  private ConsumerChangedInstanceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumerChangedInstanceEvent() {
    consumerId_ = "";
    host_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumerChangedInstanceEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsumerChangedInstanceEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            consumerId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 32: {

            port_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.class, network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.Builder.class);
  }

  public static final int CONSUMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object consumerId_;
  /**
   * <code>string consumer_id = 1;</code>
   * @return The consumerId.
   */
  @java.lang.Override
  public java.lang.String getConsumerId() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumerId_ = s;
      return s;
    }
  }
  /**
   * <code>string consumer_id = 1;</code>
   * @return The bytes for consumerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsumerIdBytes() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consumerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOST_FIELD_NUMBER = 3;
  private volatile java.lang.Object host_;
  /**
   * <code>string host = 3;</code>
   * @return The host.
   */
  @java.lang.Override
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <code>string host = 3;</code>
   * @return The bytes for host.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 4;
  private int port_;
  /**
   * <code>int32 port = 4;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getConsumerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, consumerId_);
    }
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, host_);
    }
    if (port_ != 0) {
      output.writeInt32(4, port_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getConsumerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, consumerId_);
    }
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, host_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, port_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent)) {
      return super.equals(obj);
    }
    network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent other = (network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent) obj;

    if (!getConsumerId()
        .equals(other.getConsumerId())) return false;
    if (!getHost()
        .equals(other.getHost())) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONSUMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConsumerId().hashCode();
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cow.environment.v1.ConsumerChangedInstanceEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.environment.v1.ConsumerChangedInstanceEvent)
      network.cow.environment.protocol.v1.ConsumerChangedInstanceEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.class, network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.Builder.class);
    }

    // Construct using network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      consumerId_ = "";

      host_ = "";

      port_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor;
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent getDefaultInstanceForType() {
      return network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent build() {
      network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent buildPartial() {
      network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent result = new network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent(this);
      result.consumerId_ = consumerId_;
      result.host_ = host_;
      result.port_ = port_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent) {
        return mergeFrom((network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent other) {
      if (other == network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent.getDefaultInstance()) return this;
      if (!other.getConsumerId().isEmpty()) {
        consumerId_ = other.consumerId_;
        onChanged();
      }
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object consumerId_ = "";
    /**
     * <code>string consumer_id = 1;</code>
     * @return The consumerId.
     */
    public java.lang.String getConsumerId() {
      java.lang.Object ref = consumerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @return The bytes for consumerId.
     */
    public com.google.protobuf.ByteString
        getConsumerIdBytes() {
      java.lang.Object ref = consumerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @param value The consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      consumerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumerId() {
      
      consumerId_ = getDefaultInstance().getConsumerId();
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @param value The bytes for consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      consumerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object host_ = "";
    /**
     * <code>string host = 3;</code>
     * @return The host.
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string host = 3;</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host = 3;</code>
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string host = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <code>string host = 3;</code>
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>int32 port = 4;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>int32 port = 4;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 port = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cow.environment.v1.ConsumerChangedInstanceEvent)
  }

  // @@protoc_insertion_point(class_scope:cow.environment.v1.ConsumerChangedInstanceEvent)
  private static final network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent();
  }

  public static network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerChangedInstanceEvent>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerChangedInstanceEvent>() {
    @java.lang.Override
    public ConsumerChangedInstanceEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsumerChangedInstanceEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsumerChangedInstanceEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsumerChangedInstanceEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.environment.protocol.v1.ConsumerChangedInstanceEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
