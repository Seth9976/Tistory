package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class MaybeFlatMapIterableObservable extends Observable {
    public final MaybeSource a;
    public final Function b;

    public MaybeFlatMapIterableObservable(MaybeSource maybeSource0, Function function0) {
        this.a = maybeSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        v v0 = new v(observer0, this.b);
        this.a.subscribe(v0);
    }
}

