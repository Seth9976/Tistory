package io.reactivex.internal.operators.mixed;

import ed.o;
import g.b;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class ObservableConcatMapCompletable extends Completable {
    public final Observable a;
    public final Function b;
    public final ErrorMode c;
    public final int d;

    public ObservableConcatMapCompletable(Observable observable0, Function function0, ErrorMode errorMode0, int v) {
        this.a = observable0;
        this.b = function0;
        this.c = errorMode0;
        this.d = v;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        Observable observable0 = this.a;
        Function function0 = this.b;
        if(!b.H(observable0, function0, completableObserver0)) {
            observable0.subscribe(new o(completableObserver0, function0, this.c, this.d));
        }
    }
}

