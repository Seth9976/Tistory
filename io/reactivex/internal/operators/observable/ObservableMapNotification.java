package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class ObservableMapNotification extends a {
    public final Function a;
    public final Function b;
    public final Callable c;

    public ObservableMapNotification(ObservableSource observableSource0, Function function0, Function function1, Callable callable0) {
        super(observableSource0);
        this.a = function0;
        this.b = function1;
        this.c = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        y1 y10 = new y1(observer0, this.a, this.b, this.c);
        this.source.subscribe(y10);
    }
}

