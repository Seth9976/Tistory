package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration extends GeneratedMessageLite implements DurationOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements DurationOrBuilder {
        public Builder clearNanos() {
            this.copyOnWrite();
            Duration.t(((Duration)this.instance));
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            Duration.r(((Duration)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public int getNanos() {
            return ((Duration)this.instance).getNanos();
        }

        @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public long getSeconds() {
            return ((Duration)this.instance).getSeconds();
        }

        public Builder setNanos(int v) {
            this.copyOnWrite();
            Duration.s(((Duration)this.instance), v);
            return this;
        }

        public Builder setSeconds(long v) {
            this.copyOnWrite();
            Duration.q(((Duration)this.instance), v);
            return this;
        }
    }

    private static final Duration DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Duration duration0 = new Duration();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        Duration.DEFAULT_INSTANCE = duration0;
        GeneratedMessageLite.registerDefaultInstance(Duration.class, duration0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(j0.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Duration();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(Duration.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            }
            case 4: {
                return Duration.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Duration.PARSER;
                if(parser0 == null) {
                    Class class0 = Duration.class;
                    synchronized(class0) {
                        parser0 = Duration.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Duration.DEFAULT_INSTANCE);
                            Duration.PARSER = parser0;
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

    public static Duration getDefaultInstance() {
        return Duration.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Builder newBuilder() {
        return (Builder)Duration.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Duration duration0) {
        return (Builder)Duration.DEFAULT_INSTANCE.createBuilder(duration0);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteString0);
    }

    public static Duration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Duration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, arr_b);
    }

    public static Duration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Duration.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Duration duration0, long v) {
        duration0.seconds_ = v;
    }

    public static void r(Duration duration0) {
        duration0.seconds_ = 0L;
    }

    public static void s(Duration duration0, int v) {
        duration0.nanos_ = v;
    }

    public static void t(Duration duration0) {
        duration0.nanos_ = 0;
    }
}

