package io.reactivex.internal.operators.single;

import gd.i;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.annotations.Experimental;
import io.reactivex.functions.Function;

@Experimental
public final class SingleDematerialize extends Maybe {
    public final Single a;
    public final Function b;

    public SingleDematerialize(Single single0, Function function0) {
        this.a = single0;
        this.b = function0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        i i0 = new i(0, maybeObserver0, this.b);
        this.a.subscribe(i0);
    }
}

