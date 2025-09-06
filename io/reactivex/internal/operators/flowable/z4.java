package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class z4 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final BiFunction b;
    public final SpscArrayQueue c;
    public final AtomicLong d;
    public final int e;
    public final int f;
    public volatile boolean g;
    public volatile boolean h;
    public Throwable i;
    public Subscription j;
    public Object k;
    public int l;

    public z4(int v, BiFunction biFunction0, Object object0, Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = biFunction0;
        this.k = object0;
        this.e = v;
        this.f = v - (v >> 2);
        SpscArrayQueue spscArrayQueue0 = new SpscArrayQueue(v);
        this.c = spscArrayQueue0;
        spscArrayQueue0.offer(object0);
        this.d = new AtomicLong();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        SpscArrayQueue spscArrayQueue0 = this.c;
        int v = this.f;
        int v1 = this.l;
        int v2 = 1;
        do {
            long v3 = this.d.get();
            long v4 = 0L;
            int v5;
            while((v5 = Long.compare(v4, v3)) != 0) {
                if(this.g) {
                    spscArrayQueue0.clear();
                    return;
                }
                boolean z = this.h;
                if(z) {
                    Throwable throwable0 = this.i;
                    if(throwable0 != null) {
                        spscArrayQueue0.clear();
                        subscriber0.onError(throwable0);
                        return;
                    }
                }
                Object object0 = spscArrayQueue0.poll();
                if(z && object0 == null) {
                    subscriber0.onComplete();
                    return;
                }
                if(object0 == null) {
                    break;
                }
                subscriber0.onNext(object0);
                ++v4;
                if(v1 + 1 == v) {
                    this.j.request(((long)v));
                    v1 = 0;
                }
                else {
                    ++v1;
                }
            }
            if(v5 == 0 && this.h) {
                Throwable throwable1 = this.i;
                if(throwable1 != null) {
                    spscArrayQueue0.clear();
                    subscriber0.onError(throwable1);
                    return;
                }
                if(spscArrayQueue0.isEmpty()) {
                    subscriber0.onComplete();
                    return;
                }
            }
            if(v4 != 0L) {
                BackpressureHelper.produced(this.d, v4);
            }
            this.l = v1;
            v2 = this.addAndGet(-v2);
        }
        while(v2 != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.g = true;
        this.j.cancel();
        if(this.getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.i = throwable0;
        this.h = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object1;
        if(this.h) {
            return;
        }
        try {
            object1 = ObjectHelper.requireNonNull(this.b.apply(this.k, object0), "The accumulator returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.j.cancel();
            this.onError(throwable0);
            return;
        }
        this.k = object1;
        this.c.offer(object1);
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.j, subscription0)) {
            this.j = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(((long)(this.e - 1)));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.d, v);
            this.a();
        }
    }
}

