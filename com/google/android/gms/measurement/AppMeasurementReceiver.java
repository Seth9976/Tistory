package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzfa.zza;
import com.google.android.gms.measurement.internal.zzfa;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfa.zza {
    public zzfa c;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return this.goAsync();
    }

    @Override  // com.google.android.gms.measurement.internal.zzfa$zza
    @MainThread
    public void doStartService(@NonNull Context context0, @NonNull Intent intent0) {
        WakefulBroadcastReceiver.startWakefulService(context0, intent0);
    }

    @Override  // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(@NonNull Context context0, @NonNull Intent intent0) {
        if(this.c == null) {
            this.c = new zzfa(this);
        }
        this.c.zza(context0, intent0);
    }
}

