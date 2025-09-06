package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;

public final class FlowableRetryBiPredicate extends a {
    public final BiPredicate b;

    public FlowableRetryBiPredicate(Flowable flowable0, BiPredicate biPredicate0) {
        super(flowable0);
        this.b = biPredicate0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SubscriptionArbiter subscriptionArbiter0 = new SubscriptionArbiter(false);
        subscriber0.onSubscribe(subscriptionArbiter0);
        new p4(subscriber0, this.b, subscriptionArbiter0, this.source).a();
    }
}

