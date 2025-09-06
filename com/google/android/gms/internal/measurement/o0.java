package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

public final class o0 implements zziz {
    public int a;
    public final int b;
    public final zzje c;

    public o0(zzje zzje0) {
        this.c = zzje0;
        this.a = 0;
        this.b = zzje0.zzd();
    }

    @Override
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override
    public final Object next() {
        return this.zza();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.measurement.zziz
    public final byte zza() {
        int v = this.a;
        if(v >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = v + 1;
        return this.c.a(v);
    }
}

