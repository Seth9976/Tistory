package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpd;

public final class l0 implements Runnable {
    public final zzai a;
    public final int b;
    public final long c;
    public final boolean d;
    public final zzai e;
    public final zzhx f;

    public l0(zzhx zzhx0, zzai zzai0, int v, long v1, boolean z, zzai zzai1) {
        this.f = zzhx0;
        this.a = zzai0;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = zzai1;
    }

    @Override
    public final void run() {
        zzhx zzhx0 = this.f;
        zzai zzai0 = this.a;
        zzhx0.d(zzai0);
        zzhx.i(this.f, this.a, this.b, this.c, false, this.d);
        zzpd.zzc();
        if(zzhx0.zzt.zzf().zzs(null, zzdu.zzam)) {
            zzhx.h(zzhx0, zzai0, this.e);
        }
    }
}

