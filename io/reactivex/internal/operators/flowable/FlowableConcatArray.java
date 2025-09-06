package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableConcatArray extends Flowable {
    public final Publisher[] b;
    public final boolean c;

    public FlowableConcatArray(Publisher[] arr_publisher, boolean z) {
        this.b = arr_publisher;
        this.c = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d0 d00 = new d0(this.b, this.c, subscriber0);
        subscriber0.onSubscribe(d00);
        d00.onComplete();
    }
}

