package io.reactivex.internal.operators.maybe;

import gd.a0;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import org.reactivestreams.Publisher;

public final class MaybeTimeoutPublisher extends a {
    public final Publisher a;
    public final MaybeSource b;

    public MaybeTimeoutPublisher(MaybeSource maybeSource0, Publisher publisher0, MaybeSource maybeSource1) {
        super(maybeSource0);
        this.a = publisher0;
        this.b = maybeSource1;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        g0 g00 = new g0(maybeObserver0, this.b, 1);
        maybeObserver0.onSubscribe(g00);
        this.a.subscribe(((a0)g00.d));
        this.source.subscribe(g00);
    }
}

