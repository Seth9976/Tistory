package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;

public final class ObservableCreate extends Observable {
    public final ObservableOnSubscribe a;

    public ObservableCreate(ObservableOnSubscribe observableOnSubscribe0) {
        this.a = observableOnSubscribe0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        j0 j00 = new j0(observer0);
        observer0.onSubscribe(j00);
        try {
            this.a.subscribe(j00);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            j00.onError(throwable0);
        }
    }
}

