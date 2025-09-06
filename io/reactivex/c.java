package io.reactivex;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

public final class c implements SchedulerRunnableIntrospection, Runnable {
    public final Runnable a;
    public final SequentialDisposable b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public final Worker g;

    public c(Worker scheduler$Worker0, long v, Runnable runnable0, long v1, SequentialDisposable sequentialDisposable0, long v2) {
        this.g = scheduler$Worker0;
        this.a = runnable0;
        this.b = sequentialDisposable0;
        this.c = v2;
        this.e = v1;
        this.f = v;
    }

    @Override  // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.a;
    }

    @Override
    public final void run() {
        long v3;
        this.a.run();
        SequentialDisposable sequentialDisposable0 = this.b;
        if(!sequentialDisposable0.isDisposed()) {
            TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
            Worker scheduler$Worker0 = this.g;
            long v = scheduler$Worker0.now(timeUnit0);
            long v1 = this.c;
            if(Long.compare(v + Scheduler.b, this.e) < 0 || v >= this.e + v1 + Scheduler.b) {
                v3 = v + v1;
                long v4 = this.d + 1L;
                this.d = v4;
                this.f = v3 - v1 * v4;
            }
            else {
                long v2 = this.d + 1L;
                this.d = v2;
                v3 = v2 * v1 + this.f;
            }
            this.e = v;
            sequentialDisposable0.replace(scheduler$Worker0.schedule(this, v3 - v, timeUnit0));
        }
    }
}

