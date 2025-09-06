package io.reactivex.internal.schedulers;

import androidx.core.app.o;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ExecutorScheduler extends Scheduler {
    public static final class ExecutorWorker extends Worker implements Runnable {
        public final boolean a;
        public final Executor b;
        public final MpscLinkedQueue c;
        public volatile boolean d;
        public final AtomicInteger e;
        public final CompositeDisposable f;

        public ExecutorWorker(Executor executor0, boolean z) {
            this.e = new AtomicInteger();
            this.f = new CompositeDisposable();
            this.b = executor0;
            this.c = new MpscLinkedQueue();
            this.a = z;
        }

        @Override  // io.reactivex.disposables.Disposable
        public void dispose() {
            if(!this.d) {
                this.d = true;
                this.f.dispose();
                if(this.e.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        @Override  // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.d;
        }

        @Override
        public void run() {
            Runnable runnable0;
            MpscLinkedQueue mpscLinkedQueue0 = this.c;
            int v = 1;
            while(true) {
                if(this.d) {
                    mpscLinkedQueue0.clear();
                    return;
                }
            label_5:
                runnable0 = (Runnable)mpscLinkedQueue0.poll();
                if(runnable0 != null) {
                    break;
                }
                if(this.d) {
                    mpscLinkedQueue0.clear();
                    return;
                }
                v = this.e.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            runnable0.run();
            if(!this.d) {
                goto label_5;
            }
            mpscLinkedQueue0.clear();
        }

        @Override  // io.reactivex.Scheduler$Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable0) {
            Disposable disposable0;
            if(this.d) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
            if(this.a) {
                disposable0 = new h(runnable1, this.f);
                this.f.add(disposable0);
            }
            else {
                disposable0 = new g(runnable1);
            }
            this.c.offer(disposable0);
            if(this.e.getAndIncrement() == 0) {
                try {
                    this.b.execute(this);
                    return disposable0;
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.d = true;
                    this.c.clear();
                    RxJavaPlugins.onError(rejectedExecutionException0);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return disposable0;
        }

        @Override  // io.reactivex.Scheduler$Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable0, long v, @NonNull TimeUnit timeUnit0) {
            if(v <= 0L) {
                return this.schedule(runnable0);
            }
            if(this.d) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
            Disposable disposable0 = new SequentialDisposable(sequentialDisposable0);
            ScheduledRunnable scheduledRunnable0 = new ScheduledRunnable(new i(this, ((SequentialDisposable)disposable0), RxJavaPlugins.onSchedule(runnable0)), this.f);
            this.f.add(scheduledRunnable0);
            Executor executor0 = this.b;
            if(executor0 instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable0.setFuture(((ScheduledExecutorService)executor0).schedule(scheduledRunnable0, v, timeUnit0));
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.d = true;
                    RxJavaPlugins.onError(rejectedExecutionException0);
                    return EmptyDisposable.INSTANCE;
                }
            }
            else {
                scheduledRunnable0.setFuture(new e(ExecutorScheduler.e.scheduleDirect(scheduledRunnable0, v, timeUnit0)));
            }
            sequentialDisposable0.replace(scheduledRunnable0);
            return disposable0;
        }
    }

    public final boolean c;
    public final Executor d;
    public static final Scheduler e;

    static {
        ExecutorScheduler.e = Schedulers.single();
    }

    public ExecutorScheduler(@NonNull Executor executor0, boolean z) {
        this.d = executor0;
        this.c = z;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new ExecutorWorker(this.d, this.c);
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0) {
        Executor executor0 = this.d;
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        try {
            if(executor0 instanceof ExecutorService) {
                Disposable disposable0 = new ScheduledDirectTask(runnable1);
                ((a)disposable0).setFuture(((ExecutorService)executor0).submit(((Callable)disposable0)));
                return disposable0;
            }
            if(this.c) {
                Disposable disposable1 = new h(runnable1, null);
                executor0.execute(((Runnable)disposable1));
                return disposable1;
            }
            Disposable disposable2 = new g(runnable1);
            executor0.execute(((Runnable)disposable2));
            return disposable2;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        RxJavaPlugins.onError(rejectedExecutionException0);
        return EmptyDisposable.INSTANCE;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable0, long v, TimeUnit timeUnit0) {
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        Executor executor0 = this.d;
        if(executor0 instanceof ScheduledExecutorService) {
            try {
                Disposable disposable0 = new ScheduledDirectTask(runnable1);
                ((a)disposable0).setFuture(((ScheduledExecutorService)executor0).schedule(((Callable)disposable0), v, timeUnit0));
                return disposable0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                RxJavaPlugins.onError(rejectedExecutionException0);
                return EmptyDisposable.INSTANCE;
            }
        }
        Disposable disposable1 = new f(runnable1);
        o o0 = new o(this, disposable1, false, 25);
        Disposable disposable2 = ExecutorScheduler.e.scheduleDirect(o0, v, timeUnit0);
        disposable1.a.replace(disposable2);
        return disposable1;
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Executor executor0 = this.d;
        if(executor0 instanceof ScheduledExecutorService) {
            Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
            try {
                Disposable disposable0 = new ScheduledDirectPeriodicTask(runnable1);
                ((a)disposable0).setFuture(((ScheduledExecutorService)executor0).scheduleAtFixedRate(((Runnable)disposable0), v, v1, timeUnit0));
                return disposable0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                RxJavaPlugins.onError(rejectedExecutionException0);
                return EmptyDisposable.INSTANCE;
            }
        }
        return super.schedulePeriodicallyDirect(runnable0, v, v1, timeUnit0);
    }
}

