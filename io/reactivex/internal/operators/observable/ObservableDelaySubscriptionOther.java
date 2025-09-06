package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ObservableDelaySubscriptionOther extends Observable {
    public final ObservableSource a;
    public final ObservableSource b;

    public ObservableDelaySubscriptionOther(ObservableSource observableSource0, ObservableSource observableSource1) {
        this.a = observableSource0;
        this.b = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        observer0.onSubscribe(sequentialDisposable0);
        r0 r00 = new r0(this, sequentialDisposable0, observer0);
        this.b.subscribe(r00);
    }
}

