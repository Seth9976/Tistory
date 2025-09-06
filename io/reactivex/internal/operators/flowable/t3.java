package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class t3 implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final r3 b;
    public Subscription c;

    public t3(Subscriber subscriber0, r3 r30) {
        this.a = subscriber0;
        this.b = r30;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }
}

