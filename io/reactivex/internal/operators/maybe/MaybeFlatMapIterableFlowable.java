package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class MaybeFlatMapIterableFlowable extends Flowable {
    public final MaybeSource b;
    public final Function c;

    public MaybeFlatMapIterableFlowable(MaybeSource maybeSource0, Function function0) {
        this.b = maybeSource0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        u u0 = new u(subscriber0, this.c);
        this.b.subscribe(u0);
    }
}

