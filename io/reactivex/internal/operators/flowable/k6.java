package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k6 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final int b;
    public final q c;
    public final AtomicReference d;
    public final AtomicInteger e;
    public final MpscLinkedQueue f;
    public final AtomicThrowable g;
    public final AtomicBoolean h;
    public final AtomicLong i;
    public volatile boolean j;
    public UnicastProcessor k;
    public long l;
    public static final Object m;

    static {
        k6.m = new Object();
    }

    public k6(Subscriber subscriber0, int v) {
        this.a = subscriber0;
        this.b = v;
        this.c = new q(this, 1);
        this.d = new AtomicReference();
        this.e = new AtomicInteger(1);
        this.f = new MpscLinkedQueue();
        this.g = new AtomicThrowable();
        this.h = new AtomicBoolean();
        this.i = new AtomicLong();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        MpscLinkedQueue mpscLinkedQueue0 = this.f;
        AtomicThrowable atomicThrowable0 = this.g;
        long v = this.l;
        int v1 = 1;
        while(true) {
            if(this.e.get() == 0) {
                mpscLinkedQueue0.clear();
                this.k = null;
                return;
            }
            UnicastProcessor unicastProcessor0 = this.k;
            boolean z = this.j;
            if(z && atomicThrowable0.get() != null) {
                mpscLinkedQueue0.clear();
                Throwable throwable0 = atomicThrowable0.terminate();
                if(unicastProcessor0 != null) {
                    this.k = null;
                    unicastProcessor0.onError(throwable0);
                }
                subscriber0.onError(throwable0);
                return;
            }
            Object object0 = mpscLinkedQueue0.poll();
            if(z && object0 == null) {
                Throwable throwable1 = atomicThrowable0.terminate();
                if(throwable1 == null) {
                    if(unicastProcessor0 != null) {
                        this.k = null;
                        unicastProcessor0.onComplete();
                    }
                    subscriber0.onComplete();
                    return;
                }
                if(unicastProcessor0 != null) {
                    this.k = null;
                    unicastProcessor0.onError(throwable1);
                }
                subscriber0.onError(throwable1);
                return;
            }
            if(object0 == null) {
                this.l = v;
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    continue;
                }
                return;
            }
            if(object0 == k6.m) {
                if(unicastProcessor0 != null) {
                    this.k = null;
                    unicastProcessor0.onComplete();
                }
                if(!this.h.get()) {
                    UnicastProcessor unicastProcessor1 = UnicastProcessor.create(this.b, this);
                    this.k = unicastProcessor1;
                    this.e.getAndIncrement();
                    if(v == this.i.get()) {
                        SubscriptionHelper.cancel(this.d);
                        this.c.dispose();
                        atomicThrowable0.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                        this.j = true;
                    }
                    else {
                        ++v;
                        subscriber0.onNext(unicastProcessor1);
                    }
                }
            }
            else {
                unicastProcessor0.onNext(object0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.h.compareAndSet(false, true)) {
            this.c.dispose();
            if(this.e.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.d);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.c.dispose();
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.c.dispose();
        if(this.g.addThrowable(throwable0)) {
            this.j = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.f.offer(object0);
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this.d, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        BackpressureHelper.add(this.i, v);
    }

    @Override
    public final void run() {
        if(this.e.decrementAndGet() == 0) {
            SubscriptionHelper.cancel(this.d);
        }
    }
}

