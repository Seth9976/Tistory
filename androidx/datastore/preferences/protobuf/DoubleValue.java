package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DoubleValue extends GeneratedMessageLite implements DoubleValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements DoubleValueOrBuilder {
        public Builder clearValue() {
            this.copyOnWrite();
            DoubleValue.r(((DoubleValue)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.DoubleValueOrBuilder
        public double getValue() {
            return ((DoubleValue)this.instance).getValue();
        }

        public Builder setValue(double f) {
            this.copyOnWrite();
            DoubleValue.q(((DoubleValue)this.instance), f);
            return this;
        }
    }

    private static final DoubleValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue0 = new DoubleValue();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
        DoubleValue.DEFAULT_INSTANCE = doubleValue0;
        GeneratedMessageLite.registerDefaultInstance(DoubleValue.class, doubleValue0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(i0.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new DoubleValue();  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;-><init>()V
            }
            case 2: {
                return new Builder(DoubleValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            }
            case 4: {
                return DoubleValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = DoubleValue.PARSER;
                if(parser0 == null) {
                    Class class0 = DoubleValue.class;
                    synchronized(class0) {
                        parser0 = DoubleValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(DoubleValue.DEFAULT_INSTANCE);
                            DoubleValue.PARSER = parser0;
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

    public static DoubleValue getDefaultInstance() {
        return DoubleValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.DoubleValueOrBuilder
    public double getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)DoubleValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DoubleValue doubleValue0) {
        return (Builder)DoubleValue.DEFAULT_INSTANCE.createBuilder(doubleValue0);
    }

    public static DoubleValue of(double f) {
        return (DoubleValue)DoubleValue.newBuilder().setValue(f).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseDelimitedFrom(DoubleValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseDelimitedFrom(DoubleValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static DoubleValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, byteString0);
    }

    public static DoubleValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static DoubleValue parseFrom(InputStream inputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static DoubleValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static DoubleValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, arr_b);
    }

    public static DoubleValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.parseFrom(DoubleValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return DoubleValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(DoubleValue doubleValue0, double f) {
        doubleValue0.value_ = f;
    }

    public static void r(DoubleValue doubleValue0) {
        doubleValue0.value_ = 0.0;
    }
}

