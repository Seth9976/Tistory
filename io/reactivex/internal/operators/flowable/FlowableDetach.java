package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableDetach extends a {
    public FlowableDetach(Flowable flowable0) {
        super(flowable0);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        e1 e10 = new e1();
        e10.b = subscriber0;
        this.source.subscribe(e10);
    }
}

