package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Callable b;
    public final int c;
    public Collection d;
    public Subscription e;
    public boolean f;
    public int g;

    public k(Subscriber subscriber0, int v, Callable callable0) {
        this.a = subscriber0;
        this.c = v;
        this.b = callable0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.e.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.f) {
            return;
        }
        this.f = true;
        Collection collection0 = this.d;
        Subscriber subscriber0 = this.a;
        if(collection0 != null && !collection0.isEmpty()) {
            subscriber0.onNext(collection0);
        }
        subscriber0.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.f = true;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        Collection collection0 = this.d;
        if(collection0 == null) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.b.call(), "The bufferSupplier returned a null buffer");
                this.d = collection0;
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                this.onError(throwable0);
                return;
            }
        }
        collection0.add(object0);
        int v = this.g + 1;
        if(v == this.c) {
            this.g = 0;
            this.d = null;
            this.a.onNext(collection0);
            return;
        }
        this.g = v;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            this.e.request(BackpressureHelper.multiplyCap(v, this.c));
        }
    }
}

