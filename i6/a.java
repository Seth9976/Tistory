package i6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends InputStream {
    public final int a;
    public int b;
    public final Object c;

    public a(InputStream inputStream0) {
        this.a = 1;
        super();
        this.c = inputStream0;
        this.b = 0x40000000;
    }

    public a(ByteBuffer byteBuffer0) {
        this.a = 0;
        super();
        this.b = -1;
        this.c = byteBuffer0;
    }

    @Override
    public final int available() {
        return this.a == 0 ? ((ByteBuffer)this.c).remaining() : this.b;
    }

    @Override
    public void close() {
        if(this.a != 1) {
            super.close();
            return;
        }
        ((InputStream)this.c).close();
    }

    @Override
    public void mark(int v) {
        if(this.a != 0) {
            super.mark(v);
            return;
        }
        synchronized(this) {
            this.b = ((ByteBuffer)this.c).position();
        }
    }

    @Override
    public boolean markSupported() {
        return this.a == 0 ? true : super.markSupported();
    }

    @Override
    public final int read() {
        if(this.a != 0) {
            int v = ((InputStream)this.c).read();
            if(v == -1) {
                this.b = 0;
            }
            return v;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.c;
        return byteBuffer0.hasRemaining() ? byteBuffer0.get() & 0xFF : -1;
    }

    @Override
    public int read(byte[] arr_b) {
        if(this.a != 1) {
            return super.read(arr_b);
        }
        int v = ((InputStream)this.c).read(arr_b);
        if(v == -1) {
            this.b = 0;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            int v2 = ((InputStream)this.c).read(arr_b, v, v1);
            if(v2 == -1) {
                this.b = 0;
            }
            return v2;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.c;
        if(!byteBuffer0.hasRemaining()) {
            return -1;
        }
        int v3 = Math.min(v1, byteBuffer0.remaining());
        byteBuffer0.get(arr_b, v, v3);
        return v3;
    }

    @Override
    public void reset() {
        if(this.a != 0) {
            super.reset();
            return;
        }
        synchronized(this) {
            int v1 = this.b;
            if(v1 != -1) {
                ((ByteBuffer)this.c).position(v1);
                return;
            }
        }
        throw new IOException("Cannot reset to unset mark position");
    }

    @Override
    public final long skip(long v) {
        if(this.a != 0) {
            return ((InputStream)this.c).skip(v);
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.c;
        if(!byteBuffer0.hasRemaining()) {
            return -1L;
        }
        long v1 = Math.min(v, byteBuffer0.remaining());
        byteBuffer0.position(((int)(((long)byteBuffer0.position()) + v1)));
        return v1;
    }
}

