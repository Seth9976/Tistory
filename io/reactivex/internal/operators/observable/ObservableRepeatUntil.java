package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ObservableRepeatUntil extends a {
    public final BooleanSupplier a;

    public ObservableRepeatUntil(Observable observable0, BooleanSupplier booleanSupplier0) {
        super(observable0);
        this.a = booleanSupplier0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        observer0.onSubscribe(sequentialDisposable0);
        n2 n20 = new n2(observer0, this.a, sequentialDisposable0, this.source);
        if(n20.getAndIncrement() == 0) {
            int v = 1;
            while(true) {
                n20.c.subscribe(n20);
                v = n20.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }
}

