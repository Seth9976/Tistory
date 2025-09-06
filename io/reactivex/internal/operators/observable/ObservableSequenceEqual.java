package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;

public final class ObservableSequenceEqual extends Observable {
    public final ObservableSource a;
    public final ObservableSource b;
    public final BiPredicate c;
    public final int d;

    public ObservableSequenceEqual(ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0, int v) {
        this.a = observableSource0;
        this.b = observableSource1;
        this.c = biPredicate0;
        this.d = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        n3 n30 = new n3(observer0, this.d, this.a, this.b, this.c);
        observer0.onSubscribe(n30);
        n30.d.subscribe(((o3[])n30.j)[0]);
        n30.e.subscribe(((o3[])n30.j)[1]);
    }
}

