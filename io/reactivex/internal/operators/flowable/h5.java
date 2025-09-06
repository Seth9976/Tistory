package io.reactivex.internal.operators.flowable;

import gd.a0;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class h5 extends AtomicInteger implements ConditionalSubscriber, Subscription {
    public final Subscriber a;
    public final AtomicReference b;
    public final AtomicLong c;
    public final a0 d;
    public final AtomicThrowable e;
    public volatile boolean f;

    public h5(Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = new AtomicReference();
        this.c = new AtomicLong();
        this.d = new a0(this, 2);
        this.e = new AtomicThrowable();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.b);
        SubscriptionHelper.cancel(this.d);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        SubscriptionHelper.cancel(this.d);
        HalfSerializer.onComplete(this.a, this, this.e);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        SubscriptionHelper.cancel(this.d);
        HalfSerializer.onError(this.a, throwable0, this, this.e);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0)) {
            ((Subscription)this.b.get()).request(1L);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.b, this.c, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.b, this.c, v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.f) {
            HalfSerializer.onNext(this.a, object0, this, this.e);
            return true;
        }
        return false;
    }
}

