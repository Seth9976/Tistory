package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;

public final class ObservableLastMaybe extends Maybe {
    public final ObservableSource a;

    public ObservableLastMaybe(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        w1 w10 = new w1(maybeObserver0, 0);
        this.a.subscribe(w10);
    }
}

