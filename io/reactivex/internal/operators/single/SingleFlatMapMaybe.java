package io.reactivex.internal.operators.single;

import gd.h;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleFlatMapMaybe extends Maybe {
    public final SingleSource a;
    public final Function b;

    public SingleFlatMapMaybe(SingleSource singleSource0, Function function0) {
        this.b = function0;
        this.a = singleSource0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        h h0 = new h(2, maybeObserver0, this.b);
        this.a.subscribe(h0);
    }
}

