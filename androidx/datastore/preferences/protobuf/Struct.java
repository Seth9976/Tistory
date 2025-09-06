package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class Struct extends GeneratedMessageLite implements StructOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StructOrBuilder {
        public Builder clearFields() {
            this.copyOnWrite();
            Struct.q(((Struct)this.instance)).clear();
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String s) {
            s.getClass();
            return ((Struct)this.instance).getFieldsMap().containsKey(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map getFields() {
            return this.getFieldsMap();
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct)this.instance).getFieldsMap().size();
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map getFieldsMap() {
            return Collections.unmodifiableMap(((Struct)this.instance).getFieldsMap());
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String s, Value value0) {
            s.getClass();
            Map map0 = ((Struct)this.instance).getFieldsMap();
            return map0.containsKey(s) ? ((Value)map0.get(s)) : value0;
        }

        @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String s) {
            s.getClass();
            Map map0 = ((Struct)this.instance).getFieldsMap();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Value)map0.get(s);
        }

        public Builder putAllFields(Map map0) {
            this.copyOnWrite();
            Struct.q(((Struct)this.instance)).putAll(map0);
            return this;
        }

        public Builder putFields(String s, Value value0) {
            s.getClass();
            value0.getClass();
            this.copyOnWrite();
            Struct.q(((Struct)this.instance)).put(s, value0);
            return this;
        }

        public Builder removeFields(String s) {
            s.getClass();
            this.copyOnWrite();
            Struct.q(((Struct)this.instance)).remove(s);
            return this;
        }
    }

    private static final Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private MapFieldLite fields_;

    static {
        Struct struct0 = new Struct();
        Struct.DEFAULT_INSTANCE = struct0;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct0);
    }

    public Struct() {
        this.fields_ = MapFieldLite.emptyMapField();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String s) {
        s.getClass();
        return this.fields_.containsKey(s);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(n3.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new Struct();
            }
            case 2: {
                return new Builder(Struct.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", o3.a});
            }
            case 4: {
                return Struct.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Struct.PARSER;
                if(parser0 == null) {
                    Class class0 = Struct.class;
                    synchronized(class0) {
                        parser0 = Struct.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Struct.DEFAULT_INSTANCE);
                            Struct.PARSER = parser0;
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

    public static Struct getDefaultInstance() {
        return Struct.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map getFields() {
        return this.getFieldsMap();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map getFieldsMap() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String s, Value value0) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.fields_;
        return mapFieldLite0.containsKey(s) ? ((Value)mapFieldLite0.get(s)) : value0;
    }

    @Override  // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.fields_;
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (Value)mapFieldLite0.get(s);
    }

    public static Builder newBuilder() {
        return (Builder)Struct.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Struct struct0) {
        return (Builder)Struct.DEFAULT_INSTANCE.createBuilder(struct0);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteString0);
    }

    public static Struct parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Struct parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, arr_b);
    }

    public static Struct parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Struct.DEFAULT_INSTANCE.getParserForType();
    }

    public static MapFieldLite q(Struct struct0) {
        if(!struct0.fields_.isMutable()) {
            struct0.fields_ = struct0.fields_.mutableCopy();
        }
        return struct0.fields_;
    }
}

