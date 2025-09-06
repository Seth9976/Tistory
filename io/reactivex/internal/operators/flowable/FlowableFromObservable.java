package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import org.reactivestreams.Subscriber;

public final class FlowableFromObservable extends Flowable {
    public final Observable b;

    public FlowableFromObservable(Observable observable0) {
        this.b = observable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d2 d20 = new d2(subscriber0);
        this.b.subscribe(d20);
    }
}

