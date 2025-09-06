package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class a extends FilterInputStream {
    public int a;

    public a(InputStream inputStream0, int v) {
        super(inputStream0);
        this.a = v;
    }

    @Override
    public final int available() {
        return Math.min(super.available(), this.a);
    }

    @Override
    public final int read() {
        if(this.a <= 0) {
            return -1;
        }
        int v = super.read();
        if(v >= 0) {
            --this.a;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.a;
        if(v2 <= 0) {
            return -1;
        }
        int v3 = super.read(arr_b, v, Math.min(v1, v2));
        if(v3 >= 0) {
            this.a -= v3;
        }
        return v3;
    }

    @Override
    public final long skip(long v) {
        long v1 = super.skip(Math.min(v, this.a));
        if(v1 >= 0L) {
            this.a = (int)(((long)this.a) - v1);
        }
        return v1;
    }
}

