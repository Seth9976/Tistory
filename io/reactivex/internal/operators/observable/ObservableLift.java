package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableOperator;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableLift extends a {
    public final ObservableOperator a;

    public ObservableLift(ObservableSource observableSource0, ObservableOperator observableOperator0) {
        super(observableSource0);
        this.a = observableOperator0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observer observer1;
        try {
            observer1 = (Observer)ObjectHelper.requireNonNull(this.a.apply(observer0), "Operator " + this.a + " returned a null Observer");
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("Actually not, but can\'t throw other exceptions due to RS");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
        this.source.subscribe(observer1);
    }
}

