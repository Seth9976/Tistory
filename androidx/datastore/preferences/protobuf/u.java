package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class u extends CodedInputStream {
    public final Iterable e;
    public final Iterator f;
    public ByteBuffer g;
    public final boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public long q;
    public long r;
    public long s;

    public u(Iterable iterable0, int v, boolean z) {
        this.l = 0x7FFFFFFF;
        this.j = v;
        this.e = iterable0;
        this.f = iterable0.iterator();
        this.h = z;
        this.n = 0;
        this.o = 0;
        if(v == 0) {
            this.g = Internal.EMPTY_BYTE_BUFFER;
            this.p = 0L;
            this.q = 0L;
            this.s = 0L;
            this.r = 0L;
            return;
        }
        this.k();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void checkLastTagWas(int v) {
        if(this.m != v) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final long d() {
        return this.s - this.p;
    }

    public final void e() {
        if(!this.f.hasNext()) {
            throw InvalidProtocolBufferException.h();
        }
        this.k();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.i = z;
    }

    public final void f(int v, byte[] arr_b) {
        if(v >= 0 && v <= this.i()) {
            int v1 = v;
            while(v1 > 0) {
                if(this.d() == 0L) {
                    this.e();
                }
                int v2 = Math.min(v1, ((int)this.d()));
                d4.g(this.p, arr_b, v - v1, v2);
                v1 -= v2;
                this.p += (long)v2;
            }
            return;
        }
        if(v > 0) {
            throw InvalidProtocolBufferException.h();
        }
        if(v != 0) {
            throw InvalidProtocolBufferException.f();
        }
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
        return this.l == 0x7FFFFFFF ? -1 : this.l - this.getTotalBytesRead();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.m;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int)(((long)(this.n - this.o)) + this.p - this.q);
    }

    public final void h() {
        int v = this.j + this.k;
        this.j = v;
        int v1 = v - this.o;
        int v2 = this.l;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.k = v3;
            this.j = v - v3;
            return;
        }
        this.k = 0;
    }

    public final int i() {
        return (int)(((long)(this.j - this.n)) - this.p + this.q);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return ((long)this.n) + this.p - this.q == ((long)this.j);
    }

    public final ByteBuffer j(int v, int v1) {
        int v2 = this.g.position();
        int v3 = this.g.limit();
        ByteBuffer byteBuffer0 = this.g;
        try {
            byteBuffer0.position(v);
            byteBuffer0.limit(v1);
            return this.g.slice();
        }
        catch(IllegalArgumentException unused_ex) {
            throw InvalidProtocolBufferException.h();
        }
        finally {
            byteBuffer0.position(v2);
            byteBuffer0.limit(v3);
        }
    }

    public final void k() {
        Object object0 = this.f.next();
        this.g = (ByteBuffer)object0;
        this.n += (int)(this.p - this.q);
        long v = (long)((ByteBuffer)object0).position();
        this.p = v;
        this.q = v;
        this.s = (long)this.g.limit();
        long v1 = d4.b(this.g);
        this.r = v1;
        this.p += v1;
        this.q += v1;
        this.s += v1;
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
        int v1 = this.getTotalBytesRead() + v;
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
        return this.readRawBytes(this.readRawVarint32());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int v = this.readRawVarint32();
        if(v > 0 && ((long)v) <= this.d()) {
            if(!this.h && this.i) {
                long v1 = this.p + ((long)v);
                this.p = v1;
                long v2 = v1 - this.r;
                return this.j(((int)(v2 - ((long)v))), ((int)v2));
            }
            byte[] arr_b = new byte[v];
            d4.g(this.p, arr_b, 0L, v);
            this.p += (long)v;
            return ByteBuffer.wrap(arr_b);
        }
        if(v > 0 && v <= this.i()) {
            byte[] arr_b1 = new byte[v];
            this.f(v, arr_b1);
            return ByteBuffer.wrap(arr_b1);
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return Internal.EMPTY_BYTE_BUFFER;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int v = this.readRawVarint32();
        boolean z = this.h;
        if(v > 0) {
            long v1 = this.p;
            if(((long)v) <= this.s - v1) {
                if(z && this.i) {
                    int v2 = (int)(v1 - this.r);
                    ByteString byteString0 = ByteString.f(this.j(v2, v + v2));
                    this.p += (long)v;
                    return byteString0;
                }
                byte[] arr_b = new byte[v];
                d4.g(v1, arr_b, 0L, v);
                this.p += (long)v;
                return new q(arr_b);
            }
        }
        if(v > 0 && v <= this.i()) {
            if(z && this.i) {
                ArrayList arrayList0 = new ArrayList();
                while(v > 0) {
                    if(this.d() == 0L) {
                        this.e();
                    }
                    int v3 = Math.min(v, ((int)this.d()));
                    int v4 = (int)(this.p - this.r);
                    arrayList0.add(ByteString.f(this.j(v4, v4 + v3)));
                    v -= v3;
                    this.p += (long)v3;
                }
                return ByteString.copyFrom(arrayList0);
            }
            byte[] arr_b1 = new byte[v];
            this.f(v, arr_b1);
            return new q(arr_b1);
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return ByteString.EMPTY;
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
        if(this.d() == 0L) {
            this.e();
        }
        long v = this.p;
        this.p = v + 1L;
        return d4.c.f(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte[] readRawBytes(int v) {
        if(v >= 0 && ((long)v) <= this.d()) {
            byte[] arr_b = new byte[v];
            d4.g(this.p, arr_b, 0L, v);
            this.p += (long)v;
            return arr_b;
        }
        if(v >= 0 && v <= this.i()) {
            byte[] arr_b1 = new byte[v];
            this.f(v, arr_b1);
            return arr_b1;
        }
        if(v > 0) {
            throw InvalidProtocolBufferException.h();
        }
        if(v != 0) {
            throw InvalidProtocolBufferException.f();
        }
        return Internal.EMPTY_BYTE_ARRAY;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        if(this.d() >= 4L) {
            long v = this.p;
            this.p = v + 4L;
            int v1 = d4.c.f(v);
            int v2 = d4.c.f(v + 1L);
            int v3 = d4.c.f(v + 2L);
            return (d4.c.f(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
        }
        return this.readRawByte() & 0xFF | (this.readRawByte() & 0xFF) << 8 | (this.readRawByte() & 0xFF) << 16 | (this.readRawByte() & 0xFF) << 24;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        long v1;
        if(Long.compare(this.d(), 8L) >= 0) {
            long v = this.p;
            this.p = v + 8L;
            v1 = ((long)d4.c.f(v)) & 0xFFL | (((long)d4.c.f(v + 1L)) & 0xFFL) << 8 | (((long)d4.c.f(v + 2L)) & 0xFFL) << 16 | (((long)d4.c.f(v + 3L)) & 0xFFL) << 24 | (((long)d4.c.f(v + 4L)) & 0xFFL) << 0x20 | (((long)d4.c.f(v + 5L)) & 0xFFL) << 40 | (((long)d4.c.f(v + 6L)) & 0xFFL) << 0x30;
            return (((long)d4.c.f(v + 7L)) & 0xFFL) << 56 | v1;
        }
        v1 = ((long)this.readRawByte()) & 0xFFL | (((long)this.readRawByte()) & 0xFFL) << 8 | (((long)this.readRawByte()) & 0xFFL) << 16 | (((long)this.readRawByte()) & 0xFFL) << 24 | (((long)this.readRawByte()) & 0xFFL) << 0x20 | (((long)this.readRawByte()) & 0xFFL) << 40 | (((long)this.readRawByte()) & 0xFFL) << 0x30;
        return (((long)this.readRawByte()) & 0xFFL) << 56 | v1;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int v4;
        long v = this.p;
        if(this.s != v) {
            c4 c40 = d4.c;
            int v1 = c40.f(v);
            if(v1 >= 0) {
                ++this.p;
                return v1;
            }
            if(this.s - this.p >= 10L) {
                long v2 = v + 2L;
                int v3 = c40.f(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.p = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = c40.f(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.p = v2;
                    return v4;
                }
                long v7 = v + 4L;
                int v8 = v6 ^ c40.f(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    v2 = v7;
                    this.p = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v9 = c40.f(v7);
                int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                if(v9 >= 0) {
                    v2 = v5;
                    this.p = v2;
                    return v10;
                }
                v7 = v + 6L;
                if(c40.f(v5) >= 0) {
                    v2 = v7;
                    this.p = v2;
                    return v10;
                }
                v5 = v + 7L;
                if(c40.f(v7) >= 0) {
                    v2 = v5;
                    this.p = v2;
                    return v10;
                }
                v7 = v + 8L;
                if(c40.f(v5) >= 0) {
                    v2 = v7;
                    this.p = v2;
                    return v10;
                }
                v5 = v + 9L;
                if(c40.f(v7) >= 0) {
                    v2 = v5;
                    this.p = v2;
                    return v10;
                }
                else if(c40.f(v5) >= 0) {
                    v2 = v + 10L;
                    this.p = v2;
                    return v10;
                }
            }
        }
        return (int)this.g();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long v12;
        long v10;
        long v4;
        long v = this.p;
        if(this.s != v) {
            c4 c40 = d4.c;
            int v1 = c40.f(v);
            if(v1 >= 0) {
                ++this.p;
                return (long)v1;
            }
            if(this.s - this.p >= 10L) {
                long v2 = v + 2L;
                int v3 = c40.f(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = (long)(v3 ^ 0xFFFFFF80);
                    this.p = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = c40.f(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.p = v2;
                    return v4;
                }
                int v7 = v6 ^ c40.f(v5) << 21;
                if(v7 < 0) {
                    v4 = (long)(0xFFE03F80 ^ v7);
                    v2 = v + 4L;
                    this.p = v2;
                    return v4;
                }
                long v8 = v + 5L;
                long v9 = ((long)c40.f(v + 4L)) << 28 ^ ((long)v7);
                if(v9 >= 0L) {
                    v10 = 0xFE03F80L;
                    v4 = v10 ^ v9;
                    v2 = v8;
                    this.p = v2;
                    return v4;
                }
                v5 = v + 6L;
                long v11 = v9 ^ ((long)c40.f(v8)) << 35;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v4 = v12 ^ v11;
                    v2 = v5;
                    this.p = v2;
                    return v4;
                }
                v8 = v + 7L;
                v9 = v11 ^ ((long)c40.f(v5)) << 42;
                if(v9 >= 0L) {
                    v10 = 0x3F80FE03F80L;
                    v4 = v10 ^ v9;
                    v2 = v8;
                    this.p = v2;
                    return v4;
                }
                v5 = v + 8L;
                v11 = v9 ^ ((long)c40.f(v8)) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v4 = v12 ^ v11;
                    v2 = v5;
                    this.p = v2;
                    return v4;
                }
                v8 = v + 9L;
                long v13 = v11 ^ ((long)c40.f(v5)) << 56 ^ 0xFE03F80FE03F80L;
                if(v13 >= 0L) {
                    v2 = v8;
                    this.p = v2;
                    return v13;
                }
                else if(((long)c40.f(v8)) >= 0L) {
                    v2 = v + 10L;
                    this.p = v2;
                    return v13;
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
        if(v > 0) {
            long v1 = this.p;
            if(((long)v) <= this.s - v1) {
                byte[] arr_b = new byte[v];
                d4.g(v1, arr_b, 0L, v);
                this.p += (long)v;
                return new String(arr_b, Internal.a);
            }
        }
        if(v > 0 && v <= this.i()) {
            byte[] arr_b1 = new byte[v];
            this.f(v, arr_b1);
            return new String(arr_b1, Internal.a);
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return "";
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int v = this.readRawVarint32();
        if(v > 0) {
            long v1 = this.p;
            if(((long)v) <= this.s - v1) {
                String s = g4.c(this.g, ((int)(v1 - this.q)), v);
                this.p += (long)v;
                return s;
            }
        }
        if(v >= 0 && v <= this.i()) {
            byte[] arr_b = new byte[v];
            this.f(v, arr_b);
            return g4.a.e(arr_b, 0, v);
        }
        if(v != 0) {
            throw v > 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return "";
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readTag() {
        if(this.isAtEnd()) {
            this.m = 0;
            return 0;
        }
        int v = this.readRawVarint32();
        this.m = v;
        if(v >>> 3 == 0) {
            throw InvalidProtocolBufferException.b();
        }
        return this.m;
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
        this.o = (int)(((long)this.n) + this.p - this.q);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean skipField(int v) {
        switch(v & 7) {
            case 0: {
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(this.readRawByte() >= 0) {
                        return true;
                    }
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
        if(v < 0 || ((long)v) > ((long)(this.j - this.n)) - this.p + this.q) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        while(v > 0) {
            if(this.d() == 0L) {
                this.e();
            }
            int v1 = Math.min(v, ((int)this.d()));
            v -= v1;
            this.p += (long)v1;
        }
    }
}

