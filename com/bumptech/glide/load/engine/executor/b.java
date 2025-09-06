package com.bumptech.glide.load.engine.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {
    public final c6.b a;
    public final String b;
    public final UncaughtThrowableStrategy c;
    public final boolean d;
    public final AtomicInteger e;

    public b(c6.b b0, String s, UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0, boolean z) {
        this.e = new AtomicInteger();
        this.a = b0;
        this.b = s;
        this.c = glideExecutor$UncaughtThrowableStrategy0;
        this.d = z;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        a a0 = new a(this, runnable0);
        this.a.getClass();
        Thread thread0 = new c6.a(a0);
        thread0.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return thread0;
    }
}

