package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class i2 extends AtomicReference implements FlowableSubscriber, Disposable {
    public final AtomicInteger a;
    public final boolean b;
    public final int c;

    public i2(JoinSupport flowableGroupJoin$JoinSupport0, boolean z, int v) {
        this.a = (AtomicInteger)flowableGroupJoin$JoinSupport0;
        this.b = z;
        this.c = v;
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
        ((JoinSupport)this.a).innerClose(this.b, this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        ((JoinSupport)this.a).innerCloseError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(SubscriptionHelper.cancel(this)) {
            ((JoinSupport)this.a).innerClose(this.b, this);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

