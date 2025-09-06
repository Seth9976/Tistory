package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Subscriber;

public final class FlowableConcatMap extends a {
    interface ConcatMapSupport {
        void innerComplete();

        void innerError(Throwable arg1);

        void innerNext(Object arg1);
    }

    public final Function b;
    public final int c;
    public final ErrorMode d;

    public FlowableConcatMap(Flowable flowable0, Function function0, int v, ErrorMode errorMode0) {
        super(flowable0);
        this.b = function0;
        this.c = v;
        this.d = errorMode0;
    }

    public static Subscriber subscribe(Subscriber subscriber0, Function function0, int v, ErrorMode errorMode0) {
        switch(e0.a[errorMode0.ordinal()]) {
            case 1: {
                return new g0(v, function0, subscriber0, false);
            }
            case 2: {
                return new g0(v, function0, subscriber0, true);
            }
            default: {
                return new h0(subscriber0, function0, v);
            }
        }
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Function function0 = this.b;
        if(FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber0, function0)) {
            return;
        }
        Subscriber subscriber1 = FlowableConcatMap.subscribe(subscriber0, function0, this.c, this.d);
        this.source.subscribe(subscriber1);
    }
}

