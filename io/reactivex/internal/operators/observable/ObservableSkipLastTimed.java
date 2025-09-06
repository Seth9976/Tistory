package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableSkipLastTimed extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final int d;
    public final boolean e;

    public ObservableSkipLastTimed(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
        this.d = v1;
        this.e = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        q3 q30 = new q3(observer0, this.a, this.b, this.c, this.d, this.e);
        this.source.subscribe(q30);
    }
}

