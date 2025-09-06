package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;

public final class FlowableRepeatUntil extends a {
    public final BooleanSupplier b;

    public FlowableRepeatUntil(Flowable flowable0, BooleanSupplier booleanSupplier0) {
        super(flowable0);
        this.b = booleanSupplier0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SubscriptionArbiter subscriptionArbiter0 = new SubscriptionArbiter(false);
        subscriber0.onSubscribe(subscriptionArbiter0);
        new a4(subscriber0, this.b, subscriptionArbiter0, this.source).a();
    }
}

