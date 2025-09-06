package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class o5 extends AtomicBoolean implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final long b;
    public boolean c;
    public Subscription d;
    public long e;

    public o5(Subscriber subscriber0, long v) {
        this.a = subscriber0;
        this.b = v;
        this.e = v;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.c) {
            this.c = true;
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(!this.c) {
            this.c = true;
            this.d.cancel();
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.c) {
            long v = this.e;
            this.e = v - 1L;
            if(v > 0L) {
                this.a.onNext(object0);
                if(v - 1L == 0L) {
                    this.d.cancel();
                    this.onComplete();
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            Subscriber subscriber0 = this.a;
            if(Long.compare(this.b, 0L) == 0) {
                subscription0.cancel();
                this.c = true;
                EmptySubscription.complete(subscriber0);
                return;
            }
            subscriber0.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(!SubscriptionHelper.validate(v)) {
            return;
        }
        if(!this.get() && this.compareAndSet(false, true) && v >= this.b) {
            this.d.request(0x7FFFFFFFFFFFFFFFL);
            return;
        }
        this.d.request(v);
    }
}

