package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableFromUnsafeSource extends Observable {
    public final ObservableSource a;

    public ObservableFromUnsafeSource(ObservableSource observableSource0) {
        this.a = observableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        this.a.subscribe(observer0);
    }
}

