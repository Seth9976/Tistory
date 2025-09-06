package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

public final class h implements FlowableSubscriber, Disposable {
    public final int a;
    public final Object b;
    public Object c;
    public Subscription d;
    public boolean e;

    public h(MaybeObserver maybeObserver0) {
        this.a = 2;
        super();
        this.b = maybeObserver0;
    }

    public h(SingleObserver singleObserver0, Predicate predicate0, int v) {
        this.a = v;
        this.b = singleObserver0;
        this.c = predicate0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.d.cancel();
                this.d = SubscriptionHelper.CANCELLED;
                return;
            }
            case 1: {
                this.d.cancel();
                this.d = SubscriptionHelper.CANCELLED;
                return;
            }
            default: {
                this.d.cancel();
                this.d = SubscriptionHelper.CANCELLED;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.d == SubscriptionHelper.CANCELLED;
            }
            case 1: {
                return this.d == SubscriptionHelper.CANCELLED;
            }
            default: {
                return this.d == SubscriptionHelper.CANCELLED;
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    this.e = true;
                    this.d = SubscriptionHelper.CANCELLED;
                    ((SingleObserver)this.b).onSuccess(Boolean.TRUE);
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    this.d = SubscriptionHelper.CANCELLED;
                    ((SingleObserver)this.b).onSuccess(Boolean.FALSE);
                }
                return;
            }
            default: {
                if(!this.e) {
                    this.e = true;
                    this.d = SubscriptionHelper.CANCELLED;
                    Object object0 = this.c;
                    this.c = null;
                    MaybeObserver maybeObserver0 = (MaybeObserver)this.b;
                    if(object0 == null) {
                        maybeObserver0.onComplete();
                        return;
                    }
                    maybeObserver0.onSuccess(object0);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.d = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.d = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            default: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.d = SubscriptionHelper.CANCELLED;
                ((MaybeObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    try {
                        if(!((Predicate)this.c).test(object0)) {
                            goto label_20;
                        }
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.d.cancel();
                        this.d = SubscriptionHelper.CANCELLED;
                        this.onError(throwable0);
                    }
                    return;
                label_20:
                    this.e = true;
                    this.d.cancel();
                    this.d = SubscriptionHelper.CANCELLED;
                    ((SingleObserver)this.b).onSuccess(Boolean.FALSE);
                    return;
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    try {
                        if(((Predicate)this.c).test(object0)) {
                            goto label_35;
                        }
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.d.cancel();
                        this.d = SubscriptionHelper.CANCELLED;
                        this.onError(throwable1);
                    }
                    return;
                label_35:
                    this.e = true;
                    this.d.cancel();
                    this.d = SubscriptionHelper.CANCELLED;
                    ((SingleObserver)this.b).onSuccess(Boolean.TRUE);
                    return;
                }
                return;
            }
            default: {
                if(!this.e) {
                    if(this.c != null) {
                        this.e = true;
                        this.d.cancel();
                        this.d = SubscriptionHelper.CANCELLED;
                        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                        ((MaybeObserver)this.b).onError(illegalArgumentException0);
                        return;
                    }
                    this.c = object0;
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
                    ((SingleObserver)this.b).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    ((SingleObserver)this.b).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            default: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    ((MaybeObserver)this.b).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
            }
        }
    }
}

