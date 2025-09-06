package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableDelay extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final boolean d;

    public ObservableDelay(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
        this.d = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observer observer1 = this.d ? observer0 : new SerializedObserver(observer0);
        Worker scheduler$Worker0 = this.c.createWorker();
        q0 q00 = new q0(observer1, this.a, this.b, scheduler$Worker0, this.d);
        this.source.subscribe(q00);
    }
}

