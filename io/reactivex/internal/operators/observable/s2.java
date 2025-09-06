package io.reactivex.internal.operators.observable;

import cd.a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.Callable;

public final class s2 extends Observable {
    public final Callable a;
    public final Function b;

    public s2(Callable callable0, Function function0) {
        this.a = callable0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        ObservableSource observableSource0;
        ConnectableObservable connectableObservable0;
        try {
            connectableObservable0 = (ConnectableObservable)ObjectHelper.requireNonNull(this.a.call(), "The connectableFactory returned a null ConnectableObservable");
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(connectableObservable0), "The selector returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        ObserverResourceWrapper observerResourceWrapper0 = new ObserverResourceWrapper(observer0);
        observableSource0.subscribe(observerResourceWrapper0);
        connectableObservable0.connect(new a(observerResourceWrapper0, 3));
    }
}

