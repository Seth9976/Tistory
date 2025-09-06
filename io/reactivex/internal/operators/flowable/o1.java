package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class o1 implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Consumer b;
    public final LongConsumer c;
    public final Action d;
    public Subscription e;

    public o1(Subscriber subscriber0, Consumer consumer0, LongConsumer longConsumer0, Action action0) {
        this.a = subscriber0;
        this.b = consumer0;
        this.d = action0;
        this.c = longConsumer0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        Subscription subscription0 = this.e;
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(subscription0 != subscriptionHelper0) {
            try {
                this.e = subscriptionHelper0;
                this.d.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
            subscription0.cancel();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.e != SubscriptionHelper.CANCELLED) {
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e != SubscriptionHelper.CANCELLED) {
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        Subscriber subscriber0;
        try {
            subscriber0 = this.a;
            this.b.accept(subscription0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            subscription0.cancel();
            this.e = SubscriptionHelper.CANCELLED;
            EmptySubscription.error(throwable0, subscriber0);
            return;
        }
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            subscriber0.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        try {
            this.c.accept(v);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
        this.e.request(v);
    }
}

