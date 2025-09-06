package io.reactivex.internal.operators.flowable;

import gd.a0;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class s5 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final AtomicLong b;
    public final AtomicReference c;
    public final AtomicThrowable d;
    public final a0 e;

    public s5(Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = new AtomicLong();
        this.c = new AtomicReference();
        this.e = new a0(this, 3);
        this.d = new AtomicThrowable();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.c);
        SubscriptionHelper.cancel(this.e);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        SubscriptionHelper.cancel(this.e);
        HalfSerializer.onComplete(this.a, this, this.d);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        SubscriptionHelper.cancel(this.e);
        HalfSerializer.onError(this.a, throwable0, this, this.d);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        HalfSerializer.onNext(this.a, object0, this, this.d);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.c, this.b, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.c, this.b, v);
    }
}

