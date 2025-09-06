package io.reactivex.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kd.e;
import kd.f;

public final class TestScheduler extends Scheduler {
    public final PriorityBlockingQueue c;
    public long d;
    public volatile long e;

    public TestScheduler() {
        this.c = new PriorityBlockingQueue(11);
    }

    public TestScheduler(long v, TimeUnit timeUnit0) {
        this.c = new PriorityBlockingQueue(11);
        this.e = timeUnit0.toNanos(v);
    }

    public final void a(long v) {
        f f0;
        while((f0 = (f)this.c.peek()) != null) {
            long v1 = f0.a;
            if(v1 > v) {
                break;
            }
            if(v1 == 0L) {
                v1 = this.e;
            }
            this.e = v1;
            this.c.remove(f0);
            if(!f0.c.a) {
                f0.b.run();
            }
        }
        this.e = v;
    }

    public void advanceTimeBy(long v, TimeUnit timeUnit0) {
        long v1 = this.e;
        this.advanceTimeTo(timeUnit0.toNanos(v) + v1, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long v, TimeUnit timeUnit0) {
        this.a(timeUnit0.toNanos(v));
    }

    @Override  // io.reactivex.Scheduler
    @NonNull
    public Worker createWorker() {
        return new e(this);
    }

    @Override  // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit0) {
        return timeUnit0.convert(this.e, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        this.a(this.e);
    }
}

