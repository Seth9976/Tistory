package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableReduceWithSingle extends Single {
    public final ObservableSource a;
    public final Callable b;
    public final BiFunction c;

    public ObservableReduceWithSingle(ObservableSource observableSource0, Callable callable0, BiFunction biFunction0) {
        this.a = observableSource0;
        this.b = callable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The seedSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        x1 x10 = new x1(singleObserver0, this.c, object0);
        this.a.subscribe(x10);
    }
}

