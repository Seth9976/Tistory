package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ObservableToList extends a {
    public final Callable a;

    public ObservableToList(ObservableSource observableSource0, int v) {
        super(observableSource0);
        this.a = Functions.createArrayList(v);
    }

    public ObservableToList(ObservableSource observableSource0, Callable callable0) {
        super(observableSource0);
        this.a = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Collection collection0;
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.a.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        w1 w10 = new w1(observer0, collection0, 2);
        this.source.subscribe(w10);
    }
}

