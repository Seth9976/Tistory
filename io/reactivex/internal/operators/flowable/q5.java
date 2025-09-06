package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

public final class q5 extends DeferredScalarSubscription implements FlowableSubscriber {
    public Subscription a;

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.a.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Object object0 = this.value;
        if(object0 != null) {
            this.complete(object0);
            return;
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.value = null;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.value = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.a, subscription0)) {
            this.a = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

