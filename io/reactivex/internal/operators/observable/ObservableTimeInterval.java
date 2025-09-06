package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableTimeInterval extends a {
    public final Scheduler a;
    public final TimeUnit b;

    public ObservableTimeInterval(ObservableSource observableSource0, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(observableSource0);
        this.a = scheduler0;
        this.b = timeUnit0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        c4 c40 = new c4(observer0, this.b, this.a);
        this.source.subscribe(c40);
    }
}

