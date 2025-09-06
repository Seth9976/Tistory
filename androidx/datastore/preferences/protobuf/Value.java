package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageLite implements ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ValueOrBuilder {
        public Builder clearBoolValue() {
            this.copyOnWrite();
            Value.s(((Value)this.instance));
            return this;
        }

        public Builder clearKind() {
            this.copyOnWrite();
            Value.q(((Value)this.instance));
            return this;
        }

        public Builder clearListValue() {
            this.copyOnWrite();
            Value.y(((Value)this.instance));
            return this;
        }

        public Builder clearNullValue() {
            this.copyOnWrite();
            Value.B(((Value)this.instance));
            return this;
        }

        public Builder clearNumberValue() {
            this.copyOnWrite();
            Value.D(((Value)this.instance));
            return this;
        }

        public Builder clearStringValue() {
            this.copyOnWrite();
            Value.F(((Value)this.instance));
            return this;
        }

        public Builder clearStructValue() {
            this.copyOnWrite();
            Value.v(((Value)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((Value)this.instance).getBoolValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
            return ((Value)this.instance).getKindCase();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ListValue getListValue() {
            return ((Value)this.instance).getListValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
            return ((Value)this.instance).getNullValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((Value)this.instance).getNullValueValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((Value)this.instance).getNumberValue();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public String getStringValue() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
            return ((Value)this.instance).getStringValueBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public Struct getStructValue() {
            return ((Value)this.instance).getStructValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
            return ((Value)this.instance).hasBoolValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((Value)this.instance).hasListValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
            return ((Value)this.instance).hasNullValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
            return ((Value)this.instance).hasNumberValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
            return ((Value)this.instance).hasStringValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((Value)this.instance).hasStructValue();
        }

        public Builder mergeListValue(ListValue listValue0) {
            this.copyOnWrite();
            Value.x(listValue0, ((Value)this.instance));
            return this;
        }

        public Builder mergeStructValue(Struct struct0) {
            this.copyOnWrite();
            Value.u(((Value)this.instance), struct0);
            return this;
        }

        public Builder setBoolValue(boolean z) {
            this.copyOnWrite();
            Value.r(((Value)this.instance), z);
            return this;
        }

        public Builder setListValue(androidx.datastore.preferences.protobuf.ListValue.Builder listValue$Builder0) {
            this.copyOnWrite();
            Value value0 = (Value)this.instance;
            Value.w(((ListValue)listValue$Builder0.build()), value0);
            return this;
        }

        public Builder setListValue(ListValue listValue0) {
            this.copyOnWrite();
            Value.w(listValue0, ((Value)this.instance));
            return this;
        }

        public Builder setNullValue(NullValue nullValue0) {
            this.copyOnWrite();
            Value.A(((Value)this.instance), nullValue0);
            return this;
        }

        public Builder setNullValueValue(int v) {
            this.copyOnWrite();
            Value.z(v, ((Value)this.instance));
            return this;
        }

        public Builder setNumberValue(double f) {
            this.copyOnWrite();
            Value.C(((Value)this.instance), f);
            return this;
        }

        public Builder setStringValue(String s) {
            this.copyOnWrite();
            Value.E(s, ((Value)this.instance));
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString0) {
            this.copyOnWrite();
            Value.G(((Value)this.instance), byteString0);
            return this;
        }

        public Builder setStructValue(androidx.datastore.preferences.protobuf.Struct.Builder struct$Builder0) {
            this.copyOnWrite();
            Value.t(((Value)this.instance), ((Struct)struct$Builder0.build()));
            return this;
        }

        public Builder setStructValue(Struct struct0) {
            this.copyOnWrite();
            Value.t(((Value)this.instance), struct0);
            return this;
        }
    }

    public static enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        public final int a;

        public KindCase(int v1) {
            this.a = v1;
        }

        public static KindCase forNumber(int v) {
            switch(v) {
                case 0: {
                    return KindCase.KIND_NOT_SET;
                }
                case 1: {
                    return KindCase.NULL_VALUE;
                }
                case 2: {
                    return KindCase.NUMBER_VALUE;
                }
                case 3: {
                    return KindCase.STRING_VALUE;
                }
                case 4: {
                    return KindCase.BOOL_VALUE;
                }
                case 5: {
                    return KindCase.STRUCT_VALUE;
                }
                case 6: {
                    return KindCase.LIST_VALUE;
                }
                default: {
                    return null;
                }
            }
        }

        public int getNumber() {
            return this.a;
        }

        @Deprecated
        public static KindCase valueOf(int v) {
            return KindCase.forNumber(v);
        }
    }

    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private Object kind_;

    static {
        Value value0 = new Value();
        Value.DEFAULT_INSTANCE = value0;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value0);
    }

    public Value() {
        this.kindCase_ = 0;
    }

    public static void A(Value value0, NullValue nullValue0) {
        value0.getClass();
        value0.kind_ = nullValue0.getNumber();
        value0.kindCase_ = 1;
    }

    public static void B(Value value0) {
        if(value0.kindCase_ == 1) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void C(Value value0, double f) {
        value0.kindCase_ = 2;
        value0.kind_ = f;
    }

    public static void D(Value value0) {
        if(value0.kindCase_ == 2) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void E(String s, Value value0) {
        value0.getClass();
        s.getClass();
        value0.kindCase_ = 3;
        value0.kind_ = s;
    }

    public static void F(Value value0) {
        if(value0.kindCase_ == 3) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void G(Value value0, ByteString byteString0) {
        value0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        value0.kind_ = byteString0.toStringUtf8();
        value0.kindCase_ = 3;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(h4.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Value();
            }
            case 2: {
                return new Builder(Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            }
            case 4: {
                return Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Value.class;
                    synchronized(class0) {
                        parser0 = Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Value.DEFAULT_INSTANCE);
                            Value.PARSER = parser0;
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

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        return this.kindCase_ == 4 ? ((Boolean)this.kind_).booleanValue() : false;
    }

    public static Value getDefaultInstance() {
        return Value.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? ((ListValue)this.kind_) : ListValue.getDefaultInstance();
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
        if(this.kindCase_ == 1) {
            NullValue nullValue0 = NullValue.forNumber(((int)(((Integer)this.kind_))));
            return nullValue0 == null ? NullValue.UNRECOGNIZED : nullValue0;
        }
        return NullValue.NULL_VALUE;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        return this.kindCase_ == 1 ? ((int)(((Integer)this.kind_))) : 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
        return this.kindCase_ == 2 ? ((double)(((Double)this.kind_))) : 0.0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public String getStringValue() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
        return this.kindCase_ == 3 ? ByteString.copyFromUtf8(((String)this.kind_)) : ByteString.copyFromUtf8("");
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? ((Struct)this.kind_) : Struct.getDefaultInstance();
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static Builder newBuilder() {
        return (Builder)Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Value value0) {
        return (Builder)Value.DEFAULT_INSTANCE.createBuilder(value0);
    }

    public static Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Value)GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Value parseFrom(InputStream inputStream0) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Value.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Value value0) {
        value0.kindCase_ = 0;
        value0.kind_ = null;
    }

    public static void r(Value value0, boolean z) {
        value0.kindCase_ = 4;
        value0.kind_ = Boolean.valueOf(z);
    }

    public static void s(Value value0) {
        if(value0.kindCase_ == 4) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void t(Value value0, Struct struct0) {
        value0.getClass();
        struct0.getClass();
        value0.kind_ = struct0;
        value0.kindCase_ = 5;
    }

    public static void u(Value value0, Struct struct0) {
        value0.getClass();
        struct0.getClass();
        value0.kind_ = value0.kindCase_ != 5 || value0.kind_ == Struct.getDefaultInstance() ? struct0 : ((androidx.datastore.preferences.protobuf.Struct.Builder)Struct.newBuilder(((Struct)value0.kind_)).mergeFrom(struct0)).buildPartial();
        value0.kindCase_ = 5;
    }

    public static void v(Value value0) {
        if(value0.kindCase_ == 5) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void w(ListValue listValue0, Value value0) {
        value0.getClass();
        listValue0.getClass();
        value0.kind_ = listValue0;
        value0.kindCase_ = 6;
    }

    public static void x(ListValue listValue0, Value value0) {
        value0.getClass();
        listValue0.getClass();
        value0.kind_ = value0.kindCase_ != 6 || value0.kind_ == ListValue.getDefaultInstance() ? listValue0 : ((androidx.datastore.preferences.protobuf.ListValue.Builder)ListValue.newBuilder(((ListValue)value0.kind_)).mergeFrom(listValue0)).buildPartial();
        value0.kindCase_ = 6;
    }

    public static void y(Value value0) {
        if(value0.kindCase_ == 6) {
            value0.kindCase_ = 0;
            value0.kind_ = null;
        }
    }

    public static void z(int v, Value value0) {
        value0.kindCase_ = 1;
        value0.kind_ = v;
    }
}

