package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any extends GeneratedMessageLite implements AnyOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements AnyOrBuilder {
        public Builder clearTypeUrl() {
            this.copyOnWrite();
            Any.r(((Any)this.instance));
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            Any.u(((Any)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public String getTypeUrl() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Any)this.instance).getTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getValue() {
            return ((Any)this.instance).getValue();
        }

        public Builder setTypeUrl(String s) {
            this.copyOnWrite();
            Any.q(((Any)this.instance), s);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString0) {
            this.copyOnWrite();
            Any.s(((Any)this.instance), byteString0);
            return this;
        }

        public Builder setValue(ByteString byteString0) {
            this.copyOnWrite();
            Any.t(((Any)this.instance), byteString0);
            return this;
        }
    }

    private static final Any DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_;
    private ByteString value_;

    static {
        Any any0 = new Any();
        Any.DEFAULT_INSTANCE = any0;
        GeneratedMessageLite.registerDefaultInstance(Any.class, any0);
    }

    public Any() {
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(d.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Any();
            }
            case 2: {
                return new Builder(Any.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            }
            case 4: {
                return Any.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Any.PARSER;
                if(parser0 == null) {
                    Class class0 = Any.class;
                    synchronized(class0) {
                        parser0 = Any.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Any.DEFAULT_INSTANCE);
                            Any.PARSER = parser0;
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

    public static Any getDefaultInstance() {
        return Any.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public String getTypeUrl() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)Any.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Any any0) {
        return (Builder)Any.DEFAULT_INSTANCE.createBuilder(any0);
    }

    public static Any parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteString0);
    }

    public static Any parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Any parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Any parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Any parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Any parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, arr_b);
    }

    public static Any parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Any.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Any any0, String s) {
        any0.getClass();
        s.getClass();
        any0.typeUrl_ = s;
    }

    public static void r(Any any0) {
        any0.getClass();
        any0.typeUrl_ = "";
    }

    public static void s(Any any0, ByteString byteString0) {
        any0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        any0.typeUrl_ = byteString0.toStringUtf8();
    }

    public static void t(Any any0, ByteString byteString0) {
        any0.getClass();
        byteString0.getClass();
        any0.value_ = byteString0;
    }

    public static void u(Any any0) {
        any0.getClass();
        any0.value_ = Any.getDefaultInstance().getValue();
    }
}

