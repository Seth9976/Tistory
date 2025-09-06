package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import org.reactivestreams.Subscriber;

public final class MaybeConcatArray extends Flowable {
    public final MaybeSource[] b;

    public MaybeConcatArray(MaybeSource[] arr_maybeSource) {
        this.b = arr_maybeSource;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d d0 = new d(subscriber0, this.b);
        subscriber0.onSubscribe(d0);
        d0.a();
    }
}

