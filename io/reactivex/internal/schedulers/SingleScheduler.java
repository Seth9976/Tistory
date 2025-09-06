package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleScheduler extends Scheduler {
    public final ThreadFactory c;
    public final AtomicReference d;
    public static final RxThreadFactory e;
    public static final ScheduledExecutorService f;

    static {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(0);
        SingleScheduler.f = scheduledExecutorService0;
        scheduledExecutorService0.shutdown();
        SingleScheduler.e = new RxThreadFactory("RxSingleScheduler", 5, true);
    }

    public SingleScheduler() {
        this(SingleScheduler.e);
    }

    public SingleScheduler(ThreadFactory threadFactory0) {
        AtomicReference atomicReference0 = new AtomicReference();
        this.d = atomicReference0;
        this.c = threadFactory0;
        atomicReference0.lazySet(SchedulerPoolFactory.create(threadFactory0));
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new w(((ScheduledExecutorService)this.d.get()));
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, TimeUnit timeUnit0) {
        Disposable disposable0 = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable0));
        AtomicReference atomicReference0 = this.d;
        try {
            Future future0 = Long.compare(v, 0L) <= 0 ? ((ScheduledExecutorService)atomicReference0.get()).submit(((Callable)disposable0)) : ((ScheduledExecutorService)atomicReference0.get()).schedule(((Callable)disposable0), v, timeUnit0);
            ((a)disposable0).setFuture(future0);
            return disposable0;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        RxJavaPlugins.onError(rejectedExecutionException0);
        return EmptyDisposable.INSTANCE;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        AtomicReference atomicReference0 = this.d;
        if(Long.compare(v1, 0L) <= 0) {
            ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)atomicReference0.get();
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
            ((a)disposable1).setFuture(((ScheduledExecutorService)atomicReference0.get()).scheduleAtFixedRate(((Runnable)disposable1), v, v1, timeUnit0));
            return disposable1;
        }
        catch(RejectedExecutionException rejectedExecutionException1) {
            RxJavaPlugins.onError(rejectedExecutionException1);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override  // io.reactivex.Scheduler
    public void shutdown() {
        AtomicReference atomicReference0 = this.d;
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)atomicReference0.get();
        ScheduledExecutorService scheduledExecutorService1 = SingleScheduler.f;
        if(scheduledExecutorService0 != scheduledExecutorService1) {
            ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService)atomicReference0.getAndSet(scheduledExecutorService1);
            if(scheduledExecutorService2 != scheduledExecutorService1) {
                scheduledExecutorService2.shutdownNow();
            }
        }
    }

    @Override  // io.reactivex.Scheduler
    public void start() {
        ExecutorService executorService0 = null;
        while(true) {
            AtomicReference atomicReference0 = this.d;
            ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)atomicReference0.get();
            if(scheduledExecutorService0 != SingleScheduler.f) {
                if(executorService0 != null) {
                    executorService0.shutdown();
                }
                return;
            }
            if(executorService0 == null) {
                executorService0 = SchedulerPoolFactory.create(this.c);
            }
            do {
                if(atomicReference0.compareAndSet(scheduledExecutorService0, executorService0)) {
                    return;
                }
            }
            while(atomicReference0.get() == scheduledExecutorService0);
        }
    }
}

