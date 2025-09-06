package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableWindowBoundarySelector extends a {
    public final Publisher b;
    public final Function c;
    public final int d;

    public FlowableWindowBoundarySelector(Flowable flowable0, Publisher publisher0, Function function0, int v) {
        super(flowable0);
        this.b = publisher0;
        this.c = function0;
        this.d = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        m6 m60 = new m6(new SerializedSubscriber(subscriber0), this.b, this.c, this.d);
        this.source.subscribe(m60);
    }
}

