package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BoolValue extends GeneratedMessageLite implements BoolValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements BoolValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            BoolValue.r(((BoolValue)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return ((BoolValue)this.instance).getValue();
        }

        public Builder setValue(boolean z) {
            this.copyOnWrite();
            BoolValue.q(((BoolValue)this.instance), z);
            return this;
        }
    }

    private static final BoolValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue0 = new BoolValue();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        BoolValue.DEFAULT_INSTANCE = boolValue0;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, boolValue0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(i.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new BoolValue();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(BoolValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            }
            case 4: {
                return BoolValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = BoolValue.PARSER;
                if(parser0 == null) {
                    Class class0 = BoolValue.class;
                    synchronized(class0) {
                        parser0 = BoolValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(BoolValue.DEFAULT_INSTANCE);
                            BoolValue.PARSER = parser0;
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

    public static BoolValue getDefaultInstance() {
        return BoolValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)BoolValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BoolValue boolValue0) {
        return (Builder)BoolValue.DEFAULT_INSTANCE.createBuilder(boolValue0);
    }

    public static BoolValue of(boolean z) {
        return (BoolValue)BoolValue.newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteString0);
    }

    public static BoolValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, arr_b);
    }

    public static BoolValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return BoolValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(BoolValue boolValue0, boolean z) {
        boolValue0.value_ = z;
    }

    public static void r(BoolValue boolValue0) {
        boolValue0.value_ = false;
    }
}

