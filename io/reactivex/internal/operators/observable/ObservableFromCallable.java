package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class ObservableFromCallable extends Observable implements Callable {
    public final Callable a;

    public ObservableFromCallable(Callable callable0) {
        this.a = callable0;
    }

    @Override
    public Object call() throws Exception {
        return ObjectHelper.requireNonNull(this.a.call(), "The callable returned a null value");
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object0;
        DeferredScalarDisposable deferredScalarDisposable0 = new DeferredScalarDisposable(observer0);
        observer0.onSubscribe(deferredScalarDisposable0);
        if(deferredScalarDisposable0.isDisposed()) {
            return;
        }
        try {
            object0 = ObjectHelper.requireNonNull(this.a.call(), "Callable returned null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            if(!deferredScalarDisposable0.isDisposed()) {
                observer0.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        deferredScalarDisposable0.complete(object0);
    }
}

