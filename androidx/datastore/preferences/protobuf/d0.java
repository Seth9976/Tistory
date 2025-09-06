package androidx.datastore.preferences.protobuf;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class d0 extends CodedOutputStream {
    public final ByteBuffer e;
    public final ByteBuffer f;
    public final int g;

    public d0(ByteBuffer byteBuffer0) {
        this.e = byteBuffer0;
        this.f = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.g = byteBuffer0.position();
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
        this.e.position(this.f.position());
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f.position() - this.g;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f.remaining();
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte b) {
        try {
            this.f.put(b);
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(ByteBuffer byteBuffer0) {
        try {
            this.f.put(byteBuffer0);
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte[] arr_b, int v, int v1) {
        try {
            this.f.put(arr_b, v, v1);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(indexOutOfBoundsException0);
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
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
            this.f.putInt(v);
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
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
            this.f.putLong(v);
        }
        catch(BufferOverflowException bufferOverflowException0) {
            throw new OutOfSpaceException(bufferOverflowException0);
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
        ByteBuffer byteBuffer0 = this.f;
        int v = byteBuffer0.position();
        try {
            int v1 = CodedOutputStream.computeUInt32SizeNoTag(s.length());
            if(v1 == CodedOutputStream.computeUInt32SizeNoTag(s.length() * 3)) {
                int v2 = byteBuffer0.position() + v1;
                byteBuffer0.position(v2);
                try {
                    g4.d(byteBuffer0, s);
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    throw new OutOfSpaceException(indexOutOfBoundsException0);
                }
                int v3 = byteBuffer0.position();
                byteBuffer0.position(v);
                this.writeUInt32NoTag(v3 - v2);
                byteBuffer0.position(v3);
                return;
            }
            this.writeUInt32NoTag(g4.e(s));
            try {
                g4.d(byteBuffer0, s);
                return;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
                throw new OutOfSpaceException(indexOutOfBoundsException1);
            }
            throw new OutOfSpaceException(illegalArgumentException0);
        }
        catch(f4 f40) {
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new OutOfSpaceException(illegalArgumentException0);
        }
        byteBuffer0.position(v);
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
                ByteBuffer byteBuffer0 = this.f;
                if((v & 0xFFFFFF80) == 0) {
                    byteBuffer0.put(((byte)v));
                    return;
                }
                byteBuffer0.put(((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
        }
        catch(BufferOverflowException bufferOverflowException0) {
        }
        throw new OutOfSpaceException(bufferOverflowException0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64(int v, long v1) {
        this.writeTag(v, 0);
        this.writeUInt64NoTag(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long v) {
        try {
            while(true) {
                ByteBuffer byteBuffer0 = this.f;
                if(Long.compare(0xFFFFFFFFFFFFFF80L & v, 0L) == 0) {
                    byteBuffer0.put(((byte)(((int)v))));
                    return;
                }
                byteBuffer0.put(((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
        }
        catch(BufferOverflowException bufferOverflowException0) {
        }
        throw new OutOfSpaceException(bufferOverflowException0);
    }
}

