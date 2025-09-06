package io.reactivex.internal.operators.completable;

import dd.a0;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class CompletableToObservable extends Observable {
    public final CompletableSource a;

    public CompletableToObservable(CompletableSource completableSource0) {
        this.a = completableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        a0 a00 = new a0(observer0);
        this.a.subscribe(a00);
    }
}

