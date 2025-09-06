package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

public final class w2 implements FlowableSubscriber, Disposable {
    public final int a;
    public final SingleObserver b;
    public Object c;
    public Subscription d;
    public Object e;

    public w2(SingleObserver singleObserver0, BiFunction biFunction0, Object object0) {
        this.a = 1;
        super();
        this.b = singleObserver0;
        this.c = object0;
        this.e = biFunction0;
    }

    public w2(SingleObserver singleObserver0, Object object0) {
        this.a = 0;
        super();
        this.b = singleObserver0;
        this.c = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.d.cancel();
            this.d = SubscriptionHelper.CANCELLED;
            return;
        }
        this.d.cancel();
        this.d = SubscriptionHelper.CANCELLED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.d = SubscriptionHelper.CANCELLED;
                this.b.onSuccess(object0);
            }
            return;
        }
        this.d = SubscriptionHelper.CANCELLED;
        Object object1 = this.e;
        SingleObserver singleObserver0 = this.b;
        if(object1 != null) {
            this.e = null;
            singleObserver0.onSuccess(object1);
            return;
        }
        Object object2 = this.c;
        if(object2 != null) {
            singleObserver0.onSuccess(object2);
            return;
        }
        singleObserver0.onError(new NoSuchElementException());
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.c != null) {
                this.c = null;
                this.d = SubscriptionHelper.CANCELLED;
                this.b.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = SubscriptionHelper.CANCELLED;
        this.e = null;
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            Object object1 = this.c;
            if(object1 != null) {
                try {
                    this.c = ObjectHelper.requireNonNull(((BiFunction)this.e).apply(object1, object0), "The reducer returned a null value");
                    return;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.d.cancel();
                    this.onError(throwable0);
                }
            }
            return;
        }
        this.e = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.d, subscription0)) {
                this.d = subscription0;
                this.b.onSubscribe(this);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.b.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

