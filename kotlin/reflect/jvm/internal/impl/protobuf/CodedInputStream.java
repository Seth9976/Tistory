package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public final class CodedInputStream {
    interface RefillCallback {
        void onRefill();
    }

    public final byte[] a;
    public int b;
    public int c;
    public int d;
    public final InputStream e;
    public int f;
    public int g;
    public int h;
    public int i;

    public CodedInputStream(InputStream inputStream0) {
        this.h = 0x7FFFFFFF;
        this.a = new byte[0x1000];
        this.b = 0;
        this.d = 0;
        this.g = 0;
        this.e = inputStream0;
    }

    public CodedInputStream(i i0) {
        this.h = 0x7FFFFFFF;
        this.a = i0.a;
        this.d = 0;
        this.b = i0.a.length;
        this.g = 0;
        this.e = null;
    }

    public final byte[] a(int v) {
        if(v <= 0) {
            if(v != 0) {
                throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            return Internal.EMPTY_BYTE_ARRAY;
        }
        int v1 = this.g;
        int v2 = this.d;
        int v3 = this.h;
        if(v1 + v2 + v <= v3) {
            byte[] arr_b = this.a;
            if(v < 0x1000) {
                byte[] arr_b1 = new byte[v];
                int v4 = this.b - v2;
                System.arraycopy(arr_b, v2, arr_b1, 0, v4);
                this.d = this.b;
                int v5 = v - v4;
                if(v5 > 0) {
                    this.d(v5);
                }
                System.arraycopy(arr_b, 0, arr_b1, v4, v5);
                this.d = v5;
                return arr_b1;
            }
            int v6 = this.b;
            this.g = v1 + v6;
            this.d = 0;
            this.b = 0;
            int v7 = v6 - v2;
            int v8 = v - v7;
            ArrayList arrayList0 = new ArrayList();
            while(v8 > 0) {
                int v9 = Math.min(v8, 0x1000);
                byte[] arr_b2 = new byte[v9];
                for(int v10 = 0; v10 < v9; v10 += v11) {
                    int v11 = this.e == null ? -1 : this.e.read(arr_b2, v10, v9 - v10);
                    if(v11 == -1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    this.g += v11;
                }
                v8 -= v9;
                arrayList0.add(arr_b2);
            }
            byte[] arr_b3 = new byte[v];
            System.arraycopy(arr_b, v2, arr_b3, 0, v7);
            for(Object object0: arrayList0) {
                System.arraycopy(((byte[])object0), 0, arr_b3, v7, ((byte[])object0).length);
                v7 += ((byte[])object0).length;
            }
            return arr_b3;
        }
        this.skipRawBytes(v3 - v1 - v2);
        throw InvalidProtocolBufferException.a();
    }

    public final long b() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.readRawByte();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final void c() {
        int v = this.b + this.c;
        this.b = v;
        int v1 = this.g + v;
        int v2 = this.h;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.c = v3;
            this.b = v - v3;
            return;
        }
        this.c = 0;
    }

    public void checkLastTagWas(int v) throws InvalidProtocolBufferException {
        if(this.f != v) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void d(int v) {
        if(!this.e(v)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public static int decodeZigZag32(int v) {
        return -(v & 1) ^ v >>> 1;
    }

    public static long decodeZigZag64(long v) {
        return -(v & 1L) ^ v >>> 1;
    }

    public final boolean e(int v) {
        int v1 = this.d;
        int v2 = this.b;
        if(v1 + v <= v2) {
            throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
        }
        if(this.g + v1 + v > this.h) {
            return false;
        }
        InputStream inputStream0 = this.e;
        if(inputStream0 != null) {
            byte[] arr_b = this.a;
            if(v1 > 0) {
                if(v2 > v1) {
                    System.arraycopy(arr_b, v1, arr_b, 0, v2 - v1);
                }
                this.g += v1;
                this.b -= v1;
                this.d = 0;
            }
            int v3 = inputStream0.read(arr_b, this.b, arr_b.length - this.b);
            if(v3 == 0 || v3 < -1 || v3 > arr_b.length) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + v3 + "\nThe InputStream implementation is buggy.");
            }
            if(v3 > 0) {
                this.b += v3;
                if(this.g + v - 0x4000000 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                this.c();
                return this.b < v ? this.e(v) : true;
            }
        }
        return false;
    }

    public int getBytesUntilLimit() {
        return this.h == 0x7FFFFFFF ? -1 : this.h - (this.g + this.d);
    }

    // 去混淆评级： 低(20)
    public boolean isAtEnd() throws IOException {
        return this.d == this.b && !this.e(1);
    }

    public static CodedInputStream newInstance(InputStream inputStream0) {
        return new CodedInputStream(inputStream0);
    }

    public void popLimit(int v) {
        this.h = v;
        this.c();
    }

    public int pushLimit(int v) throws InvalidProtocolBufferException {
        if(v < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = this.g + this.d + v;
        int v2 = this.h;
        if(v1 > v2) {
            throw InvalidProtocolBufferException.a();
        }
        this.h = v1;
        this.c();
        return v2;
    }

    public boolean readBool() throws IOException {
        return this.readRawVarint64() != 0L;
    }

    public ByteString readBytes() throws IOException {
        int v = this.readRawVarint32();
        int v1 = this.d;
        if(v <= this.b - v1 && v > 0) {
            ByteString byteString0 = ByteString.copyFrom(this.a, v1, v);
            this.d += v;
            return byteString0;
        }
        return v == 0 ? ByteString.EMPTY : new i(this.a(v));
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return this.readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return this.readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return this.readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readRawLittleEndian32());
    }

    public void readGroup(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v1 = this.i;
        if(v1 >= 0x40) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.i = v1 + 1;
        messageLite$Builder0.mergeFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(v << 3 | 4);
        --this.i;
    }

    public int readInt32() throws IOException {
        return this.readRawVarint32();
    }

    public long readInt64() throws IOException {
        return this.readRawVarint64();
    }

    public MessageLite readMessage(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = this.readRawVarint32();
        if(this.i >= 0x40) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = this.pushLimit(v);
        ++this.i;
        MessageLite messageLite0 = (MessageLite)parser0.parsePartialFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(0);
        --this.i;
        this.popLimit(v1);
        return messageLite0;
    }

    public void readMessage(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = this.readRawVarint32();
        if(this.i >= 0x40) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = this.pushLimit(v);
        ++this.i;
        messageLite$Builder0.mergeFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(0);
        --this.i;
        this.popLimit(v1);
    }

    public byte readRawByte() throws IOException {
        if(this.d == this.b) {
            this.d(1);
        }
        int v = this.d;
        this.d = v + 1;
        return this.a[v];
    }

    public int readRawLittleEndian32() throws IOException {
        int v = this.d;
        if(this.b - v < 4) {
            this.d(4);
            v = this.d;
        }
        this.d = v + 4;
        return (this.a[v + 3] & 0xFF) << 24 | (this.a[v] & 0xFF | (this.a[v + 1] & 0xFF) << 8 | (this.a[v + 2] & 0xFF) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int v = this.d;
        if(this.b - v < 8) {
            this.d(8);
            v = this.d;
        }
        this.d = v + 8;
        return (((long)this.a[v + 7]) & 0xFFL) << 56 | (((long)this.a[v]) & 0xFFL | (((long)this.a[v + 1]) & 0xFFL) << 8 | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v + 4]) & 0xFFL) << 0x20 | (((long)this.a[v + 5]) & 0xFFL) << 40 | (((long)this.a[v + 6]) & 0xFFL) << 0x30);
    }

    public static int readRawVarint32(int v, InputStream inputStream0) throws IOException {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2;
        for(v2 = 7; v2 < 0x20; v2 += 7) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw InvalidProtocolBufferException.a();
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw InvalidProtocolBufferException.a();
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public int readRawVarint32() throws IOException {
        int v5;
        int v = this.d;
        int v1 = this.b;
        if(v1 != v) {
            byte[] arr_b = this.a;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.d = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(((long)v4) < 0L) {
                    v5 = (int)(0xFFFFFFFFFFFFFF80L ^ ((long)v4));
                    this.d = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(((long)v7) >= 0L) {
                    v5 = (int)(0x3F80L ^ ((long)v7));
                    v3 = v6;
                    this.d = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(((long)v9) < 0L) {
                    v5 = (int)(0xFFFFFFFFFFE03F80L ^ ((long)v9));
                    v3 = v8;
                    this.d = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = (int)(((long)(v9 ^ v10 << 28)) ^ 0xFE03F80L);
                if(v10 >= 0) {
                    v3 = v6;
                    this.d = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.d = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.d = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.d = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.d = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.d = v3;
                    return v11;
                }
            }
        }
        return (int)this.b();
    }

    public long readRawVarint64() throws IOException {
        long v5;
        int v = this.d;
        int v1 = this.b;
        if(v1 != v) {
            byte[] arr_b = this.a;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.d = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                long v4 = (long)(arr_b[v + 1] << 7 ^ v2);
                if(v4 < 0L) {
                    v5 = 0xFFFFFFFFFFFFFF80L ^ v4;
                }
                else {
                    long v6 = v4 ^ ((long)(arr_b[v3] << 14));
                    if(v6 >= 0L) {
                        v3 = v + 3;
                        v5 = 0x3F80L ^ v6;
                    }
                    else {
                        v3 = v + 4;
                        v4 = v6 ^ ((long)(arr_b[v + 3] << 21));
                        if(v4 < 0L) {
                            v5 = 0xFFFFFFFFFFE03F80L ^ v4;
                        }
                        else {
                            v6 = v4 ^ ((long)arr_b[v3]) << 28;
                            if(v6 >= 0L) {
                                v3 = v + 5;
                                v5 = 0xFE03F80L ^ v6;
                            }
                            else {
                                v3 = v + 6;
                                v4 = v6 ^ ((long)arr_b[v + 5]) << 35;
                                if(v4 < 0L) {
                                    v5 = 0xFFFFFFF80FE03F80L ^ v4;
                                }
                                else {
                                    v6 = v4 ^ ((long)arr_b[v3]) << 42;
                                    if(v6 >= 0L) {
                                        v3 = v + 7;
                                        v5 = 0x3F80FE03F80L ^ v6;
                                    }
                                    else {
                                        v3 = v + 8;
                                        v4 = v6 ^ ((long)arr_b[v + 7]) << 49;
                                        if(v4 < 0L) {
                                            v5 = 0xFFFE03F80FE03F80L ^ v4;
                                        }
                                        else {
                                            long v7 = v4 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                                            if(v7 < 0L) {
                                                v3 = v + 10;
                                                if(((long)arr_b[v + 9]) < 0L) {
                                                    return this.b();
                                                }
                                            }
                                            else {
                                                v3 = v + 9;
                                            }
                                            v5 = v7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.d = v3;
                return v5;
            }
        }
        return this.b();
    }

    public int readSFixed32() throws IOException {
        return this.readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return this.readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return CodedInputStream.decodeZigZag32(this.readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return CodedInputStream.decodeZigZag64(this.readRawVarint64());
    }

    public String readString() throws IOException {
        int v = this.readRawVarint32();
        int v1 = this.d;
        if(v <= this.b - v1 && v > 0) {
            String s = new String(this.a, v1, v, "UTF-8");
            this.d += v;
            return s;
        }
        return v == 0 ? "" : new String(this.a(v), "UTF-8");
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] arr_b;
        int v = this.readRawVarint32();
        int v1 = this.d;
        if(v > this.b - v1 || v <= 0) {
            if(v == 0) {
                return "";
            }
            arr_b = this.a(v);
            v1 = 0;
        }
        else {
            this.d = v1 + v;
            arr_b = this.a;
        }
        if(o.c(arr_b, v1, v1 + v) != 0) {
            throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
        }
        return new String(arr_b, v1, v, "UTF-8");
    }

    public int readTag() throws IOException {
        if(this.isAtEnd()) {
            this.f = 0;
            return 0;
        }
        int v = this.readRawVarint32();
        this.f = v;
        if(v >>> 3 == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        return this.f;
    }

    public int readUInt32() throws IOException {
        return this.readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return this.readRawVarint64();
    }

    public boolean skipField(int v, CodedOutputStream codedOutputStream0) throws IOException {
        switch(v & 7) {
            case 0: {
                long v3 = this.readInt64();
                codedOutputStream0.writeRawVarint32(v);
                codedOutputStream0.writeUInt64NoTag(v3);
                return true;
            }
            case 1: {
                long v4 = this.readRawLittleEndian64();
                codedOutputStream0.writeRawVarint32(v);
                codedOutputStream0.writeFixed64NoTag(v4);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            codedOutputStream0.writeRawVarint32(v);
                            this.skipMessage(codedOutputStream0);
                            int v2 = v >>> 3 << 3 | 4;
                            this.checkLastTagWas(v2);
                            codedOutputStream0.writeRawVarint32(v2);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
                            }
                            int v1 = this.readRawLittleEndian32();
                            codedOutputStream0.writeRawVarint32(v);
                            codedOutputStream0.writeFixed32NoTag(v1);
                            return true;
                        }
                    }
                }
                ByteString byteString0 = this.readBytes();
                codedOutputStream0.writeRawVarint32(v);
                codedOutputStream0.writeBytesNoTag(byteString0);
                return true;
            }
        }
    }

    public void skipMessage(CodedOutputStream codedOutputStream0) throws IOException {
        do {
            int v = this.readTag();
        }
        while(v != 0 && this.skipField(v, codedOutputStream0));
    }

    public void skipRawBytes(int v) throws IOException {
        int v6;
        int v1 = this.b;
        int v2 = this.d;
        int v3 = v1 - v2;
        if(v <= v3 && v >= 0) {
            this.d = v2 + v;
            return;
        }
        if(v < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v4 = this.g;
        int v5 = this.h;
        if(v4 + v2 + v <= v5) {
            this.d = v1;
            this.d(1);
            while(true) {
                v6 = v - v3;
                int v7 = this.b;
                if(v6 <= v7) {
                    break;
                }
                v3 += v7;
                this.d = v7;
                this.d(1);
            }
            this.d = v6;
            return;
        }
        this.skipRawBytes(v5 - v4 - v2);
        throw InvalidProtocolBufferException.a();
    }
}

