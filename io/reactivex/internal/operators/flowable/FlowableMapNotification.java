package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class FlowableMapNotification extends a {
    public final Function b;
    public final Function c;
    public final Callable d;

    public FlowableMapNotification(Flowable flowable0, Function function0, Function function1, Callable callable0) {
        super(flowable0);
        this.b = function0;
        this.c = function1;
        this.d = callable0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        y2 y20 = new y2(subscriber0, this.b, this.c, this.d);
        this.source.subscribe(y20);
    }
}

