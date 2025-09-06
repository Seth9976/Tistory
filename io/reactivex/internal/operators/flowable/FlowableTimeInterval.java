package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableTimeInterval extends a {
    public final Scheduler b;
    public final TimeUnit c;

    public FlowableTimeInterval(Flowable flowable0, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(flowable0);
        this.b = scheduler0;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        v5 v50 = new v5(subscriber0, this.c, this.b);
        this.source.subscribe(v50);
    }
}

