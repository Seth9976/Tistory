package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

public final class p0 implements FlowableSubscriber, Disposable {
    public final SingleObserver a;
    public Subscription b;
    public long c;

    public p0(SingleObserver singleObserver0) {
        this.a = singleObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.b.cancel();
        this.b = SubscriptionHelper.CANCELLED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.b = SubscriptionHelper.CANCELLED;
        this.a.onSuccess(this.c);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.b = SubscriptionHelper.CANCELLED;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.c;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

