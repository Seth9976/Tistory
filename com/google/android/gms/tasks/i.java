package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

public final class i implements Executor {
    public final zza a;

    public i() {
        this.a = new zza(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.post(runnable0);
    }
}

