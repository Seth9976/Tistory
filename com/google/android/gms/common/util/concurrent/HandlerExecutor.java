package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {
    public final zzi a;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper0) {
        this.a = new zzi(looper0);
    }

    @Override
    public final void execute(@NonNull Runnable runnable0) {
        this.a.post(runnable0);
    }
}

