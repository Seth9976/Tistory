package com.google.android.gms.measurement.internal;

import androidx.room.a;

public final class h1 extends g {
    public final int e;
    public final Object f;

    public h1(Object object0, zzgm zzgm0, int v) {
        this.e = v;
        this.f = object0;
        super(zzgm0);
    }

    @Override  // com.google.android.gms.measurement.internal.g
    public final void b() {
        if(this.e != 0) {
            ((zzkf)this.f).zza();
            a.B(((zzkf)this.f).zzt, "Starting upload from DelayedRunnable");
            ((zzkf)this.f).zzf.p();
            return;
        }
        ((i1)this.f).d.zzg();
        long v = ((i1)this.f).d.zzt.zzav().elapsedRealtime();
        ((i1)this.f).a(v, false, false);
        ((i1)this.f).d.zzt.zzd().zzf(((i1)this.f).d.zzt.zzav().elapsedRealtime());
    }
}

