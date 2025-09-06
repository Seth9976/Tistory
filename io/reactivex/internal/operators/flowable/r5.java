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

public final class r5 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final SpscLinkedArrayQueue f;
    public final boolean g;
    public Subscription h;
    public final AtomicLong i;
    public volatile boolean j;
    public volatile boolean k;
    public Throwable l;

    public r5(Subscriber subscriber0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2, boolean z) {
        this.i = new AtomicLong();
        this.a = subscriber0;
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = new SpscLinkedArrayQueue(v2);
        this.g = z;
    }

    public final boolean a(Subscriber subscriber0, boolean z, boolean z1) {
        if(this.j) {
            this.f.clear();
            return true;
        }
        if(!z1) {
            Throwable throwable1 = this.l;
            if(throwable1 != null) {
                this.f.clear();
                subscriber0.onError(throwable1);
                return true;
            }
            if(z) {
                subscriber0.onComplete();
                return true;
            }
        }
        else if(z) {
            Throwable throwable0 = this.l;
            if(throwable0 != null) {
                subscriber0.onError(throwable0);
                return true;
            }
            subscriber0.onComplete();
            return true;
        }
        return false;
    }

    public final void b() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.f;
        boolean z = this.g;
        int v = 1;
        do {
            if(this.k) {
                if(this.a(subscriber0, spscLinkedArrayQueue0.isEmpty(), z)) {
                    return;
                }
                long v1 = this.i.get();
                for(long v2 = 0L; true; ++v2) {
                    if(this.a(subscriber0, spscLinkedArrayQueue0.peek() == null, z)) {
                        return;
                    }
                    if(v1 == v2) {
                        if(v2 != 0L) {
                            BackpressureHelper.produced(this.i, v2);
                        }
                        break;
                    }
                    spscLinkedArrayQueue0.poll();
                    subscriber0.onNext(spscLinkedArrayQueue0.poll());
                }
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    public final void c(long v, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        long v1 = this.b;
        boolean z = Long.compare(v1, 0x7FFFFFFFFFFFFFFFL) == 0;
        while(!spscLinkedArrayQueue0.isEmpty() && (((long)(((Long)spscLinkedArrayQueue0.peek()))) < v - this.c || !z && ((long)(spscLinkedArrayQueue0.size() >> 1)) > v1)) {
            spscLinkedArrayQueue0.poll();
            spscLinkedArrayQueue0.poll();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.j) {
            this.j = true;
            this.h.cancel();
            if(this.getAndIncrement() == 0) {
                this.f.clear();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.c(this.e.now(this.d), this.f);
        this.k = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.g) {
            this.c(this.e.now(this.d), this.f);
        }
        this.l = throwable0;
        this.k = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.e.now(this.d);
        this.f.offer(v, object0);
        this.c(v, this.f);
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
            BackpressureHelper.add(this.i, v);
            this.b();
        }
    }
}

