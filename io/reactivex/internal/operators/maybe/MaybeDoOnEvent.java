package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.BiConsumer;

public final class MaybeDoOnEvent extends a {
    public final BiConsumer a;

    public MaybeDoOnEvent(MaybeSource maybeSource0, BiConsumer biConsumer0) {
        super(maybeSource0);
        this.a = biConsumer0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        k k0 = new k(2, maybeObserver0, this.a);
        this.source.subscribe(k0);
    }
}

