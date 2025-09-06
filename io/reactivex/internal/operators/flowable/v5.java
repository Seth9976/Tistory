package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class v5 implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final TimeUnit b;
    public final Scheduler c;
    public Subscription d;
    public long e;

    public v5(Subscriber subscriber0, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = subscriber0;
        this.c = scheduler0;
        this.b = timeUnit0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.cancel();
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
        long v = this.c.now(this.b);
        long v1 = this.e;
        this.e = v;
        Timed timed0 = new Timed(object0, v - v1, this.b);
        this.a.onNext(timed0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.e = this.c.now(this.b);
            this.d = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.d.request(v);
    }
}

