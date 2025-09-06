package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscriber;

public final class e4 extends ConnectableFlowable {
    public final ConnectableFlowable b;
    public final Flowable c;

    public e4(ConnectableFlowable connectableFlowable0, Flowable flowable0) {
        this.b = connectableFlowable0;
        this.c = flowable0;
    }

    @Override  // io.reactivex.flowables.ConnectableFlowable
    public final void connect(Consumer consumer0) {
        this.b.connect(consumer0);
    }

    @Override  // io.reactivex.Flowable
    public final void subscribeActual(Subscriber subscriber0) {
        this.c.subscribe(subscriber0);
    }
}

