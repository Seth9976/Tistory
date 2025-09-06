package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Subscriber;

public final class FlowableRetryPredicate extends a {
    public final Predicate b;
    public final long c;

    public FlowableRetryPredicate(Flowable flowable0, long v, Predicate predicate0) {
        super(flowable0);
        this.b = predicate0;
        this.c = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SubscriptionArbiter subscriptionArbiter0 = new SubscriptionArbiter(false);
        subscriber0.onSubscribe(subscriptionArbiter0);
        new q4(subscriber0, this.c, this.b, subscriptionArbiter0, this.source).a();
    }
}

