package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class OnDemandCounter {
    public final AtomicInteger a;
    public final AtomicInteger b;

    public OnDemandCounter() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
    }

    public int getDroppedOnDemandExceptions() {
        return this.b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.b.set(0);
    }
}

