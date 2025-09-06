package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class g5 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final SpscLinkedArrayQueue e;
    public final boolean f;
    public Subscription g;
    public final AtomicLong h;
    public volatile boolean i;
    public volatile boolean j;
    public Throwable k;

    public g5(Subscriber subscriber0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, boolean z) {
        this.h = new AtomicLong();
        this.a = subscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = new SpscLinkedArrayQueue(v1);
        this.f = z;
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.e;
        boolean z = this.f;
        TimeUnit timeUnit0 = this.c;
        Scheduler scheduler0 = this.d;
        long v = this.b;
        int v1 = 1;
        do {
            long v2 = this.h.get();
            long v3;
            for(v3 = 0L; v3 != v2; ++v3) {
                boolean z1 = this.j;
                Long long0 = (Long)spscLinkedArrayQueue0.peek();
                boolean z2 = long0 == null || ((long)long0) <= scheduler0.now(timeUnit0) - v ? long0 == null : true;
                if(this.i) {
                    this.e.clear();
                    return;
                }
                if(z1) {
                    if(!z) {
                        Throwable throwable1 = this.k;
                        if(throwable1 != null) {
                            this.e.clear();
                            subscriber0.onError(throwable1);
                            return;
                        }
                        if(z2) {
                            subscriber0.onComplete();
                            return;
                        }
                    }
                    else if(z2) {
                        Throwable throwable0 = this.k;
                        if(throwable0 != null) {
                            subscriber0.onError(throwable0);
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                }
                if(z2) {
                    break;
                }
                spscLinkedArrayQueue0.poll();
                subscriber0.onNext(spscLinkedArrayQueue0.poll());
            }
            if(v3 != 0L) {
                BackpressureHelper.produced(this.h, v3);
            }
            v1 = this.addAndGet(-v1);
        }
        while(v1 != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.i) {
            this.i = true;
            this.g.cancel();
            if(this.getAndIncrement() == 0) {
                this.e.clear();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.k = throwable0;
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Long long0 = this.d.now(this.c);
        this.e.offer(long0, object0);
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.h, v);
            this.a();
        }
    }
}

