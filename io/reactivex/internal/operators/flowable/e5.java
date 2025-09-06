package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e5 implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public long b;
    public Subscription c;

    public e5(Subscriber subscriber0, long v) {
        this.a = subscriber0;
        this.b = v;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
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
        long v = this.b;
        if(v != 0L) {
            this.b = v - 1L;
            return;
        }
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            long v = this.b;
            this.c = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(v);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }
}

