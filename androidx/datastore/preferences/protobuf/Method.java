package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Method extends GeneratedMessageLite implements MethodOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements MethodOrBuilder {
        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            Method.y(((Method)this.instance), iterable0);
            return this;
        }

        public Builder addOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Method.x(((Method)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            Method.x(((Method)this.instance), v, option0);
            return this;
        }

        public Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Method.w(((Method)this.instance), ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            Method.w(((Method)this.instance), option0);
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            Method.B(((Method)this.instance));
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            Method.z(((Method)this.instance));
            return this;
        }

        public Builder clearRequestStreaming() {
            this.copyOnWrite();
            Method.K(((Method)this.instance));
            return this;
        }

        public Builder clearRequestTypeUrl() {
            this.copyOnWrite();
            Method.H(((Method)this.instance));
            return this;
        }

        public Builder clearResponseStreaming() {
            this.copyOnWrite();
            Method.u(((Method)this.instance));
            return this;
        }

        public Builder clearResponseTypeUrl() {
            this.copyOnWrite();
            Method.r(((Method)this.instance));
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            Method.E(((Method)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getNameBytes() {
            return ((Method)this.instance).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Option getOptions(int v) {
            return ((Method)this.instance).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((Method)this.instance).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public List getOptionsList() {
            return Collections.unmodifiableList(((Method)this.instance).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((Method)this.instance).getRequestStreaming();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getRequestTypeUrl() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getRequestTypeUrlBytes() {
            return ((Method)this.instance).getRequestTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((Method)this.instance).getResponseStreaming();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getResponseTypeUrl() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getResponseTypeUrlBytes() {
            return ((Method)this.instance).getResponseTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Syntax getSyntax() {
            return ((Method)this.instance).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((Method)this.instance).getSyntaxValue();
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            Method.A(v, ((Method)this.instance));
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Method.q(((Method)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Method.F(((Method)this.instance), byteString0);
            return this;
        }

        public Builder setOptions(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            Method.v(((Method)this.instance), v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            Method.v(((Method)this.instance), v, option0);
            return this;
        }

        public Builder setRequestStreaming(boolean z) {
            this.copyOnWrite();
            Method.J(((Method)this.instance), z);
            return this;
        }

        public Builder setRequestTypeUrl(String s) {
            this.copyOnWrite();
            Method.G(((Method)this.instance), s);
            return this;
        }

        public Builder setRequestTypeUrlBytes(ByteString byteString0) {
            this.copyOnWrite();
            Method.I(((Method)this.instance), byteString0);
            return this;
        }

        public Builder setResponseStreaming(boolean z) {
            this.copyOnWrite();
            Method.t(((Method)this.instance), z);
            return this;
        }

        public Builder setResponseTypeUrl(String s) {
            this.copyOnWrite();
            Method.L(((Method)this.instance), s);
            return this;
        }

        public Builder setResponseTypeUrlBytes(ByteString byteString0) {
            this.copyOnWrite();
            Method.s(((Method)this.instance), byteString0);
            return this;
        }

        public Builder setSyntax(Syntax syntax0) {
            this.copyOnWrite();
            Method.D(((Method)this.instance), syntax0);
            return this;
        }

        public Builder setSyntaxValue(int v) {
            this.copyOnWrite();
            Method.C(v, ((Method)this.instance));
            return this;
        }
    }

    private static final Method DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_;
    private ProtobufList options_;
    private boolean requestStreaming_;
    private String requestTypeUrl_;
    private boolean responseStreaming_;
    private String responseTypeUrl_;
    private int syntax_;

    static {
        Method method0 = new Method();
        Method.DEFAULT_INSTANCE = method0;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method0);
    }

    public Method() {
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.responseTypeUrl_ = "";
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void A(int v, Method method0) {
        method0.M();
        method0.options_.remove(v);
    }

    public static void B(Method method0) {
        method0.getClass();
        method0.name_ = "";
    }

    public static void C(int v, Method method0) {
        method0.syntax_ = v;
    }

    public static void D(Method method0, Syntax syntax0) {
        method0.getClass();
        method0.syntax_ = syntax0.getNumber();
    }

    public static void E(Method method0) {
        method0.syntax_ = 0;
    }

    public static void F(Method method0, ByteString byteString0) {
        method0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        method0.name_ = byteString0.toStringUtf8();
    }

    public static void G(Method method0, String s) {
        method0.getClass();
        s.getClass();
        method0.requestTypeUrl_ = s;
    }

    public static void H(Method method0) {
        method0.getClass();
        method0.requestTypeUrl_ = "";
    }

    public static void I(Method method0, ByteString byteString0) {
        method0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        method0.requestTypeUrl_ = byteString0.toStringUtf8();
    }

    public static void J(Method method0, boolean z) {
        method0.requestStreaming_ = z;
    }

    public static void K(Method method0) {
        method0.requestStreaming_ = false;
    }

    public static void L(Method method0, String s) {
        method0.getClass();
        s.getClass();
        method0.responseTypeUrl_ = s;
    }

    public final void M() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(k2.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Method();
            }
            case 2: {
                return new Builder(Method.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001B\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            }
            case 4: {
                return Method.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Method.PARSER;
                if(parser0 == null) {
                    Class class0 = Method.class;
                    synchronized(class0) {
                        parser0 = Method.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Method.DEFAULT_INSTANCE);
                            Method.PARSER = parser0;
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

    public static Method getDefaultInstance() {
        return Method.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getRequestTypeUrl() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getRequestTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getResponseTypeUrl() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getResponseTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.forNumber(this.syntax_);
        return syntax0 == null ? Syntax.UNRECOGNIZED : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static Builder newBuilder() {
        return (Builder)Method.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Method method0) {
        return (Builder)Method.DEFAULT_INSTANCE.createBuilder(method0);
    }

    public static Method parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Method)GeneratedMessageLite.parseDelimitedFrom(Method.DEFAULT_INSTANCE, inputStream0);
    }

    public static Method parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.parseDelimitedFrom(Method.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Method parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, byteString0);
    }

    public static Method parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Method parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Method parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Method parseFrom(InputStream inputStream0) throws IOException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, inputStream0);
    }

    public static Method parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Method parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Method parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Method parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, arr_b);
    }

    public static Method parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.parseFrom(Method.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Method.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Method method0, String s) {
        method0.getClass();
        s.getClass();
        method0.name_ = s;
    }

    public static void r(Method method0) {
        method0.getClass();
        method0.responseTypeUrl_ = "";
    }

    public static void s(Method method0, ByteString byteString0) {
        method0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        method0.responseTypeUrl_ = byteString0.toStringUtf8();
    }

    public static void t(Method method0, boolean z) {
        method0.responseStreaming_ = z;
    }

    public static void u(Method method0) {
        method0.responseStreaming_ = false;
    }

    public static void v(Method method0, int v, Option option0) {
        method0.getClass();
        option0.getClass();
        method0.M();
        method0.options_.set(v, option0);
    }

    public static void w(Method method0, Option option0) {
        method0.getClass();
        option0.getClass();
        method0.M();
        method0.options_.add(option0);
    }

    public static void x(Method method0, int v, Option option0) {
        method0.getClass();
        option0.getClass();
        method0.M();
        method0.options_.add(v, option0);
    }

    public static void y(Method method0, Iterable iterable0) {
        method0.M();
        AbstractMessageLite.addAll(iterable0, method0.options_);
    }

    public static void z(Method method0) {
        method0.getClass();
        method0.options_ = GeneratedMessageLite.emptyProtobufList();
    }
}

