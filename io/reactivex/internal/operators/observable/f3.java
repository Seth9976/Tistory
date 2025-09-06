package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class f3 extends h3 {
    public final AtomicInteger g;

    public f3(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(serializedObserver0, v, timeUnit0, scheduler0);
        this.g = new AtomicInteger(1);
    }

    @Override  // io.reactivex.internal.operators.observable.h3
    public final void a() {
        Object object0 = this.getAndSet(null);
        SerializedObserver serializedObserver0 = this.a;
        if(object0 != null) {
            serializedObserver0.onNext(object0);
        }
        if(this.g.decrementAndGet() == 0) {
            serializedObserver0.onComplete();
        }
    }

    @Override
    public final void run() {
        AtomicInteger atomicInteger0 = this.g;
        if(atomicInteger0.incrementAndGet() == 2) {
            Object object0 = this.getAndSet(null);
            SerializedObserver serializedObserver0 = this.a;
            if(object0 != null) {
                serializedObserver0.onNext(object0);
            }
            if(atomicInteger0.decrementAndGet() == 0) {
                serializedObserver0.onComplete();
            }
        }
    }
}

