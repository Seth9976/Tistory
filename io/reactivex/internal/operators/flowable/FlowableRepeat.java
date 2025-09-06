package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;

public final class FlowableRepeat extends a {
    public final long b;

    public FlowableRepeat(Flowable flowable0, long v) {
        super(flowable0);
        this.b = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SubscriptionArbiter subscriptionArbiter0 = new SubscriptionArbiter(false);
        subscriber0.onSubscribe(subscriptionArbiter0);
        new z3(subscriber0, (this.b == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : this.b - 1L), subscriptionArbiter0, this.source).a();
    }
}

