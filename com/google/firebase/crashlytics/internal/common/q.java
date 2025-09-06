package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class q implements ThreadFactory {
    public final String a;
    public final AtomicLong b;

    public q(String s, AtomicLong atomicLong0) {
        this.a = s;
        this.b = atomicLong0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = Executors.defaultThreadFactory().newThread(new p(runnable0));
        thread0.setName(this.a + this.b.getAndIncrement());
        return thread0;
    }
}

