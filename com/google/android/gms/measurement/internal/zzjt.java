package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzjt {
    public final Context a;

    public zzjt(Context context0) {
        Preconditions.checkNotNull(context0);
        this.a = context0;
    }

    public final zzeh a() {
        return zzfr.zzp(this.a, null, null).zzay();
    }

    @MainThread
    public final int zza(Intent intent0, int v, int v1) {
        zzeh zzeh0 = zzfr.zzp(this.a, null, null).zzay();
        if(intent0 == null) {
            zzeh0.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        zzeh0.zzj().zzc("Local AppMeasurementService called. startId, action", v1, s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zzh(new zzjq(this, v1, zzeh0, intent0));
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onBind called with null intent");
            return null;
        }
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new zzgj(zzkt.zzt(this.a), null);
        }
        this.a().zzk().zzb("onBind received unknown action", s);
        return null;
    }

    @MainThread
    public final void zze() {
        zzfr.zzp(this.a, null, null).zzay().zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfr.zzp(this.a, null, null).zzay().zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onRebind called with null intent");
            return;
        }
        String s = intent0.getAction();
        this.a().zzj().zzb("onRebind called. action", s);
    }

    public final void zzh(Runnable runnable0) {
        zzkt zzkt0 = zzkt.zzt(this.a);
        zzkt0.zzaz().zzp(new f(zzkt0, runnable0));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(JobParameters jobParameters0) {
        zzeh zzeh0 = zzfr.zzp(this.a, null, null).zzay();
        String s = jobParameters0.getExtras().getString("action");
        zzeh0.zzj().zzb("Local AppMeasurementJobService called. action", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zzh(new zzjp(this, zzeh0, jobParameters0));
        }
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent0) {
        if(intent0 == null) {
            this.a().zzd().zza("onUnbind called with null intent");
            return true;
        }
        String s = intent0.getAction();
        this.a().zzj().zzb("onUnbind called for intent. action", s);
        return true;
    }
}

