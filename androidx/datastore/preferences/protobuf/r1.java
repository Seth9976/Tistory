package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class r1 extends InputStream {
    public final Iterator a;
    public ByteBuffer b;
    public final int c;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public int h;
    public long i;

    public r1(Iterable iterable0) {
        this.a = iterable0.iterator();
        this.c = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            ++this.c;
        }
        this.d = -1;
        if(!this.a()) {
            this.b = Internal.EMPTY_BYTE_BUFFER;
            this.d = 0;
            this.e = 0;
            this.i = 0L;
        }
    }

    public final boolean a() {
        ++this.d;
        Iterator iterator0 = this.a;
        if(!iterator0.hasNext()) {
            return false;
        }
        Object object0 = iterator0.next();
        this.b = (ByteBuffer)object0;
        this.e = ((ByteBuffer)object0).position();
        if(this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
            return true;
        }
        this.f = false;
        this.i = d4.b(this.b);
        this.g = null;
        return true;
    }

    public final void b(int v) {
        int v1 = this.e + v;
        this.e = v1;
        if(v1 == this.b.limit()) {
            this.a();
        }
    }

    @Override
    public final int read() {
        if(this.d == this.c) {
            return -1;
        }
        if(this.f) {
            int v = this.g[this.e + this.h] & 0xFF;
            this.b(1);
            return v;
        }
        int v1 = d4.c.f(((long)this.e) + this.i);
        this.b(1);
        return v1 & 0xFF;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(this.d == this.c) {
            return -1;
        }
        int v2 = this.e;
        int v3 = this.b.limit() - v2;
        if(v1 > v3) {
            v1 = v3;
        }
        if(this.f) {
            System.arraycopy(this.g, v2 + this.h, arr_b, v, v1);
            this.b(v1);
            return v1;
        }
        int v4 = this.b.position();
        this.b.position(this.e);
        this.b.get(arr_b, v, v1);
        this.b.position(v4);
        this.b(v1);
        return v1;
    }
}

