package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

public final class ScalarSubscription extends AtomicInteger implements QueueSubscription {
    public final Object a;
    public final Subscriber b;

    public ScalarSubscription(Subscriber subscriber0, Object object0) {
        this.b = subscriber0;
        this.a = object0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.lazySet(2);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.lazySet(1);
    }

    public boolean isCancelled() {
        return this.get() == 2;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.get() != 0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        if(this.get() == 0) {
            this.lazySet(1);
            return this.a;
        }
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        if(!SubscriptionHelper.validate(v)) {
            return;
        }
        if(this.compareAndSet(0, 1)) {
            Subscriber subscriber0 = this.b;
            subscriber0.onNext(this.a);
            if(this.get() != 2) {
                subscriber0.onComplete();
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int v) {
        return v & 1;
    }
}

