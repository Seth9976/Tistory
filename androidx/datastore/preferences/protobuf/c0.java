package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class c0 extends z {
    public final OutputStream i;

    public c0(OutputStream outputStream0, int v) {
        super(v);
        if(outputStream0 == null) {
            throw new NullPointerException("out");
        }
        this.i = outputStream0;
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
        if(this.g > 0) {
            this.j();
        }
    }

    public final void j() {
        this.i.write(this.e, 0, this.g);
        this.g = 0;
    }

    public final void k(int v) {
        if(this.f - this.g < v) {
            this.j();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte b) {
        if(this.g == this.f) {
            this.j();
        }
        int v = this.g;
        this.g = v + 1;
        this.e[v] = b;
        ++this.h;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        int v1 = this.g;
        int v2 = this.f;
        byte[] arr_b = this.e;
        if(v2 - v1 >= v) {
            byteBuffer0.get(arr_b, v1, v);
            this.g += v;
            this.h += v;
            return;
        }
        int v3 = v2 - v1;
        byteBuffer0.get(arr_b, v1, v3);
        int v4 = v - v3;
        this.g = v2;
        this.h += v3;
        this.j();
        while(v4 > v2) {
            byteBuffer0.get(arr_b, 0, v2);
            this.i.write(arr_b, 0, v2);
            v4 -= v2;
            this.h += v2;
        }
        byteBuffer0.get(arr_b, 0, v4);
        this.g = v4;
        this.h += v4;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void write(byte[] arr_b, int v, int v1) {
        int v2 = this.g;
        int v3 = this.f;
        byte[] arr_b1 = this.e;
        if(v3 - v2 >= v1) {
            System.arraycopy(arr_b, v, arr_b1, v2, v1);
            this.g += v1;
            this.h += v1;
            return;
        }
        int v4 = v3 - v2;
        System.arraycopy(arr_b, v, arr_b1, v2, v4);
        int v5 = v + v4;
        int v6 = v1 - v4;
        this.g = v3;
        this.h += v4;
        this.j();
        if(v6 <= v3) {
            System.arraycopy(arr_b, v5, arr_b1, 0, v6);
            this.g = v6;
        }
        else {
            this.i.write(arr_b, v5, v6);
        }
        this.h += v6;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeBool(int v, boolean z) {
        this.k(11);
        this.g(v, 0);
        int v1 = this.g;
        this.g = v1 + 1;
        this.e[v1] = (byte)z;
        ++this.h;
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
        this.k(14);
        this.g(v, 5);
        this.e(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int v) {
        this.k(4);
        this.e(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64(int v, long v1) {
        this.k(18);
        this.g(v, 1);
        this.f(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long v) {
        this.k(8);
        this.f(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeInt32(int v, int v1) {
        this.k(20);
        this.g(v, 0);
        if(v1 >= 0) {
            this.h(v1);
            return;
        }
        this.i(((long)v1));
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
        int v9;
        byte[] arr_b1;
        int v6;
        int v5;
        int v3;
        try {
            int v = s.length();
            int v1 = CodedOutputStream.computeUInt32SizeNoTag(v * 3);
            int v2 = v1 + v * 3;
            v3 = this.f;
            if(v2 > v3) {
                byte[] arr_b = new byte[v * 3];
                int v4 = g4.a.g(s, arr_b, 0, v * 3);
                this.writeUInt32NoTag(v4);
                this.write(arr_b, 0, v4);
                return;
            }
            if(v2 > v3 - this.g) {
                this.j();
            }
            v5 = CodedOutputStream.computeUInt32SizeNoTag(s.length());
            v6 = this.g;
            arr_b1 = this.e;
            if(v5 == v1) {
                goto label_16;
            }
            else {
                goto label_24;
            }
            this.h += v9;
        }
        catch(f4 f40) {
            this.b(s, f40);
        }
        return;
        try {
        label_16:
            int v7 = v6 + v5;
            this.g = v7;
            int v8 = g4.a.g(s, arr_b1, v7, v3 - v7);
            this.g = v6;
            v9 = v8 - v6 - v5;
            this.h(v9);
            this.g = v8;
            this.h += v9;
            return;
        label_24:
            v9 = g4.e(s);
            this.h(v9);
            this.g = g4.a.g(s, arr_b1, this.g, v9);
            this.h += v9;
            return;
        }
        catch(f4 f41) {
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new OutOfSpaceException(arrayIndexOutOfBoundsException0);
        }
        try {
            this.h -= this.g - v6;
            this.g = v6;
            throw f41;
        }
        catch(f4 f40) {
        }
        this.b(s, f40);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeTag(int v, int v1) {
        this.writeUInt32NoTag(v << 3 | v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt32(int v, int v1) {
        this.k(20);
        this.g(v, 0);
        this.h(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int v) {
        this.k(5);
        this.h(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64(int v, long v1) {
        this.k(20);
        this.g(v, 0);
        this.i(v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long v) {
        this.k(10);
        this.i(v);
    }
}

