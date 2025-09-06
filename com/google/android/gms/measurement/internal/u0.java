package com.google.android.gms.measurement.internal;

public final class u0 implements Runnable {
    public final int a;
    public final long b;
    public final j c;

    public u0(j j0, long v, int v1) {
        this.a = v1;
        this.c = j0;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ((zzd)this.c).c(this.b);
            return;
        }
        ((zzim)this.c).zzt.zzd().zzf(this.b);
        ((zzim)this.c).zza = null;
    }
}

