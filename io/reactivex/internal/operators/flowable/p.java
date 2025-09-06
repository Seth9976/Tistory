package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class p extends AtomicReference implements FlowableSubscriber, Disposable {
    public final o a;
    public final long b;

    public p(o o0, long v) {
        this.a = o0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Object object0 = this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(object0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            this.a.a(this, this.b);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Object object0 = this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(object0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            SubscriptionHelper.cancel(this.a.g);
            this.a.e.delete(this);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Subscription subscription0 = (Subscription)this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(subscription0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            subscription0.cancel();
            this.a.a(this, this.b);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

