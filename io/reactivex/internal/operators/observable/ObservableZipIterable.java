package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Iterator;

public final class ObservableZipIterable extends Observable {
    public final Observable a;
    public final Iterable b;
    public final BiFunction c;

    public ObservableZipIterable(Observable observable0, Iterable iterable0, BiFunction biFunction0) {
        this.a = observable0;
        this.b = iterable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)ObjectHelper.requireNonNull(this.b.iterator(), "The iterator returned by other is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        try {
            if(!iterator0.hasNext()) {
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            EmptyDisposable.error(throwable1, observer0);
            return;
        }
    label_12:
        EmptyDisposable.complete(observer0);
        return;
    label_14:
        y y0 = new y(observer0, iterator0, this.c);
        this.a.subscribe(y0);
    }
}

