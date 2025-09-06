package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public final class ObservableTimeoutTimed extends a {
    interface TimeoutSupport {
        void onTimeout(long arg1);
    }

    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final ObservableSource d;

    public ObservableTimeoutTimed(Observable observable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, ObservableSource observableSource0) {
        super(observable0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
        this.d = observableSource0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Scheduler scheduler0 = this.c;
        if(this.d == null) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            h4 h40 = new h4(observer0, this.a, this.b, scheduler$Worker0);
            observer0.onSubscribe(h40);
            i4 i40 = new i4(0L, h40);
            Disposable disposable0 = h40.d.schedule(i40, h40.b, h40.c);
            h40.e.replace(disposable0);
            this.source.subscribe(h40);
            return;
        }
        Worker scheduler$Worker1 = scheduler0.createWorker();
        g4 g40 = new g4(observer0, this.a, this.b, scheduler$Worker1, this.d);
        observer0.onSubscribe(g40);
        i4 i41 = new i4(0L, g40);
        Disposable disposable1 = g40.d.schedule(i41, g40.b, g40.c);
        g40.e.replace(disposable1);
        this.source.subscribe(g40);
    }
}

