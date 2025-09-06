package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableInterval extends Observable {
    public final Scheduler a;
    public final long b;
    public final long c;
    public final TimeUnit d;

    public ObservableInterval(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        t1 t10 = new t1(observer0);
        observer0.onSubscribe(t10);
        Scheduler scheduler0 = this.a;
        if(scheduler0 instanceof TrampolineScheduler) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            DisposableHelper.setOnce(t10, scheduler$Worker0);
            scheduler$Worker0.schedulePeriodically(t10, this.b, this.c, this.d);
            return;
        }
        DisposableHelper.setOnce(t10, scheduler0.schedulePeriodicallyDirect(t10, this.b, this.c, this.d));
    }
}

