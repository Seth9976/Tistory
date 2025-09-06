package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;

public final class ObservableUnsubscribeOn extends a {
    public final Scheduler a;

    public ObservableUnsubscribeOn(ObservableSource observableSource0, Scheduler scheduler0) {
        super(observableSource0);
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        j4 j40 = new j4(observer0, this.a);
        this.source.subscribe(j40);
    }
}

