package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzjs {
    public zzjt a;

    public final zzjt a() {
        if(this.a == null) {
            this.a = new zzjt(this);
        }
        return this.a;
    }

    @Override  // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.a().zze();
    }

    @Override  // android.app.Service
    @MainThread
    public void onDestroy() {
        this.a().zzf();
        super.onDestroy();
    }

    @Override  // android.app.Service
    @MainThread
    public void onRebind(@NonNull Intent intent0) {
        this.a().zzg(intent0);
    }

    @Override  // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters0) {
        this.a().zzi(jobParameters0);
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters0) {
        return false;
    }

    @Override  // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent0) {
        this.a().zzj(intent0);
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    public final void zza(@NonNull Intent intent0) {
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    @TargetApi(24)
    public final void zzb(@NonNull JobParameters jobParameters0, boolean z) {
        this.jobFinished(jobParameters0, false);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    public final boolean zzc(int v) {
        throw new UnsupportedOperationException();
    }
}

