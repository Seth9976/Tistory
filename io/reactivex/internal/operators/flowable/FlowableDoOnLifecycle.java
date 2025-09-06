package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import org.reactivestreams.Subscriber;

public final class FlowableDoOnLifecycle extends a {
    public final Consumer b;
    public final LongConsumer c;
    public final Action d;

    public FlowableDoOnLifecycle(Flowable flowable0, Consumer consumer0, LongConsumer longConsumer0, Action action0) {
        super(flowable0);
        this.b = consumer0;
        this.c = longConsumer0;
        this.d = action0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o1 o10 = new o1(subscriber0, this.b, this.c, this.d);
        this.source.subscribe(o10);
    }
}

