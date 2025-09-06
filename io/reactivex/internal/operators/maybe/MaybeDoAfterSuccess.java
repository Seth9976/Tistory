package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Consumer;

public final class MaybeDoAfterSuccess extends a {
    public final Consumer a;

    public MaybeDoAfterSuccess(MaybeSource maybeSource0, Consumer consumer0) {
        super(maybeSource0);
        this.a = consumer0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        k k0 = new k(1, maybeObserver0, this.a);
        this.source.subscribe(k0);
    }
}

