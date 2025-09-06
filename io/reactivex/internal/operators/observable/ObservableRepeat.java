package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class ObservableRepeat extends a {
    public final long a;

    public ObservableRepeat(Observable observable0, long v) {
        super(observable0);
        this.a = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
        observer0.onSubscribe(sequentialDisposable0);
        new m2(observer0, (this.a == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : this.a - 1L), sequentialDisposable0, this.source).a();
    }
}

