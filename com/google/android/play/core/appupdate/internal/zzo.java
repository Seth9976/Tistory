package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzo implements OnCompleteListener {
    public final zzx zza;
    public final TaskCompletionSource zzb;

    public zzo(zzx zzx0, TaskCompletionSource taskCompletionSource0) {
        this.zza = zzx0;
        this.zzb = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        synchronized(this.zza.f) {
            this.zza.e.remove(this.zzb);
        }
    }
}

