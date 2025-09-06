package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class j extends AtomicReference implements FlowableSubscriber, Subscription {
    public final i a;
    public final int b;
    public final Subscriber c;
    public boolean d;
    public final AtomicLong e;

    public j(i i0, int v, Subscriber subscriber0) {
        this.e = new AtomicLong();
        this.a = i0;
        this.b = v;
        this.c = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Subscriber subscriber0 = this.c;
        if(this.d) {
            subscriber0.onComplete();
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            subscriber0.onComplete();
            return;
        }
        ((Subscription)this.get()).cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Subscriber subscriber0 = this.c;
        if(this.d) {
            subscriber0.onError(throwable0);
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            subscriber0.onError(throwable0);
            return;
        }
        ((Subscription)this.get()).cancel();
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Subscriber subscriber0 = this.c;
        if(this.d) {
            subscriber0.onNext(object0);
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            subscriber0.onNext(object0);
            return;
        }
        ((Subscription)this.get()).cancel();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this, this.e, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this, this.e, v);
    }
}

