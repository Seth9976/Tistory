package io.reactivex.internal.operators.flowable;

import dd.e;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

public final class FlowableMergeWithCompletable extends a {
    public final CompletableSource b;

    public FlowableMergeWithCompletable(Flowable flowable0, CompletableSource completableSource0) {
        super(flowable0);
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        a3 a30 = new a3(subscriber0, 0);
        subscriber0.onSubscribe(a30);
        this.source.subscribe(a30);
        this.b.subscribe(((e)a30.g));
    }
}

