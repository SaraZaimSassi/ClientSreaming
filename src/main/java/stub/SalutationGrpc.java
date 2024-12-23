package stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Salutation.proto")
public final class SalutationGrpc {

  private SalutationGrpc() {}

  public static final String SERVICE_NAME = "Salutation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stub.SalutationOuterClass.SalutRequest,
      stub.SalutationOuterClass.SalutResponse> getMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "message",
      requestType = stub.SalutationOuterClass.SalutRequest.class,
      responseType = stub.SalutationOuterClass.SalutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<stub.SalutationOuterClass.SalutRequest,
      stub.SalutationOuterClass.SalutResponse> getMessageMethod() {
    io.grpc.MethodDescriptor<stub.SalutationOuterClass.SalutRequest, stub.SalutationOuterClass.SalutResponse> getMessageMethod;
    if ((getMessageMethod = SalutationGrpc.getMessageMethod) == null) {
      synchronized (SalutationGrpc.class) {
        if ((getMessageMethod = SalutationGrpc.getMessageMethod) == null) {
          SalutationGrpc.getMessageMethod = getMessageMethod = 
              io.grpc.MethodDescriptor.<stub.SalutationOuterClass.SalutRequest, stub.SalutationOuterClass.SalutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Salutation", "message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.SalutationOuterClass.SalutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.SalutationOuterClass.SalutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SalutationMethodDescriptorSupplier("message"))
                  .build();
          }
        }
     }
     return getMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalutationStub newStub(io.grpc.Channel channel) {
    return new SalutationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalutationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SalutationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalutationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SalutationFutureStub(channel);
  }

  /**
   */
  public static abstract class SalutationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<stub.SalutationOuterClass.SalutRequest> message(
        io.grpc.stub.StreamObserver<stub.SalutationOuterClass.SalutResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                stub.SalutationOuterClass.SalutRequest,
                stub.SalutationOuterClass.SalutResponse>(
                  this, METHODID_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SalutationStub extends io.grpc.stub.AbstractStub<SalutationStub> {
    private SalutationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalutationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalutationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalutationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<stub.SalutationOuterClass.SalutRequest> message(
        io.grpc.stub.StreamObserver<stub.SalutationOuterClass.SalutResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SalutationBlockingStub extends io.grpc.stub.AbstractStub<SalutationBlockingStub> {
    private SalutationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalutationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalutationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalutationBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SalutationFutureStub extends io.grpc.stub.AbstractStub<SalutationFutureStub> {
    private SalutationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalutationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalutationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalutationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SalutationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SalutationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.message(
              (io.grpc.stub.StreamObserver<stub.SalutationOuterClass.SalutResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SalutationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalutationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stub.SalutationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Salutation");
    }
  }

  private static final class SalutationFileDescriptorSupplier
      extends SalutationBaseDescriptorSupplier {
    SalutationFileDescriptorSupplier() {}
  }

  private static final class SalutationMethodDescriptorSupplier
      extends SalutationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SalutationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SalutationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalutationFileDescriptorSupplier())
              .addMethod(getMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
