package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.observers.SerializedObserver;

public final class ObservableSkipUntil extends a {
    public final ObservableSource a;

    public ObservableSkipUntil(ObservableSource observableSource0, ObservableSource observableSource1) {
        super(observableSource0);
        this.a = observableSource1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        ArrayCompositeDisposable arrayCompositeDisposable0 = new ArrayCompositeDisposable(2);
        serializedObserver0.onSubscribe(arrayCompositeDisposable0);
        s3 s30 = new s3(serializedObserver0, arrayCompositeDisposable0);
        r3 r30 = new r3(arrayCompositeDisposable0, s30, serializedObserver0);
        this.a.subscribe(r30);
        this.source.subscribe(s30);
    }
}

