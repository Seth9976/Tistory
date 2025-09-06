package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

public final class t5 extends AtomicLong implements FlowableSubscriber, Runnable, Subscription {
    public final SerializedSubscriber a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public Subscription e;
    public final SequentialDisposable f;
    public volatile boolean g;
    public boolean h;

    public t5(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0) {
        this.f = new SequentialDisposable();
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
        this.a.onError(throwable0);
        this.d.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.h) {
            return;
        }
        if(!this.g) {
            this.g = true;
            if(this.get() != 0L) {
                this.a.onNext(object0);
                BackpressureHelper.produced(this, 1L);
                Disposable disposable0 = (Disposable)this.f.get();
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                Disposable disposable1 = this.d.schedule(this, this.b, this.c);
                this.f.replace(disposable1);
                return;
            }
            this.h = true;
            this.cancel();
            MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver value due to lack of requests");
            this.a.onError(missingBackpressureException0);
        }
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

    @Override
    public final void run() {
        this.g = false;
    }
}

