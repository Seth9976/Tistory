package io.reactivex.internal.operators.flowable;

import ed.f;
import io.reactivex.Flowable;
import io.reactivex.SingleSource;
import org.reactivestreams.Subscriber;

public final class FlowableMergeWithSingle extends a {
    public final SingleSource b;

    public FlowableMergeWithSingle(Flowable flowable0, SingleSource singleSource0) {
        super(flowable0);
        this.b = singleSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        b3 b30 = new b3(subscriber0, 1);
        subscriber0.onSubscribe(b30);
        this.source.subscribe(b30);
        this.b.subscribe(((f)b30.o));
    }
}

