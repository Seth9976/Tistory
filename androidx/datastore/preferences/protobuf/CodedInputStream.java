package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class CodedInputStream {
    public int a;
    public int b;
    public int c;
    public y d;

    public CodedInputStream() {
        this.b = 100;
        this.c = 0x7FFFFFFF;
    }

    public static t a(byte[] arr_b, int v, int v1, boolean z) {
        t t0 = new t(arr_b, v, v1, z);
        try {
            t0.pushLimit(v1);
            return t0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new IllegalArgumentException(invalidProtocolBufferException0);
        }
    }

    public static CodedInputStream b(Iterable iterable0, boolean z) {
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            v1 += byteBuffer0.remaining();
            if(byteBuffer0.hasArray()) {
                v |= 1;
            }
            else {
                v |= (byteBuffer0.isDirect() ? 2 : 4);
            }
        }
        return v == 2 ? new u(iterable0, v1, z) : CodedInputStream.newInstance(new r1(iterable0));
    }

    public static CodedInputStream c(ByteBuffer byteBuffer0, boolean z) {
        if(byteBuffer0.hasArray()) {
            return CodedInputStream.a(byteBuffer0.array(), byteBuffer0.position() + byteBuffer0.arrayOffset(), byteBuffer0.remaining(), z);
        }
        if(byteBuffer0.isDirect() && d4.d) {
            return new w(byteBuffer0, z);
        }
        int v = byteBuffer0.remaining();
        byte[] arr_b = new byte[v];
        byteBuffer0.duplicate().get(arr_b);
        return CodedInputStream.a(arr_b, 0, v, true);
    }

    public abstract void checkLastTagWas(int arg1) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if(this.a >= this.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public static int decodeZigZag32(int v) [...] // Inlined contents

    public static long decodeZigZag64(long v) [...] // Inlined contents

    public abstract void enableAliasing(boolean arg1);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public static CodedInputStream newInstance(InputStream inputStream0) {
        return CodedInputStream.newInstance(inputStream0, 0x1000);
    }

    public static CodedInputStream newInstance(InputStream inputStream0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        return inputStream0 == null ? CodedInputStream.newInstance(Internal.EMPTY_BYTE_ARRAY) : new v(inputStream0, v);
    }

    public static CodedInputStream newInstance(Iterable iterable0) {
        return d4.d ? CodedInputStream.b(iterable0, false) : CodedInputStream.newInstance(new r1(iterable0));
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer0) {
        return CodedInputStream.c(byteBuffer0, false);
    }

    public static CodedInputStream newInstance(byte[] arr_b) {
        return CodedInputStream.newInstance(arr_b, 0, arr_b.length);
    }

    public static CodedInputStream newInstance(byte[] arr_b, int v, int v1) {
        return CodedInputStream.a(arr_b, v, v1, false);
    }

    public abstract void popLimit(int arg1);

    public abstract int pushLimit(int arg1) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract MessageLite readGroup(int arg1, Parser arg2, ExtensionRegistryLite arg3) throws IOException;

    public abstract void readGroup(int arg1, Builder arg2, ExtensionRegistryLite arg3) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract MessageLite readMessage(Parser arg1, ExtensionRegistryLite arg2) throws IOException;

    public abstract void readMessage(Builder arg1, ExtensionRegistryLite arg2) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int arg1) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public static int readRawVarint32(int v, InputStream inputStream0) throws IOException {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2;
        for(v2 = 7; v2 < 0x20; v2 += 7) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
        }
        throw InvalidProtocolBufferException.e();
    }

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int arg1, Builder arg2) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + v);
        }
        int v1 = this.b;
        this.b = v;
        return v1;
    }

    public final int setSizeLimit(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + v);
        }
        int v1 = this.c;
        this.c = v;
        return v1;
    }

    public abstract boolean skipField(int arg1) throws IOException;

    @Deprecated
    public abstract boolean skipField(int arg1, CodedOutputStream arg2) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream arg1) throws IOException;

    public abstract void skipRawBytes(int arg1) throws IOException;
}

