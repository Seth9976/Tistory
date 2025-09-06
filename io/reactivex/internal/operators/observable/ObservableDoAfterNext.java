package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

public final class ObservableDoAfterNext extends a {
    public final Consumer a;

    public ObservableDoAfterNext(ObservableSource observableSource0, Consumer consumer0) {
        super(observableSource0);
        this.a = consumer0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        w0 w00 = new w0(observer0, this.a, 0);
        this.source.subscribe(w00);
    }
}

