package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class p4 extends AtomicInteger implements FlowableSubscriber {
    public final Subscriber a;
    public final SubscriptionArbiter b;
    public final Publisher c;
    public final BiPredicate d;
    public int e;
    public long f;

    public p4(Subscriber subscriber0, BiPredicate biPredicate0, SubscriptionArbiter subscriptionArbiter0, Publisher publisher0) {
        this.a = subscriber0;
        this.b = subscriptionArbiter0;
        this.c = publisher0;
        this.d = biPredicate0;
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
        Subscriber subscriber0;
        try {
            subscriber0 = this.a;
            int v = this.e + 1;
            this.e = v;
            if(!this.d.test(v, throwable0)) {
                goto label_9;
            }
            goto label_11;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            subscriber0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
    label_9:
        subscriber0.onError(throwable0);
        return;
    label_11:
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

