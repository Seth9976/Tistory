package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Processor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class i6 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final SpscLinkedArrayQueue b;
    public final long c;
    public final long d;
    public final ArrayDeque e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicLong h;
    public final AtomicInteger i;
    public final int j;
    public long k;
    public long l;
    public Subscription m;
    public volatile boolean n;
    public Throwable o;
    public volatile boolean p;

    public i6(Subscriber subscriber0, long v, long v1, int v2) {
        super(1);
        this.a = subscriber0;
        this.c = v;
        this.d = v1;
        this.b = new SpscLinkedArrayQueue(v2);
        this.e = new ArrayDeque();
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean();
        this.h = new AtomicLong();
        this.i = new AtomicInteger();
        this.j = v2;
    }

    public final boolean a(boolean z, boolean z1, Subscriber subscriber0, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        if(this.p) {
            spscLinkedArrayQueue0.clear();
            return true;
        }
        if(z) {
            Throwable throwable0 = this.o;
            if(throwable0 != null) {
                spscLinkedArrayQueue0.clear();
                subscriber0.onError(throwable0);
                return true;
            }
            if(z1) {
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if(this.i.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.b;
        int v = 1;
        do {
            long v1 = this.h.get();
            long v2 = 0L;
            int v3;
            while((v3 = Long.compare(v2, v1)) != 0) {
                boolean z = this.n;
                UnicastProcessor unicastProcessor0 = (UnicastProcessor)spscLinkedArrayQueue0.poll();
                if(this.a(z, unicastProcessor0 == null, subscriber0, spscLinkedArrayQueue0)) {
                    return;
                }
                if(unicastProcessor0 == null) {
                    break;
                }
                subscriber0.onNext(unicastProcessor0);
                ++v2;
            }
            if(v3 == 0 && this.a(this.n, spscLinkedArrayQueue0.isEmpty(), subscriber0, spscLinkedArrayQueue0)) {
                return;
            }
            if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                this.h.addAndGet(-v2);
            }
            v = this.i.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.p = true;
        if(this.f.compareAndSet(false, true)) {
            this.run();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.n) {
            return;
        }
        for(Object object0: this.e) {
            ((Processor)object0).onComplete();
        }
        this.e.clear();
        this.n = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.n) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        for(Object object0: this.e) {
            ((Processor)object0).onError(throwable0);
        }
        this.e.clear();
        this.o = throwable0;
        this.n = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.n) {
            return;
        }
        long v = this.k;
        if(v == 0L && !this.p) {
            this.getAndIncrement();
            UnicastProcessor unicastProcessor0 = UnicastProcessor.create(this.j, this);
            this.e.offer(unicastProcessor0);
            this.b.offer(unicastProcessor0);
            this.b();
        }
        for(Object object1: this.e) {
            ((Processor)object1).onNext(object0);
        }
        long v1 = this.l + 1L;
        if(v1 == this.c) {
            this.l = v1 - this.d;
            Processor processor0 = (Processor)this.e.poll();
            if(processor0 != null) {
                processor0.onComplete();
            }
        }
        else {
            this.l = v1;
        }
        if(v + 1L == this.d) {
            this.k = 0L;
            return;
        }
        this.k = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.m, subscription0)) {
            this.m = subscription0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.h, v);
            boolean z = this.g.get();
            long v1 = this.d;
            if(z || !this.g.compareAndSet(false, true)) {
                long v3 = BackpressureHelper.multiplyCap(v1, v);
                this.m.request(v3);
            }
            else {
                long v2 = BackpressureHelper.multiplyCap(v1, v - 1L);
                this.m.request(BackpressureHelper.addCap(this.c, v2));
            }
            this.b();
        }
    }

    @Override
    public final void run() {
        if(this.decrementAndGet() == 0) {
            this.m.cancel();
        }
    }
}

