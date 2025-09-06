package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class SubscriberResourceWrapper extends AtomicReference implements FlowableSubscriber, Disposable, Subscription {
    public final Subscriber a;
    public final AtomicReference b;

    public SubscriberResourceWrapper(Subscriber subscriber0) {
        this.b = new AtomicReference();
        this.a = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.b);
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        DisposableHelper.dispose(this);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.setOnce(this.b, subscription0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            ((Subscription)this.b.get()).request(v);
        }
    }

    public void setResource(Disposable disposable0) {
        DisposableHelper.set(this, disposable0);
    }
}

