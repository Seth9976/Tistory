package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class j0 extends AtomicBoolean implements Subscription {
    public final Subscriber a;
    public final Object b;

    public j0(Object object0, Subscriber subscriber0) {
        this.b = object0;
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(v > 0L && this.compareAndSet(false, true)) {
            this.a.onNext(this.b);
            this.a.onComplete();
        }
    }
}

