package io.reactivex.internal.operators.mixed;

import ed.r;
import g.b;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public final class ObservableSwitchMapCompletable extends Completable {
    public final Observable a;
    public final Function b;
    public final boolean c;

    public ObservableSwitchMapCompletable(Observable observable0, Function function0, boolean z) {
        this.a = observable0;
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        Observable observable0 = this.a;
        Function function0 = this.b;
        if(!b.H(observable0, function0, completableObserver0)) {
            observable0.subscribe(new r(completableObserver0, function0, this.c));
        }
    }
}

