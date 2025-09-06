package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option extends GeneratedMessageLite implements OptionOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements OptionOrBuilder {
        public Builder clearName() {
            this.copyOnWrite();
            Option.r(((Option)this.instance));
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            Option.v(((Option)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
            return ((Option)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option)this.instance).getValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option)this.instance).hasValue();
        }

        public Builder mergeValue(Any any0) {
            this.copyOnWrite();
            Option.u(((Option)this.instance), any0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Option.q(((Option)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Option.s(((Option)this.instance), byteString0);
            return this;
        }

        public Builder setValue(androidx.datastore.preferences.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            Option.t(((Option)this.instance), ((Any)any$Builder0.build()));
            return this;
        }

        public Builder setValue(Any any0) {
            this.copyOnWrite();
            Option.t(((Option)this.instance), any0);
            return this;
        }
    }

    private static final Option DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_;
    private Any value_;

    static {
        Option option0 = new Option();
        Option.DEFAULT_INSTANCE = option0;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option0);
    }

    public Option() {
        this.name_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(u2.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Option();
            }
            case 2: {
                return new Builder(Option.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            }
            case 4: {
                return Option.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Option.PARSER;
                if(parser0 == null) {
                    Class class0 = Option.class;
                    synchronized(class0) {
                        parser0 = Option.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Option.DEFAULT_INSTANCE);
                            Option.PARSER = parser0;
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

    public static Option getDefaultInstance() {
        return Option.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public Any getValue() {
        return this.value_ == null ? Any.getDefaultInstance() : this.value_;
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return this.value_ != null;
    }

    public static Builder newBuilder() {
        return (Builder)Option.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Option option0) {
        return (Builder)Option.DEFAULT_INSTANCE.createBuilder(option0);
    }

    public static Option parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteString0);
    }

    public static Option parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Option parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Option parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Option parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Option parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, arr_b);
    }

    public static Option parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Option.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Option option0, String s) {
        option0.getClass();
        s.getClass();
        option0.name_ = s;
    }

    public static void r(Option option0) {
        option0.getClass();
        option0.name_ = "";
    }

    public static void s(Option option0, ByteString byteString0) {
        option0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        option0.name_ = byteString0.toStringUtf8();
    }

    public static void t(Option option0, Any any0) {
        option0.getClass();
        any0.getClass();
        option0.value_ = any0;
    }

    public static void u(Option option0, Any any0) {
        option0.getClass();
        any0.getClass();
        if(option0.value_ != null && option0.value_ != Any.getDefaultInstance()) {
            option0.value_ = (Any)((androidx.datastore.preferences.protobuf.Any.Builder)Any.newBuilder(option0.value_).mergeFrom(any0)).buildPartial();
            return;
        }
        option0.value_ = any0;
    }

    public static void v(Option option0) {
        option0.value_ = null;
    }
}

