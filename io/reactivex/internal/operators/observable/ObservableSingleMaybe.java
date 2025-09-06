package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;

public final class ObservableSingleMaybe extends Maybe {
    public final ObservableSource a;

    public ObservableSingleMaybe(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        s0 s00 = new s0(maybeObserver0);
        this.a.subscribe(s00);
    }
}

