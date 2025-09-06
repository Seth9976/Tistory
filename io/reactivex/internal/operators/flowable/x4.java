package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public abstract class x4 extends AtomicReference implements FlowableSubscriber, Runnable, Subscription {
    public final SerializedSubscriber a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final AtomicLong e;
    public final SequentialDisposable f;
    public Subscription g;

    public x4(SerializedSubscriber serializedSubscriber0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.e = new AtomicLong();
        this.f = new SequentialDisposable();
        this.a = serializedSubscriber0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
    }

    public abstract void a();

    public final void b() {
        Object object0 = this.getAndSet(null);
        if(object0 != null) {
            AtomicLong atomicLong0 = this.e;
            int v = Long.compare(atomicLong0.get(), 0L);
            SerializedSubscriber serializedSubscriber0 = this.a;
            if(v != 0) {
                serializedSubscriber0.onNext(object0);
                BackpressureHelper.produced(atomicLong0, 1L);
                return;
            }
            this.cancel();
            serializedSubscriber0.onError(new MissingBackpressureException("Couldn\'t emit value due to lack of requests!"));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        DisposableHelper.dispose(this.f);
        this.g.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        DisposableHelper.dispose(this.f);
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.f);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.lazySet(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            Disposable disposable0 = this.d.schedulePeriodicallyDirect(this, this.b, this.b, this.c);
            this.f.replace(disposable0);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
        }
    }

    @Override
    public void run() {
        this.b();
    }
}

