package com.google.firebase.installations;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements ThreadFactory {
    public final AtomicInteger a;

    public d() {
        this.a = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, String.format("firebase-installations-executor-%d", this.a.getAndIncrement()));
    }
}

