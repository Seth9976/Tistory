package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class h6 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final long b;
    public final AtomicBoolean c;
    public final int d;
    public long e;
    public Subscription f;
    public UnicastProcessor g;

    public h6(Subscriber subscriber0, long v, int v1) {
        super(1);
        this.a = subscriber0;
        this.b = v;
        this.c = new AtomicBoolean();
        this.d = v1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.c.compareAndSet(false, true)) {
            this.run();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        UnicastProcessor unicastProcessor0 = this.g;
        if(unicastProcessor0 != null) {
            this.g = null;
            unicastProcessor0.onComplete();
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        UnicastProcessor unicastProcessor0 = this.g;
        if(unicastProcessor0 != null) {
            this.g = null;
            unicastProcessor0.onError(throwable0);
        }
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.e;
        UnicastProcessor unicastProcessor0 = this.g;
        if(v == 0L) {
            this.getAndIncrement();
            unicastProcessor0 = UnicastProcessor.create(this.d, this);
            this.g = unicastProcessor0;
            this.a.onNext(unicastProcessor0);
        }
        unicastProcessor0.onNext(object0);
        if(v + 1L == this.b) {
            this.e = 0L;
            this.g = null;
            unicastProcessor0.onComplete();
            return;
        }
        this.e = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            long v1 = BackpressureHelper.multiplyCap(this.b, v);
            this.f.request(v1);
        }
    }

    @Override
    public final void run() {
        if(this.decrementAndGet() == 0) {
            this.f.cancel();
        }
    }
}

