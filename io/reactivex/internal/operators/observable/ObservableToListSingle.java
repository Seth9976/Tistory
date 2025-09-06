package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ObservableToListSingle extends Single implements FuseToObservable {
    public final ObservableSource a;
    public final Callable b;

    public ObservableToListSingle(ObservableSource observableSource0, int v) {
        this.a = observableSource0;
        this.b = Functions.createArrayList(v);
    }

    public ObservableToListSingle(ObservableSource observableSource0, Callable callable0) {
        this.a = observableSource0;
        this.b = callable0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToObservable
    public Observable fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.a, this.b));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Collection collection0;
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        w1 w10 = new w1(singleObserver0, collection0, 3);
        this.a.subscribe(w10);
    }
}

