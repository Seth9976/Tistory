package com.google.android.gms.measurement.internal;

import androidx.room.a;

public final class z0 extends g {
    public final int e;
    public final zzjm f;

    public z0(zzjm zzjm0, zzfr zzfr0, int v) {
        this.e = v;
        this.f = zzjm0;
        super(zzfr0);
    }

    @Override  // com.google.android.gms.measurement.internal.g
    public final void b() {
        if(this.e != 0) {
            a.A(this.f.zzt, "Tasks have been queued for a long time");
            return;
        }
        zzjm zzjm0 = this.f;
        zzjm0.zzg();
        if(zzjm0.zzL()) {
            zzjm0.zzt.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjm0.zzs();
        }
    }
}

