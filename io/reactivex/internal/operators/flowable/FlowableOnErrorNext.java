package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableOnErrorNext extends a {
    public final Function b;
    public final boolean c;

    public FlowableOnErrorNext(Flowable flowable0, Function function0, boolean z) {
        super(flowable0);
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        k3 k30 = new k3(subscriber0, this.b, this.c);
        subscriber0.onSubscribe(k30);
        this.source.subscribe(k30);
    }
}

