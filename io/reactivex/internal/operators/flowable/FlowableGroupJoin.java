package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableGroupJoin extends a {
    interface JoinSupport {
        void innerClose(boolean arg1, i2 arg2);

        void innerCloseError(Throwable arg1);

        void innerComplete(j2 arg1);

        void innerError(Throwable arg1);

        void innerValue(boolean arg1, Object arg2);
    }

    public final Publisher b;
    public final Function c;
    public final Function d;
    public final BiFunction e;

    public FlowableGroupJoin(Flowable flowable0, Publisher publisher0, Function function0, Function function1, BiFunction biFunction0) {
        super(flowable0);
        this.b = publisher0;
        this.c = function0;
        this.d = function1;
        this.e = biFunction0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        h2 h20 = new h2(subscriber0, this.c, this.d, this.e);
        subscriber0.onSubscribe(h20);
        j2 j20 = new j2(h20, true);
        h20.d.add(j20);
        j2 j21 = new j2(h20, false);
        h20.d.add(j21);
        this.source.subscribe(j20);
        this.b.subscribe(j21);
    }
}

