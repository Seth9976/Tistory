package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import org.reactivestreams.Subscriber;

public final class MaybeConcatArrayDelayError extends Flowable {
    public final MaybeSource[] b;

    public MaybeConcatArrayDelayError(MaybeSource[] arr_maybeSource) {
        this.b = arr_maybeSource;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        e e0 = new e(subscriber0, this.b);
        subscriber0.onSubscribe(e0);
        e0.a();
    }
}

