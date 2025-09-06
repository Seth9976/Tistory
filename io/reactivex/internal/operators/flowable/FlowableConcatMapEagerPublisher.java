package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableConcatMapEagerPublisher extends Flowable {
    public final Publisher b;
    public final Function c;
    public final int d;
    public final int e;
    public final ErrorMode f;

    public FlowableConcatMapEagerPublisher(Publisher publisher0, Function function0, int v, int v1, ErrorMode errorMode0) {
        this.b = publisher0;
        this.c = function0;
        this.d = v;
        this.e = v1;
        this.f = errorMode0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        k0 k00 = new k0(this.d, this.e, this.c, this.f, subscriber0);
        this.b.subscribe(k00);
    }
}

