package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class i5 implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final Predicate c;
    public Subscription d;
    public boolean e;

    public i5(Subscriber subscriber0, Predicate predicate0, int v) {
        this.a = v;
        this.b = subscriber0;
        this.c = predicate0;
        super();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        switch(this.a) {
            case 0: {
                this.d.cancel();
                return;
            }
            case 1: {
                this.d.cancel();
                return;
            }
            default: {
                this.d.cancel();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.b.onComplete();
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    this.b.onComplete();
                }
                return;
            }
            default: {
                if(!this.e) {
                    this.e = true;
                    this.b.onComplete();
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b.onError(throwable0);
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    this.b.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.b.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Subscriber subscriber0;
        switch(this.a) {
            case 0: {
                Subscriber subscriber1 = this.b;
                if(this.e) {
                    subscriber1.onNext(object0);
                    return;
                }
                try {
                    if(this.c.test(object0)) {
                        goto label_29;
                    }
                    goto label_31;
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    this.d.cancel();
                    subscriber1.onError(throwable1);
                    return;
                }
            label_29:
                this.d.request(1L);
                return;
            label_31:
                this.e = true;
                subscriber1.onNext(object0);
                return;
            }
            case 1: {
                if(!this.e) {
                    Subscriber subscriber2 = this.b;
                    subscriber2.onNext(object0);
                    try {
                        if(this.c.test(object0)) {
                            goto label_44;
                        }
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.d.cancel();
                        this.onError(throwable2);
                    }
                    return;
                label_44:
                    this.e = true;
                    this.d.cancel();
                    subscriber2.onComplete();
                    return;
                }
                return;
            }
            default: {
                if(!this.e) {
                    try {
                        boolean z = this.c.test(object0);
                        subscriber0 = this.b;
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.d.cancel();
                        this.onError(throwable0);
                        return;
                    }
                    if(!z) {
                        this.e = true;
                        this.d.cancel();
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onNext(object0);
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            default: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    this.b.onSubscribe(this);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        switch(this.a) {
            case 0: {
                this.d.request(v);
                return;
            }
            case 1: {
                this.d.request(v);
                return;
            }
            default: {
                this.d.request(v);
            }
        }
    }
}

