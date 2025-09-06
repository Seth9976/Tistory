package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.reactivestreams.Subscriber;

public final class FlowableJust extends Flowable implements ScalarCallable {
    public final Object b;

    public FlowableJust(Object object0) {
        this.b = object0;
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return this.b;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        subscriber0.onSubscribe(new ScalarSubscription(subscriber0, this.b));
    }
}

