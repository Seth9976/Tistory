package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableBufferTimed extends a {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final Callable f;
    public final int g;
    public final boolean h;

    public FlowableBufferTimed(Flowable flowable0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, Callable callable0, int v2, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = callable0;
        this.g = v2;
        this.h = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        int v = Long.compare(this.b, this.c);
        if(v == 0 && this.g == 0x7FFFFFFF) {
            u u0 = new u(new SerializedSubscriber(subscriber0), this.f, this.b, this.d, this.e);
            this.source.subscribe(u0);
            return;
        }
        Worker scheduler$Worker0 = this.e.createWorker();
        if(v == 0) {
            t t0 = new t(new SerializedSubscriber(subscriber0), this.f, this.b, this.d, this.g, this.h, scheduler$Worker0);
            this.source.subscribe(t0);
            return;
        }
        w w0 = new w(new SerializedSubscriber(subscriber0), this.f, this.b, this.c, this.d, scheduler$Worker0);
        this.source.subscribe(w0);
    }
}

