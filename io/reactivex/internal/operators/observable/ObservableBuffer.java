package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.concurrent.Callable;

public final class ObservableBuffer extends a {
    public final int a;
    public final int b;
    public final Callable c;

    public ObservableBuffer(ObservableSource observableSource0, int v, int v1, Callable callable0) {
        super(observableSource0);
        this.a = v;
        this.b = v1;
        this.c = callable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Callable callable0 = this.c;
        int v = this.b;
        int v1 = this.a;
        if(v == v1) {
            k k0 = new k(observer0, v1, callable0);
            if(k0.a()) {
                this.source.subscribe(k0);
            }
        }
        else {
            l l0 = new l(observer0, v1, v, callable0);
            this.source.subscribe(l0);
        }
    }
}

