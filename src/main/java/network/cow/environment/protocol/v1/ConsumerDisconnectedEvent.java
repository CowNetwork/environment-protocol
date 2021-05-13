// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_events.proto

package network.cow.environment.protocol.v1;

/**
 * Protobuf type {@code cow.environment.v1.ConsumerDisconnectedEvent}
 */
public final class ConsumerDisconnectedEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.environment.v1.ConsumerDisconnectedEvent)
    ConsumerDisconnectedEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumerDisconnectedEvent.newBuilder() to construct.
  private ConsumerDisconnectedEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumerDisconnectedEvent() {
    consumerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumerDisconnectedEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsumerDisconnectedEvent(
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
    return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerDisconnectedEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.class, network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof network.cow.environment.protocol.v1.ConsumerDisconnectedEvent)) {
      return super.equals(obj);
    }
    network.cow.environment.protocol.v1.ConsumerDisconnectedEvent other = (network.cow.environment.protocol.v1.ConsumerDisconnectedEvent) obj;

    if (!getConsumerId()
        .equals(other.getConsumerId())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parseFrom(
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
  public static Builder newBuilder(network.cow.environment.protocol.v1.ConsumerDisconnectedEvent prototype) {
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
   * Protobuf type {@code cow.environment.v1.ConsumerDisconnectedEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.environment.v1.ConsumerDisconnectedEvent)
      network.cow.environment.protocol.v1.ConsumerDisconnectedEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerDisconnectedEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.class, network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.Builder.class);
    }

    // Construct using network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.environment.protocol.v1.ServiceEvents.internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor;
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerDisconnectedEvent getDefaultInstanceForType() {
      return network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerDisconnectedEvent build() {
      network.cow.environment.protocol.v1.ConsumerDisconnectedEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.environment.protocol.v1.ConsumerDisconnectedEvent buildPartial() {
      network.cow.environment.protocol.v1.ConsumerDisconnectedEvent result = new network.cow.environment.protocol.v1.ConsumerDisconnectedEvent(this);
      result.consumerId_ = consumerId_;
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
      if (other instanceof network.cow.environment.protocol.v1.ConsumerDisconnectedEvent) {
        return mergeFrom((network.cow.environment.protocol.v1.ConsumerDisconnectedEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.environment.protocol.v1.ConsumerDisconnectedEvent other) {
      if (other == network.cow.environment.protocol.v1.ConsumerDisconnectedEvent.getDefaultInstance()) return this;
      if (!other.getConsumerId().isEmpty()) {
        consumerId_ = other.consumerId_;
        onChanged();
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
      network.cow.environment.protocol.v1.ConsumerDisconnectedEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.environment.protocol.v1.ConsumerDisconnectedEvent) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:cow.environment.v1.ConsumerDisconnectedEvent)
  }

  // @@protoc_insertion_point(class_scope:cow.environment.v1.ConsumerDisconnectedEvent)
  private static final network.cow.environment.protocol.v1.ConsumerDisconnectedEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.environment.protocol.v1.ConsumerDisconnectedEvent();
  }

  public static network.cow.environment.protocol.v1.ConsumerDisconnectedEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerDisconnectedEvent>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerDisconnectedEvent>() {
    @java.lang.Override
    public ConsumerDisconnectedEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsumerDisconnectedEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsumerDisconnectedEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsumerDisconnectedEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.environment.protocol.v1.ConsumerDisconnectedEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

