package io.reactivex.internal.operators.mixed;

import ed.n;
import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Subscriber;

public final class MaybeFlatMapPublisher extends Flowable {
    public final MaybeSource b;
    public final Function c;

    public MaybeFlatMapPublisher(MaybeSource maybeSource0, Function function0) {
        this.b = maybeSource0;
        this.c = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        n n0 = new n(subscriber0, this.c);
        this.b.subscribe(n0);
    }
}

