package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

public final class MaybeFlatMapSingleElement extends Maybe {
    public final MaybeSource a;
    public final Function b;

    public MaybeFlatMapSingleElement(MaybeSource maybeSource0, Function function0) {
        this.a = maybeSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(1, maybeObserver0, this.b);
        this.a.subscribe(y0);
    }
}

