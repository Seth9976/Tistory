package androidx.emoji2.text.flatbuffer;

import androidx.datastore.preferences.protobuf.p2;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class FlatBufferBuilder {
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int arg1);

        public void releaseByteBuffer(ByteBuffer byteBuffer0) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE;

        static {
            HeapByteBufferFactory.INSTANCE = new HeapByteBufferFactory();
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory
        public ByteBuffer newByteBuffer(int v) {
            return ByteBuffer.allocate(v).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public ByteBuffer a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int[] i;
    public int j;
    public int k;
    public boolean l;
    public ByteBufferFactory m;
    public final Utf8 n;

    public FlatBufferBuilder() {
        this(0x400);
    }

    public FlatBufferBuilder(int v) {
        Utf8 utf80 = Utf8.getDefault();
        this(v, HeapByteBufferFactory.INSTANCE, null, utf80);
    }

    public FlatBufferBuilder(int v, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this(v, flatBufferBuilder$ByteBufferFactory0, null, Utf8.getDefault());
    }

    public FlatBufferBuilder(int v, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0, ByteBuffer byteBuffer0, Utf8 utf80) {
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = false;
        if(v <= 0) {
            v = 1;
        }
        this.m = flatBufferBuilder$ByteBufferFactory0;
        if(byteBuffer0 == null) {
            this.a = flatBufferBuilder$ByteBufferFactory0.newByteBuffer(v);
        }
        else {
            this.a = byteBuffer0;
            byteBuffer0.clear();
            this.a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.n = utf80;
        this.b = this.a.capacity();
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer0) {
        this(byteBuffer0, new HeapByteBufferFactory());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer0, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this(byteBuffer0.capacity(), flatBufferBuilder$ByteBufferFactory0, byteBuffer0, Utf8.getDefault());
    }

    public void Nested(int v) {
        if(v != this.offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(int v, boolean z, boolean z1) {
        if(this.l || z != z1) {
            this.addBoolean(z);
            this.slot(v);
        }
    }

    public void addBoolean(boolean z) {
        this.prep(1, 0);
        this.putBoolean(z);
    }

    public void addByte(byte b) {
        this.prep(1, 0);
        this.putByte(b);
    }

    public void addByte(int v, byte b, int v1) {
        if(this.l || b != v1) {
            this.addByte(b);
            this.slot(v);
        }
    }

    public void addDouble(double f) {
        this.prep(8, 0);
        this.putDouble(f);
    }

    public void addDouble(int v, double f, double f1) {
        if(this.l || f != f1) {
            this.addDouble(f);
            this.slot(v);
        }
    }

    public void addFloat(float f) {
        this.prep(4, 0);
        this.putFloat(f);
    }

    public void addFloat(int v, float f, double f1) {
        if(this.l || ((double)f) != f1) {
            this.addFloat(f);
            this.slot(v);
        }
    }

    public void addInt(int v) {
        this.prep(4, 0);
        this.putInt(v);
    }

    public void addInt(int v, int v1, int v2) {
        if(this.l || v1 != v2) {
            this.addInt(v1);
            this.slot(v);
        }
    }

    public void addLong(int v, long v1, long v2) {
        if(this.l || v1 != v2) {
            this.addLong(v1);
            this.slot(v);
        }
    }

    public void addLong(long v) {
        this.prep(8, 0);
        this.putLong(v);
    }

    public void addOffset(int v) {
        this.prep(4, 0);
        this.putInt(this.offset() - v + 4);
    }

    public void addOffset(int v, int v1, int v2) {
        if(this.l || v1 != v2) {
            this.addOffset(v1);
            this.slot(v);
        }
    }

    public void addShort(int v, short v1, int v2) {
        if(this.l || v1 != v2) {
            this.addShort(v1);
            this.slot(v);
        }
    }

    public void addShort(short v) {
        this.prep(2, 0);
        this.putShort(v);
    }

    public void addStruct(int v, int v1, int v2) {
        if(v1 != v2) {
            this.Nested(v1);
            this.slot(v);
        }
    }

    public void clear() {
        this.b = this.a.capacity();
        this.a.clear();
        this.c = 1;
        int v;
        while((v = this.e) > 0) {
            this.e = v - 1;
            this.d[v - 1] = 0;
        }
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.k = 0;
    }

    public int createByteVector(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.startVector(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.a.put(byteBuffer0);
        return this.endVector();
    }

    public int createByteVector(byte[] arr_b) {
        this.startVector(1, arr_b.length, 1);
        int v = this.b - arr_b.length;
        this.b = v;
        this.a.position(v);
        this.a.put(arr_b);
        return this.endVector();
    }

    public int createByteVector(byte[] arr_b, int v, int v1) {
        this.startVector(1, v1, 1);
        int v2 = this.b - v1;
        this.b = v2;
        this.a.position(v2);
        this.a.put(arr_b, v, v1);
        return this.endVector();
    }

    public int createSortedVectorOfTables(Table table0, int[] arr_v) {
        table0.sortTables(arr_v, this.a);
        return this.createVectorOfTables(arr_v);
    }

    public int createString(CharSequence charSequence0) {
        int v = this.n.encodedLength(charSequence0);
        this.addByte(0);
        this.startVector(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.n.encodeUtf8(charSequence0, this.a);
        return this.endVector();
    }

    public int createString(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.addByte(0);
        this.startVector(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.a.put(byteBuffer0);
        return this.endVector();
    }

    public ByteBuffer createUnintializedVector(int v, int v1, int v2) {
        int v3 = v * v1;
        this.startVector(v, v1, v2);
        int v4 = this.b - v3;
        this.b = v4;
        this.a.position(v4);
        ByteBuffer byteBuffer0 = this.a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.limit(v3);
        return byteBuffer0;
    }

    public int createVectorOfTables(int[] arr_v) {
        this.notNested();
        this.startVector(4, arr_v.length, 4);
        for(int v = arr_v.length - 1; v >= 0; --v) {
            this.addOffset(arr_v[v]);
        }
        return this.endVector();
    }

    public ByteBuffer dataBuffer() {
        this.finished();
        return this.a;
    }

    public int endTable() {
        int v5;
        if(this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        this.addInt(0);
        int v = this.offset();
        int v1;
        for(v1 = this.e - 1; v1 >= 0 && this.d[v1] == 0; --v1) {
        }
        for(int v2 = v1; v2 >= 0; --v2) {
            int v3 = this.d[v2];
            this.addShort(((short)(v3 == 0 ? 0 : v - v3)));
        }
        this.addShort(((short)(v - this.h)));
        this.addShort(((short)((v1 + 3) * 2)));
    alab1:
        for(int v4 = 0; true; ++v4) {
            v5 = 0;
            if(v4 >= this.j) {
                break;
            }
            int v6 = this.a.capacity() - this.i[v4];
            int v7 = this.b;
            int v8 = this.a.getShort(v6);
            if(v8 == this.a.getShort(v7)) {
                int v9 = 2;
                while(v9 < v8) {
                    if(this.a.getShort(v6 + v9) != this.a.getShort(v7 + v9)) {
                        continue alab1;
                    }
                    v9 += 2;
                }
                v5 = this.i[v4];
                break;
            }
        }
        if(v5 == 0) {
            int v11 = this.j;
            int[] arr_v = this.i;
            if(v11 == arr_v.length) {
                this.i = Arrays.copyOf(arr_v, v11 * 2);
            }
            int v12 = this.j;
            this.j = v12 + 1;
            this.i[v12] = this.offset();
            this.a.putInt(this.a.capacity() - v, this.offset() - v);
        }
        else {
            int v10 = this.a.capacity() - v;
            this.b = v10;
            this.a.putInt(v10, v5 - v);
        }
        this.f = false;
        return v;
    }

    public int endVector() {
        if(!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        this.putInt(this.k);
        return this.offset();
    }

    public void finish(int v) {
        this.finish(v, false);
    }

    public void finish(int v, String s) {
        this.finish(v, s, false);
    }

    public void finish(int v, String s, boolean z) {
        this.prep(this.c, (z ? 4 : 0) + 8);
        if(s.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for(int v1 = 3; v1 >= 0; --v1) {
            this.addByte(((byte)s.charAt(v1)));
        }
        this.finish(v, z);
    }

    public void finish(int v, boolean z) {
        this.prep(this.c, (z ? 4 : 0) + 4);
        this.addOffset(v);
        if(z) {
            this.addInt(this.a.capacity() - this.b);
        }
        this.a.position(this.b);
        this.g = true;
    }

    public void finishSizePrefixed(int v) {
        this.finish(v, true);
    }

    public void finishSizePrefixed(int v, String s) {
        this.finish(v, s, true);
    }

    public void finished() {
        if(!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z) {
        this.l = z;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer0, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this.m = flatBufferBuilder$ByteBufferFactory0;
        this.a = byteBuffer0;
        byteBuffer0.clear();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.c = 1;
        this.b = this.a.capacity();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.k = 0;
        return this;
    }

    public static boolean isFieldPresent(Table table0, int v) {
        return table0.__offset(v) != 0;
    }

    public void notNested() {
        if(this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.a.capacity() - this.b;
    }

    public void pad(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = this.b - 1;
            this.b = v2;
            this.a.put(v2, 0);
        }
    }

    public void prep(int v, int v1) {
        if(v > this.c) {
            this.c = v;
        }
        int v2 = -(this.a.capacity() - this.b + v1) & v - 1;
        while(this.b < v2 + v + v1) {
            int v3 = this.a.capacity();
            ByteBuffer byteBuffer0 = this.a;
            ByteBufferFactory flatBufferBuilder$ByteBufferFactory0 = this.m;
            int v4 = byteBuffer0.capacity();
            if((0xC0000000 & v4) != 0) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            byteBuffer0.position(0);
            ByteBuffer byteBuffer1 = flatBufferBuilder$ByteBufferFactory0.newByteBuffer((v4 == 0 ? 1 : v4 << 1));
            byteBuffer1.position(byteBuffer1.clear().capacity() - v4);
            byteBuffer1.put(byteBuffer0);
            this.a = byteBuffer1;
            this.b = this.a.capacity() - v3 + this.b;
        }
        this.pad(v2);
    }

    public void putBoolean(boolean z) {
        int v = this.b - 1;
        this.b = v;
        this.a.put(v, ((byte)z));
    }

    public void putByte(byte b) {
        int v = this.b - 1;
        this.b = v;
        this.a.put(v, b);
    }

    public void putDouble(double f) {
        int v = this.b - 8;
        this.b = v;
        this.a.putDouble(v, f);
    }

    public void putFloat(float f) {
        int v = this.b - 4;
        this.b = v;
        this.a.putFloat(v, f);
    }

    public void putInt(int v) {
        int v1 = this.b - 4;
        this.b = v1;
        this.a.putInt(v1, v);
    }

    public void putLong(long v) {
        int v1 = this.b - 8;
        this.b = v1;
        this.a.putLong(v1, v);
    }

    public void putShort(short v) {
        int v1 = this.b - 2;
        this.b = v1;
        this.a.putShort(v1, v);
    }

    public void required(int v, int v1) {
        int v2 = this.a.capacity() - v;
        int v3 = this.a.getInt(v2);
        if(this.a.getShort(v2 - v3 + v1) == 0) {
            throw new AssertionError("FlatBuffers: field " + v1 + " must be set");
        }
    }

    public byte[] sizedByteArray() {
        return this.sizedByteArray(this.b, this.a.capacity() - this.b);
    }

    public byte[] sizedByteArray(int v, int v1) {
        this.finished();
        byte[] arr_b = new byte[v1];
        this.a.position(v);
        this.a.get(arr_b);
        return arr_b;
    }

    public InputStream sizedInputStream() {
        this.finished();
        ByteBuffer byteBuffer0 = this.a.duplicate();
        byteBuffer0.position(this.b);
        byteBuffer0.limit(this.a.capacity());
        InputStream inputStream0 = new p2();
        inputStream0.b = byteBuffer0;
        return inputStream0;
    }

    public void slot(int v) {
        this.d[v] = this.offset();
    }

    public void startTable(int v) {
        this.notNested();
        if(this.d == null || this.d.length < v) {
            this.d = new int[v];
        }
        this.e = v;
        Arrays.fill(this.d, 0, v, 0);
        this.f = true;
        this.h = this.offset();
    }

    public void startVector(int v, int v1, int v2) {
        this.notNested();
        this.k = v1;
        int v3 = v * v1;
        this.prep(4, v3);
        this.prep(v2, v3);
        this.f = true;
    }
}

