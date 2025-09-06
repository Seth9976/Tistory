package com.google.android.gms.measurement.internal;

public final class s0 implements Runnable {
    public final zzie a;
    public final zzie b;
    public final long c;
    public final boolean d;
    public final zzim e;

    public s0(zzim zzim0, zzie zzie0, zzie zzie1, long v, boolean z) {
        this.e = zzim0;
        this.a = zzie0;
        this.b = zzie1;
        this.c = v;
        this.d = z;
    }

    @Override
    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d, null);
    }
}

