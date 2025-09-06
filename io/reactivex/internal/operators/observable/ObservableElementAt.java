package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class ObservableElementAt extends a {
    public final long a;
    public final Object b;
    public final boolean c;

    public ObservableElementAt(ObservableSource observableSource0, long v, Object object0, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = object0;
        this.c = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        z0 z00 = new z0(observer0, this.a, this.b, this.c);
        this.source.subscribe(z00);
    }
}

