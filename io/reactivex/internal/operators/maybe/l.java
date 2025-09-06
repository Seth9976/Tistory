package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class l extends AtomicReference implements FlowableSubscriber {
    public final MaybeObserver a;
    public Object b;
    public Throwable c;

    public l(MaybeObserver maybeObserver0) {
        this.a = maybeObserver0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        Throwable throwable0 = this.c;
        MaybeObserver maybeObserver0 = this.a;
        if(throwable0 != null) {
            maybeObserver0.onError(throwable0);
            return;
        }
        Object object0 = this.b;
        if(object0 != null) {
            maybeObserver0.onSuccess(object0);
            return;
        }
        maybeObserver0.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        Throwable throwable1 = this.c;
        MaybeObserver maybeObserver0 = this.a;
        if(throwable1 == null) {
            maybeObserver0.onError(throwable0);
            return;
        }
        maybeObserver0.onError(new CompositeException(new Throwable[]{throwable1, throwable0}));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Subscription subscription0 = (Subscription)this.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(subscription0 != subscriptionHelper0) {
            this.lazySet(subscriptionHelper0);
            subscription0.cancel();
            this.onComplete();
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

