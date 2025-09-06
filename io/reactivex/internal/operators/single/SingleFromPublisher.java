package io.reactivex.internal.operators.single;

import gd.t;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import org.reactivestreams.Publisher;

public final class SingleFromPublisher extends Single {
    public final Publisher a;

    public SingleFromPublisher(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        t t0 = new t(singleObserver0);
        this.a.subscribe(t0);
    }
}

