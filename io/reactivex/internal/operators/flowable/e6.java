package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e6 extends DeferredScalarSubscription implements FlowableSubscriber, Subscription {
    public Subscription a;

    public e6(Subscriber subscriber0, Collection collection0) {
        super(subscriber0);
        this.value = collection0;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public final void cancel() {
        super.cancel();
        this.a.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.complete(this.value);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.value = null;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Collection collection0 = (Collection)this.value;
        if(collection0 != null) {
            collection0.add(object0);
        }
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

