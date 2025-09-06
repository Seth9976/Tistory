package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableSwitchMap extends a {
    public final Function b;
    public final int c;
    public final boolean d;

    public FlowableSwitchMap(Flowable flowable0, Function function0, int v, boolean z) {
        super(flowable0);
        this.b = function0;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Function function0 = this.b;
        if(FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber0, function0)) {
            return;
        }
        n5 n50 = new n5(this.c, function0, subscriber0, this.d);
        this.source.subscribe(n50);
    }
}

