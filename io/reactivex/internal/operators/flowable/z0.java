package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

public final class z0 extends AtomicLong implements FlowableSubscriber, Subscription {
    public final SerializedSubscriber a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public Subscription e;
    public y0 f;
    public volatile long g;
    public boolean h;

    public z0(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        this.a = serializedSubscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.e.cancel();
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        if(y00 != null) {
            y00.a();
        }
        this.a.onComplete();
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.h = true;
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        this.a.onError(throwable0);
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.h) {
            return;
        }
        long v = this.g + 1L;
        this.g = v;
        y0 y00 = this.f;
        if(y00 != null) {
            DisposableHelper.dispose(y00);
        }
        y0 y01 = new y0(object0, v, this);
        this.f = y01;
        DisposableHelper.replace(y01, this.d.schedule(y01, this.b, this.c));
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this, v);
        }
    }
}

