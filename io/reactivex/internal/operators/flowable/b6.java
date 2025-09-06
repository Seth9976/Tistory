package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class b6 extends AtomicLong implements FlowableSubscriber, TimeoutSupport, Subscription {
    public final Subscriber a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final SequentialDisposable e;
    public final AtomicReference f;
    public final AtomicLong g;

    public b6(Subscriber subscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        this.a = subscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.e = new SequentialDisposable();
        this.f = new AtomicReference();
        this.g = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.f);
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.e.dispose();
            this.a.onComplete();
            this.d.dispose();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.e.dispose();
            this.a.onError(throwable0);
            this.d.dispose();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        long v = this.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && this.compareAndSet(v, v + 1L)) {
            ((Disposable)this.e.get()).dispose();
            this.a.onNext(object0);
            c6 c60 = new c6(v + 1L, this);
            Disposable disposable0 = this.d.schedule(c60, this.b, this.c);
            this.e.replace(disposable0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.f, this.g, subscription0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.f);
            TimeoutException timeoutException0 = new TimeoutException(ExceptionHelper.timeoutMessage(this.b, this.c));
            this.a.onError(timeoutException0);
            this.d.dispose();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.f, this.g, v);
    }
}

