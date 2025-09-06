package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;

public final class ObservableIntervalRange extends Observable {
    public final Scheduler a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public ObservableIntervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.d = v2;
        this.e = v3;
        this.f = timeUnit0;
        this.a = scheduler0;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        u1 u10 = new u1(observer0, this.b, this.c);
        observer0.onSubscribe(u10);
        Scheduler scheduler0 = this.a;
        if(scheduler0 instanceof TrampolineScheduler) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            DisposableHelper.setOnce(u10, scheduler$Worker0);
            scheduler$Worker0.schedulePeriodically(u10, this.d, this.e, this.f);
            return;
        }
        DisposableHelper.setOnce(u10, scheduler0.schedulePeriodicallyDirect(u10, this.d, this.e, this.f));
    }
}

