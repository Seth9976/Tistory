package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class x2 extends AtomicLong implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public long b;
    public Subscription c;

    public x2(Subscriber subscriber0, long v) {
        this.a = subscriber0;
        this.b = v;
        this.lazySet(v);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.b > 0L) {
            this.b = 0L;
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.b > 0L) {
            this.b = 0L;
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.b;
        if(v > 0L) {
            this.b = v - 1L;
            Subscriber subscriber0 = this.a;
            subscriber0.onNext(object0);
            if(v - 1L == 0L) {
                this.c.cancel();
                subscriber0.onComplete();
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            Subscriber subscriber0 = this.a;
            if(Long.compare(this.b, 0L) == 0) {
                subscription0.cancel();
                EmptySubscription.complete(subscriber0);
                return;
            }
            this.c = subscription0;
            subscriber0.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            long v1;
            while((v1 = this.get()) != 0L) {
                long v2 = v1 > v ? v : v1;
                if(this.compareAndSet(v1, v1 - v2)) {
                    this.c.request(v2);
                    return;
                }
            }
        }
    }
}

