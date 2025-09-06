package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {
    public final String a;
    public final AtomicInteger b;
    public final ThreadFactory c;

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String s) {
        this.b = new AtomicInteger();
        this.c = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(s, "Name must not be null");
        this.a = s;
    }

    @Override
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable0) {
        a a0 = new a(1, runnable0);
        Thread thread0 = this.c.newThread(a0);
        int v = this.b.getAndIncrement();
        thread0.setName(this.a + "[" + v + "]");
        return thread0;
    }
}

