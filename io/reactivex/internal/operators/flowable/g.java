package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class g extends DeferredScalarSubscription implements FlowableSubscriber {
    public final int a;
    public final Predicate b;
    public Subscription c;
    public boolean d;

    public g(Subscriber subscriber0, Predicate predicate0, int v) {
        this.a = v;
        super(subscriber0);
        this.b = predicate0;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        if(this.a != 0) {
            super.cancel();
            this.c.cancel();
            return;
        }
        super.cancel();
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.d) {
                this.d = true;
                this.complete(Boolean.FALSE);
            }
            return;
        }
        if(!this.d) {
            this.d = true;
            this.complete(Boolean.TRUE);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.d) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.d = true;
            this.downstream.onError(throwable0);
            return;
        }
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(!this.d) {
                try {
                    if(this.b.test(object0)) {
                        goto label_9;
                    }
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.c.cancel();
                    this.onError(throwable0);
                }
                return;
            label_9:
                this.d = true;
                this.c.cancel();
                this.complete(Boolean.TRUE);
                return;
            }
            return;
        }
        if(!this.d) {
            try {
                if(!this.b.test(object0)) {
                    goto label_22;
                }
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.c.cancel();
                this.onError(throwable1);
            }
            return;
        label_22:
            this.d = true;
            this.c.cancel();
            this.complete(Boolean.FALSE);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.c, subscription0)) {
                this.c = subscription0;
                this.downstream.onSubscribe(this);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.downstream.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

