package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableSkipLastTimed extends a {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final int e;
    public final boolean f;

    public FlowableSkipLastTimed(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = v1;
        this.f = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        g5 g50 = new g5(subscriber0, this.b, this.c, this.d, this.e, this.f);
        this.source.subscribe(g50);
    }
}

