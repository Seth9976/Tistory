package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {
    public final ThreadFactory c;
    public final AtomicReference d;
    public static final c e;
    public static final RxThreadFactory f;
    public static final int g;
    public static final d h;

    static {
        ComputationScheduler.g = Runtime.getRuntime().availableProcessors();
        d d0 = new d(new RxThreadFactory("RxComputationShutdown"));  // 初始化器: Lio/reactivex/internal/schedulers/NewThreadWorker;-><init>(Ljava/util/concurrent/ThreadFactory;)V
        ComputationScheduler.h = d0;
        d0.dispose();
        RxThreadFactory rxThreadFactory0 = new RxThreadFactory("RxComputationThreadPool", 5, true);
        ComputationScheduler.f = rxThreadFactory0;
        c c0 = new c(rxThreadFactory0, 0);
        ComputationScheduler.e = c0;
        c0.b();
    }

    public ComputationScheduler() {
        this(ComputationScheduler.f);
    }

    public ComputationScheduler(ThreadFactory threadFactory0) {
        this.c = threadFactory0;
        this.d = new AtomicReference(ComputationScheduler.e);
        this.start();
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new b(((c)this.d.get()).a());
    }

    @Override  // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int v, WorkerCallback schedulerMultiWorkerSupport$WorkerCallback0) {
        ObjectHelper.verifyPositive(v, "number > 0 required");
        ((c)this.d.get()).createWorkers(v, schedulerMultiWorkerSupport$WorkerCallback0);
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, TimeUnit timeUnit0) {
        return ((c)this.d.get()).a().scheduleDirect(runnable0, v, timeUnit0);
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return ((c)this.d.get()).a().schedulePeriodicallyDirect(runnable0, v, v1, timeUnit0);
    }

    @Override  // io.reactivex.Scheduler
    public void shutdown() {
        while(true) {
            AtomicReference atomicReference0 = this.d;
            c c0 = (c)atomicReference0.get();
            c c1 = ComputationScheduler.e;
            if(c0 == c1) {
                return;
            }
            do {
                if(atomicReference0.compareAndSet(c0, c1)) {
                    c0.b();
                    return;
                }
            }
            while(atomicReference0.get() == c0);
        }
    }

    @Override  // io.reactivex.Scheduler
    public void start() {
        c c0 = new c(this.c, ComputationScheduler.g);
        AtomicReference atomicReference0 = this.d;
        while(true) {
            c c1 = ComputationScheduler.e;
            if(atomicReference0.compareAndSet(c1, c0)) {
                break;
            }
            if(atomicReference0.get() != c1) {
                c0.b();
                return;
            }
        }
    }
}

