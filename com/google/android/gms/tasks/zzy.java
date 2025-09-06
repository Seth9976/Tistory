package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;

public final class zzy implements OnCompleteListener {
    public final zza zza;
    public final TaskCompletionSource zzb;
    public final d zzc;

    public zzy(zza zza0, TaskCompletionSource taskCompletionSource0, d d0) {
        this.zza = zza0;
        this.zzb = taskCompletionSource0;
        this.zzc = d0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        TaskCompletionSource taskCompletionSource0 = this.zzb;
        d d0 = this.zzc;
        this.zza.removeCallbacksAndMessages(null);
        if(task0.isSuccessful()) {
            taskCompletionSource0.trySetResult(task0.getResult());
            return;
        }
        if(task0.isCanceled()) {
            d0.a.d(null);
            return;
        }
        Exception exception0 = task0.getException();
        exception0.getClass();
        taskCompletionSource0.trySetException(exception0);
    }
}

