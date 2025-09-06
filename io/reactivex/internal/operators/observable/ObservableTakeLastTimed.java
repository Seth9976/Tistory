package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableTakeLastTimed extends a {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final int e;
    public final boolean f;

    public ObservableTakeLastTimed(ObservableSource observableSource0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = v2;
        this.f = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        y3 y30 = new y3(observer0, this.a, this.b, this.c, this.d, this.e, this.f);
        this.source.subscribe(y30);
    }
}

