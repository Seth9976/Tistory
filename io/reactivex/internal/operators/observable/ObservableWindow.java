package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableWindow extends a {
    public final long a;
    public final long b;
    public final int c;

    public ObservableWindow(ObservableSource observableSource0, long v, long v1, int v2) {
        super(observableSource0);
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        long v = this.a;
        if(v == this.b) {
            l4 l40 = new l4(observer0, v, this.c);
            this.source.subscribe(l40);
            return;
        }
        m4 m40 = new m4(observer0, this.a, this.b, this.c);
        this.source.subscribe(m40);
    }
}

