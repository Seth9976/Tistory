package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt64Value extends GeneratedMessageLite implements UInt64ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements UInt64ValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            UInt64Value.r(((UInt64Value)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
        public long getValue() {
            return ((UInt64Value)this.instance).getValue();
        }

        public Builder setValue(long v) {
            this.copyOnWrite();
            UInt64Value.q(((UInt64Value)this.instance), v);
            return this;
        }
    }

    private static final UInt64Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        UInt64Value uInt64Value0 = new UInt64Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        UInt64Value.DEFAULT_INSTANCE = uInt64Value0;
        GeneratedMessageLite.registerDefaultInstance(UInt64Value.class, uInt64Value0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(v3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new UInt64Value();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(UInt64Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            }
            case 4: {
                return UInt64Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = UInt64Value.PARSER;
                if(parser0 == null) {
                    Class class0 = UInt64Value.class;
                    synchronized(class0) {
                        parser0 = UInt64Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(UInt64Value.DEFAULT_INSTANCE);
                            UInt64Value.PARSER = parser0;
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

    public static UInt64Value getDefaultInstance() {
        return UInt64Value.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)UInt64Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UInt64Value uInt64Value0) {
        return (Builder)UInt64Value.DEFAULT_INSTANCE.createBuilder(uInt64Value0);
    }

    public static UInt64Value of(long v) {
        return (UInt64Value)UInt64Value.newBuilder().setValue(v).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseDelimitedFrom(UInt64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseDelimitedFrom(UInt64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt64Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, byteString0);
    }

    public static UInt64Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static UInt64Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static UInt64Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static UInt64Value parseFrom(InputStream inputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt64Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static UInt64Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, arr_b);
    }

    public static UInt64Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.parseFrom(UInt64Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return UInt64Value.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(UInt64Value uInt64Value0, long v) {
        uInt64Value0.value_ = v;
    }

    public static void r(UInt64Value uInt64Value0) {
        uInt64Value0.value_ = 0L;
    }
}

