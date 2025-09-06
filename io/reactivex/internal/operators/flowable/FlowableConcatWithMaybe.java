package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import org.reactivestreams.Subscriber;

public final class FlowableConcatWithMaybe extends a {
    public final MaybeSource b;

    public FlowableConcatWithMaybe(Flowable flowable0, MaybeSource maybeSource0) {
        super(flowable0);
        this.b = maybeSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        m0 m00 = new m0(subscriber0, this.b);
        this.source.subscribe(m00);
    }
}

