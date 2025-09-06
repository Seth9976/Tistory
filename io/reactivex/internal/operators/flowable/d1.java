package io.reactivex.internal.operators.flowable;

import gd.a0;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class d1 extends AtomicLong implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Publisher b;
    public final a0 c;
    public final AtomicReference d;

    public d1(Publisher publisher0, Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = publisher0;
        this.c = new a0(this, 1);
        this.d = new AtomicReference();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.c);
        SubscriptionHelper.cancel(this.d);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.d, this, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            SubscriptionHelper.deferredRequest(this.d, this, v);
        }
    }
}

