package com.google.android.gms.internal.measurement;

public final class p0 extends q0 {
    public final int c;

    public p0(byte[] arr_b, int v) {
        super(arr_b);
        zzje.c(0, v, arr_b.length);
        this.c = v;
    }

    @Override  // com.google.android.gms.internal.measurement.q0
    public final byte a(int v) {
        return this.b[v];
    }

    @Override  // com.google.android.gms.internal.measurement.q0
    public final byte zza(int v) {
        int v1 = this.c;
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.b[v];
    }

    @Override  // com.google.android.gms.internal.measurement.q0
    public final int zzd() {
        return this.c;
    }
}

