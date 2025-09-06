package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

public final class MaybeFlatMapBiSelector extends a {
    public final Function a;
    public final BiFunction b;

    public MaybeFlatMapBiSelector(MaybeSource maybeSource0, Function function0, BiFunction biFunction0) {
        super(maybeSource0);
        this.a = function0;
        this.b = biFunction0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        s s0 = new s(maybeObserver0, this.a, this.b);
        this.source.subscribe(s0);
    }
}

