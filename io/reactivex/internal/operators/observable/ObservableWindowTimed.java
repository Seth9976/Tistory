package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableWindowTimed extends a {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final long e;
    public final int f;
    public final boolean g;

    public ObservableWindowTimed(ObservableSource observableSource0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, long v2, int v3, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = v2;
        this.f = v3;
        this.g = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        long v = this.a;
        long v1 = this.b;
        if(v == v1) {
            long v2 = this.e;
            if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                u4 u40 = new u4(serializedObserver0, v, this.c, this.d, this.f);
                this.source.subscribe(u40);
                return;
            }
            t4 t40 = new t4(serializedObserver0, v, this.c, this.d, this.f, v2, this.g);
            this.source.subscribe(t40);
            return;
        }
        Worker scheduler$Worker0 = this.d.createWorker();
        w4 w40 = new w4(serializedObserver0, v, v1, this.c, scheduler$Worker0, this.f);
        this.source.subscribe(w40);
    }
}

