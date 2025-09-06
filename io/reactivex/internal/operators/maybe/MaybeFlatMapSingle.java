package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.Function;

public final class MaybeFlatMapSingle extends Single {
    public final MaybeSource a;
    public final Function b;

    public MaybeFlatMapSingle(MaybeSource maybeSource0, Function function0) {
        this.a = maybeSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        y y0 = new y(0, singleObserver0, this.b);
        this.a.subscribe(y0);
    }
}

