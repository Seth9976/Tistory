package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f5 extends ArrayDeque implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final int b;
    public Subscription c;

    public f5(Subscriber subscriber0, int v) {
        super(v);
        this.a = subscriber0;
        this.b = v;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
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
        if(this.b == this.size()) {
            Object object1 = this.poll();
            this.a.onNext(object1);
        }
        else {
            this.c.request(1L);
        }
        this.offer(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }
}

