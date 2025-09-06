package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Timestamp extends GeneratedMessageLite implements TimestampOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements TimestampOrBuilder {
        public Builder clearNanos() {
            this.copyOnWrite();
            Timestamp.t(((Timestamp)this.instance));
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            Timestamp.r(((Timestamp)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public int getNanos() {
            return ((Timestamp)this.instance).getNanos();
        }

        @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public long getSeconds() {
            return ((Timestamp)this.instance).getSeconds();
        }

        public Builder setNanos(int v) {
            this.copyOnWrite();
            Timestamp.s(((Timestamp)this.instance), v);
            return this;
        }

        public Builder setSeconds(long v) {
            this.copyOnWrite();
            Timestamp.q(((Timestamp)this.instance), v);
            return this;
        }
    }

    private static final Timestamp DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp0 = new Timestamp();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        Timestamp.DEFAULT_INSTANCE = timestamp0;
        GeneratedMessageLite.registerDefaultInstance(Timestamp.class, timestamp0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(s3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Timestamp();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(Timestamp.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            }
            case 4: {
                return Timestamp.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Timestamp.PARSER;
                if(parser0 == null) {
                    Class class0 = Timestamp.class;
                    synchronized(class0) {
                        parser0 = Timestamp.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Timestamp.DEFAULT_INSTANCE);
                            Timestamp.PARSER = parser0;
                        }
                    }
                }
                return parser0;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static Timestamp getDefaultInstance() {
        return Timestamp.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Builder newBuilder() {
        return (Builder)Timestamp.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Timestamp timestamp0) {
        return (Builder)Timestamp.DEFAULT_INSTANCE.createBuilder(timestamp0);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseDelimitedFrom(Timestamp.DEFAULT_INSTANCE, inputStream0);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseDelimitedFrom(Timestamp.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Timestamp parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, byteString0);
    }

    public static Timestamp parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Timestamp parseFrom(InputStream inputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, inputStream0);
    }

    public static Timestamp parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Timestamp parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, arr_b);
    }

    public static Timestamp parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.parseFrom(Timestamp.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Timestamp.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Timestamp timestamp0, long v) {
        timestamp0.seconds_ = v;
    }

    public static void r(Timestamp timestamp0) {
        timestamp0.seconds_ = 0L;
    }

    public static void s(Timestamp timestamp0, int v) {
        timestamp0.nanos_ = v;
    }

    public static void t(Timestamp timestamp0) {
        timestamp0.nanos_ = 0;
    }
}

