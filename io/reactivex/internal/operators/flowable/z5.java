package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class z5 implements FlowableSubscriber {
    public final Subscriber a;
    public final SubscriptionArbiter b;

    public z5(Subscriber subscriber0, SubscriptionArbiter subscriptionArbiter0) {
        this.a = subscriber0;
        this.b = subscriptionArbiter0;
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
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        this.b.setSubscription(subscription0);
    }
}

