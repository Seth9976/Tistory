package io.reactivex.internal.schedulers;

import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class l implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final CompositeDisposable c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public l(long v, TimeUnit timeUnit0, ThreadFactory threadFactory0) {
        ScheduledFuture scheduledFuture0;
        ScheduledExecutorService scheduledExecutorService0;
        long v1 = timeUnit0 == null ? 0L : timeUnit0.toNanos(v);
        this.a = v1;
        this.b = new ConcurrentLinkedQueue();
        this.c = new CompositeDisposable();
        this.f = threadFactory0;
        if(timeUnit0 == null) {
            scheduledExecutorService0 = null;
            scheduledFuture0 = null;
        }
        else {
            scheduledExecutorService0 = Executors.newScheduledThreadPool(1, IoScheduler.f);
            scheduledFuture0 = scheduledExecutorService0.scheduleWithFixedDelay(this, v1, v1, TimeUnit.NANOSECONDS);
        }
        this.d = scheduledExecutorService0;
        this.e = scheduledFuture0;
    }

    public final void a() {
        this.c.dispose();
        ScheduledFuture scheduledFuture0 = this.e;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService0 = this.d;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
        }
    }

    @Override
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = this.b;
        if(!concurrentLinkedQueue0.isEmpty()) {
            long v = System.nanoTime();
            for(Object object0: concurrentLinkedQueue0) {
                n n0 = (n)object0;
                if(n0.c > v) {
                    break;
                }
                if(concurrentLinkedQueue0.remove(n0)) {
                    this.c.remove(n0);
                }
            }
        }
    }
}

