package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BytesValue extends GeneratedMessageLite implements BytesValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements BytesValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            BytesValue.r(((BytesValue)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
        public ByteString getValue() {
            return ((BytesValue)this.instance).getValue();
        }

        public Builder setValue(ByteString byteString0) {
            this.copyOnWrite();
            BytesValue.q(((BytesValue)this.instance), byteString0);
            return this;
        }
    }

    private static final BytesValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;

    static {
        BytesValue bytesValue0 = new BytesValue();
        BytesValue.DEFAULT_INSTANCE = bytesValue0;
        GeneratedMessageLite.registerDefaultInstance(BytesValue.class, bytesValue0);
    }

    public BytesValue() {
        this.value_ = ByteString.EMPTY;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(s.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new BytesValue();
            }
            case 2: {
                return new Builder(BytesValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            }
            case 4: {
                return BytesValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = BytesValue.PARSER;
                if(parser0 == null) {
                    Class class0 = BytesValue.class;
                    synchronized(class0) {
                        parser0 = BytesValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(BytesValue.DEFAULT_INSTANCE);
                            BytesValue.PARSER = parser0;
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

    public static BytesValue getDefaultInstance() {
        return BytesValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)BytesValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BytesValue bytesValue0) {
        return (Builder)BytesValue.DEFAULT_INSTANCE.createBuilder(bytesValue0);
    }

    public static BytesValue of(ByteString byteString0) {
        return (BytesValue)BytesValue.newBuilder().setValue(byteString0).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseDelimitedFrom(BytesValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseDelimitedFrom(BytesValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BytesValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, byteString0);
    }

    public static BytesValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static BytesValue parseFrom(InputStream inputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BytesValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static BytesValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, arr_b);
    }

    public static BytesValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.parseFrom(BytesValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return BytesValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(BytesValue bytesValue0, ByteString byteString0) {
        bytesValue0.getClass();
        byteString0.getClass();
        bytesValue0.value_ = byteString0;
    }

    public static void r(BytesValue bytesValue0) {
        bytesValue0.getClass();
        bytesValue0.value_ = BytesValue.getDefaultInstance().getValue();
    }
}

