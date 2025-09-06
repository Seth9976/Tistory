package com.google.android.gms.measurement.internal;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

public final class zzkc extends p {
    public zzby b;
    protected final j1 zza;
    protected final i1 zzb;
    protected final g1 zzc;

    public zzkc(zzfr zzfr0) {
        super(zzfr0);
        this.zza = new j1(this);
        this.zzb = new i1(this);
        this.zzc = new g1(this);
    }

    public final void a() {
        this.zzg();
        if(this.b == null) {
            this.b = new zzby(Looper.getMainLooper());
        }
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return false;
    }
}

