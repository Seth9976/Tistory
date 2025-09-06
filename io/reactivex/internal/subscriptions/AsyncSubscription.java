package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class AsyncSubscription extends AtomicLong implements Disposable, Subscription {
    public final AtomicReference a;
    public final AtomicReference b;

    public AsyncSubscription() {
        this.b = new AtomicReference();
        this.a = new AtomicReference();
    }

    public AsyncSubscription(Disposable disposable0) {
        this.b.lazySet(disposable0);
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.a);
        DisposableHelper.dispose(this.b);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.a.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(Disposable disposable0) {
        return DisposableHelper.replace(this.b, disposable0);
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        SubscriptionHelper.deferredRequest(this.a, this, v);
    }

    public boolean setResource(Disposable disposable0) {
        return DisposableHelper.set(this.b, disposable0);
    }

    public void setSubscription(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.a, this, subscription0);
    }
}

