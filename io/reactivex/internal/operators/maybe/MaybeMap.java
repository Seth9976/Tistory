package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

public final class MaybeMap extends a {
    public final Function a;

    public MaybeMap(MaybeSource maybeSource0, Function function0) {
        super(maybeSource0);
        this.a = function0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        a0 a00 = new a0(0, maybeObserver0, this.a);
        this.source.subscribe(a00);
    }
}

