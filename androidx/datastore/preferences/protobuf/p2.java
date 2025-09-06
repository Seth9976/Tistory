package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public final class p2 extends InputStream {
    public final int a;
    public ByteBuffer b;

    public p2() {
        this.a = 1;
        super();
    }

    public p2(q2 q20) {
        this.a = 0;
        super();
        this.b = q20.d.slice();
    }

    @Override
    public int available() {
        return this.a == 0 ? this.b.remaining() : super.available();
    }

    @Override
    public void mark(int v) {
        if(this.a != 0) {
            super.mark(v);
            return;
        }
        this.b.mark();
    }

    @Override
    public boolean markSupported() {
        return this.a == 0 ? true : super.markSupported();
    }

    @Override
    public final int read() {
        if(this.a != 0) {
            try {
                return this.b.get() & 0xFF;
            }
            catch(BufferUnderflowException unused_ex) {
                return -1;
            }
        }
        ByteBuffer byteBuffer0 = this.b;
        return byteBuffer0.hasRemaining() ? byteBuffer0.get() & 0xFF : -1;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            return super.read(arr_b, v, v1);
        }
        ByteBuffer byteBuffer0 = this.b;
        if(!byteBuffer0.hasRemaining()) {
            return -1;
        }
        int v2 = Math.min(v1, byteBuffer0.remaining());
        byteBuffer0.get(arr_b, v, v2);
        return v2;
    }

    @Override
    public void reset() {
        if(this.a != 0) {
            super.reset();
            return;
        }
        try {
            this.b.reset();
        }
        catch(InvalidMarkException invalidMarkException0) {
            throw new IOException(invalidMarkException0);
        }
    }
}

