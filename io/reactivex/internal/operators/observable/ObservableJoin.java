package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

public final class ObservableJoin extends a {
    public final ObservableSource a;
    public final Function b;
    public final Function c;
    public final BiFunction d;

    public ObservableJoin(ObservableSource observableSource0, ObservableSource observableSource1, Function function0, Function function1, BiFunction biFunction0) {
        super(observableSource0);
        this.a = observableSource1;
        this.b = function0;
        this.c = function1;
        this.d = biFunction0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        v1 v10 = new v1(observer0, this.b, this.c, this.d);
        observer0.onSubscribe(v10);
        q1 q10 = new q1(v10, true);
        v10.c.add(q10);
        q1 q11 = new q1(v10, false);
        v10.c.add(q11);
        this.source.subscribe(q10);
        this.a.subscribe(q11);
    }
}

