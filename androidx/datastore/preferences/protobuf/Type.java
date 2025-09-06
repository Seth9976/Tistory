package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Type extends GeneratedMessageLite implements TypeOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements TypeOrBuilder {
        public Builder addAllFields(Iterable iterable0) {
            this.copyOnWrite();
            Type.N(((Type)this.instance), iterable0);
            return this;
        }

        public Builder addAllOneofs(Iterable iterable0) {
            this.copyOnWrite();
            Type.t(((Type)this.instance), iterable0);
            return this;
        }

        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            Type.z(((Type)this.instance), iterable0);
            return this;
        }

        public Builder addFields(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.copyOnWrite();
            Type.M(((Type)this.instance), v, ((Field)field$Builder0.build()));
            return this;
        }

        public Builder addFields(int v, Field field0) {
            this.copyOnWrite();
            Type.M(((Type)this.instance), v, field0);
            return this;
        }

        public Builder addFields(androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.copyOnWrite();
            Type.L(((Type)this.instance), ((Field)field$Builder0.build()));
            return this;
        }

        public Builder addFields(Field field0) {
            this.copyOnWrite();
            Type.L(((Type)this.instance), field0);
            return this;
        }

        public Builder addOneofs(String s) {
            this.copyOnWrite();
            Type.s(((Type)this.instance), s);
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString0) {
            this.copyOnWrite();
            Type.v(((Type)this.instance), byteString0);
            return this;
        }

        public Builder addOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Type.y(((Type)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            Type.y(((Type)this.instance), v, option0);
            return this;
        }

        public Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Type.x(((Type)this.instance), ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            Type.x(((Type)this.instance), option0);
            return this;
        }

        public Builder clearFields() {
            this.copyOnWrite();
            Type.O(((Type)this.instance));
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            Type.B(((Type)this.instance));
            return this;
        }

        public Builder clearOneofs() {
            this.copyOnWrite();
            Type.u(((Type)this.instance));
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            Type.A(((Type)this.instance));
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            Type.F(((Type)this.instance));
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            Type.I(((Type)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Field getFields(int v) {
            return ((Type)this.instance).getFields(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type)this.instance).getFieldsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getFieldsList() {
            return Collections.unmodifiableList(((Type)this.instance).getFieldsList());
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getOneofs(int v) {
            return ((Type)this.instance).getOneofs(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int v) {
            return ((Type)this.instance).getOneofsBytes(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type)this.instance).getOneofsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getOneofsList() {
            return Collections.unmodifiableList(((Type)this.instance).getOneofsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Option getOptions(int v) {
            return ((Type)this.instance).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type)this.instance).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getOptionsList() {
            return Collections.unmodifiableList(((Type)this.instance).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type)this.instance).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type)this.instance).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type)this.instance).getSyntaxValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type)this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Type.E(((Type)this.instance), sourceContext0);
            return this;
        }

        public Builder removeFields(int v) {
            this.copyOnWrite();
            Type.P(((Type)this.instance), v);
            return this;
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            Type.C(((Type)this.instance), v);
            return this;
        }

        public Builder setFields(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.copyOnWrite();
            Type.K(((Type)this.instance), v, ((Field)field$Builder0.build()));
            return this;
        }

        public Builder setFields(int v, Field field0) {
            this.copyOnWrite();
            Type.K(((Type)this.instance), v, field0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Type.q(((Type)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Type.J(((Type)this.instance), byteString0);
            return this;
        }

        public Builder setOneofs(int v, String s) {
            this.copyOnWrite();
            Type.r(((Type)this.instance), v, s);
            return this;
        }

        public Builder setOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Type.w(((Type)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            Type.w(((Type)this.instance), v, option0);
            return this;
        }

        public Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.copyOnWrite();
            Type.D(((Type)this.instance), ((SourceContext)sourceContext$Builder0.build()));
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Type.D(((Type)this.instance), sourceContext0);
            return this;
        }

        public Builder setSyntax(Syntax syntax0) {
            this.copyOnWrite();
            Type.H(((Type)this.instance), syntax0);
            return this;
        }

        public Builder setSyntaxValue(int v) {
            this.copyOnWrite();
            Type.G(((Type)this.instance), v);
            return this;
        }
    }

    private static final Type DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private ProtobufList fields_;
    private String name_;
    private ProtobufList oneofs_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Type type0 = new Type();
        Type.DEFAULT_INSTANCE = type0;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type0);
    }

    public Type() {
        this.name_ = "";
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void A(Type type0) {
        type0.getClass();
        type0.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void B(Type type0) {
        type0.getClass();
        type0.name_ = "";
    }

    public static void C(Type type0, int v) {
        type0.S();
        type0.options_.remove(v);
    }

    public static void D(Type type0, SourceContext sourceContext0) {
        type0.getClass();
        sourceContext0.getClass();
        type0.sourceContext_ = sourceContext0;
    }

    public static void E(Type type0, SourceContext sourceContext0) {
        type0.getClass();
        sourceContext0.getClass();
        if(type0.sourceContext_ != null && type0.sourceContext_ != SourceContext.getDefaultInstance()) {
            type0.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.newBuilder(type0.sourceContext_).mergeFrom(sourceContext0)).buildPartial();
            return;
        }
        type0.sourceContext_ = sourceContext0;
    }

    public static void F(Type type0) {
        type0.sourceContext_ = null;
    }

    public static void G(Type type0, int v) {
        type0.syntax_ = v;
    }

    public static void H(Type type0, Syntax syntax0) {
        type0.getClass();
        type0.syntax_ = syntax0.getNumber();
    }

    public static void I(Type type0) {
        type0.syntax_ = 0;
    }

    public static void J(Type type0, ByteString byteString0) {
        type0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        type0.name_ = byteString0.toStringUtf8();
    }

    public static void K(Type type0, int v, Field field0) {
        type0.getClass();
        field0.getClass();
        type0.Q();
        type0.fields_.set(v, field0);
    }

    public static void L(Type type0, Field field0) {
        type0.getClass();
        field0.getClass();
        type0.Q();
        type0.fields_.add(field0);
    }

    public static void M(Type type0, int v, Field field0) {
        type0.getClass();
        field0.getClass();
        type0.Q();
        type0.fields_.add(v, field0);
    }

    public static void N(Type type0, Iterable iterable0) {
        type0.Q();
        AbstractMessageLite.addAll(iterable0, type0.fields_);
    }

    public static void O(Type type0) {
        type0.getClass();
        type0.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void P(Type type0, int v) {
        type0.Q();
        type0.fields_.remove(v);
    }

    public final void Q() {
        ProtobufList internal$ProtobufList0 = this.fields_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public final void R() {
        ProtobufList internal$ProtobufList0 = this.oneofs_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public final void S() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(t3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Type();
            }
            case 2: {
                return new Builder(Type.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001B\u0003Ț\u0004\u001B\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            }
            case 4: {
                return Type.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Type.PARSER;
                if(parser0 == null) {
                    Class class0 = Type.class;
                    synchronized(class0) {
                        parser0 = Type.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Type.DEFAULT_INSTANCE);
                            Type.PARSER = parser0;
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

    public static Type getDefaultInstance() {
        return Type.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Field getFields(int v) {
        return (Field)this.fields_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int v) {
        return (FieldOrBuilder)this.fields_.get(v);
    }

    public List getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getOneofs(int v) {
        return (String)this.oneofs_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int v) {
        return ByteString.copyFromUtf8(((String)this.oneofs_.get(v)));
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getOneofsList() {
        return this.oneofs_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.forNumber(this.syntax_);
        return syntax0 == null ? Syntax.UNRECOGNIZED : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static Builder newBuilder() {
        return (Builder)Type.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Type type0) {
        return (Builder)Type.DEFAULT_INSTANCE.createBuilder(type0);
    }

    public static Type parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Type)GeneratedMessageLite.parseDelimitedFrom(Type.DEFAULT_INSTANCE, inputStream0);
    }

    public static Type parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.parseDelimitedFrom(Type.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Type parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, byteString0);
    }

    public static Type parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Type parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Type parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Type parseFrom(InputStream inputStream0) throws IOException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, inputStream0);
    }

    public static Type parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Type parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Type parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Type parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, arr_b);
    }

    public static Type parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.parseFrom(Type.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Type.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Type type0, String s) {
        type0.getClass();
        s.getClass();
        type0.name_ = s;
    }

    public static void r(Type type0, int v, String s) {
        type0.getClass();
        s.getClass();
        type0.R();
        type0.oneofs_.set(v, s);
    }

    public static void s(Type type0, String s) {
        type0.getClass();
        s.getClass();
        type0.R();
        type0.oneofs_.add(s);
    }

    public static void t(Type type0, Iterable iterable0) {
        type0.R();
        AbstractMessageLite.addAll(iterable0, type0.oneofs_);
    }

    public static void u(Type type0) {
        type0.getClass();
        type0.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void v(Type type0, ByteString byteString0) {
        type0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        type0.R();
        type0.oneofs_.add(byteString0.toStringUtf8());
    }

    public static void w(Type type0, int v, Option option0) {
        type0.getClass();
        option0.getClass();
        type0.S();
        type0.options_.set(v, option0);
    }

    public static void x(Type type0, Option option0) {
        type0.getClass();
        option0.getClass();
        type0.S();
        type0.options_.add(option0);
    }

    public static void y(Type type0, int v, Option option0) {
        type0.getClass();
        option0.getClass();
        type0.S();
        type0.options_.add(v, option0);
    }

    public static void z(Type type0, Iterable iterable0) {
        type0.S();
        AbstractMessageLite.addAll(iterable0, type0.options_);
    }
}

