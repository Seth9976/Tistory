package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ObservableDistinct extends a {
    public final Function a;
    public final Callable b;

    public ObservableDistinct(ObservableSource observableSource0, Function function0, Callable callable0) {
        super(observableSource0);
        this.a = function0;
        this.b = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Collection collection0;
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        u0 u00 = new u0(observer0, this.a, collection0);
        this.source.subscribe(u00);
    }
}

