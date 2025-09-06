package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

public final class w extends CodedInputStream {
    public final ByteBuffer e;
    public final boolean f;
    public final long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public boolean m;
    public int n;

    public w(ByteBuffer byteBuffer0, boolean z) {
        this.n = 0x7FFFFFFF;
        this.e = byteBuffer0;
        long v = d4.b(byteBuffer0);
        this.g = v;
        this.h = ((long)byteBuffer0.limit()) + v;
        long v1 = v + ((long)byteBuffer0.position());
        this.i = v1;
        this.j = v1;
        this.f = z;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void checkLastTagWas(int v) {
        if(this.l != v) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final long d() {
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

    public final void e() {
        long v = this.h + ((long)this.k);
        this.h = v;
        int v1 = (int)(v - this.j);
        int v2 = this.n;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.k = v3;
            this.h = v - ((long)v3);
            return;
        }
        this.k = 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.m = z;
    }

    public final int f() {
        return (int)(this.h - this.i);
    }

    public final ByteBuffer g(long v, long v1) {
        ByteBuffer byteBuffer0 = this.e;
        int v2 = byteBuffer0.position();
        int v3 = byteBuffer0.limit();
        try {
            byteBuffer0.position(((int)(v - this.g)));
            byteBuffer0.limit(((int)(v1 - this.g)));
            return byteBuffer0.slice();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            InvalidProtocolBufferException invalidProtocolBufferException0 = InvalidProtocolBufferException.h();
            invalidProtocolBufferException0.initCause(illegalArgumentException0);
            throw invalidProtocolBufferException0;
        }
        finally {
            byteBuffer0.position(v2);
            byteBuffer0.limit(v3);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        return this.n == 0x7FFFFFFF ? -1 : this.n - this.getTotalBytesRead();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.l;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int)(this.i - this.j);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.i == this.h;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void popLimit(int v) {
        this.n = v;
        this.e();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int pushLimit(int v) {
        if(v < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int v1 = this.getTotalBytesRead() + v;
        int v2 = this.n;
        if(v1 > v2) {
            throw InvalidProtocolBufferException.h();
        }
        this.n = v1;
        this.e();
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
        if(v > 0 && v <= this.f()) {
            if(!this.f && this.m) {
                ByteBuffer byteBuffer0 = this.g(this.i, this.i + ((long)v));
                this.i += (long)v;
                return byteBuffer0;
            }
            byte[] arr_b = new byte[v];
            d4.g(this.i, arr_b, 0L, v);
            this.i += (long)v;
            return ByteBuffer.wrap(arr_b);
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return Internal.EMPTY_BYTE_BUFFER;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int v = this.readRawVarint32();
        if(v > 0 && v <= this.f()) {
            if(this.f && this.m) {
                ByteBuffer byteBuffer0 = this.g(this.i, this.i + ((long)v));
                this.i += (long)v;
                return ByteString.f(byteBuffer0);
            }
            byte[] arr_b = new byte[v];
            d4.g(this.i, arr_b, 0L, v);
            this.i += (long)v;
            return new q(arr_b);
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
        long v = this.i;
        if(v == this.h) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 1L;
        return d4.c.f(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte[] readRawBytes(int v) {
        if(v >= 0 && v <= this.f()) {
            byte[] arr_b = new byte[v];
            this.g(this.i, this.i + ((long)v)).get(arr_b);
            this.i += (long)v;
            return arr_b;
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
        long v = this.i;
        if(this.h - v < 4L) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 4L;
        int v1 = d4.c.f(v);
        int v2 = d4.c.f(v + 1L);
        int v3 = d4.c.f(v + 2L);
        return (d4.c.f(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        long v = this.i;
        if(this.h - v < 8L) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 8L;
        long v1 = ((long)d4.c.f(v)) & 0xFFL | (((long)d4.c.f(v + 1L)) & 0xFFL) << 8 | (((long)d4.c.f(v + 2L)) & 0xFFL) << 16 | (((long)d4.c.f(v + 3L)) & 0xFFL) << 24 | (((long)d4.c.f(v + 4L)) & 0xFFL) << 0x20 | (((long)d4.c.f(v + 5L)) & 0xFFL) << 40 | (((long)d4.c.f(v + 6L)) & 0xFFL) << 0x30;
        return (((long)d4.c.f(v + 7L)) & 0xFFL) << 56 | v1;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int v4;
        long v = this.i;
        if(this.h != v) {
            c4 c40 = d4.c;
            int v1 = c40.f(v);
            if(v1 >= 0) {
                this.i = v + 1L;
                return v1;
            }
            if(this.h - (v + 1L) >= 9L) {
                long v2 = v + 2L;
                int v3 = c40.f(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.i = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = v3 ^ c40.f(v2) << 14;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.i = v2;
                    return v4;
                }
                v2 = v + 4L;
                int v7 = v6 ^ c40.f(v5) << 21;
                if(v7 < 0) {
                    v4 = 0xFFE03F80 ^ v7;
                    this.i = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v8 = c40.f(v2);
                int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                if(v8 >= 0) {
                    v2 = v5;
                    this.i = v2;
                    return v9;
                }
                v2 = v + 6L;
                if(c40.f(v5) >= 0) {
                    this.i = v2;
                    return v9;
                }
                v5 = v + 7L;
                if(c40.f(v2) >= 0) {
                    v2 = v5;
                    this.i = v2;
                    return v9;
                }
                v2 = v + 8L;
                if(c40.f(v5) >= 0) {
                    this.i = v2;
                    return v9;
                }
                if(c40.f(v2) >= 0) {
                    v2 = v + 9L;
                    this.i = v2;
                    return v9;
                }
                v2 = v + 10L;
                if(c40.f(v + 9L) >= 0) {
                    this.i = v2;
                    return v9;
                }
            }
        }
        return (int)this.d();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long v13;
        long v10;
        long v7;
        int v4;
        long v = this.i;
        if(this.h != v) {
            c4 c40 = d4.c;
            int v1 = c40.f(v);
            if(v1 >= 0) {
                this.i = v + 1L;
                return (long)v1;
            }
            if(this.h - (v + 1L) >= 9L) {
                long v2 = v + 2L;
                int v3 = c40.f(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.i = v2;
                    return (long)v4;
                }
                long v5 = v + 3L;
                int v6 = v3 ^ c40.f(v2) << 14;
                if(v6 >= 0) {
                    v7 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.i = v2;
                    return v7;
                }
                v2 = v + 4L;
                int v8 = v6 ^ c40.f(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    this.i = v2;
                    return (long)v4;
                }
                v5 = v + 5L;
                long v9 = ((long)v8) ^ ((long)c40.f(v2)) << 28;
                if(v9 >= 0L) {
                    v10 = 0xFE03F80L;
                    v7 = v10 ^ v9;
                    v2 = v5;
                    this.i = v2;
                    return v7;
                }
                long v11 = v + 6L;
                long v12 = v9 ^ ((long)c40.f(v5)) << 35;
                if(v12 < 0L) {
                    v13 = 0xFFFFFFF80FE03F80L;
                    v7 = v13 ^ v12;
                    v2 = v11;
                    this.i = v2;
                    return v7;
                }
                v5 = v + 7L;
                v9 = v12 ^ ((long)c40.f(v11)) << 42;
                if(v9 >= 0L) {
                    v10 = 0x3F80FE03F80L;
                    v7 = v10 ^ v9;
                    v2 = v5;
                    this.i = v2;
                    return v7;
                }
                v11 = v + 8L;
                v12 = v9 ^ ((long)c40.f(v5)) << 49;
                if(v12 < 0L) {
                    v13 = 0xFFFE03F80FE03F80L;
                    v7 = v13 ^ v12;
                    v2 = v11;
                    this.i = v2;
                    return v7;
                }
                long v14 = v12 ^ ((long)c40.f(v11)) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v2 = v + 9L;
                    this.i = v2;
                    return v14;
                }
                else if(((long)c40.f(v + 9L)) >= 0L) {
                    v2 = v + 10L;
                    this.i = v2;
                    return v14;
                }
            }
        }
        return this.d();
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
        if(v > 0 && v <= this.f()) {
            byte[] arr_b = new byte[v];
            d4.g(this.i, arr_b, 0L, v);
            this.i += (long)v;
            return new String(arr_b, Internal.a);
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return "";
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int v = this.readRawVarint32();
        if(v > 0 && v <= this.f()) {
            String s = g4.c(this.e, ((int)(this.i - this.g)), v);
            this.i += (long)v;
            return s;
        }
        if(v != 0) {
            throw v > 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return "";
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readTag() {
        if(this.isAtEnd()) {
            this.l = 0;
            return 0;
        }
        int v = this.readRawVarint32();
        this.l = v;
        if(v >>> 3 == 0) {
            throw InvalidProtocolBufferException.b();
        }
        return this.l;
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
        this.j = this.i;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean skipField(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.f() >= 10) {
                    while(v1 < 10) {
                        long v2 = this.i;
                        this.i = v2 + 1L;
                        if(d4.c.f(v2) >= 0) {
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
        if(v < 0 || v > this.f()) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        this.i += (long)v;
    }
}

