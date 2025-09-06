package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

public final class c4 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Publisher a;
    public final AtomicReference b;
    public final AtomicLong c;
    public b4 d;

    public c4(Publisher publisher0) {
        this.a = publisher0;
        this.b = new AtomicReference();
        this.c = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.b);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.d.cancel();
        this.d.h.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.d.cancel();
        this.d.h.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.getAndIncrement() == 0) {
            while(true) {
                if(this.b.get() == SubscriptionHelper.CANCELLED) {
                    return;
                }
                this.a.subscribe(this.d);
                if(this.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.b, this.c, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.b, this.c, v);
    }
}

