package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k2 implements FlowableSubscriber, QueueSubscription {
    public final Subscriber a;
    public Subscription b;

    public k2(Subscriber subscriber0) {
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b.cancel();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        return v & 2;
    }
}

