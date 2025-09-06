package io.reactivex.internal.operators.mixed;

import ed.p;
import g.b;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class ObservableConcatMapMaybe extends Observable {
    public final Observable a;
    public final Function b;
    public final ErrorMode c;
    public final int d;

    public ObservableConcatMapMaybe(Observable observable0, Function function0, ErrorMode errorMode0, int v) {
        this.a = observable0;
        this.b = function0;
        this.c = errorMode0;
        this.d = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observable observable0 = this.a;
        Function function0 = this.b;
        if(!b.I(observable0, function0, observer0)) {
            observable0.subscribe(new p(this.d, 0, observer0, function0, this.c));
        }
    }
}

