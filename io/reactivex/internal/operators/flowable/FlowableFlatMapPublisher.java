package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableFlatMapPublisher extends Flowable {
    public final Publisher b;
    public final Function c;
    public final boolean d;
    public final int e;
    public final int f;

    public FlowableFlatMapPublisher(Publisher publisher0, Function function0, boolean z, int v, int v1) {
        this.b = publisher0;
        this.c = function0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Publisher publisher0 = this.b;
        Function function0 = this.c;
        if(FlowableScalarXMap.tryScalarXMapSubscribe(publisher0, subscriber0, function0)) {
            return;
        }
        publisher0.subscribe(FlowableFlatMap.subscribe(subscriber0, function0, this.d, this.e, this.f));
    }
}

