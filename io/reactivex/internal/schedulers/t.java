package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.processors.FlowableProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class t extends Worker {
    public final AtomicBoolean a;
    public final FlowableProcessor b;
    public final Worker c;

    public t(FlowableProcessor flowableProcessor0, Worker scheduler$Worker0) {
        this.b = flowableProcessor0;
        this.c = scheduler$Worker0;
        this.a = new AtomicBoolean();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a.compareAndSet(false, true)) {
            this.b.onComplete();
            this.c.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get();
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0) {
        Disposable disposable0 = new s(runnable0);
        this.b.onNext(disposable0);
        return disposable0;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        Disposable disposable0 = new r(runnable0, v, timeUnit0);
        this.b.onNext(disposable0);
        return disposable0;
    }
}

