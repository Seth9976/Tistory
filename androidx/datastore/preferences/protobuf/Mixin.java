package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Mixin extends GeneratedMessageLite implements MixinOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements MixinOrBuilder {
        public Builder clearName() {
            this.copyOnWrite();
            Mixin.r(((Mixin)this.instance));
            return this;
        }

        public Builder clearRoot() {
            this.copyOnWrite();
            Mixin.u(((Mixin)this.instance));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getName() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getNameBytes() {
            return ((Mixin)this.instance).getNameBytes();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getRoot() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getRootBytes() {
            return ((Mixin)this.instance).getRootBytes();
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            Mixin.q(((Mixin)this.instance), s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            Mixin.s(((Mixin)this.instance), byteString0);
            return this;
        }

        public Builder setRoot(String s) {
            this.copyOnWrite();
            Mixin.t(((Mixin)this.instance), s);
            return this;
        }

        public Builder setRootBytes(ByteString byteString0) {
            this.copyOnWrite();
            Mixin.v(((Mixin)this.instance), byteString0);
            return this;
        }
    }

    private static final Mixin DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_;
    private String root_;

    static {
        Mixin mixin0 = new Mixin();
        Mixin.DEFAULT_INSTANCE = mixin0;
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin0);
    }

    public Mixin() {
        this.name_ = "";
        this.root_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(l2.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Mixin();
            }
            case 2: {
                return new Builder(Mixin.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            }
            case 4: {
                return Mixin.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Mixin.PARSER;
                if(parser0 == null) {
                    Class class0 = Mixin.class;
                    synchronized(class0) {
                        parser0 = Mixin.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Mixin.DEFAULT_INSTANCE);
                            Mixin.PARSER = parser0;
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

    public static Mixin getDefaultInstance() {
        return Mixin.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getName() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getRoot() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getRootBytes() {
        return ByteString.copyFromUtf8(this.root_);
    }

    public static Builder newBuilder() {
        return (Builder)Mixin.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Mixin mixin0) {
        return (Builder)Mixin.DEFAULT_INSTANCE.createBuilder(mixin0);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseDelimitedFrom(Mixin.DEFAULT_INSTANCE, inputStream0);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseDelimitedFrom(Mixin.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Mixin parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, byteString0);
    }

    public static Mixin parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Mixin parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Mixin parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Mixin parseFrom(InputStream inputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, inputStream0);
    }

    public static Mixin parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Mixin parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, arr_b);
    }

    public static Mixin parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Mixin.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Mixin mixin0, String s) {
        mixin0.getClass();
        s.getClass();
        mixin0.name_ = s;
    }

    public static void r(Mixin mixin0) {
        mixin0.getClass();
        mixin0.name_ = "";
    }

    public static void s(Mixin mixin0, ByteString byteString0) {
        mixin0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        mixin0.name_ = byteString0.toStringUtf8();
    }

    public static void t(Mixin mixin0, String s) {
        mixin0.getClass();
        s.getClass();
        mixin0.root_ = s;
    }

    public static void u(Mixin mixin0) {
        mixin0.getClass();
        mixin0.root_ = "";
    }

    public static void v(Mixin mixin0, ByteString byteString0) {
        mixin0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        mixin0.root_ = byteString0.toStringUtf8();
    }
}

