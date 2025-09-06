package com.google.android.gms.measurement.internal;

public final class zzgx implements Runnable {
    public final zzhx zza;
    public final String zzb;

    public zzgx(zzhx zzhx0, String s) {
        this.zza = zzhx0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzhx zzhx0 = this.zza;
        zzdy zzdy0 = zzhx0.zzt.zzh();
        boolean z = zzdy0.o != null && !zzdy0.o.equals(this.zzb);
        zzdy0.o = this.zzb;
        if(z) {
            zzhx0.zzt.zzh().a();
        }
    }
}

