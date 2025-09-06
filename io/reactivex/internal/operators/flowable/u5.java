package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class u5 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final boolean e;
    public final AtomicReference f;
    public final AtomicLong g;
    public Subscription h;
    public volatile boolean i;
    public Throwable j;
    public volatile boolean k;
    public volatile boolean l;
    public long m;
    public boolean n;

    public u5(Subscriber subscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, boolean z) {
        this.a = subscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.e = z;
        this.f = new AtomicReference();
        this.g = new AtomicLong();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.f;
        AtomicLong atomicLong0 = this.g;
        Subscriber subscriber0 = this.a;
        int v = 1;
        while(true) {
            if(this.k) {
                atomicReference0.lazySet(null);
                return;
            }
            boolean z = this.i;
            if(z && this.j != null) {
                atomicReference0.lazySet(null);
                subscriber0.onError(this.j);
                this.d.dispose();
                return;
            }
            boolean z1 = atomicReference0.get() == null;
            if(z) {
                if(z1 || !this.e) {
                    atomicReference0.lazySet(null);
                    subscriber0.onComplete();
                }
                else {
                    Object object0 = atomicReference0.getAndSet(null);
                    long v1 = this.m;
                    if(v1 == atomicLong0.get()) {
                        subscriber0.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                    }
                    else {
                        this.m = v1 + 1L;
                        subscriber0.onNext(object0);
                        subscriber0.onComplete();
                    }
                }
                this.d.dispose();
                return;
            }
            if(!z1) {
                if(this.n && !this.l) {
                    goto label_37;
                }
            }
            else if(this.l) {
                this.n = false;
                this.l = false;
                goto label_37;
            }
            else {
            label_37:
                v = this.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            Object object1 = atomicReference0.getAndSet(null);
            long v2 = this.m;
            if(v2 == atomicLong0.get()) {
                break;
            }
            subscriber0.onNext(object1);
            this.m = v2 + 1L;
            this.l = false;
            this.n = true;
            this.d.schedule(this, this.b, this.c);
        }
        this.h.cancel();
        subscriber0.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.k = true;
        this.h.cancel();
        this.d.dispose();
        if(this.getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.i = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.j = throwable0;
        this.i = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.f.set(object0);
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.h, subscription0)) {
            this.h = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.g, v);
        }
    }

    @Override
    public final void run() {
        this.l = true;
        this.a();
    }
}

