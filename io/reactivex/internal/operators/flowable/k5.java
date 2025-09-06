package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k5 extends AtomicReference implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final Worker b;
    public final AtomicReference c;
    public final AtomicLong d;
    public final boolean e;
    public Publisher f;

    public k5(Subscriber subscriber0, Worker scheduler$Worker0, Publisher publisher0, boolean z) {
        this.a = subscriber0;
        this.b = scheduler$Worker0;
        this.f = publisher0;
        this.c = new AtomicReference();
        this.d = new AtomicLong();
        this.e = !z;
    }

    public final void a(long v, Subscription subscription0) {
        if(!this.e && Thread.currentThread() != this.get()) {
            j5 j50 = new j5(v, subscription0);
            this.b.schedule(j50);
            return;
        }
        subscription0.request(v);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.c);
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
        this.b.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.c, subscription0)) {
            long v = this.d.getAndSet(0L);
            if(v != 0L) {
                this.a(v, subscription0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            AtomicReference atomicReference0 = this.c;
            Subscription subscription0 = (Subscription)atomicReference0.get();
            if(subscription0 != null) {
                this.a(v, subscription0);
                return;
            }
            AtomicLong atomicLong0 = this.d;
            BackpressureHelper.add(atomicLong0, v);
            Subscription subscription1 = (Subscription)atomicReference0.get();
            if(subscription1 != null) {
                long v1 = atomicLong0.getAndSet(0L);
                if(v1 != 0L) {
                    this.a(v1, subscription1);
                }
            }
        }
    }

    @Override
    public final void run() {
        this.lazySet(Thread.currentThread());
        Publisher publisher0 = this.f;
        this.f = null;
        publisher0.subscribe(this);
    }
}

