package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableDelay extends a {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public FlowableDelay(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Subscriber subscriber1 = this.e ? subscriber0 : new SerializedSubscriber(subscriber0);
        Worker scheduler$Worker0 = this.d.createWorker();
        c1 c10 = new c1(subscriber1, this.b, this.c, scheduler$Worker0, this.e);
        this.source.subscribe(c10);
    }
}

