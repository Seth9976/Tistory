package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

public abstract class z extends CodedOutputStream {
    public final byte[] e;
    public final int f;
    public int g;
    public int h;

    public z(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] arr_b = new byte[Math.max(v, 20)];
        this.e = arr_b;
        this.f = arr_b.length;
    }

    public final void e(int v) {
        int v1 = this.g;
        this.g = v1 + 1;
        this.e[v1] = (byte)(v & 0xFF);
        this.g = v1 + 2;
        this.e[v1 + 1] = (byte)(v >> 8 & 0xFF);
        this.g = v1 + 3;
        this.e[v1 + 2] = (byte)(v >> 16 & 0xFF);
        this.g = v1 + 4;
        this.e[v1 + 3] = (byte)(v >> 24 & 0xFF);
        this.h += 4;
    }

    public final void f(long v) {
        int v1 = this.g;
        this.g = v1 + 1;
        this.e[v1] = (byte)(((int)(v & 0xFFL)));
        this.g = v1 + 2;
        this.e[v1 + 1] = (byte)(((int)(v >> 8 & 0xFFL)));
        this.g = v1 + 3;
        this.e[v1 + 2] = (byte)(((int)(v >> 16 & 0xFFL)));
        this.g = v1 + 4;
        this.e[v1 + 3] = (byte)(((int)(0xFFL & v >> 24)));
        this.g = v1 + 5;
        this.e[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
        this.g = v1 + 6;
        this.e[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
        this.g = v1 + 7;
        this.e[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
        this.g = v1 + 8;
        this.e[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        this.h += 8;
    }

    public final void g(int v, int v1) {
        this.h(v << 3 | v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.h;
    }

    public final void h(int v) {
        byte[] arr_b = this.e;
        if(CodedOutputStream.d) {
            long v1 = (long)this.g;
            while((v & 0xFFFFFF80) != 0) {
                int v2 = this.g;
                this.g = v2 + 1;
                d4.r(arr_b, ((long)v2), ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.g;
            this.g = v3 + 1;
            d4.r(arr_b, ((long)v3), ((byte)v));
            this.h += (int)(((long)this.g) - v1);
            return;
        }
        while((v & 0xFFFFFF80) != 0) {
            int v4 = this.g;
            this.g = v4 + 1;
            arr_b[v4] = (byte)(v & 0x7F | 0x80);
            ++this.h;
            v >>>= 7;
        }
        int v5 = this.g;
        this.g = v5 + 1;
        arr_b[v5] = (byte)v;
        ++this.h;
    }

    public final void i(long v) {
        byte[] arr_b = this.e;
        if(CodedOutputStream.d) {
            long v1 = (long)this.g;
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.g;
                this.g = v2 + 1;
                d4.r(arr_b, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.g;
            this.g = v3 + 1;
            d4.r(arr_b, ((long)v3), ((byte)(((int)v))));
            this.h += (int)(((long)this.g) - v1);
            return;
        }
        while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
            int v4 = this.g;
            this.g = v4 + 1;
            arr_b[v4] = (byte)(((int)v) & 0x7F | 0x80);
            ++this.h;
            v >>>= 7;
        }
        int v5 = this.g;
        this.g = v5 + 1;
        arr_b[v5] = (byte)(((int)v));
        ++this.h;
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public void writeLazy(ByteBuffer byteBuffer0) {
        this.write(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
    public void writeLazy(byte[] arr_b, int v, int v1) {
        this.write(arr_b, v, v1);
    }
}

