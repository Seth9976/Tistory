package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;

public final class AppMeasurementService extends Service implements zzjs {
    public zzjt a;

    public final zzjt a() {
        if(this.a == null) {
            this.a = new zzjt(this);
        }
        return this.a;
    }

    @Override  // android.app.Service
    @MainThread
    @Nullable
    public IBinder onBind(@NonNull Intent intent0) {
        return this.a().zzb(intent0);
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

    @Override  // android.app.Service
    @MainThread
    public int onStartCommand(@NonNull Intent intent0, int v, int v1) {
        this.a().zza(intent0, v, v1);
        return 2;
    }

    @Override  // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent0) {
        this.a().zzj(intent0);
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    public final void zza(@NonNull Intent intent0) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    public final void zzb(@NonNull JobParameters jobParameters0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjs
    public final boolean zzc(int v) {
        return this.stopSelfResult(v);
    }
}

