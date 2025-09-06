package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscriber;

public final class FlowableOnBackpressureDrop extends a implements Consumer {
    public final Consumer b;

    public FlowableOnBackpressureDrop(Flowable flowable0) {
        super(flowable0);
        this.b = this;
    }

    public FlowableOnBackpressureDrop(Flowable flowable0, Consumer consumer0) {
        super(flowable0);
        this.b = consumer0;
    }

    @Override  // io.reactivex.functions.Consumer
    public void accept(Object object0) {
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        i3 i30 = new i3(subscriber0, this.b);
        this.source.subscribe(i30);
    }
}

