package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class IoScheduler extends Scheduler {
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60L;
    public final ThreadFactory c;
    public final AtomicReference d;
    public static final RxThreadFactory e;
    public static final RxThreadFactory f;
    public static final long g;
    public static final TimeUnit h;
    public static final n i;
    public static final boolean j;
    public static final l k;

    static {
        IoScheduler.h = TimeUnit.SECONDS;
        IoScheduler.g = 60L;
        n n0 = new n(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        IoScheduler.i = n0;
        n0.dispose();
        RxThreadFactory rxThreadFactory0 = new RxThreadFactory("RxCachedThreadScheduler", 5);
        IoScheduler.e = rxThreadFactory0;
        IoScheduler.f = new RxThreadFactory("RxCachedWorkerPoolEvictor", 5);
        IoScheduler.j = false;
        l l0 = new l(0L, null, rxThreadFactory0);
        IoScheduler.k = l0;
        l0.a();
    }

    public IoScheduler() {
        this(IoScheduler.e);
    }

    public IoScheduler(ThreadFactory threadFactory0) {
        this.c = threadFactory0;
        this.d = new AtomicReference(IoScheduler.k);
        this.start();
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new m(((l)this.d.get()));
    }

    @Override  // io.reactivex.Scheduler
    public void shutdown() {
        while(true) {
            AtomicReference atomicReference0 = this.d;
            l l0 = (l)atomicReference0.get();
            l l1 = IoScheduler.k;
            if(l0 == l1) {
                return;
            }
            do {
                if(atomicReference0.compareAndSet(l0, l1)) {
                    l0.a();
                    return;
                }
            }
            while(atomicReference0.get() == l0);
        }
    }

    public int size() {
        return ((l)this.d.get()).c.size();
    }

    @Override  // io.reactivex.Scheduler
    public void start() {
        l l0 = new l(IoScheduler.g, IoScheduler.h, this.c);
        AtomicReference atomicReference0 = this.d;
        while(true) {
            l l1 = IoScheduler.k;
            if(atomicReference0.compareAndSet(l1, l0)) {
                break;
            }
            if(atomicReference0.get() != l1) {
                l0.a();
                return;
            }
        }
    }
}

