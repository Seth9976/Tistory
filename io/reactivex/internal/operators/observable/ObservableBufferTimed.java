package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class ObservableBufferTimed extends a {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Callable e;
    public final int f;
    public final boolean g;

    public ObservableBufferTimed(ObservableSource observableSource0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, Callable callable0, int v2, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = callable0;
        this.f = v2;
        this.g = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        int v = Long.compare(this.a, this.b);
        if(v == 0 && this.f == 0x7FFFFFFF) {
            t t0 = new t(new SerializedObserver(observer0), this.e, this.a, this.c, this.d);
            this.source.subscribe(t0);
            return;
        }
        Worker scheduler$Worker0 = this.d.createWorker();
        if(v == 0) {
            s s0 = new s(new SerializedObserver(observer0), this.e, this.a, this.c, this.f, this.g, scheduler$Worker0);
            this.source.subscribe(s0);
            return;
        }
        w w0 = new w(new SerializedObserver(observer0), this.e, this.a, this.b, this.c, scheduler$Worker0);
        this.source.subscribe(w0);
    }
}

