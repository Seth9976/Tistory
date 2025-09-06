package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    public final ByteBuffer a;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.a.array();
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int v) {
        return this.a.get(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int v) {
        return this.get(v) != 0;
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int v) {
        return this.a.getDouble(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int v) {
        return this.a.getFloat(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int v) {
        return this.a.getInt(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int v) {
        return this.a.getLong(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int v) {
        return this.a.getShort(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int v, int v1) {
        return Utf8Safe.decodeUtf8Buffer(this.a, v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int limit() {
        return this.a.limit();
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b) {
        this.a.put(b);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] arr_b, int v, int v1) {
        this.a.put(arr_b, v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z) {
        this.a.put(((byte)z));
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double f) {
        this.a.putDouble(f);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f) {
        this.a.putFloat(f);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int v) {
        this.a.putInt(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long v) {
        this.a.putLong(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short v) {
        this.a.putShort(v);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int v) {
        return v <= this.a.limit();
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int v, byte b) {
        this.a.put(v, b);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int v, byte[] arr_b, int v1, int v2) {
        this.a.position(v);
        this.a.put(arr_b, v1, v2);
        this.a.position(this.a.position());
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int v, boolean z) {
        this.set(v, ((byte)z));
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int v, double f) {
        this.a.putDouble(v, f);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int v, float f) {
        this.a.putFloat(v, f);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int v, int v1) {
        this.a.putInt(v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int v, long v1) {
        this.a.putLong(v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int v, short v1) {
        this.a.putShort(v, v1);
    }

    @Override  // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.a.position();
    }
}

