package io.reactivex.internal.operators.flowable;

import io.reactivex.flowables.GroupedFlowable;
import org.reactivestreams.Subscriber;

public final class f2 extends GroupedFlowable {
    public final g2 c;
    public static final int d;

    public f2(Object object0, g2 g20) {
        super(object0);
        this.c = g20;
    }

    @Override  // io.reactivex.Flowable
    public final void subscribeActual(Subscriber subscriber0) {
        this.c.subscribe(subscriber0);
    }
}

