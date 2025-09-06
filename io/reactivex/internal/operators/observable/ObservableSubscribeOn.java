package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSubscribeOn extends a {
    public final Scheduler a;

    public ObservableSubscribeOn(ObservableSource observableSource0, Scheduler scheduler0) {
        super(observableSource0);
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        j2 j20 = new j2(observer0, 1);
        observer0.onSubscribe(j20);
        t3 t30 = new t3(0, this, j20);
        DisposableHelper.setOnce(j20, this.a.scheduleDirect(t30));
    }
}

