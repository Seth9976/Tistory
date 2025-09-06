package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ObservableFromFuture extends Observable {
    public final Future a;
    public final long b;
    public final TimeUnit c;

    public ObservableFromFuture(Future future0, long v, TimeUnit timeUnit0) {
        this.a = future0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object0;
        DeferredScalarDisposable deferredScalarDisposable0 = new DeferredScalarDisposable(observer0);
        observer0.onSubscribe(deferredScalarDisposable0);
        if(!deferredScalarDisposable0.isDisposed()) {
            try {
                object0 = ObjectHelper.requireNonNull((this.c == null ? this.a.get() : this.a.get(this.b, this.c)), "Future returned null");
                goto label_10;
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            if(!deferredScalarDisposable0.isDisposed()) {
                observer0.onError(throwable0);
                return;
            label_10:
                deferredScalarDisposable0.complete(object0);
            }
        }
    }
}

