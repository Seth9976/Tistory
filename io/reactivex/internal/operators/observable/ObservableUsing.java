package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableUsing extends Observable {
    public final Callable a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public ObservableUsing(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        this.a = callable0;
        this.b = function0;
        this.c = consumer0;
        this.d = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        ObservableSource observableSource0;
        Object object0;
        Consumer consumer0;
        try {
            consumer0 = this.c;
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The sourceSupplier returned a null ObservableSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            try {
                consumer0.accept(object0);
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                EmptyDisposable.error(new CompositeException(new Throwable[]{throwable1, throwable2}), observer0);
                return;
            }
            EmptyDisposable.error(throwable1, observer0);
            return;
        }
        observableSource0.subscribe(new k4(observer0, object0, consumer0, this.d));
    }
}

