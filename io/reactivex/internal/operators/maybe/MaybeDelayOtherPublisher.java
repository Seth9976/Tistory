package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import org.reactivestreams.Publisher;

public final class MaybeDelayOtherPublisher extends a {
    public final Publisher a;

    public MaybeDelayOtherPublisher(MaybeSource maybeSource0, Publisher publisher0) {
        super(maybeSource0);
        this.a = publisher0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        k k0 = new k(maybeObserver0, this.a);
        this.source.subscribe(k0);
    }
}

