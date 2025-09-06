package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableThrottleLatest extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final boolean d;

    public ObservableThrottleLatest(Observable observable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(observable0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
        this.d = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Worker scheduler$Worker0 = this.c.createWorker();
        b4 b40 = new b4(observer0, this.a, this.b, scheduler$Worker0, this.d);
        this.source.subscribe(b40);
    }
}

