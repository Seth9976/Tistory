package io.reactivex.internal.operators.mixed;

import ed.a;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class CompletableAndThenObservable extends Observable {
    public final CompletableSource a;
    public final ObservableSource b;

    public CompletableAndThenObservable(CompletableSource completableSource0, ObservableSource observableSource0) {
        this.a = completableSource0;
        this.b = observableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        a a0 = new a(this.b, observer0);
        observer0.onSubscribe(a0);
        this.a.subscribe(a0);
    }
}

