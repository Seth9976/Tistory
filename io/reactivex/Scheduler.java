package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public abstract class Scheduler {
    public static abstract class Worker implements Disposable {
        public long now(@NonNull TimeUnit timeUnit0) {
            return Scheduler.a ? timeUnit0.convert(System.nanoTime(), TimeUnit.NANOSECONDS) : timeUnit0.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @NonNull
        public Disposable schedule(@NonNull Runnable runnable0) {
            return this.schedule(runnable0, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        public abstract Disposable schedule(@NonNull Runnable arg1, long arg2, @NonNull TimeUnit arg3);

        @NonNull
        public Disposable schedulePeriodically(@NonNull Runnable runnable0, long v, long v1, @NonNull TimeUnit timeUnit0) {
            SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
            Disposable disposable0 = new SequentialDisposable(sequentialDisposable0);
            Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
            long v2 = timeUnit0.toNanos(v1);
            long v3 = this.now(TimeUnit.NANOSECONDS);
            Disposable disposable1 = this.schedule(new c(this, timeUnit0.toNanos(v) + v3, runnable1, v3, ((SequentialDisposable)disposable0), v2), v, timeUnit0);
            if(disposable1 == EmptyDisposable.INSTANCE) {
                return disposable1;
            }
            sequentialDisposable0.replace(disposable1);
            return disposable0;
        }
    }

    public static final boolean a;
    public static final long b;

    static {
        Scheduler.a = false;
        Scheduler.b = TimeUnit.MINUTES.toNanos(15L);
    }

    public static long clockDriftTolerance() {
        return Scheduler.b;
    }

    @NonNull
    public abstract Worker createWorker();

    public long now(@NonNull TimeUnit timeUnit0) {
        return Scheduler.a ? timeUnit0.convert(System.nanoTime(), TimeUnit.NANOSECONDS) : timeUnit0.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0) {
        return this.scheduleDirect(runnable0, 0L, TimeUnit.NANOSECONDS);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, @NonNull TimeUnit timeUnit0) {
        Worker scheduler$Worker0 = this.createWorker();
        Disposable disposable0 = new a(RxJavaPlugins.onSchedule(runnable0), scheduler$Worker0);
        scheduler$Worker0.schedule(((Runnable)disposable0), v, timeUnit0);
        return disposable0;
    }

    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable0, long v, long v1, @NonNull TimeUnit timeUnit0) {
        Worker scheduler$Worker0 = this.createWorker();
        Disposable disposable0 = new b(RxJavaPlugins.onSchedule(runnable0), scheduler$Worker0);
        Disposable disposable1 = scheduler$Worker0.schedulePeriodically(((Runnable)disposable0), v, v1, timeUnit0);
        return disposable1 == EmptyDisposable.INSTANCE ? disposable1 : disposable0;
    }

    public void shutdown() {
    }

    public void start() {
    }

    @NonNull
    public Scheduler when(@NonNull Function function0) {
        return new SchedulerWhen(function0, this);
    }
}

