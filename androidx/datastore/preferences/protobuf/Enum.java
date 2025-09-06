package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Enum extends GeneratedMessageLite implements EnumOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements EnumOrBuilder {
        public Builder addAllEnumvalue(Iterable iterable0) {
            this.copyOnWrite();
            Enum.I(((Enum)this.instance), iterable0);
            return this;
        }

        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            Enum.u(((Enum)this.instance), iterable0);
            return this;
        }

        public Builder addEnumvalue(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            Enum.H(((Enum)this.instance), v, ((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder addEnumvalue(int v, EnumValue enumValue0) {
            this.copyOnWrite();
            Enum.H(((Enum)this.instance), v, enumValue0);
            return this;
        }

        public Builder addEnumvalue(androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            Enum.G(((Enum)this.instance), ((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue0) {
            this.copyOnWrite();
            Enum.G(((Enum)this.instance), enumValue0);
            return this;
        }

        public Builder addOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Enum.t(((Enum)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            Enum.t(((Enum)this.instance), v, option0);
            return this;
        }

        public Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Enum.s(((Enum)this.instance), ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            Enum.s(((Enum)this.instance), option0);
            return this;
        }

        public Builder clearEnumvalue() {
            this.copyOnWrite();
            Enum.J(((Enum)this.instance));
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            Enum.B(((Enum)this.instance));
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            Enum.v(((Enum)this.instance));
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            Enum.z(((Enum)this.instance));
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            Enum.D(((Enum)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int v) {
            return ((Enum)this.instance).getEnumvalue(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum)this.instance).getEnumvalueCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List getEnumvalueList() {
            return Collections.unmodifiableList(((Enum)this.instance).getEnumvalueList());
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            return ((Enum)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Option getOptions(int v) {
            return ((Enum)this.instance).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum)this.instance).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List getOptionsList() {
            return Collections.unmodifiableList(((Enum)this.instance).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum)this.instance).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            return ((Enum)this.instance).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum)this.instance).getSyntaxValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum)this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Enum.y(((Enum)this.instance), sourceContext0);
            return this;
        }

        public Builder removeEnumvalue(int v) {
            this.copyOnWrite();
            Enum.K(((Enum)this.instance), v);
            return this;
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            Enum.w(((Enum)this.instance), v);
            return this;
        }

        public Builder setEnumvalue(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            Enum.F(((Enum)this.instance), v, ((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder setEnumvalue(int v, EnumValue enumValue0) {
            this.copyOnWrite();
            Enum.F(((Enum)this.instance), v, enumValue0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Enum.q(((Enum)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Enum.E(((Enum)this.instance), byteString0);
            return this;
        }

        public Builder setOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Enum.r(((Enum)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            Enum.r(((Enum)this.instance), v, option0);
            return this;
        }

        public Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.copyOnWrite();
            Enum.x(((Enum)this.instance), ((SourceContext)sourceContext$Builder0.build()));
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Enum.x(((Enum)this.instance), sourceContext0);
            return this;
        }

        public Builder setSyntax(Syntax syntax0) {
            this.copyOnWrite();
            Enum.C(((Enum)this.instance), syntax0);
            return this;
        }

        public Builder setSyntaxValue(int v) {
            this.copyOnWrite();
            Enum.A(((Enum)this.instance), v);
            return this;
        }
    }

    private static final Enum DEFAULT_INSTANCE = null;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private ProtobufList enumvalue_;
    private String name_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Enum enum0 = new Enum();
        Enum.DEFAULT_INSTANCE = enum0;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, enum0);
    }

    public Enum() {
        this.name_ = "";
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void A(Enum enum0, int v) {
        enum0.syntax_ = v;
    }

    public static void B(Enum enum0) {
        enum0.getClass();
        enum0.name_ = "";
    }

    public static void C(Enum enum0, Syntax syntax0) {
        enum0.getClass();
        enum0.syntax_ = syntax0.getNumber();
    }

    public static void D(Enum enum0) {
        enum0.syntax_ = 0;
    }

    public static void E(Enum enum0, ByteString byteString0) {
        enum0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        enum0.name_ = byteString0.toStringUtf8();
    }

    public static void F(Enum enum0, int v, EnumValue enumValue0) {
        enum0.getClass();
        enumValue0.getClass();
        enum0.L();
        enum0.enumvalue_.set(v, enumValue0);
    }

    public static void G(Enum enum0, EnumValue enumValue0) {
        enum0.getClass();
        enumValue0.getClass();
        enum0.L();
        enum0.enumvalue_.add(enumValue0);
    }

    public static void H(Enum enum0, int v, EnumValue enumValue0) {
        enum0.getClass();
        enumValue0.getClass();
        enum0.L();
        enum0.enumvalue_.add(v, enumValue0);
    }

    public static void I(Enum enum0, Iterable iterable0) {
        enum0.L();
        AbstractMessageLite.addAll(iterable0, enum0.enumvalue_);
    }

    public static void J(Enum enum0) {
        enum0.getClass();
        enum0.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void K(Enum enum0, int v) {
        enum0.L();
        enum0.enumvalue_.remove(v);
    }

    public final void L() {
        ProtobufList internal$ProtobufList0 = this.enumvalue_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.enumvalue_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public final void M() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(l0.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Enum();
            }
            case 2: {
                return new Builder(Enum.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            }
            case 4: {
                return Enum.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Enum.PARSER;
                if(parser0 == null) {
                    Class class0 = Enum.class;
                    synchronized(class0) {
                        parser0 = Enum.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Enum.DEFAULT_INSTANCE);
                            Enum.PARSER = parser0;
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

    public static Enum getDefaultInstance() {
        return Enum.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int v) {
        return (EnumValue)this.enumvalue_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int v) {
        return (EnumValueOrBuilder)this.enumvalue_.get(v);
    }

    public List getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.forNumber(this.syntax_);
        return syntax0 == null ? Syntax.UNRECOGNIZED : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static Builder newBuilder() {
        return (Builder)Enum.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Enum enum0) {
        return (Builder)Enum.DEFAULT_INSTANCE.createBuilder(enum0);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteString0);
    }

    public static Enum parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    public static Enum parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Enum parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, arr_b);
    }

    public static Enum parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Enum.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Enum enum0, String s) {
        enum0.getClass();
        s.getClass();
        enum0.name_ = s;
    }

    public static void r(Enum enum0, int v, Option option0) {
        enum0.getClass();
        option0.getClass();
        enum0.M();
        enum0.options_.set(v, option0);
    }

    public static void s(Enum enum0, Option option0) {
        enum0.getClass();
        option0.getClass();
        enum0.M();
        enum0.options_.add(option0);
    }

    public static void t(Enum enum0, int v, Option option0) {
        enum0.getClass();
        option0.getClass();
        enum0.M();
        enum0.options_.add(v, option0);
    }

    public static void u(Enum enum0, Iterable iterable0) {
        enum0.M();
        AbstractMessageLite.addAll(iterable0, enum0.options_);
    }

    public static void v(Enum enum0) {
        enum0.getClass();
        enum0.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void w(Enum enum0, int v) {
        enum0.M();
        enum0.options_.remove(v);
    }

    public static void x(Enum enum0, SourceContext sourceContext0) {
        enum0.getClass();
        sourceContext0.getClass();
        enum0.sourceContext_ = sourceContext0;
    }

    public static void y(Enum enum0, SourceContext sourceContext0) {
        enum0.getClass();
        sourceContext0.getClass();
        if(enum0.sourceContext_ != null && enum0.sourceContext_ != SourceContext.getDefaultInstance()) {
            enum0.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.newBuilder(enum0.sourceContext_).mergeFrom(sourceContext0)).buildPartial();
            return;
        }
        enum0.sourceContext_ = sourceContext0;
    }

    public static void z(Enum enum0) {
        enum0.sourceContext_ = null;
    }
}

