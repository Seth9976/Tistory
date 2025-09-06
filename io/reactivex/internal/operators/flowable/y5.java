package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class y5 extends AtomicLong implements FlowableSubscriber, TimeoutSelectorSupport, Subscription {
    public final Subscriber a;
    public final Function b;
    public final SequentialDisposable c;
    public final AtomicReference d;
    public final AtomicLong e;

    public y5(Subscriber subscriber0, Function function0) {
        this.a = subscriber0;
        this.b = function0;
        this.c = new SequentialDisposable();
        this.d = new AtomicReference();
        this.e = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.d);
        this.c.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.c.dispose();
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.c.dispose();
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        long v = this.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && this.compareAndSet(v, v + 1L)) {
            SequentialDisposable sequentialDisposable0 = this.c;
            Disposable disposable0 = (Disposable)sequentialDisposable0.get();
            if(disposable0 != null) {
                disposable0.dispose();
            }
            Subscriber subscriber0 = this.a;
            subscriber0.onNext(object0);
            try {
                publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The itemTimeoutIndicator returned a null Publisher.");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Subscription)this.d.get()).cancel();
                this.getAndSet(0x7FFFFFFFFFFFFFFFL);
                subscriber0.onError(throwable0);
                return;
            }
            w5 w50 = new w5(v + 1L, this);
            if(sequentialDisposable0.replace(w50)) {
                publisher0.subscribe(w50);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.d, this.e, subscription0);
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.d);
            TimeoutException timeoutException0 = new TimeoutException();
            this.a.onError(timeoutException0);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSelectorSupport
    public final void onTimeoutError(long v, Throwable throwable0) {
        if(this.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.d);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.d, this.e, v);
    }
}

