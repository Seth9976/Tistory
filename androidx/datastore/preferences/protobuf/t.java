package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t extends CodedInputStream {
    public final byte[] e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;

    public t(byte[] arr_b, int v, int v1, boolean z) {
        this.m = 0x7FFFFFFF;
        this.e = arr_b;
        this.g = v1 + v;
        this.i = v;
        this.j = v;
        this.f = z;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void checkLastTagWas(int v) {
        if(this.k != v) {
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
        int v = this.g + this.h;
        this.g = v;
        int v1 = v - this.j;
        int v2 = this.m;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.h = v3;
            this.g = v - v3;
            return;
        }
        this.h = 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.l = z;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        return this.m == 0x7FFFFFFF ? -1 : this.m - this.getTotalBytesRead();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.k;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.i - this.j;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.i == this.g;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final void popLimit(int v) {
        this.m = v;
        this.e();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int pushLimit(int v) {
        if(v < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int v1 = this.getTotalBytesRead() + v;
        if(v1 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int v2 = this.m;
        if(v1 > v2) {
            throw InvalidProtocolBufferException.h();
        }
        this.m = v1;
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
        if(v > 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                ByteBuffer byteBuffer0 = this.f || !this.l ? ByteBuffer.wrap(Arrays.copyOfRange(this.e, v1, v1 + v)) : ByteBuffer.wrap(this.e, v1, v).slice();
                this.i += v;
                return byteBuffer0;
            }
        }
        if(v != 0) {
            throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return Internal.EMPTY_BYTE_BUFFER;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int v = this.readRawVarint32();
        if(v > 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                byte[] arr_b = this.e;
                ByteString byteString0 = !this.f || !this.l ? ByteString.copyFrom(arr_b, v1, v) : new o(arr_b, v1, v);
                this.i += v;
                return byteString0;
            }
        }
        return v == 0 ? ByteString.EMPTY : new q(this.readRawBytes(v));
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
        int v = this.i;
        if(v == this.g) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 1;
        return this.e[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final byte[] readRawBytes(int v) {
        if(v > 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                int v2 = v + v1;
                this.i = v2;
                return Arrays.copyOfRange(this.e, v1, v2);
            }
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
        int v = this.i;
        if(this.g - v < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 4;
        return (this.e[v + 3] & 0xFF) << 24 | (this.e[v] & 0xFF | (this.e[v + 1] & 0xFF) << 8 | (this.e[v + 2] & 0xFF) << 16);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int v = this.i;
        if(this.g - v < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = v + 8;
        return (((long)this.e[v + 7]) & 0xFFL) << 56 | (((long)this.e[v]) & 0xFFL | (((long)this.e[v + 1]) & 0xFFL) << 8 | (((long)this.e[v + 2]) & 0xFFL) << 16 | (((long)this.e[v + 3]) & 0xFFL) << 24 | (((long)this.e[v + 4]) & 0xFFL) << 0x20 | (((long)this.e[v + 5]) & 0xFFL) << 40 | (((long)this.e[v + 6]) & 0xFFL) << 0x30);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int v5;
        int v = this.i;
        int v1 = this.g;
        if(v1 != v) {
            byte[] arr_b = this.e;
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
        return (int)this.d();
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
            byte[] arr_b = this.e;
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
        if(v > 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                String s = new String(this.e, v1, v, Internal.a);
                this.i += v;
                return s;
            }
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
            int v1 = this.i;
            if(v <= this.g - v1) {
                String s = g4.a.e(this.e, v1, v);
                this.i += v;
                return s;
            }
        }
        if(v != 0) {
            throw v > 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
        }
        return "";
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
    public final int readTag() {
        if(this.isAtEnd()) {
            this.k = 0;
            return 0;
        }
        int v = this.readRawVarint32();
        this.k = v;
        if(v >>> 3 == 0) {
            throw InvalidProtocolBufferException.b();
        }
        return this.k;
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
                if(this.g - this.i >= 10) {
                    while(v1 < 10) {
                        int v2 = this.i;
                        this.i = v2 + 1;
                        if(this.e[v2] >= 0) {
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
        if(v >= 0) {
            int v1 = this.i;
            if(v <= this.g - v1) {
                this.i = v1 + v;
                return;
            }
        }
        throw v >= 0 ? InvalidProtocolBufferException.h() : InvalidProtocolBufferException.f();
    }
}

