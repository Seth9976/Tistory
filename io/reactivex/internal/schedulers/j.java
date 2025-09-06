package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public final class j extends Worker {
    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return false;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0) {
        runnable0.run();
        return ImmediateThinScheduler.d;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support delayed execution");
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedulePeriodically(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support periodic execution");
    }
}

