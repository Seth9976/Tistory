package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableScanSeed extends a {
    public final BiFunction a;
    public final Callable b;

    public ObservableScanSeed(ObservableSource observableSource0, Callable callable0, BiFunction biFunction0) {
        super(observableSource0);
        this.a = biFunction0;
        this.b = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The seed supplied is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        m3 m30 = new m3(observer0, this.a, object0);
        this.source.subscribe(m30);
    }
}

