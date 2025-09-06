package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableThrottleFirstTimed extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public ObservableThrottleFirstTimed(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(observableSource0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        Worker scheduler$Worker0 = this.c.createWorker();
        a4 a40 = new a4(serializedObserver0, this.a, this.b, scheduler$Worker0);
        this.source.subscribe(a40);
    }
}

