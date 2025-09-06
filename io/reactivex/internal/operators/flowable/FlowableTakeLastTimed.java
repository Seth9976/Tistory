package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableTakeLastTimed extends a {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final int f;
    public final boolean g;

    public FlowableTakeLastTimed(Flowable flowable0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, int v2, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = v2;
        this.g = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        r5 r50 = new r5(subscriber0, this.b, this.c, this.d, this.e, this.f, this.g);
        this.source.subscribe(r50);
    }
}

