package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class w3 extends DeferredScalarSubscription implements FlowableSubscriber {
    public final BiFunction a;
    public Subscription b;

    public w3(Subscriber subscriber0, BiFunction biFunction0) {
        super(subscriber0);
        this.a = biFunction0;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        super.cancel();
        this.b.cancel();
        this.b = SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(this.b == subscriptionHelper0) {
            return;
        }
        this.b = subscriptionHelper0;
        Object object0 = this.value;
        if(object0 != null) {
            this.complete(object0);
            return;
        }
        this.downstream.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(this.b == subscriptionHelper0) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.b = subscriptionHelper0;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.b == SubscriptionHelper.CANCELLED) {
            return;
        }
        Object object1 = this.value;
        if(object1 == null) {
            this.value = object0;
            return;
        }
        try {
            this.value = ObjectHelper.requireNonNull(this.a.apply(object1, object0), "The reducer returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.b.cancel();
            this.onError(throwable0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

