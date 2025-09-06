package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler c;

    static {
        TrampolineScheduler.c = new TrampolineScheduler();  // 初始化器: Lio/reactivex/Scheduler;-><init>()V
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new z();
    }

    public static TrampolineScheduler instance() {
        return TrampolineScheduler.c;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0) {
        RxJavaPlugins.onSchedule(runnable0).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, TimeUnit timeUnit0) {
        try {
            timeUnit0.sleep(v);
            RxJavaPlugins.onSchedule(runnable0).run();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(interruptedException0);
        }
        return EmptyDisposable.INSTANCE;
    }
}

