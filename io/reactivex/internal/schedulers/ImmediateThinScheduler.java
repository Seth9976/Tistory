package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.TimeUnit;

public final class ImmediateThinScheduler extends Scheduler {
    public static final Scheduler INSTANCE;
    public static final j c;
    public static final Disposable d;

    static {
        ImmediateThinScheduler.INSTANCE = new ImmediateThinScheduler();  // 初始化器: Lio/reactivex/Scheduler;-><init>()V
        ImmediateThinScheduler.c = new j();  // 初始化器: Lio/reactivex/Scheduler$Worker;-><init>()V
        Disposable disposable0 = Disposables.empty();
        ImmediateThinScheduler.d = disposable0;
        disposable0.dispose();
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return ImmediateThinScheduler.c;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0) {
        runnable0.run();
        return ImmediateThinScheduler.d;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support delayed execution");
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support periodic execution");
    }
}

