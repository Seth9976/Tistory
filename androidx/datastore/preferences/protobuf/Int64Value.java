package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int64Value extends GeneratedMessageLite implements Int64ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements Int64ValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            Int64Value.r(((Int64Value)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
        public long getValue() {
            return ((Int64Value)this.instance).getValue();
        }

        public Builder setValue(long v) {
            this.copyOnWrite();
            Int64Value.q(((Int64Value)this.instance), v);
            return this;
        }
    }

    private static final Int64Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value0 = new Int64Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        Int64Value.DEFAULT_INSTANCE = int64Value0;
        GeneratedMessageLite.registerDefaultInstance(Int64Value.class, int64Value0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(l1.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Int64Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(Int64Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            }
            case 4: {
                return Int64Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Int64Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Int64Value.class;
                    synchronized(class0) {
                        parser0 = Int64Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Int64Value.DEFAULT_INSTANCE);
                            Int64Value.PARSER = parser0;
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

    public static Int64Value getDefaultInstance() {
        return Int64Value.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)Int64Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Int64Value int64Value0) {
        return (Builder)Int64Value.DEFAULT_INSTANCE.createBuilder(int64Value0);
    }

    public static Int64Value of(long v) {
        return (Int64Value)Int64Value.newBuilder().setValue(v).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Int64Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Int64Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Int64Value.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Int64Value int64Value0, long v) {
        int64Value0.value_ = v;
    }

    public static void r(Int64Value int64Value0) {
        int64Value0.value_ = 0L;
    }
}

