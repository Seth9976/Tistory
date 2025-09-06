package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ListValue extends GeneratedMessageLite implements ListValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ListValueOrBuilder {
        public Builder addAllValues(Iterable iterable0) {
            this.copyOnWrite();
            ListValue.t(((ListValue)this.instance), iterable0);
            return this;
        }

        public Builder addValues(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ListValue.s(((ListValue)this.instance), v, ((Value)value$Builder0.build()));
            return this;
        }

        public Builder addValues(int v, Value value0) {
            this.copyOnWrite();
            ListValue.s(((ListValue)this.instance), v, value0);
            return this;
        }

        public Builder addValues(androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ListValue.r(((ListValue)this.instance), ((Value)value$Builder0.build()));
            return this;
        }

        public Builder addValues(Value value0) {
            this.copyOnWrite();
            ListValue.r(((ListValue)this.instance), value0);
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ListValue.u(((ListValue)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public Value getValues(int v) {
            return ((ListValue)this.instance).getValues(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((ListValue)this.instance).getValuesCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public List getValuesList() {
            return Collections.unmodifiableList(((ListValue)this.instance).getValuesList());
        }

        public Builder removeValues(int v) {
            this.copyOnWrite();
            ListValue.v(((ListValue)this.instance), v);
            return this;
        }

        public Builder setValues(int v, androidx.datastore.preferences.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ListValue.q(((ListValue)this.instance), v, ((Value)value$Builder0.build()));
            return this;
        }

        public Builder setValues(int v, Value value0) {
            this.copyOnWrite();
            ListValue.q(((ListValue)this.instance), v, value0);
            return this;
        }
    }

    private static final ListValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private ProtobufList values_;

    static {
        ListValue listValue0 = new ListValue();
        ListValue.DEFAULT_INSTANCE = listValue0;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue0);
    }

    public ListValue() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(y1.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new ListValue();
            }
            case 2: {
                return new Builder(ListValue.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"values_", Value.class});
            }
            case 4: {
                return ListValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = ListValue.PARSER;
                if(parser0 == null) {
                    Class class0 = ListValue.class;
                    synchronized(class0) {
                        parser0 = ListValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(ListValue.DEFAULT_INSTANCE);
                            ListValue.PARSER = parser0;
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

    public static ListValue getDefaultInstance() {
        return ListValue.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public Value getValues(int v) {
        return (Value)this.values_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public List getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int v) {
        return (ValueOrBuilder)this.values_.get(v);
    }

    public List getValuesOrBuilderList() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return (Builder)ListValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListValue listValue0) {
        return (Builder)ListValue.DEFAULT_INSTANCE.createBuilder(listValue0);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteString0);
    }

    public static ListValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, arr_b);
    }

    public static ListValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return ListValue.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(ListValue listValue0, int v, Value value0) {
        listValue0.getClass();
        value0.getClass();
        listValue0.w();
        listValue0.values_.set(v, value0);
    }

    public static void r(ListValue listValue0, Value value0) {
        listValue0.getClass();
        value0.getClass();
        listValue0.w();
        listValue0.values_.add(value0);
    }

    public static void s(ListValue listValue0, int v, Value value0) {
        listValue0.getClass();
        value0.getClass();
        listValue0.w();
        listValue0.values_.add(v, value0);
    }

    public static void t(ListValue listValue0, Iterable iterable0) {
        listValue0.w();
        AbstractMessageLite.addAll(iterable0, listValue0.values_);
    }

    public static void u(ListValue listValue0) {
        listValue0.getClass();
        listValue0.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void v(ListValue listValue0, int v) {
        listValue0.w();
        listValue0.values_.remove(v);
    }

    public final void w() {
        ProtobufList internal$ProtobufList0 = this.values_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }
}

