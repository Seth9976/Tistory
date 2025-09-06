package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

public final class ObservableReduceMaybe extends Maybe {
    public final ObservableSource a;
    public final BiFunction b;

    public ObservableReduceMaybe(ObservableSource observableSource0, BiFunction biFunction0) {
        this.a = observableSource0;
        this.b = biFunction0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(maybeObserver0, this.b);
        this.a.subscribe(y0);
    }
}

