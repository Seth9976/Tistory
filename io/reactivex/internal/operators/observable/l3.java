package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class l3 extends Observable {
    public final Object a;
    public final Function b;

    public l3(Object object0, Function function0) {
        this.a = object0;
        this.b = function0;
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        Object object0;
        ObservableSource observableSource0;
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(this.a), "The mapper returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        if(observableSource0 instanceof Callable) {
            try {
                object0 = ((Callable)observableSource0).call();
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                EmptyDisposable.error(throwable1, observer0);
                return;
            }
            if(object0 == null) {
                EmptyDisposable.complete(observer0);
                return;
            }
            ScalarDisposable observableScalarXMap$ScalarDisposable0 = new ScalarDisposable(observer0, object0);
            observer0.onSubscribe(observableScalarXMap$ScalarDisposable0);
            observableScalarXMap$ScalarDisposable0.run();
            return;
        }
        observableSource0.subscribe(observer0);
    }
}

