package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class j6 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final long b;
    public final long c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final int f;
    public long g;
    public Subscription h;
    public UnicastProcessor i;

    public j6(Subscriber subscriber0, long v, long v1, int v2) {
        super(1);
        this.a = subscriber0;
        this.b = v;
        this.c = v1;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        this.f = v2;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.d.compareAndSet(false, true)) {
            this.run();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        UnicastProcessor unicastProcessor0 = this.i;
        if(unicastProcessor0 != null) {
            this.i = null;
            unicastProcessor0.onComplete();
        }
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        UnicastProcessor unicastProcessor0 = this.i;
        if(unicastProcessor0 != null) {
            this.i = null;
            unicastProcessor0.onError(throwable0);
        }
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.g;
        UnicastProcessor unicastProcessor0 = this.i;
        if(v == 0L) {
            this.getAndIncrement();
            unicastProcessor0 = UnicastProcessor.create(this.f, this);
            this.i = unicastProcessor0;
            this.a.onNext(unicastProcessor0);
        }
        if(unicastProcessor0 != null) {
            unicastProcessor0.onNext(object0);
        }
        if(v + 1L == this.b) {
            this.i = null;
            unicastProcessor0.onComplete();
        }
        if(v + 1L == this.c) {
            this.g = 0L;
            return;
        }
        this.g = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.h, subscription0)) {
            this.h = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            boolean z = this.e.get();
            long v1 = this.c;
            if(!z && this.e.compareAndSet(false, true)) {
                long v2 = BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.b, v), BackpressureHelper.multiplyCap(v1 - this.b, v - 1L));
                this.h.request(v2);
                return;
            }
            long v3 = BackpressureHelper.multiplyCap(v1, v);
            this.h.request(v3);
        }
    }

    @Override
    public final void run() {
        if(this.decrementAndGet() == 0) {
            this.h.cancel();
        }
    }
}

