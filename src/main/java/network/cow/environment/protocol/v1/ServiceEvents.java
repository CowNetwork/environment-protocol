// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_events.proto

package network.cow.environment.protocol.v1;

public final class ServiceEvents {
  private ServiceEvents() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_environment_v1_ConsumerRegisteredEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_environment_v1_ConsumerRegisteredEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_environment_v1_ConsumerConnectedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_environment_v1_ConsumerConnectedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_environment_v1_ConsumerDisconnectedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024service_events.proto\022\022cow.environment." +
      "v1\"O\n\027ConsumerRegisteredEvent\022\022\n\ncontext" +
      "_id\030\001 \001(\t\022\023\n\013consumer_id\030\002 \001(\t\022\013\n\003url\030\003 " +
      "\001(\t\"-\n\026ConsumerConnectedEvent\022\023\n\013consume" +
      "r_id\030\001 \001(\t\"0\n\031ConsumerDisconnectedEvent\022" +
      "\023\n\013consumer_id\030\001 \001(\t\"O\n\034ConsumerChangedI" +
      "nstanceEvent\022\023\n\013consumer_id\030\001 \001(\t\022\014\n\004hos" +
      "t\030\003 \001(\t\022\014\n\004port\030\004 \001(\005B\'\n#network.cow.env" +
      "ironment.protocol.v1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_cow_environment_v1_ConsumerRegisteredEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cow_environment_v1_ConsumerRegisteredEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_environment_v1_ConsumerRegisteredEvent_descriptor,
        new java.lang.String[] { "ContextId", "ConsumerId", "Url", });
    internal_static_cow_environment_v1_ConsumerConnectedEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cow_environment_v1_ConsumerConnectedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_environment_v1_ConsumerConnectedEvent_descriptor,
        new java.lang.String[] { "ConsumerId", });
    internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cow_environment_v1_ConsumerDisconnectedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_environment_v1_ConsumerDisconnectedEvent_descriptor,
        new java.lang.String[] { "ConsumerId", });
    internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_environment_v1_ConsumerChangedInstanceEvent_descriptor,
        new java.lang.String[] { "ConsumerId", "Host", "Port", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
