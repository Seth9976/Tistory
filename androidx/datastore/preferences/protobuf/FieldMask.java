package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class FieldMask extends GeneratedMessageLite implements FieldMaskOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements FieldMaskOrBuilder {
        public Builder addAllPaths(Iterable iterable0) {
            this.copyOnWrite();
            FieldMask.s(((FieldMask)this.instance), iterable0);
            return this;
        }

        public Builder addPaths(String s) {
            this.copyOnWrite();
            FieldMask.r(((FieldMask)this.instance), s);
            return this;
        }

        public Builder addPathsBytes(ByteString byteString0) {
            this.copyOnWrite();
            FieldMask.u(((FieldMask)this.instance), byteString0);
            return this;
        }

        public Builder clearPaths() {
            this.copyOnWrite();
            FieldMask.t(((FieldMask)this.instance));
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int v) {
            return ((FieldMask)this.instance).getPaths(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int v) {
            return ((FieldMask)this.instance).getPathsBytes(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask)this.instance).getPathsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List getPathsList() {
            return Collections.unmodifiableList(((FieldMask)this.instance).getPathsList());
        }

        public Builder setPaths(int v, String s) {
            this.copyOnWrite();
            FieldMask.q(((FieldMask)this.instance), v, s);
            return this;
        }
    }

    private static final FieldMask DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private ProtobufList paths_;

    static {
        FieldMask fieldMask0 = new FieldMask();
        FieldMask.DEFAULT_INSTANCE = fieldMask0;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask0);
    }

    public FieldMask() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(b1.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
            case 1: {
                return new FieldMask();
            }
            case 2: {
                return new Builder(FieldMask.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            }
            case 4: {
                return FieldMask.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = FieldMask.PARSER;
                if(parser0 == null) {
                    Class class0 = FieldMask.class;
                    synchronized(class0) {
                        parser0 = FieldMask.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(FieldMask.DEFAULT_INSTANCE);
                            FieldMask.PARSER = parser0;
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

    public static FieldMask getDefaultInstance() {
        return FieldMask.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int v) {
        return (String)this.paths_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int v) {
        return ByteString.copyFromUtf8(((String)this.paths_.get(v)));
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List getPathsList() {
        return this.paths_;
    }

    public static Builder newBuilder() {
        return (Builder)FieldMask.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(FieldMask fieldMask0) {
        return (Builder)FieldMask.DEFAULT_INSTANCE.createBuilder(fieldMask0);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseDelimitedFrom(FieldMask.DEFAULT_INSTANCE, inputStream0);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseDelimitedFrom(FieldMask.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static FieldMask parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, byteString0);
    }

    public static FieldMask parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static FieldMask parseFrom(InputStream inputStream0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, inputStream0);
    }

    public static FieldMask parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static FieldMask parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, arr_b);
    }

    public static FieldMask parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FieldMask)GeneratedMessageLite.parseFrom(FieldMask.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return FieldMask.DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(FieldMask fieldMask0, int v, String s) {
        fieldMask0.getClass();
        s.getClass();
        fieldMask0.v();
        fieldMask0.paths_.set(v, s);
    }

    public static void r(FieldMask fieldMask0, String s) {
        fieldMask0.getClass();
        s.getClass();
        fieldMask0.v();
        fieldMask0.paths_.add(s);
    }

    public static void s(FieldMask fieldMask0, Iterable iterable0) {
        fieldMask0.v();
        AbstractMessageLite.addAll(iterable0, fieldMask0.paths_);
    }

    public static void t(FieldMask fieldMask0) {
        fieldMask0.getClass();
        fieldMask0.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void u(FieldMask fieldMask0, ByteString byteString0) {
        fieldMask0.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        fieldMask0.v();
        fieldMask0.paths_.add(byteString0.toStringUtf8());
    }

    public final void v() {
        ProtobufList internal$ProtobufList0 = this.paths_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.paths_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }
}

