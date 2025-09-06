package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class w extends Worker {
    public final ScheduledExecutorService a;
    public final CompositeDisposable b;
    public volatile boolean c;

    public w(ScheduledExecutorService scheduledExecutorService0) {
        this.a = scheduledExecutorService0;
        this.b = new CompositeDisposable();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.c) {
            this.c = true;
            this.b.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        if(this.c) {
            return EmptyDisposable.INSTANCE;
        }
        Disposable disposable0 = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable0), this.b);
        this.b.add(disposable0);
        try {
            Future future0 = v <= 0L ? this.a.submit(((Callable)disposable0)) : this.a.schedule(((Callable)disposable0), v, timeUnit0);
            ((ScheduledRunnable)disposable0).setFuture(future0);
            return disposable0;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        this.dispose();
        RxJavaPlugins.onError(rejectedExecutionException0);
        return EmptyDisposable.INSTANCE;
    }
}

