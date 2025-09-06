package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final class zzjq implements Runnable {
    public final zzjt zza;
    public final int zzb;
    public final zzeh zzc;
    public final Intent zzd;

    public zzjq(zzjt zzjt0, int v, zzeh zzeh0, Intent intent0) {
        this.zza = zzjt0;
        this.zzb = v;
        this.zzc = zzeh0;
        this.zzd = intent0;
    }

    @Override
    public final void run() {
        zzjt zzjt0 = this.zza;
        int v = this.zzb;
        zzeh zzeh0 = this.zzc;
        Intent intent0 = this.zzd;
        zzjs zzjs0 = (zzjs)zzjt0.a;
        if(zzjs0.zzc(v)) {
            zzeh0.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", v);
            zzjt0.a().zzj().zza("Completed wakeful intent.");
            zzjs0.zza(intent0);
        }
    }
}

