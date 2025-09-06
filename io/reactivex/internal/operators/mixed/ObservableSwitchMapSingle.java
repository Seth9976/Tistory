package io.reactivex.internal.operators.mixed;

import ed.v;
import g.b;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

public final class ObservableSwitchMapSingle extends Observable {
    public final Observable a;
    public final Function b;
    public final boolean c;

    public ObservableSwitchMapSingle(Observable observable0, Function function0, boolean z) {
        this.a = observable0;
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observable observable0 = this.a;
        Function function0 = this.b;
        if(!b.J(observable0, function0, observer0)) {
            observable0.subscribe(new v(observer0, function0, this.c));
        }
    }
}

