package com.bumptech.glide.load.resource.bitmap;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class p implements Lock {
    @Override
    public final void lock() {
    }

    @Override
    public final void lockInterruptibly() {
    }

    @Override
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override
    public final boolean tryLock() {
        return true;
    }

    @Override
    public final boolean tryLock(long v, TimeUnit timeUnit0) {
        return true;
    }

    @Override
    public final void unlock() {
    }
}

