package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue extends GeneratedMessageLite implements StringValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StringValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            StringValue.r(((StringValue)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public String getValue() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public ByteString getValueBytes() {
            return ((StringValue)this.instance).getValueBytes();
        }

        public Builder setValue(String s) {
            this.copyOnWrite();
            StringValue.q(((StringValue)this.instance), s);
            return this;
        }

        public Builder setValueBytes(ByteString byteString0) {
            this.copyOnWrite();
            StringValue.s(((StringValue)this.instance), byteString0);
            return this;
        }
    }

    private static final StringValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_;

    static {
        StringValue stringValue0 = new StringValue();
        StringValue.DEFAULT_INSTANCE = stringValue0;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue0);
    }

    public StringValue() {
        this.value_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(m3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new StringValue();
            }
            case 2: {
                return new Builder(StringValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            }
            case 4: {
                return StringValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = StringValue.PARSER;
                if(parser0 == null) {
                    Class class0 = StringValue.class;
                    synchronized(class0) {
                        parser0 = StringValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(StringValue.DEFAULT_INSTANCE);
                            StringValue.PARSER = parser0;
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

    public static StringValue getDefaultInstance() {
        return StringValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public String getValue() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    public static Builder newBuilder() {
        return (Builder)StringValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(StringValue stringValue0) {
        return (Builder)StringValue.DEFAULT_INSTANCE.createBuilder(stringValue0);
    }

    public static StringValue of(String s) {
        return (StringValue)StringValue.newBuilder().setValue(s).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseDelimitedFrom(StringValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseDelimitedFrom(StringValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static StringValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, byteString0);
    }

    public static StringValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static StringValue parseFrom(InputStream inputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static StringValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static StringValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, arr_b);
    }

    public static StringValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.parseFrom(StringValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return StringValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(StringValue stringValue0, String s) {
        stringValue0.getClass();
        s.getClass();
        stringValue0.value_ = s;
    }

    public static void r(StringValue stringValue0) {
        stringValue0.getClass();
        stringValue0.value_ = "";
    }

    public static void s(StringValue stringValue0, ByteString byteString0) {
        stringValue0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        stringValue0.value_ = byteString0.toStringUtf8();
    }
}

