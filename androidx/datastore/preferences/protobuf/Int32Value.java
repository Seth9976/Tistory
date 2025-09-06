package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int32Value extends GeneratedMessageLite implements Int32ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements Int32ValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            Int32Value.r(((Int32Value)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
        public int getValue() {
            return ((Int32Value)this.instance).getValue();
        }

        public Builder setValue(int v) {
            this.copyOnWrite();
            Int32Value.q(((Int32Value)this.instance), v);
            return this;
        }
    }

    private static final Int32Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        Int32Value int32Value0 = new Int32Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        Int32Value.DEFAULT_INSTANCE = int32Value0;
        GeneratedMessageLite.registerDefaultInstance(Int32Value.class, int32Value0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(k1.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Int32Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(Int32Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            }
            case 4: {
                return Int32Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Int32Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Int32Value.class;
                    synchronized(class0) {
                        parser0 = Int32Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Int32Value.DEFAULT_INSTANCE);
                            Int32Value.PARSER = parser0;
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

    public static Int32Value getDefaultInstance() {
        return Int32Value.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)Int32Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Int32Value int32Value0) {
        return (Builder)Int32Value.DEFAULT_INSTANCE.createBuilder(int32Value0);
    }

    public static Int32Value of(int v) {
        return (Int32Value)Int32Value.newBuilder().setValue(v).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseDelimitedFrom(Int32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseDelimitedFrom(Int32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int32Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Int32Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Int32Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Int32Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Int32Value parseFrom(InputStream inputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int32Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Int32Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Int32Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.parseFrom(Int32Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Int32Value.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Int32Value int32Value0, int v) {
        int32Value0.value_ = v;
    }

    public static void r(Int32Value int32Value0) {
        int32Value0.value_ = 0;
    }
}

