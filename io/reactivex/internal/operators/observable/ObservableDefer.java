package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableDefer extends Observable {
    public final Callable a;

    public ObservableDefer(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ObservableSource observableSource0;
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.a.call(), "null ObservableSource supplied");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        observableSource0.subscribe(observer0);
    }
}

