package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class DeferredScalarSubscriber extends DeferredScalarSubscription implements FlowableSubscriber {
    protected boolean hasValue;
    protected Subscription upstream;

    public DeferredScalarSubscriber(Subscriber subscriber0) {
        super(subscriber0);
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.hasValue) {
            this.complete(this.value);
            return;
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        this.value = null;
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.upstream, subscription0)) {
            this.upstream = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

