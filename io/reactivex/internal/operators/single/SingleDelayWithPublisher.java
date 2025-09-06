package io.reactivex.internal.operators.single;

import gd.g;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import org.reactivestreams.Publisher;

public final class SingleDelayWithPublisher extends Single {
    public final SingleSource a;
    public final Publisher b;

    public SingleDelayWithPublisher(SingleSource singleSource0, Publisher publisher0) {
        this.a = singleSource0;
        this.b = publisher0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        g g0 = new g(singleObserver0, this.a);
        this.b.subscribe(g0);
    }
}

