package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class q4 extends AtomicInteger implements FlowableSubscriber {
    public final Subscriber a;
    public final SubscriptionArbiter b;
    public final Publisher c;
    public final Predicate d;
    public long e;
    public long f;

    public q4(Subscriber subscriber0, long v, Predicate predicate0, SubscriptionArbiter subscriptionArbiter0, Publisher publisher0) {
        this.a = subscriber0;
        this.b = subscriptionArbiter0;
        this.c = publisher0;
        this.d = predicate0;
        this.e = v;
    }

    public final void a() {
        if(this.getAndIncrement() == 0) {
            int v = 1;
            while(true) {
                SubscriptionArbiter subscriptionArbiter0 = this.b;
                if(subscriptionArbiter0.isCancelled()) {
                    return;
                }
                long v1 = this.f;
                if(v1 != 0L) {
                    this.f = 0L;
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
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        long v = this.e;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            this.e = v - 1L;
        }
        Subscriber subscriber0 = this.a;
        if(Long.compare(v, 0L) == 0) {
            subscriber0.onError(throwable0);
            return;
        }
        try {
            if(!this.d.test(throwable0)) {
                goto label_13;
            }
            goto label_15;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            subscriber0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
    label_13:
        subscriber0.onError(throwable0);
        return;
    label_15:
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.f;
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        this.b.setSubscription(subscription0);
    }
}

