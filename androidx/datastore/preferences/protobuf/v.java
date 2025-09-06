package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public final class v extends CodedInputStream {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public v(InputStream inputStream0, int v) {
        this.l = 0x7FFFFFFF;
        Internal.a(inputStream0, "input");
        this.e = inputStream0;
        this.f = new byte[v];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void checkLastTagWas(int v) {
        if(this.j != v) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final byte[] d(int v, boolean z) {
        byte[] arr_b = this.e(v);
        if(arr_b != null) {
            return z ? ((byte[])arr_b.clone()) : arr_b;
        }
        int v1 = this.i;
        int v2 = this.g - v1;
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        ArrayList arrayList0 = this.f(v - v2);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.f, v1, arr_b1, 0, v2);
        for(Object object0: arrayList0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
            v2 += ((byte[])object0).length;
        }
        return arr_b1;
    }

    public final byte[] e(int v) {
        int v7;
        if(v == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if(v < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int v1 = this.k;
        int v2 = this.i;
        int v3 = v1 + v2 + v;
        if(v3 - this.c > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int v4 = this.l;
        if(v3 <= v4) {
            int v5 = this.g - v2;
            int v6 = v - v5;
            InputStream inputStream0 = this.e;
            if(v6 >= 0x1000) {
                try {
                    if(v6 > inputStream0.available()) {
                        return null;
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    invalidProtocolBufferException0.b = true;
                    throw invalidProtocolBufferException0;
                }
            }
            byte[] arr_b = new byte[v];
            System.arraycopy(this.f, this.i, arr_b, 0, v5);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while(v5 < v) {
                try {
                    v7 = inputStream0.read(arr_b, v5, v - v5);
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
                    invalidProtocolBufferException1.b = true;
                    throw invalidProtocolBufferException1;
                }
                if(v7 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.k += v7;
                v5 += v7;
            }
            return arr_b;
        }
        this.skipRawBytes(v4 - v1 - v2);
        throw InvalidProtocolBufferException.h();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
    }

    public final ArrayList f(int v) {
        ArrayList arrayList0 = new ArrayList();
        while(v > 0) {
            int v1 = Math.min(v, 0x1000);
            byte[] arr_b = new byte[v1];
            for(int v2 = 0; v2 < v1; v2 += v3) {
                int v3 = this.e.read(arr_b, v2, v1 - v2);
                if(v3 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.k += v3;
            }
            v -= v1;
            arrayList0.add(arr_b);
        }
        return arrayList0;
    }

    public final long g() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.readRawByte();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        return this.l == 0x7FFFFFFF ? -1 : this.l - (this.k + this.i);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.j;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.k + this.i;
    }

    public final void h() {
        int v = this.g + this.h;
        this.g = v;
        int v1 = this.k + v;
        int v2 = this.l;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.h = v3;
            this.g = v - v3;
            return;
        }
        this.h = 0;
    }

    public final void i(int v) {
        if(!this.j(v)) {
            throw v <= this.c - this.k - this.i ? InvalidProtocolBufferException.h() : new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.i == this.g && !this.j(1);
    }

    public final boolean j(int v) {
        int v4;
        InputStream inputStream0;
        int v1 = this.i;
        int v2 = this.g;
        if(v1 + v <= v2) {
            throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
        }
        int v3 = this.k;
        if(v > this.c - v3 - v1) {
            return false;
        }
        if(v3 + v1 + v > this.l) {
            return false;
        }
        byte[] arr_b = this.f;
        if(v1 > 0) {
            if(v2 > v1) {
                System.arraycopy(arr_b, v1, arr_b, 0, v2 - v1);
            }
            this.k += v1;
            this.g -= v1;
            this.i = 0;
        }
        try {
            inputStream0 = this.e;
            v4 = inputStream0.read(arr_b, this.g, Math.min(arr_b.length - this.g, this.c - this.k - this.g));
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            invalidProtocolBufferException0.b = true;
            throw invalidProtocolBufferException0;
        }
        if(v4 == 0 || v4 < -1 || v4 > arr_b.length) {
            throw new IllegalStateException(inputStream0.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
        }
        if(v4 > 0) {
            this.g += v4;
            this.h();
            return this.g >= v ? true : this.j(v);
        }
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void popLimit(int v) {
        this.l = v;
        this.h();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int pushLimit(int v) {
        if(v < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int v1 = this.k + this.i + v;
        int v2 = this.l;
        if(v1 > v2) {
            throw InvalidProtocolBufferException.h();
        }
        this.l = v1;
        this.h();
        return v2;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean readBool() {
        return this.readRawVarint64() != 0L;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        int v = this.readRawVarint32();
        int v1 = this.i;
        if(v <= this.g - v1 && v > 0) {
            byte[] arr_b = Arrays.copyOfRange(this.f, v1, v1 + v);
            this.i += v;
            return arr_b;
        }
        return this.d(v, false);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int v = this.readRawVarint32();
        int v1 = this.i;
        if(v <= this.g - v1 && v > 0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(Arrays.copyOfRange(this.f, v1, v1 + v));
            this.i += v;
            return byteBuffer0;
        }
        return v == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(this.d(v, true));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int v = this.readRawVarint32();
        int v1 = this.i;
        byte[] arr_b = this.f;
        if(v <= this.g - v1 && v > 0) {
            ByteString byteString0 = ByteString.copyFrom(arr_b, v1, v);
            this.i += v;
            return byteString0;
        }
        if(v == 0) {
            return ByteString.EMPTY;
        }
        byte[] arr_b1 = this.e(v);
        if(arr_b1 != null) {
            return ByteString.copyFrom(arr_b1);
        }
        int v2 = this.i;
        int v3 = this.g - v2;
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        ArrayList arrayList0 = this.f(v - v3);
        byte[] arr_b2 = new byte[v];
        System.arraycopy(arr_b, v2, arr_b2, 0, v3);
        for(Object object0: arrayList0) {
            System.arraycopy(((byte[])object0), 0, arr_b2, v3, ((byte[])object0).length);
            v3 += ((byte[])object0).length;
        }
        return new q(arr_b2);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(this.readRawLittleEndian64());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readEnum() {
        return this.readRawVarint32();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readFixed32() {
        return this.readRawLittleEndian32();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readFixed64() {
        return this.readRawLittleEndian64();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(this.readRawLittleEndian32());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final MessageLite readGroup(int v, Parser parser0, ExtensionRegistryLite extensionRegistryLite0) {
        this.checkRecursionLimit();
        ++this.a;
        MessageLite messageLite0 = (MessageLite)parser0.parsePartialFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(v << 3 | 4);
        --this.a;
        return messageLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void readGroup(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) {
        this.checkRecursionLimit();
        ++this.a;
        messageLite$Builder0.mergeFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(v << 3 | 4);
        --this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readInt32() {
        return this.readRawVarint32();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readInt64() {
        return this.readRawVarint64();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) {
        int v = this.readRawVarint32();
        this.checkRecursionLimit();
        int v1 = this.pushLimit(v);
        ++this.a;
        MessageLite messageLite0 = (MessageLite)parser0.parsePartialFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(0);
        --this.a;
        if(this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.h();
        }
        this.popLimit(v1);
        return messageLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void readMessage(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) {
        int v = this.readRawVarint32();
        this.checkRecursionLimit();
        int v1 = this.pushLimit(v);
        ++this.a;
        messageLite$Builder0.mergeFrom(this, extensionRegistryLite0);
        this.checkLastTagWas(0);
        --this.a;
        if(this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.h();
        }
        this.popLimit(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte readRawByte() {
        if(this.i == this.g) {
            this.i(1);
        }
        int v = this.i;
        this.i = v + 1;
        return this.f[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte[] readRawBytes(int v) {
        int v1 = this.i;
        if(v <= this.g - v1 && v > 0) {
            int v2 = v + v1;
            this.i = v2;
            return Arrays.copyOfRange(this.f, v1, v2);
        }
        return this.d(v, false);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        int v = this.i;
        if(this.g - v < 4) {
            this.i(4);
            v = this.i;
        }
        this.i = v + 4;
        return (this.f[v + 3] & 0xFF) << 24 | (this.f[v] & 0xFF | (this.f[v + 1] & 0xFF) << 8 | (this.f[v + 2] & 0xFF) << 16);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int v = this.i;
        if(this.g - v < 8) {
            this.i(8);
            v = this.i;
        }
        this.i = v + 8;
        return (((long)this.f[v + 7]) & 0xFFL) << 56 | (((long)this.f[v]) & 0xFFL | (((long)this.f[v + 1]) & 0xFFL) << 8 | (((long)this.f[v + 2]) & 0xFFL) << 16 | (((long)this.f[v + 3]) & 0xFFL) << 24 | (((long)this.f[v + 4]) & 0xFFL) << 0x20 | (((long)this.f[v + 5]) & 0xFFL) << 40 | (((long)this.f[v + 6]) & 0xFFL) << 0x30);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int v5;
        int v = this.i;
        int v1 = this.g;
        if(v1 != v) {
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.i = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.i = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.i = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.i = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.i = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.i = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.i = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.i = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.i = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.i = v3;
                    return v11;
                }
            }
        }
        return (int)this.g();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long v13;
        long v11;
        long v9;
        long v5;
        int v = this.i;
        int v1 = this.g;
        if(v1 != v) {
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.i = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.i = v3;
                    return v5;
                }
                int v6 = arr_b[v3] << 14 ^ v4;
                if(v6 >= 0) {
                    v5 = (long)(v6 ^ 0x3F80);
                    v3 = v + 3;
                    this.i = v3;
                    return v5;
                }
                int v7 = v + 4;
                int v8 = v6 ^ arr_b[v + 3] << 21;
                if(v8 < 0) {
                    v9 = (long)(0xFFE03F80 ^ v8);
                    v3 = v7;
                    this.i = v3;
                    return v9;
                }
                v3 = v + 5;
                long v10 = ((long)v8) ^ ((long)arr_b[v7]) << 28;
                if(v10 >= 0L) {
                    v11 = 0xFE03F80L;
                    v5 = v11 ^ v10;
                    this.i = v3;
                    return v5;
                }
                v7 = v + 6;
                long v12 = v10 ^ ((long)arr_b[v3]) << 35;
                if(v12 < 0L) {
                    v13 = 0xFFFFFFF80FE03F80L;
                    v9 = v13 ^ v12;
                    v3 = v7;
                    this.i = v3;
                    return v9;
                }
                v3 = v + 7;
                v10 = v12 ^ ((long)arr_b[v7]) << 42;
                if(v10 >= 0L) {
                    v11 = 0x3F80FE03F80L;
                    v5 = v11 ^ v10;
                    this.i = v3;
                    return v5;
                }
                v7 = v + 8;
                v12 = v10 ^ ((long)arr_b[v3]) << 49;
                if(v12 < 0L) {
                    v13 = 0xFFFE03F80FE03F80L;
                    v9 = v13 ^ v12;
                    v3 = v7;
                    this.i = v3;
                    return v9;
                }
                v3 = v + 9;
                long v14 = v12 ^ ((long)arr_b[v7]) << 56 ^ 0xFE03F80FE03F80L;
                boolean z = false;
                if(v14 >= 0L) {
                    z = true;
                }
                else if(((long)arr_b[v3]) >= 0L) {
                    z = true;
                    v3 = v + 10;
                }
                if(z) {
                    this.i = v3;
                    return v14;
                }
            }
        }
        return this.g();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readSFixed32() {
        return this.readRawLittleEndian32();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readSFixed64() {
        return this.readRawLittleEndian64();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(this.readRawVarint32());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(this.readRawVarint64());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final String readString() {
        int v = this.readRawVarint32();
        byte[] arr_b = this.f;
        if(v > 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                String s = new String(arr_b, v1, v, Internal.a);
                this.i += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v <= this.g) {
            this.i(v);
            String s1 = new String(arr_b, this.i, v, Internal.a);
            this.i += v;
            return s1;
        }
        return new String(this.d(v, false), Internal.a);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int v = this.readRawVarint32();
        int v1 = this.i;
        int v2 = this.g;
        byte[] arr_b = this.f;
        if(v <= v2 - v1 && v > 0) {
            this.i = v1 + v;
            return g4.a.e(arr_b, v1, v);
        }
        if(v == 0) {
            return "";
        }
        if(v <= v2) {
            this.i(v);
            this.i = v;
            return g4.a.e(arr_b, v1, v);
        }
        arr_b = this.d(v, false);
        return g4.a.e(arr_b, v1, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readTag() {
        if(this.isAtEnd()) {
            this.j = 0;
            return 0;
        }
        int v = this.readRawVarint32();
        this.j = v;
        if(v >>> 3 == 0) {
            throw InvalidProtocolBufferException.b();
        }
        return this.j;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readUInt32() {
        return this.readRawVarint32();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readUInt64() {
        return this.readRawVarint64();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void readUnknownGroup(int v, Builder messageLite$Builder0) {
        this.readGroup(v, messageLite$Builder0, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.k = -this.i;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean skipField(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.g - this.i >= 10) {
                    while(v1 < 10) {
                        int v2 = this.i;
                        this.i = v2 + 1;
                        if(this.f[v2] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while(v1 < 10) {
                    if(this.readRawByte() >= 0) {
                        return true;
                    }
                    ++v1;
                }
                throw InvalidProtocolBufferException.e();
            }
            case 1: {
                this.skipRawBytes(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            this.skipMessage();
                            this.checkLastTagWas(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw InvalidProtocolBufferException.d();
                            }
                            this.skipRawBytes(4);
                            return true;
                        }
                    }
                }
                this.skipRawBytes(this.readRawVarint32());
                return true;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean skipField(int v, CodedOutputStream codedOutputStream0) {
        switch(v & 7) {
            case 0: {
                long v3 = this.readRawVarint64();
                codedOutputStream0.writeUInt32NoTag(v);
                codedOutputStream0.writeUInt64NoTag(v3);
                return true;
            }
            case 1: {
                long v4 = this.readRawLittleEndian64();
                codedOutputStream0.writeUInt32NoTag(v);
                codedOutputStream0.writeFixed64NoTag(v4);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            codedOutputStream0.writeUInt32NoTag(v);
                            this.skipMessage(codedOutputStream0);
                            int v2 = v >>> 3 << 3 | 4;
                            this.checkLastTagWas(v2);
                            codedOutputStream0.writeUInt32NoTag(v2);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw InvalidProtocolBufferException.d();
                            }
                            int v1 = this.readRawLittleEndian32();
                            codedOutputStream0.writeUInt32NoTag(v);
                            codedOutputStream0.writeFixed32NoTag(v1);
                            return true;
                        }
                    }
                }
                ByteString byteString0 = this.readBytes();
                codedOutputStream0.writeUInt32NoTag(v);
                codedOutputStream0.writeBytesNoTag(byteString0);
                return true;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void skipMessage() {
        do {
            int v = this.readTag();
        }
        while(v != 0 && this.skipField(v));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void skipMessage(CodedOutputStream codedOutputStream0) {
        do {
            int v = this.readTag();
        }
        while(v != 0 && this.skipField(v, codedOutputStream0));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void skipRawBytes(int v) {
        int v12;
        long v9;
        int v1 = this.g;
        int v2 = this.i;
        if(v <= v1 - v2 && v >= 0) {
            this.i = v2 + v;
            return;
        }
        InputStream inputStream0 = this.e;
        if(v < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int v3 = this.k;
        int v4 = v3 + v2;
        int v5 = this.l;
        if(v4 + v <= v5) {
            this.k = v4;
            int v6 = v1 - v2;
            this.g = 0;
            this.i = 0;
            try {
                while(v6 < v) {
                    try {
                        long v8 = (long)(v - v6);
                        v9 = inputStream0.skip(v8);
                        int v10 = Long.compare(v9, 0L);
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        invalidProtocolBufferException0.b = true;
                        throw invalidProtocolBufferException0;
                    }
                    if(v10 < 0 || v9 > v8) {
                        throw new IllegalStateException(inputStream0.getClass() + "#skip returned invalid result: " + v9 + "\nThe InputStream implementation is buggy.");
                    }
                    if(v10 == 0) {
                        break;
                    }
                    v6 += (int)v9;
                }
            }
            finally {
                this.k += v6;
                this.h();
            }
            if(v6 < v) {
                int v11 = this.g - this.i;
                this.i = this.g;
                this.i(1);
                while(true) {
                    v12 = v - v11;
                    int v13 = this.g;
                    if(v12 <= v13) {
                        break;
                    }
                    v11 += v13;
                    this.i = v13;
                    this.i(1);
                }
                this.i = v12;
            }
            return;
        }
        this.skipRawBytes(v5 - v3 - v2);
        throw InvalidProtocolBufferException.h();
    }
}

