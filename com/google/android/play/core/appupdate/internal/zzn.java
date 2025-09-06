package com.google.android.play.core.appupdate.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzn implements Runnable {
    public final TaskCompletionSource a;

    public zzn() {
        this.a = null;
    }

    public zzn(@Nullable TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override
    public final void run() {
        try {
            this.zza();
        }
        catch(Exception exception0) {
            this.zzc(exception0);
        }
    }

    public abstract void zza();

    public final void zzc(Exception exception0) {
        TaskCompletionSource taskCompletionSource0 = this.a;
        if(taskCompletionSource0 != null) {
            taskCompletionSource0.trySetException(exception0);
        }
    }
}

