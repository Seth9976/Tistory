package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

public final class o0 implements Runnable {
    public final int a;
    public final zzcf b;
    public final AppMeasurementDynamiteService c;

    public o0(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcf zzcf0, int v) {
        this.a = v;
        this.c = appMeasurementDynamiteService0;
        this.b = zzcf0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            zzlb zzlb0 = this.c.a.zzv();
            boolean z = this.c.a.zzI();
            zzlb0.zzP(this.b, z);
            return;
        }
        this.c.a.zzt().zzt(this.b);
    }
}

