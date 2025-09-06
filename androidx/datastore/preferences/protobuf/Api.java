package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Api extends GeneratedMessageLite implements ApiOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ApiOrBuilder {
        public Builder addAllMethods(Iterable iterable0) {
            this.copyOnWrite();
            Api.R(((Api)this.instance), iterable0);
            return this;
        }

        public Builder addAllMixins(Iterable iterable0) {
            this.copyOnWrite();
            Api.H(((Api)this.instance), iterable0);
            return this;
        }

        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            Api.u(((Api)this.instance), iterable0);
            return this;
        }

        public Builder addMethods(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.copyOnWrite();
            Api.Q(((Api)this.instance), v, ((Method)method$Builder0.build()));
            return this;
        }

        public Builder addMethods(int v, Method method0) {
            this.copyOnWrite();
            Api.Q(((Api)this.instance), v, method0);
            return this;
        }

        public Builder addMethods(androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.copyOnWrite();
            Api.P(((Api)this.instance), ((Method)method$Builder0.build()));
            return this;
        }

        public Builder addMethods(Method method0) {
            this.copyOnWrite();
            Api.P(((Api)this.instance), method0);
            return this;
        }

        public Builder addMixins(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.copyOnWrite();
            Api.G(((Api)this.instance), v, ((Mixin)mixin$Builder0.build()));
            return this;
        }

        public Builder addMixins(int v, Mixin mixin0) {
            this.copyOnWrite();
            Api.G(((Api)this.instance), v, mixin0);
            return this;
        }

        public Builder addMixins(androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.copyOnWrite();
            Api.F(((Api)this.instance), ((Mixin)mixin$Builder0.build()));
            return this;
        }

        public Builder addMixins(Mixin mixin0) {
            this.copyOnWrite();
            Api.F(((Api)this.instance), mixin0);
            return this;
        }

        public Builder addOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Api.t(((Api)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            Api.t(((Api)this.instance), v, option0);
            return this;
        }

        public Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Api.s(((Api)this.instance), ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            Api.s(((Api)this.instance), option0);
            return this;
        }

        public Builder clearMethods() {
            this.copyOnWrite();
            Api.S(((Api)this.instance));
            return this;
        }

        public Builder clearMixins() {
            this.copyOnWrite();
            Api.I(((Api)this.instance));
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            Api.B(((Api)this.instance));
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            Api.v(((Api)this.instance));
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            Api.D(((Api)this.instance));
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            Api.N(((Api)this.instance));
            return this;
        }

        public Builder clearVersion() {
            this.copyOnWrite();
            Api.y(((Api)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Method getMethods(int v) {
            return ((Api)this.instance).getMethods(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((Api)this.instance).getMethodsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getMethodsList() {
            return Collections.unmodifiableList(((Api)this.instance).getMethodsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Mixin getMixins(int v) {
            return ((Api)this.instance).getMixins(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((Api)this.instance).getMixinsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getMixinsList() {
            return Collections.unmodifiableList(((Api)this.instance).getMixinsList());
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            return ((Api)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Option getOptions(int v) {
            return ((Api)this.instance).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((Api)this.instance).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getOptionsList() {
            return Collections.unmodifiableList(((Api)this.instance).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            return ((Api)this.instance).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            return ((Api)this.instance).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((Api)this.instance).getSyntaxValue();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getVersion() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            return ((Api)this.instance).getVersionBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((Api)this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Api.C(((Api)this.instance), sourceContext0);
            return this;
        }

        public Builder removeMethods(int v) {
            this.copyOnWrite();
            Api.T(((Api)this.instance), v);
            return this;
        }

        public Builder removeMixins(int v) {
            this.copyOnWrite();
            Api.J(((Api)this.instance), v);
            return this;
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            Api.w(((Api)this.instance), v);
            return this;
        }

        public Builder setMethods(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.copyOnWrite();
            Api.O(((Api)this.instance), v, ((Method)method$Builder0.build()));
            return this;
        }

        public Builder setMethods(int v, Method method0) {
            this.copyOnWrite();
            Api.O(((Api)this.instance), v, method0);
            return this;
        }

        public Builder setMixins(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.copyOnWrite();
            Api.E(((Api)this.instance), v, ((Mixin)mixin$Builder0.build()));
            return this;
        }

        public Builder setMixins(int v, Mixin mixin0) {
            this.copyOnWrite();
            Api.E(((Api)this.instance), v, mixin0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Api.q(((Api)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Api.M(((Api)this.instance), byteString0);
            return this;
        }

        public Builder setOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Api.r(((Api)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            Api.r(((Api)this.instance), v, option0);
            return this;
        }

        public Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.copyOnWrite();
            Api.A(((Api)this.instance), ((SourceContext)sourceContext$Builder0.build()));
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            Api.A(((Api)this.instance), sourceContext0);
            return this;
        }

        public Builder setSyntax(Syntax syntax0) {
            this.copyOnWrite();
            Api.L(((Api)this.instance), syntax0);
            return this;
        }

        public Builder setSyntaxValue(int v) {
            this.copyOnWrite();
            Api.K(((Api)this.instance), v);
            return this;
        }

        public Builder setVersion(String s) {
            this.copyOnWrite();
            Api.x(((Api)this.instance), s);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString0) {
            this.copyOnWrite();
            Api.z(((Api)this.instance), byteString0);
            return this;
        }
    }

    private static final Api DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private ProtobufList methods_;
    private ProtobufList mixins_;
    private String name_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_;

    static {
        Api api0 = new Api();
        Api.DEFAULT_INSTANCE = api0;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api0);
    }

    public Api() {
        this.name_ = "";
        this.methods_ = GeneratedMessageLite.emptyProtobufList();
        this.options_ = GeneratedMessageLite.emptyProtobufList();
        this.version_ = "";
        this.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void A(Api api0, SourceContext sourceContext0) {
        api0.getClass();
        sourceContext0.getClass();
        api0.sourceContext_ = sourceContext0;
    }

    public static void B(Api api0) {
        api0.getClass();
        api0.name_ = "";
    }

    public static void C(Api api0, SourceContext sourceContext0) {
        api0.getClass();
        sourceContext0.getClass();
        if(api0.sourceContext_ != null && api0.sourceContext_ != SourceContext.getDefaultInstance()) {
            api0.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.newBuilder(api0.sourceContext_).mergeFrom(sourceContext0)).buildPartial();
            return;
        }
        api0.sourceContext_ = sourceContext0;
    }

    public static void D(Api api0) {
        api0.sourceContext_ = null;
    }

    public static void E(Api api0, int v, Mixin mixin0) {
        api0.getClass();
        mixin0.getClass();
        api0.V();
        api0.mixins_.set(v, mixin0);
    }

    public static void F(Api api0, Mixin mixin0) {
        api0.getClass();
        mixin0.getClass();
        api0.V();
        api0.mixins_.add(mixin0);
    }

    public static void G(Api api0, int v, Mixin mixin0) {
        api0.getClass();
        mixin0.getClass();
        api0.V();
        api0.mixins_.add(v, mixin0);
    }

    public static void H(Api api0, Iterable iterable0) {
        api0.V();
        AbstractMessageLite.addAll(iterable0, api0.mixins_);
    }

    public static void I(Api api0) {
        api0.getClass();
        api0.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void J(Api api0, int v) {
        api0.V();
        api0.mixins_.remove(v);
    }

    public static void K(Api api0, int v) {
        api0.syntax_ = v;
    }

    public static void L(Api api0, Syntax syntax0) {
        api0.getClass();
        api0.syntax_ = syntax0.getNumber();
    }

    public static void M(Api api0, ByteString byteString0) {
        api0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        api0.name_ = byteString0.toStringUtf8();
    }

    public static void N(Api api0) {
        api0.syntax_ = 0;
    }

    public static void O(Api api0, int v, Method method0) {
        api0.getClass();
        method0.getClass();
        api0.U();
        api0.methods_.set(v, method0);
    }

    public static void P(Api api0, Method method0) {
        api0.getClass();
        method0.getClass();
        api0.U();
        api0.methods_.add(method0);
    }

    public static void Q(Api api0, int v, Method method0) {
        api0.getClass();
        method0.getClass();
        api0.U();
        api0.methods_.add(v, method0);
    }

    public static void R(Api api0, Iterable iterable0) {
        api0.U();
        AbstractMessageLite.addAll(iterable0, api0.methods_);
    }

    public static void S(Api api0) {
        api0.getClass();
        api0.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void T(Api api0, int v) {
        api0.U();
        api0.methods_.remove(v);
    }

    public final void U() {
        ProtobufList internal$ProtobufList0 = this.methods_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.methods_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public final void V() {
        ProtobufList internal$ProtobufList0 = this.mixins_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.mixins_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public final void W() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(e.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Api();
            }
            case 2: {
                return new Builder(Api.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004Ȉ\u0005\t\u0006\u001B\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            }
            case 4: {
                return Api.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Api.PARSER;
                if(parser0 == null) {
                    Class class0 = Api.class;
                    synchronized(class0) {
                        parser0 = Api.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Api.DEFAULT_INSTANCE);
                            Api.PARSER = parser0;
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

    public static Api getDefaultInstance() {
        return Api.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Method getMethods(int v) {
        return (Method)this.methods_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int v) {
        return (MethodOrBuilder)this.methods_.get(v);
    }

    public List getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Mixin getMixins(int v) {
        return (Mixin)this.mixins_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int v) {
        return (MixinOrBuilder)this.mixins_.get(v);
    }

    public List getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.forNumber(this.syntax_);
        return syntax0 == null ? Syntax.UNRECOGNIZED : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getVersion() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static Builder newBuilder() {
        return (Builder)Api.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Api api0) {
        return (Builder)Api.DEFAULT_INSTANCE.createBuilder(api0);
    }

    public static Api parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Api)GeneratedMessageLite.parseDelimitedFrom(Api.DEFAULT_INSTANCE, inputStream0);
    }

    public static Api parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.parseDelimitedFrom(Api.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Api parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, byteString0);
    }

    public static Api parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Api parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Api parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Api parseFrom(InputStream inputStream0) throws IOException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, inputStream0);
    }

    public static Api parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Api parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Api parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Api parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, arr_b);
    }

    public static Api parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.parseFrom(Api.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Api.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Api api0, String s) {
        api0.getClass();
        s.getClass();
        api0.name_ = s;
    }

    public static void r(Api api0, int v, Option option0) {
        api0.getClass();
        option0.getClass();
        api0.W();
        api0.options_.set(v, option0);
    }

    public static void s(Api api0, Option option0) {
        api0.getClass();
        option0.getClass();
        api0.W();
        api0.options_.add(option0);
    }

    public static void t(Api api0, int v, Option option0) {
        api0.getClass();
        option0.getClass();
        api0.W();
        api0.options_.add(v, option0);
    }

    public static void u(Api api0, Iterable iterable0) {
        api0.W();
        AbstractMessageLite.addAll(iterable0, api0.options_);
    }

    public static void v(Api api0) {
        api0.getClass();
        api0.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void w(Api api0, int v) {
        api0.W();
        api0.options_.remove(v);
    }

    public static void x(Api api0, String s) {
        api0.getClass();
        s.getClass();
        api0.version_ = s;
    }

    public static void y(Api api0) {
        api0.getClass();
        api0.version_ = "";
    }

    public static void z(Api api0, ByteString byteString0) {
        api0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        api0.version_ = byteString0.toStringUtf8();
    }
}

