package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt32Value extends GeneratedMessageLite implements UInt32ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements UInt32ValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            UInt32Value.r(((UInt32Value)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
        public int getValue() {
            return ((UInt32Value)this.instance).getValue();
        }

        public Builder setValue(int v) {
            this.copyOnWrite();
            UInt32Value.q(((UInt32Value)this.instance), v);
            return this;
        }
    }

    private static final UInt32Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value0 = new UInt32Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        UInt32Value.DEFAULT_INSTANCE = uInt32Value0;
        GeneratedMessageLite.registerDefaultInstance(UInt32Value.class, uInt32Value0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(u3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new UInt32Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(UInt32Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"value_"});
            }
            case 4: {
                return UInt32Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = UInt32Value.PARSER;
                if(parser0 == null) {
                    Class class0 = UInt32Value.class;
                    synchronized(class0) {
                        parser0 = UInt32Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(UInt32Value.DEFAULT_INSTANCE);
                            UInt32Value.PARSER = parser0;
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

    public static UInt32Value getDefaultInstance() {
        return UInt32Value.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)UInt32Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UInt32Value uInt32Value0) {
        return (Builder)UInt32Value.DEFAULT_INSTANCE.createBuilder(uInt32Value0);
    }

    public static UInt32Value of(int v) {
        return (UInt32Value)UInt32Value.newBuilder().setValue(v).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseDelimitedFrom(UInt32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseDelimitedFrom(UInt32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt32Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, byteString0);
    }

    public static UInt32Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static UInt32Value parseFrom(InputStream inputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt32Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static UInt32Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, arr_b);
    }

    public static UInt32Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.parseFrom(UInt32Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return UInt32Value.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(UInt32Value uInt32Value0, int v) {
        uInt32Value0.value_ = v;
    }

    public static void r(UInt32Value uInt32Value0) {
        uInt32Value0.value_ = 0;
    }
}

