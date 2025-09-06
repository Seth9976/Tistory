package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class EnumValue extends GeneratedMessageLite implements EnumValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements EnumValueOrBuilder {
        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            EnumValue.A(((EnumValue)this.instance), iterable0);
            return this;
        }

        public Builder addOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            EnumValue.z(((EnumValue)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            EnumValue.z(((EnumValue)this.instance), v, option0);
            return this;
        }

        public Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            EnumValue.y(((EnumValue)this.instance), ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            EnumValue.y(((EnumValue)this.instance), option0);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            EnumValue.t(((EnumValue)this.instance));
            return this;
        }

        public Builder clearNumber() {
            this.copyOnWrite();
            EnumValue.w(((EnumValue)this.instance));
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            EnumValue.r(((EnumValue)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
            return ((EnumValue)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((EnumValue)this.instance).getNumber();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public Option getOptions(int v) {
            return ((EnumValue)this.instance).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((EnumValue)this.instance).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public List getOptionsList() {
            return Collections.unmodifiableList(((EnumValue)this.instance).getOptionsList());
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            EnumValue.s(v, ((EnumValue)this.instance));
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            EnumValue.q(((EnumValue)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            EnumValue.u(((EnumValue)this.instance), byteString0);
            return this;
        }

        public Builder setNumber(int v) {
            this.copyOnWrite();
            EnumValue.v(v, ((EnumValue)this.instance));
            return this;
        }

        public Builder setOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            EnumValue.x(((EnumValue)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            EnumValue.x(((EnumValue)this.instance), v, option0);
            return this;
        }
    }

    private static final EnumValue DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String name_;
    private int number_;
    private ProtobufList options_;

    static {
        EnumValue enumValue0 = new EnumValue();
        EnumValue.DEFAULT_INSTANCE = enumValue0;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue0);
    }

    public EnumValue() {
        this.name_ = "";
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void A(EnumValue enumValue0, Iterable iterable0) {
        enumValue0.B();
        AbstractMessageLite.addAll(iterable0, enumValue0.options_);
    }

    public final void B() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(m0.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new EnumValue();
            }
            case 2: {
                return new Builder(EnumValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001B", new Object[]{"name_", "number_", "options_", Option.class});
            }
            case 4: {
                return EnumValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = EnumValue.PARSER;
                if(parser0 == null) {
                    Class class0 = EnumValue.class;
                    synchronized(class0) {
                        parser0 = EnumValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(EnumValue.DEFAULT_INSTANCE);
                            EnumValue.PARSER = parser0;
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

    public static EnumValue getDefaultInstance() {
        return EnumValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    public static Builder newBuilder() {
        return (Builder)EnumValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EnumValue enumValue0) {
        return (Builder)EnumValue.DEFAULT_INSTANCE.createBuilder(enumValue0);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseDelimitedFrom(EnumValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseDelimitedFrom(EnumValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static EnumValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, byteString0);
    }

    public static EnumValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static EnumValue parseFrom(InputStream inputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static EnumValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static EnumValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, arr_b);
    }

    public static EnumValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.parseFrom(EnumValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return EnumValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(EnumValue enumValue0, String s) {
        enumValue0.getClass();
        s.getClass();
        enumValue0.name_ = s;
    }

    public static void r(EnumValue enumValue0) {
        enumValue0.getClass();
        enumValue0.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void s(int v, EnumValue enumValue0) {
        enumValue0.B();
        enumValue0.options_.remove(v);
    }

    public static void t(EnumValue enumValue0) {
        enumValue0.getClass();
        enumValue0.name_ = "";
    }

    public static void u(EnumValue enumValue0, ByteString byteString0) {
        enumValue0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        enumValue0.name_ = byteString0.toStringUtf8();
    }

    public static void v(int v, EnumValue enumValue0) {
        enumValue0.number_ = v;
    }

    public static void w(EnumValue enumValue0) {
        enumValue0.number_ = 0;
    }

    public static void x(EnumValue enumValue0, int v, Option option0) {
        enumValue0.getClass();
        option0.getClass();
        enumValue0.B();
        enumValue0.options_.set(v, option0);
    }

    public static void y(EnumValue enumValue0, Option option0) {
        enumValue0.getClass();
        option0.getClass();
        enumValue0.B();
        enumValue0.options_.add(option0);
    }

    public static void z(EnumValue enumValue0, int v, Option option0) {
        enumValue0.getClass();
        option0.getClass();
        enumValue0.B();
        enumValue0.options_.add(v, option0);
    }
}

