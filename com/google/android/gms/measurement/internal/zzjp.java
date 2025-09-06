package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final class zzjp implements Runnable {
    public final zzjt zza;
    public final zzeh zzb;
    public final JobParameters zzc;

    public zzjp(zzjt zzjt0, zzeh zzeh0, JobParameters jobParameters0) {
        this.zza = zzjt0;
        this.zzb = zzeh0;
        this.zzc = jobParameters0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        this.zzb.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjs)this.zza.a).zzb(this.zzc, false);
    }
}

