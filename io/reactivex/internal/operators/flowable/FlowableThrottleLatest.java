package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableThrottleLatest extends a {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public FlowableThrottleLatest(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Worker scheduler$Worker0 = this.d.createWorker();
        u5 u50 = new u5(subscriber0, this.b, this.c, scheduler$Worker0, this.e);
        this.source.subscribe(u50);
    }
}

