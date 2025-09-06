package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableConcatWithCompletable extends a {
    public final CompletableSource b;

    public FlowableConcatWithCompletable(Flowable flowable0, CompletableSource completableSource0) {
        super(flowable0);
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        l0 l00 = new l0(subscriber0, this.b);
        this.source.subscribe(l00);
    }
}

