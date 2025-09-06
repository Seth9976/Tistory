package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class v4 extends x4 {
    public final AtomicInteger h;

    public v4(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(serializedSubscriber0, v, timeUnit0, scheduler0);
        this.h = new AtomicInteger(1);
    }

    @Override  // io.reactivex.internal.operators.flowable.x4
    public final void a() {
        this.b();
        if(this.h.decrementAndGet() == 0) {
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.x4
    public final void run() {
        AtomicInteger atomicInteger0 = this.h;
        if(atomicInteger0.incrementAndGet() == 2) {
            this.b();
            if(atomicInteger0.decrementAndGet() == 0) {
                this.a.onComplete();
            }
        }
    }
}

