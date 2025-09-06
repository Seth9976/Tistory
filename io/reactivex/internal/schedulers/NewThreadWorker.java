package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class NewThreadWorker extends Worker implements Disposable {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public NewThreadWorker(ThreadFactory threadFactory0) {
        this.a = SchedulerPoolFactory.create(threadFactory0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        if(!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b;
    }

    @Override  // io.reactivex.Scheduler$Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable0) {
        return this.schedule(runnable0, 0L, null);
    }

    @Override  // io.reactivex.Scheduler$Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable0, long v, @NonNull TimeUnit timeUnit0) {
        return this.b ? EmptyDisposable.INSTANCE : this.scheduleActual(runnable0, v, timeUnit0, null);
    }

    @NonNull
    public ScheduledRunnable scheduleActual(Runnable runnable0, long v, @NonNull TimeUnit timeUnit0, @Nullable DisposableContainer disposableContainer0) {
        ScheduledRunnable scheduledRunnable0 = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable0), disposableContainer0);
        if(disposableContainer0 != null && !disposableContainer0.add(scheduledRunnable0)) {
            return scheduledRunnable0;
        }
        try {
            ScheduledExecutorService scheduledExecutorService0 = this.a;
            Future future0 = Long.compare(v, 0L) <= 0 ? scheduledExecutorService0.submit(scheduledRunnable0) : scheduledExecutorService0.schedule(scheduledRunnable0, v, timeUnit0);
            scheduledRunnable0.setFuture(future0);
            return scheduledRunnable0;
        label_11:
            if(disposableContainer0 != null) {
                goto label_12;
            }
            goto label_13;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            goto label_11;
        }
    label_12:
        disposableContainer0.remove(scheduledRunnable0);
    label_13:
        RxJavaPlugins.onError(rejectedExecutionException0);
        return scheduledRunnable0;
    }

    public Disposable scheduleDirect(Runnable runnable0, long v, TimeUnit timeUnit0) {
        Disposable disposable0 = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable0));
        ScheduledExecutorService scheduledExecutorService0 = this.a;
        try {
            Future future0 = Long.compare(v, 0L) <= 0 ? scheduledExecutorService0.submit(((Callable)disposable0)) : scheduledExecutorService0.schedule(((Callable)disposable0), v, timeUnit0);
            ((a)disposable0).setFuture(future0);
            return disposable0;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        RxJavaPlugins.onError(rejectedExecutionException0);
        return EmptyDisposable.INSTANCE;
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        if(v1 <= 0L) {
            ScheduledExecutorService scheduledExecutorService0 = this.a;
            Disposable disposable0 = new k(runnable1, scheduledExecutorService0);
            try {
                Future future0 = v <= 0L ? scheduledExecutorService0.submit(((Callable)disposable0)) : scheduledExecutorService0.schedule(((Callable)disposable0), v, timeUnit0);
                ((k)disposable0).a(future0);
                return disposable0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
            }
            RxJavaPlugins.onError(rejectedExecutionException0);
            return EmptyDisposable.INSTANCE;
        }
        Disposable disposable1 = new ScheduledDirectPeriodicTask(runnable1);
        try {
            ((a)disposable1).setFuture(this.a.scheduleAtFixedRate(((Runnable)disposable1), v, v1, timeUnit0));
            return disposable1;
        }
        catch(RejectedExecutionException rejectedExecutionException1) {
            RxJavaPlugins.onError(rejectedExecutionException1);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void shutdown() {
        if(!this.b) {
            this.b = true;
            this.a.shutdown();
        }
    }
}

