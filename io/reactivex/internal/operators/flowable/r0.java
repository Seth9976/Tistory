package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableEmitter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class r0 extends AtomicLong implements FlowableEmitter, Subscription {
    public final Subscriber a;
    public final SequentialDisposable b;

    public r0(Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = new SequentialDisposable();
    }

    public final void a() {
        SequentialDisposable sequentialDisposable0 = this.b;
        if(sequentialDisposable0.isDisposed()) {
            return;
        }
        try {
            this.a.onComplete();
        }
        finally {
            sequentialDisposable0.dispose();
        }
    }

    public final boolean b(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        SequentialDisposable sequentialDisposable0 = this.b;
        if(sequentialDisposable0.isDisposed()) {
            return false;
        }
        try {
            this.a.onError(throwable0);
            return true;
        }
        finally {
            sequentialDisposable0.dispose();
        }
    }

    public void c() {
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b.dispose();
        this.d();
    }

    public void d() {
    }

    @Override  // io.reactivex.FlowableEmitter
    public final boolean isCancelled() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.Emitter
    public void onComplete() {
        this.a();
    }

    @Override  // io.reactivex.Emitter
    public final void onError(Throwable throwable0) {
        if(!this.tryOnError(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this, v);
            this.c();
        }
    }

    @Override  // io.reactivex.FlowableEmitter
    public final long requested() {
        return this.get();
    }

    @Override  // io.reactivex.FlowableEmitter
    public final FlowableEmitter serialize() {
        return new v0(this);
    }

    @Override  // io.reactivex.FlowableEmitter
    public final void setCancellable(Cancellable cancellable0) {
        this.setDisposable(new CancellableDisposable(cancellable0));
    }

    @Override  // io.reactivex.FlowableEmitter
    public final void setDisposable(Disposable disposable0) {
        this.b.update(disposable0);
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + "{" + super.toString() + "}";
    }

    @Override  // io.reactivex.FlowableEmitter
    public boolean tryOnError(Throwable throwable0) {
        return this.b(throwable0);
    }
}

