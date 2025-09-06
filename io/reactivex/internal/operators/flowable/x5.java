package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class x5 extends SubscriptionArbiter implements FlowableSubscriber, TimeoutSelectorSupport {
    public final Subscriber h;
    public final Function i;
    public final SequentialDisposable j;
    public final AtomicReference k;
    public final AtomicLong l;
    public Publisher m;
    public long n;

    public x5(Publisher publisher0, Subscriber subscriber0, Function function0) {
        super(true);
        this.h = subscriber0;
        this.i = function0;
        this.j = new SequentialDisposable();
        this.k = new AtomicReference();
        this.m = publisher0;
        this.l = new AtomicLong();
    }

    @Override  // io.reactivex.internal.subscriptions.SubscriptionArbiter
    public final void cancel() {
        super.cancel();
        this.j.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.l.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.j.dispose();
            this.h.onComplete();
            this.j.dispose();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.l.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.j.dispose();
            this.h.onError(throwable0);
            this.j.dispose();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        AtomicLong atomicLong0 = this.l;
        long v = atomicLong0.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && atomicLong0.compareAndSet(v, v + 1L)) {
            SequentialDisposable sequentialDisposable0 = this.j;
            Disposable disposable0 = (Disposable)sequentialDisposable0.get();
            if(disposable0 != null) {
                disposable0.dispose();
            }
            ++this.n;
            Subscriber subscriber0 = this.h;
            subscriber0.onNext(object0);
            try {
                publisher0 = (Publisher)ObjectHelper.requireNonNull(this.i.apply(object0), "The itemTimeoutIndicator returned a null Publisher.");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Subscription)this.k.get()).cancel();
                atomicLong0.getAndSet(0x7FFFFFFFFFFFFFFFL);
                subscriber0.onError(throwable0);
                return;
            }
            w5 w50 = new w5(v + 1L, this);
            if(sequentialDisposable0.replace(w50)) {
                publisher0.subscribe(w50);
            }
        }
    }

    @Override  // io.reactivex.internal.subscriptions.SubscriptionArbiter, io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.k, subscription0)) {
            this.setSubscription(subscription0);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.l.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.k);
            Publisher publisher0 = this.m;
            this.m = null;
            long v1 = this.n;
            if(v1 != 0L) {
                this.produced(v1);
            }
            publisher0.subscribe(new z5(this.h, this));
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSelectorSupport
    public final void onTimeoutError(long v, Throwable throwable0) {
        if(this.l.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            SubscriptionHelper.cancel(this.k);
            this.h.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }
}

