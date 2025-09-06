package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;

public final class ObservableObserveOn extends a {
    public final Scheduler a;
    public final boolean b;
    public final int c;

    public ObservableObserveOn(ObservableSource observableSource0, Scheduler scheduler0, boolean z, int v) {
        super(observableSource0);
        this.a = scheduler0;
        this.b = z;
        this.c = v;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Scheduler scheduler0 = this.a;
        if(scheduler0 instanceof TrampolineScheduler) {
            this.source.subscribe(observer0);
            return;
        }
        b2 b20 = new b2(observer0, scheduler0.createWorker(), this.b, this.c);
        this.source.subscribe(b20);
    }
}

