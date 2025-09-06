package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpd;

public final class k0 implements Runnable {
    public final zzai a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final zzai f;
    public final zzhx g;

    public k0(zzhx zzhx0, zzai zzai0, long v, int v1, long v2, boolean z, zzai zzai1) {
        this.g = zzhx0;
        this.a = zzai0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = zzai1;
    }

    @Override
    public final void run() {
        zzhx zzhx0 = this.g;
        zzai zzai0 = this.a;
        zzhx0.d(zzai0);
        zzhx0.c(this.b, false);
        zzhx.i(this.g, this.a, this.c, this.d, true, this.e);
        zzpd.zzc();
        if(zzhx0.zzt.zzf().zzs(null, zzdu.zzam)) {
            zzhx.h(zzhx0, zzai0, this.f);
        }
    }
}

