package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class p5 extends ArrayDeque implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final int b;
    public Subscription c;
    public volatile boolean d;
    public volatile boolean e;
    public final AtomicLong f;
    public final AtomicInteger g;

    public p5(Subscriber subscriber0, int v) {
        this.f = new AtomicLong();
        this.g = new AtomicInteger();
        this.a = subscriber0;
        this.b = v;
    }

    public final void a() {
        if(this.g.getAndIncrement() == 0) {
            Subscriber subscriber0 = this.a;
            long v = this.f.get();
            while(true) {
                if(this.e) {
                    return;
                }
                if(this.d) {
                    long v1;
                    for(v1 = 0L; v1 != v; ++v1) {
                        if(this.e) {
                            return;
                        }
                        Object object0 = this.poll();
                        if(object0 == null) {
                            subscriber0.onComplete();
                            return;
                        }
                        subscriber0.onNext(object0);
                    }
                    if(v1 != 0L && v != 0x7FFFFFFFFFFFFFFFL) {
                        v = this.f.addAndGet(-v1);
                    }
                }
                if(this.g.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.e = true;
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.d = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.b == this.size()) {
            this.poll();
        }
        this.offer(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.f, v);
            this.a();
        }
    }
}

