package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableConcatMapPublisher extends Flowable {
    public final Publisher b;
    public final Function c;
    public final int d;
    public final ErrorMode e;

    public FlowableConcatMapPublisher(Publisher publisher0, Function function0, int v, ErrorMode errorMode0) {
        this.b = publisher0;
        this.c = function0;
        this.d = v;
        this.e = errorMode0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0 = this.b;
        Function function0 = this.c;
        if(FlowableScalarXMap.tryScalarXMapSubscribe(publisher0, subscriber0, function0)) {
            return;
        }
        publisher0.subscribe(FlowableConcatMap.subscribe(subscriber0, function0, this.d, this.e));
    }
}

