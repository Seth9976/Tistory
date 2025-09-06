package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class a6 extends SubscriptionArbiter implements FlowableSubscriber, TimeoutSupport {
    public final Subscriber h;
    public final long i;
    public final TimeUnit j;
    public final Worker k;
    public final SequentialDisposable l;
    public final AtomicReference m;
    public final AtomicLong n;
    public long o;
    public Publisher p;

    public a6(Subscriber subscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, Publisher publisher0) {
        super(true);
        this.h = subscriber0;
        this.i = v;
        this.j = timeUnit0;
        this.k = scheduler$Worker0;
        this.p = publisher0;
        this.l = new SequentialDisposable();
        this.m = new AtomicReference();
        this.n = new AtomicLong();
    }

    @Override  // io.reactivex.internal.subscriptions.SubscriptionArbiter
    public final void cancel() {
        super.cancel();
        this.k.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.n.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.l.dispose();
            this.h.onComplete();
            this.k.dispose();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.n.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.l.dispose();
            this.h.onError(throwable0);
            this.k.dispose();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.n.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && this.n.compareAndSet(v, v + 1L)) {
            ((Disposable)this.l.get()).dispose();
            ++this.o;
            this.h.onNext(object0);
            c6 c60 = new c6(v + 1L, this);
            Disposable disposable0 = this.k.schedule(c60, this.i, this.j);
            this.l.replace(disposable0);
        }
    }

    @Override  // io.reactivex.internal.subscriptions.SubscriptionArbiter, io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.m, subscription0)) {
            this.setSubscription(subscription0);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.n.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.m);
            long v1 = this.o;
            if(v1 != 0L) {
                this.produced(v1);
            }
            Publisher publisher0 = this.p;
            this.p = null;
            publisher0.subscribe(new z5(this.h, this));
            this.k.dispose();
        }
    }
}

