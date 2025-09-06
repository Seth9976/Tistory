package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class z3 extends AtomicInteger implements FlowableSubscriber {
    public final Subscriber a;
    public final SubscriptionArbiter b;
    public final Publisher c;
    public long d;
    public long e;

    public z3(Subscriber subscriber0, long v, SubscriptionArbiter subscriptionArbiter0, Publisher publisher0) {
        this.a = subscriber0;
        this.b = subscriptionArbiter0;
        this.c = publisher0;
        this.d = v;
    }

    public final void a() {
        if(this.getAndIncrement() == 0) {
            int v = 1;
            while(true) {
                SubscriptionArbiter subscriptionArbiter0 = this.b;
                if(subscriptionArbiter0.isCancelled()) {
                    return;
                }
                long v1 = this.e;
                if(v1 != 0L) {
                    this.e = 0L;
                    subscriptionArbiter0.produced(v1);
                }
                this.c.subscribe(this);
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        long v = this.d;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            this.d = v - 1L;
        }
        if(v != 0L) {
            this.a();
            return;
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.e;
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        this.b.setSubscription(subscription0);
    }
}

