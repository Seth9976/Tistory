package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {
    public final String a;
    public final ThreadFactory b;

    @KeepForSdk
    public NamedThreadFactory(@NonNull String s) {
        this.b = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(s, "Name must not be null");
        this.a = s;
    }

    @Override
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable0) {
        a a0 = new a(1, runnable0);
        Thread thread0 = this.b.newThread(a0);
        thread0.setName(this.a);
        return thread0;
    }
}

