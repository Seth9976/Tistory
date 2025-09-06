package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

public final class a0 implements FlowableSubscriber, Disposable {
    public final int a;
    public Object b;
    public Subscription c;
    public boolean d;
    public final Object e;
    public Object f;

    public a0(MaybeObserver maybeObserver0, BiFunction biFunction0) {
        this.a = 1;
        super();
        this.e = maybeObserver0;
        this.f = biFunction0;
    }

    public a0(SingleObserver singleObserver0, Object object0) {
        this.a = 2;
        super();
        this.e = singleObserver0;
        this.b = object0;
    }

    public a0(SingleObserver singleObserver0, Object object0, BiConsumer biConsumer0) {
        this.a = 0;
        super();
        this.e = singleObserver0;
        this.f = biConsumer0;
        this.b = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.c.cancel();
                this.c = SubscriptionHelper.CANCELLED;
                return;
            }
            case 1: {
                this.c.cancel();
                this.d = true;
                return;
            }
            default: {
                this.c.cancel();
                this.c = SubscriptionHelper.CANCELLED;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.c == SubscriptionHelper.CANCELLED;
            }
            case 1: {
                return this.d;
            }
            default: {
                return this.c == SubscriptionHelper.CANCELLED;
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                if(!this.d) {
                    this.d = true;
                    this.c = SubscriptionHelper.CANCELLED;
                    ((SingleObserver)this.e).onSuccess(this.b);
                }
                return;
            }
            case 1: {
                if(!this.d) {
                    this.d = true;
                    Object object1 = this.b;
                    MaybeObserver maybeObserver0 = (MaybeObserver)this.e;
                    if(object1 != null) {
                        maybeObserver0.onSuccess(object1);
                        return;
                    }
                    maybeObserver0.onComplete();
                }
                return;
            }
            default: {
                if(!this.d) {
                    this.d = true;
                    this.c = SubscriptionHelper.CANCELLED;
                    Object object0 = this.f;
                    this.f = null;
                    if(object0 == null) {
                        object0 = this.b;
                    }
                    SingleObserver singleObserver0 = (SingleObserver)this.e;
                    if(object0 != null) {
                        singleObserver0.onSuccess(object0);
                        return;
                    }
                    singleObserver0.onError(new NoSuchElementException());
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.d = true;
                this.c = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.e).onError(throwable0);
                return;
            }
            case 1: {
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.d = true;
                ((MaybeObserver)this.e).onError(throwable0);
                return;
            }
            default: {
                if(this.d) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.d = true;
                this.c = SubscriptionHelper.CANCELLED;
                ((SingleObserver)this.e).onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                if(!this.d) {
                    try {
                        ((BiConsumer)this.f).accept(this.b, object0);
                        return;
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.c.cancel();
                        this.onError(throwable0);
                    }
                }
                return;
            }
            case 1: {
                if(!this.d) {
                    Object object1 = this.b;
                    if(object1 == null) {
                        this.b = object0;
                        return;
                    }
                    try {
                        this.b = ObjectHelper.requireNonNull(((BiFunction)this.f).apply(object1, object0), "The reducer returned a null value");
                        return;
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.c.cancel();
                        this.onError(throwable1);
                    }
                }
                return;
            }
            default: {
                if(!this.d) {
                    if(this.f != null) {
                        this.d = true;
                        this.c.cancel();
                        this.c = SubscriptionHelper.CANCELLED;
                        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                        ((SingleObserver)this.e).onError(illegalArgumentException0);
                        return;
                    }
                    this.f = object0;
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.validate(this.c, subscription0)) {
                    this.c = subscription0;
                    ((SingleObserver)this.e).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.c, subscription0)) {
                    this.c = subscription0;
                    ((MaybeObserver)this.e).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
                return;
            }
            default: {
                if(SubscriptionHelper.validate(this.c, subscription0)) {
                    this.c = subscription0;
                    ((SingleObserver)this.e).onSubscribe(this);
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                }
            }
        }
    }
}

