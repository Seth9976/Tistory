package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.lazySet(true);
    }

    public boolean isCancelled() {
        return this.get();
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
        SubscriptionHelper.validate(v);
    }

    @Override
    public String toString() {
        return "BooleanSubscription(cancelled=" + this.get() + ")";
    }
}

