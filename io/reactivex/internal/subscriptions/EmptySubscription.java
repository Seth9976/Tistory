package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscriber;

public enum EmptySubscription implements QueueSubscription {
    INSTANCE;

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    public static void complete(Subscriber subscriber0) {
        subscriber0.onSubscribe(EmptySubscription.INSTANCE);
        subscriber0.onComplete();
    }

    public static void error(Throwable throwable0, Subscriber subscriber0) {
        subscriber0.onSubscribe(EmptySubscription.INSTANCE);
        subscriber0.onError(throwable0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
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
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        SubscriptionHelper.validate(v);
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int v) {
        return v & 2;
    }

    @Override
    public String toString() {
        return "EmptySubscription";
    }
}

