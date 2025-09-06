package androidx.datastore.preferences.protobuf;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class e0 extends CodedOutputStream {
    public final ByteBuffer e;
    public final ByteBuffer f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public long k;

    public e0(ByteBuffer byteBuffer0) {
        this.e = byteBuffer0;
        this.f = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long v = d4.b(byteBuffer0);
        this.g = v;
        long v1 = ((long)byteBuffer0.position()) + v;
        this.h = v1;
        long v2 = v + ((long)byteBuffer0.limit());
        this.i = v2;
        this.j = v2 - 10L;
        this.k = v1;
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
    public final void flush() {
        this.e.position(((int)(this.k - this.g)));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int)(this.k - this.h);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int)(this.i - this.k);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte b) {
        long v = this.k;
        long v1 = this.i;
        if(v >= v1) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.k, v1, 1));
        }
        this.k = v + 1L;
        d4.q(v, b);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(ByteBuffer byteBuffer0) {
        try {
            this.f.position(((int)(this.k - this.g)));
            this.f.put(byteBuffer0);
            this.k += (long)byteBuffer0.remaining();
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte[] arr_b, int v, int v1) {
        long v2 = this.i;
        if(arr_b != null && v >= 0 && v1 >= 0 && arr_b.length - v1 >= v) {
            long v3 = this.k;
            if(v2 - ((long)v1) >= v3) {
                d4.c.d(arr_b, ((long)v), v3, ((long)v1));
                this.k += (long)v1;
                return;
            }
        }
        if(arr_b == null) {
            throw new NullPointerException("value");
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.k, v2, v1));
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
        this.f.putInt(((int)(this.k - this.g)), v);
        this.k += 4L;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64(int v, long v1) {
        this.writeTag(v, 1);
        this.writeFixed64NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long v) {
        this.f.putLong(((int)(this.k - this.g)), v);
        this.k += 8L;
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
        long v1;
        ByteBuffer byteBuffer0;
        long v;
        try {
            v = this.g;
            byteBuffer0 = this.f;
            v1 = this.k;
            int v2 = CodedOutputStream.computeUInt32SizeNoTag(s.length());
            if(v2 == CodedOutputStream.computeUInt32SizeNoTag(s.length() * 3)) {
                int v3 = ((int)(this.k - v)) + v2;
                byteBuffer0.position(v3);
                g4.d(byteBuffer0, s);
                int v4 = byteBuffer0.position() - v3;
                this.writeUInt32NoTag(v4);
                this.k += (long)v4;
                return;
            }
            int v5 = g4.e(s);
            this.writeUInt32NoTag(v5);
            byteBuffer0.position(((int)(this.k - v)));
            g4.d(byteBuffer0, s);
            this.k += (long)v5;
            return;
        }
        catch(f4 f40) {
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new OutOfSpaceException(illegalArgumentException0);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(indexOutOfBoundsException0);
        }
        this.k = v1;
        byteBuffer0.position(((int)(v1 - v)));
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
        long v4;
        if(Long.compare(this.k, this.j) <= 0) {
            while((v & 0xFFFFFF80) != 0) {
                long v1 = this.k;
                this.k = v1 + 1L;
                d4.q(v1, ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            long v2 = this.k;
            this.k = v2 + 1L;
            d4.q(v2, ((byte)v));
            return;
        }
        while(true) {
            long v3 = this.k;
            v4 = this.i;
            if(v3 >= v4) {
                break;
            }
            if((v & 0xFFFFFF80) == 0) {
                this.k = v3 + 1L;
                d4.q(v3, ((byte)v));
                return;
            }
            this.k = v3 + 1L;
            d4.q(v3, ((byte)(v & 0x7F | 0x80)));
            v >>>= 7;
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.k, v4, 1));
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64(int v, long v1) {
        this.writeTag(v, 0);
        this.writeUInt64NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long v) {
        long v4;
        if(Long.compare(this.k, this.j) <= 0) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                long v1 = this.k;
                this.k = v1 + 1L;
                d4.q(v1, ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            long v2 = this.k;
            this.k = v2 + 1L;
            d4.q(v2, ((byte)(((int)v))));
            return;
        }
        while(true) {
            long v3 = this.k;
            v4 = this.i;
            if(v3 >= v4) {
                break;
            }
            if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                this.k = v3 + 1L;
                d4.q(v3, ((byte)(((int)v))));
                return;
            }
            this.k = v3 + 1L;
            d4.q(v3, ((byte)(((int)v) & 0x7F | 0x80)));
            v >>>= 7;
        }
        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.k, v4, 1));
    }
}

