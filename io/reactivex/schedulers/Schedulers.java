package io.reactivex.schedulers;

import cd.n;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Executor;

public final class Schedulers {
    public static final Scheduler a;
    public static final Scheduler b;
    public static final Scheduler c;
    public static final TrampolineScheduler d;
    public static final Scheduler e;

    static {
        Schedulers.a = RxJavaPlugins.initSingleScheduler(new n(5));
        Schedulers.b = RxJavaPlugins.initComputationScheduler(new n(2));
        Schedulers.c = RxJavaPlugins.initIoScheduler(new n(3));
        Schedulers.d = TrampolineScheduler.instance();
        Schedulers.e = RxJavaPlugins.initNewThreadScheduler(new n(4));
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(Schedulers.b);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor0) {
        return new ExecutorScheduler(executor0, false);
    }

    @Experimental
    @NonNull
    public static Scheduler from(@NonNull Executor executor0, boolean z) {
        return new ExecutorScheduler(executor0, z);
    }

    @NonNull
    public static Scheduler io() {
        return RxJavaPlugins.onIoScheduler(Schedulers.c);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(Schedulers.e);
    }

    public static void shutdown() {
        Schedulers.computation().shutdown();
        Schedulers.io().shutdown();
        Schedulers.newThread().shutdown();
        Schedulers.single().shutdown();
        Schedulers.trampoline().shutdown();
        SchedulerPoolFactory.shutdown();
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(Schedulers.a);
    }

    public static void start() {
        Schedulers.computation().start();
        Schedulers.io().start();
        Schedulers.newThread().start();
        Schedulers.single().start();
        Schedulers.trampoline().start();
        SchedulerPoolFactory.start();
    }

    @NonNull
    public static Scheduler trampoline() {
        return Schedulers.d;
    }
}

