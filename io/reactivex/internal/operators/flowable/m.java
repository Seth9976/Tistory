package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class m extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Callable b;
    public final int c;
    public final int d;
    public Collection e;
    public Subscription f;
    public boolean g;
    public int h;

    public m(Subscriber subscriber0, int v, int v1, Callable callable0) {
        this.a = subscriber0;
        this.c = v;
        this.d = v1;
        this.b = callable0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.f.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.g) {
            return;
        }
        this.g = true;
        Collection collection0 = this.e;
        this.e = null;
        Subscriber subscriber0 = this.a;
        if(collection0 != null) {
            subscriber0.onNext(collection0);
        }
        subscriber0.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.g = true;
        this.e = null;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g) {
            return;
        }
        Collection collection0 = this.e;
        int v = this.h + 1;
        if(this.h == 0) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.b.call(), "The bufferSupplier returned a null buffer");
                this.e = collection0;
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.cancel();
                this.onError(throwable0);
                return;
            }
        }
        if(collection0 != null) {
            collection0.add(object0);
            if(collection0.size() == this.c) {
                this.e = null;
                this.a.onNext(collection0);
            }
        }
        if(v == this.d) {
            v = 0;
        }
        this.h = v;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            int v1 = this.get();
            int v2 = this.d;
            if(v1 == 0 && this.compareAndSet(0, 1)) {
                long v3 = BackpressureHelper.addCap(BackpressureHelper.multiplyCap(v, this.c), BackpressureHelper.multiplyCap(v2 - this.c, v - 1L));
                this.f.request(v3);
                return;
            }
            this.f.request(BackpressureHelper.multiplyCap(v2, v));
        }
    }
}

