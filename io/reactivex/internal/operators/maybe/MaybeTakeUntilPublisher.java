package io.reactivex.internal.operators.maybe;

import gd.a0;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import org.reactivestreams.Publisher;

public final class MaybeTakeUntilPublisher extends a {
    public final Publisher a;

    public MaybeTakeUntilPublisher(MaybeSource maybeSource0, Publisher publisher0) {
        super(maybeSource0);
        this.a = publisher0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(maybeObserver0, 6);
        maybeObserver0.onSubscribe(y0);
        this.a.subscribe(((a0)y0.b));
        this.source.subscribe(y0);
    }
}

