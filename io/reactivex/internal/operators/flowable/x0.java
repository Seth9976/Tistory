package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

public final class x0 extends AtomicLong implements FlowableSubscriber, Subscription {
    public final SerializedSubscriber a;
    public final Function b;
    public Subscription c;
    public final AtomicReference d;
    public volatile long e;
    public boolean f;

    public x0(SerializedSubscriber serializedSubscriber0, Function function0) {
        this.d = new AtomicReference();
        this.a = serializedSubscriber0;
        this.b = function0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
        DisposableHelper.dispose(this.d);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference0 = this.d;
        Disposable disposable0 = (Disposable)atomicReference0.get();
        if(!DisposableHelper.isDisposed(disposable0)) {
            if(((w0)disposable0) != null) {
                ((w0)disposable0).a();
            }
            DisposableHelper.dispose(atomicReference0);
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.d);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Publisher publisher0;
        if(this.f) {
            return;
        }
        long v = this.e + 1L;
        this.e = v;
        Disposable disposable0 = (Disposable)this.d.get();
        if(disposable0 != null) {
            disposable0.dispose();
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The publisher supplied is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.a.onError(throwable0);
            return;
        }
        w0 w00 = new w0(this, v, object0);
        AtomicReference atomicReference0 = this.d;
        do {
            if(atomicReference0.compareAndSet(disposable0, w00)) {
                publisher0.subscribe(w00);
                return;
            }
        }
        while(atomicReference0.get() == disposable0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
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

