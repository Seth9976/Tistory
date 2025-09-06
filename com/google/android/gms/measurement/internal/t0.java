package com.google.android.gms.measurement.internal;

public final class t0 implements Runnable {
    public final int a;
    public final zzim b;

    public t0(zzim zzim0, int v) {
        this.a = v;
        this.b = zzim0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.h = null;
            return;
        }
        this.b.zza = this.b.h;
    }
}

