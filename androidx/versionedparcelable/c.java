package androidx.versionedparcelable;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {
    public final d a;

    public c(d d0, InputStream inputStream0) {
        this.a = d0;
        super(inputStream0);
    }

    @Override
    public final int read() {
        d d0 = this.a;
        if(d0.i != -1 && d0.g >= d0.i) {
            throw new IOException();
        }
        int v = super.read();
        ++d0.g;
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        d d0 = this.a;
        if(d0.i != -1 && d0.g >= d0.i) {
            throw new IOException();
        }
        int v2 = super.read(arr_b, v, v1);
        if(v2 > 0) {
            d0.g += v2;
        }
        return v2;
    }

    @Override
    public final long skip(long v) {
        d d0 = this.a;
        if(d0.i != -1 && d0.g >= d0.i) {
            throw new IOException();
        }
        long v1 = super.skip(v);
        if(v1 > 0L) {
            d0.g += (int)v1;
        }
        return v1;
    }
}

