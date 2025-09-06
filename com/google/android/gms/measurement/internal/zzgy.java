package com.google.android.gms.measurement.internal;

import androidx.room.a;

public final class zzgy implements Runnable {
    public final zzhx zza;

    public zzgy(zzhx zzhx0) {
        this.zza = zzhx0;
    }

    @Override
    public final void run() {
        zzhx zzhx0 = this.zza;
        zzhx0.zzg();
        if(!zzhx0.zzt.zzm().q.zzb()) {
            long v = zzhx0.zzt.zzm().r.zza();
            zzhx0.zzt.zzm().r.zzb(v + 1L);
            if(v >= 5L) {
                a.A(zzhx0.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzhx0.zzt.zzm().q.zza(true);
                return;
            }
            zzhx0.zzt.zzE();
            return;
        }
        zzhx0.zzt.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }
}

