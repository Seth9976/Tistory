package com.google.firebase.crashlytics.internal.metadata;

import java.io.InputStream;

public final class f extends InputStream {
    public int a;
    public int b;
    public final g c;

    public f(g g0, e e0) {
        this.c = g0;
        super();
        this.a = g0.k(e0.a + 4);
        this.b = e0.b;
    }

    @Override
    public final int read() {
        if(this.b == 0) {
            return -1;
        }
        this.c.a.seek(((long)this.a));
        int v = this.c.a.read();
        this.a = this.c.k(this.a + 1);
        --this.b;
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("buffer");
        }
        if((v | v1) < 0 || v1 > arr_b.length - v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v2 = this.b;
        if(v2 > 0) {
            if(v1 > v2) {
                v1 = v2;
            }
            this.c.h(this.a, arr_b, v, v1);
            this.a = this.c.k(this.a + v1);
            this.b -= v1;
            return v1;
        }
        return -1;
    }
}

