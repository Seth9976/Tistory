package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class FlowableFlatMap extends a {
    public final Function b;
    public final boolean c;
    public final int d;
    public final int e;

    public FlowableFlatMap(Flowable flowable0, Function function0, boolean z, int v, int v1) {
        super(flowable0);
        this.b = function0;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    public static FlowableSubscriber subscribe(Subscriber subscriber0, Function function0, boolean z, int v, int v1) {
        return new u1(subscriber0, function0, z, v, v1);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Function function0 = this.b;
        if(FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber0, function0)) {
            return;
        }
        FlowableSubscriber flowableSubscriber0 = FlowableFlatMap.subscribe(subscriber0, function0, this.c, this.d, this.e);
        this.source.subscribe(flowableSubscriber0);
    }
}

