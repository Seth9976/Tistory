package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class w5 extends AtomicReference implements FlowableSubscriber, Disposable {
    public final Number a;
    public final long b;

    public w5(long v, TimeoutSelectorSupport flowableTimeout$TimeoutSelectorSupport0) {
        this.b = v;
        this.a = (Number)flowableTimeout$TimeoutSelectorSupport0;
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
            ((TimeoutSupport)this.a).onTimeout(this.b);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Object object0 = this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(object0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            ((TimeoutSelectorSupport)this.a).onTimeoutError(this.b, throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Subscription subscription0 = (Subscription)this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(subscription0 != subscriptionHelper0) {
            subscription0.cancel();
            this.lazySet(subscriptionHelper0);
            ((TimeoutSupport)this.a).onTimeout(this.b);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

