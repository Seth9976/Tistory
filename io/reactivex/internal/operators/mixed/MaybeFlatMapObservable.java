package io.reactivex.internal.operators.mixed;

import ed.m;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class MaybeFlatMapObservable extends Observable {
    public final MaybeSource a;
    public final Function b;

    public MaybeFlatMapObservable(MaybeSource maybeSource0, Function function0) {
        this.a = maybeSource0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        m m0 = new m(observer0, this.b);
        observer0.onSubscribe(m0);
        this.a.subscribe(m0);
    }
}

