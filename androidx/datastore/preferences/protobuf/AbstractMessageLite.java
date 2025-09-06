package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite implements MessageLite {
    public static abstract class Builder implements androidx.datastore.preferences.protobuf.MessageLite.Builder {
        public final String a(String s) [...] // 潜在的解密器

        @Deprecated
        public static void addAll(Iterable iterable0, Collection collection0) {
            Builder.addAll(iterable0, ((List)collection0));
        }

        public static void addAll(Iterable iterable0, List list0) {
            iterable0.getClass();
            if(iterable0 instanceof LazyStringList) {
                List list1 = ((LazyStringList)iterable0).getUnderlyingElements();
                int v = list0.size();
                for(Object object0: list1) {
                    if(object0 == null) {
                        String s = "Element at index " + (((LazyStringList)list0).size() - v) + " is null.";
                        for(int v1 = ((LazyStringList)list0).size() - 1; v1 >= v; --v1) {
                            ((LazyStringList)list0).remove(v1);
                        }
                        throw new NullPointerException(s);
                    }
                    if(object0 instanceof ByteString) {
                        ((LazyStringList)list0).add(((ByteString)object0));
                    }
                    else {
                        ((LazyStringList)list0).add(((String)object0));
                    }
                }
                return;
            }
            if(iterable0 instanceof PrimitiveNonBoxingCollection) {
                list0.addAll(((Collection)iterable0));
                return;
            }
            if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
                ((ArrayList)list0).ensureCapacity(((Collection)iterable0).size() + list0.size());
            }
            int v2 = list0.size();
            for(Object object1: iterable0) {
                if(object1 == null) {
                    String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                    for(int v3 = list0.size() - 1; v3 >= v2; --v3) {
                        list0.remove(v3);
                    }
                    throw new NullPointerException(s1);
                }
                list0.add(object1);
            }
        }

        public abstract Builder clone();

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clone() {
            return this.clone();
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        public abstract Builder internalMergeFrom(AbstractMessageLite arg1);

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public boolean mergeDelimitedFrom(InputStream inputStream0) throws IOException {
            return this.mergeDelimitedFrom(inputStream0, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public boolean mergeDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = inputStream0.read();
            if(v == -1) {
                return false;
            }
            this.mergeFrom(new a(inputStream0, CodedInputStream.readRawVarint32(v, inputStream0)), extensionRegistryLite0);
            return true;
        }

        public Builder mergeFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = byteString0.newCodedInput();
                this.mergeFrom(codedInputStream0);
                codedInputStream0.checkLastTagWas(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a ByteString threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder mergeFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = byteString0.newCodedInput();
                this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                codedInputStream0.checkLastTagWas(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a ByteString threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder mergeFrom(CodedInputStream codedInputStream0) throws IOException {
            return this.mergeFrom(codedInputStream0, ExtensionRegistryLite.getEmptyRegistry());
        }

        public abstract Builder mergeFrom(CodedInputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        public Builder mergeFrom(MessageLite messageLite0) {
            if(!this.getDefaultInstanceForType().getClass().isInstance(messageLite0)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return this.internalMergeFrom(((AbstractMessageLite)messageLite0));
        }

        public Builder mergeFrom(InputStream inputStream0) throws IOException {
            CodedInputStream codedInputStream0 = CodedInputStream.newInstance(inputStream0);
            this.mergeFrom(codedInputStream0);
            codedInputStream0.checkLastTagWas(0);
            return this;
        }

        public Builder mergeFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            CodedInputStream codedInputStream0 = CodedInputStream.newInstance(inputStream0);
            this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            codedInputStream0.checkLastTagWas(0);
            return this;
        }

        public Builder mergeFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, 0, arr_b.length);
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = CodedInputStream.newInstance(arr_b, v, v1);
                this.mergeFrom(codedInputStream0);
                codedInputStream0.checkLastTagWas(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a byte array threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = CodedInputStream.newInstance(arr_b, v, v1);
                this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                codedInputStream0.checkLastTagWas(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a byte array threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder mergeFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, 0, arr_b.length, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return this.mergeFrom(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(byteString0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0) throws IOException {
            return this.mergeFrom(codedInputStream0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(MessageLite messageLite0) {
            return this.mergeFrom(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(InputStream inputStream0) throws IOException {
            return this.mergeFrom(inputStream0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(inputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, extensionRegistryLite0);
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite0) {
            return new UninitializedMessageException(messageLite0);
        }
    }

    public interface InternalOneOfEnum {
        int getNumber();
    }

    protected int memoizedHashCode;

    public AbstractMessageLite() {
        this.memoizedHashCode = 0;
    }

    public int a() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static void addAll(Iterable iterable0, Collection collection0) {
        Builder.addAll(iterable0, ((List)collection0));
    }

    public static void addAll(Iterable iterable0, List list0) {
        Builder.addAll(iterable0, list0);
    }

    public int b(Schema schema0) {
        int v = this.a();
        if(v == -1) {
            v = schema0.getSerializedSize(this);
            this.d(v);
        }
        return v;
    }

    public final String c(String s) [...] // 潜在的解密器

    public static void checkByteStringIsUtf8(ByteString byteString0) throws IllegalArgumentException {
        if(!byteString0.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public void d(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] arr_b = new byte[this.getSerializedSize()];
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(arr_b);
            this.writeTo(codedOutputStream0);
            codedOutputStream0.checkNoSpaceLeft();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing androidx.datastore.preferences.protobuf.AbstractMessageLite to a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            byte[] arr_b = new byte[this.getSerializedSize()];
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(arr_b);
            this.writeTo(codedOutputStream0);
            codedOutputStream0.checkNoSpaceLeft();
            return new q(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing androidx.datastore.preferences.protobuf.AbstractMessageLite to a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream0) throws IOException {
        int v = this.getSerializedSize();
        CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(outputStream0, (CodedOutputStream.computeUInt32SizeNoTag(v) + v <= 0x1000 ? CodedOutputStream.computeUInt32SizeNoTag(v) + v : 0x1000));
        codedOutputStream0.writeUInt32NoTag(v);
        this.writeTo(codedOutputStream0);
        codedOutputStream0.flush();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(OutputStream outputStream0) throws IOException {
        int v = this.getSerializedSize();
        if(v > 0x1000) {
            v = 0x1000;
        }
        CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(outputStream0, v);
        this.writeTo(codedOutputStream0);
        codedOutputStream0.flush();
    }
}

