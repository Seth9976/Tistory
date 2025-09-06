package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

public final class q1 implements FlowableSubscriber, Disposable {
    public final MaybeObserver a;
    public final long b;
    public Subscription c;
    public long d;
    public boolean e;

    public q1(MaybeObserver maybeObserver0, long v) {
        this.a = maybeObserver0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.cancel();
        this.c = SubscriptionHelper.CANCELLED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.c = SubscriptionHelper.CANCELLED;
        if(!this.e) {
            this.e = true;
            this.a.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.c = SubscriptionHelper.CANCELLED;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.e) {
            return;
        }
        long v = this.d;
        if(v == this.b) {
            this.e = true;
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
            this.a.onSuccess(object0);
            return;
        }
        this.d = v + 1L;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

