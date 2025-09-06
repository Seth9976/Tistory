package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

public class a0 extends CodedOutputStream {
    public final byte[] e;
    public final int f;
    public final int g;
    public int h;

    public a0(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("buffer");
        }
        int v2 = v + v1;
        if((v | v1 | arr_b.length - v2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
        }
        this.e = arr_b;
        this.f = v;
        this.h = v;
        this.g = v2;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void c(byte[] arr_b, int v, int v1) {
        this.writeUInt32NoTag(v1);
        this.write(arr_b, v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void d(int v, MessageLite messageLite0, Schema schema0) {
        this.writeTag(v, 2);
        this.writeUInt32NoTag(((AbstractMessageLite)messageLite0).b(schema0));
        schema0.writeTo(messageLite0, this.a);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.h - this.f;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.g - this.h;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte b) {
        try {
            int v = this.h;
            this.h = v + 1;
            this.e[v] = b;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        try {
            byteBuffer0.get(this.e, this.h, v);
            this.h += v;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, v), indexOutOfBoundsException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte[] arr_b, int v, int v1) {
        try {
            System.arraycopy(arr_b, v, this.e, this.h, v1);
            this.h += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, v1), indexOutOfBoundsException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeBool(int v, boolean z) {
        this.writeTag(v, 0);
        this.write(((byte)z));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeByteArray(int v, byte[] arr_b) {
        this.writeByteArray(v, arr_b, 0, arr_b.length);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeByteArray(int v, byte[] arr_b, int v1, int v2) {
        this.writeTag(v, 2);
        this.c(arr_b, v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeByteBuffer(int v, ByteBuffer byteBuffer0) {
        this.writeTag(v, 2);
        this.writeUInt32NoTag(byteBuffer0.capacity());
        this.writeRawBytes(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeBytes(int v, ByteString byteString0) {
        this.writeTag(v, 2);
        this.writeBytesNoTag(byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString0) {
        this.writeUInt32NoTag(byteString0.size());
        byteString0.g(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed32(int v, int v1) {
        this.writeTag(v, 5);
        this.writeFixed32NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int v) {
        try {
            int v1 = this.h;
            this.h = v1 + 1;
            this.e[v1] = (byte)(v & 0xFF);
            this.h = v1 + 2;
            this.e[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.h = v1 + 3;
            this.e[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.h = v1 + 4;
            this.e[v1 + 3] = (byte)(v >> 24 & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64(int v, long v1) {
        this.writeTag(v, 1);
        this.writeFixed64NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long v) {
        try {
            int v1 = this.h;
            this.h = v1 + 1;
            this.e[v1] = (byte)(((int)v) & 0xFF);
            this.h = v1 + 2;
            this.e[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.h = v1 + 3;
            this.e[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.h = v1 + 4;
            this.e[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.h = v1 + 5;
            this.e[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.h = v1 + 6;
            this.e[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.h = v1 + 7;
            this.e[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.h = v1 + 8;
            this.e[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeInt32(int v, int v1) {
        this.writeTag(v, 0);
        this.writeInt32NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int v) {
        if(v >= 0) {
            this.writeUInt32NoTag(v);
            return;
        }
        this.writeUInt64NoTag(((long)v));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeLazy(ByteBuffer byteBuffer0) {
        this.write(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeLazy(byte[] arr_b, int v, int v1) {
        this.write(arr_b, v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeMessage(int v, MessageLite messageLite0) {
        this.writeTag(v, 2);
        this.writeMessageNoTag(messageLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite0) {
        this.writeUInt32NoTag(messageLite0.getSerializedSize());
        messageLite0.writeTo(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int v, MessageLite messageLite0) {
        this.writeTag(1, 3);
        this.writeUInt32(2, v);
        this.writeMessage(3, messageLite0);
        this.writeTag(1, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            this.write(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
            return;
        }
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        this.write(byteBuffer1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int v, ByteString byteString0) {
        this.writeTag(1, 3);
        this.writeUInt32(2, v);
        this.writeBytes(3, byteString0);
        this.writeTag(1, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeString(int v, String s) {
        this.writeTag(v, 2);
        this.writeStringNoTag(s);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeStringNoTag(String s) {
        int v;
        try {
            v = this.h;
            int v1 = CodedOutputStream.computeUInt32SizeNoTag(s.length());
            byte[] arr_b = this.e;
            if(v1 == CodedOutputStream.computeUInt32SizeNoTag(s.length() * 3)) {
                int v2 = v + v1;
                this.h = v2;
                int v3 = g4.a.g(s, arr_b, v2, this.spaceLeft());
                this.h = v;
                this.writeUInt32NoTag(v3 - v - v1);
                this.h = v3;
                return;
            }
            this.writeUInt32NoTag(g4.e(s));
            this.h = g4.a.g(s, arr_b, this.h, this.spaceLeft());
            return;
        }
        catch(f4 f40) {
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(indexOutOfBoundsException0);
        }
        this.h = v;
        this.b(s, f40);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeTag(int v, int v1) {
        this.writeUInt32NoTag(v << 3 | v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt32(int v, int v1) {
        this.writeTag(v, 0);
        this.writeUInt32NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int v) {
        try {
            while(true) {
                byte[] arr_b = this.e;
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.h;
                    this.h = v1 + 1;
                    arr_b[v1] = (byte)v;
                    return;
                }
                int v2 = this.h;
                this.h = v2 + 1;
                arr_b[v2] = (byte)(v & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64(int v, long v1) {
        this.writeTag(v, 0);
        this.writeUInt64NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long v) {
        byte[] arr_b = this.e;
        if(CodedOutputStream.d && this.spaceLeft() >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v1 = this.h;
                this.h = v1 + 1;
                d4.r(arr_b, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v2 = this.h;
            this.h = v2 + 1;
            d4.r(arr_b, ((long)v2), ((byte)(((int)v))));
            return;
        }
        try {
            while(true) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v3 = this.h;
                    this.h = v3 + 1;
                    arr_b[v3] = (byte)(((int)v));
                    return;
                }
                int v4 = this.h;
                this.h = v4 + 1;
                arr_b[v4] = (byte)(((int)v) & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.h, this.g, 1), indexOutOfBoundsException0);
    }
}

