package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableThrottleFirstTimed extends a {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public FlowableThrottleFirstTimed(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        Worker scheduler$Worker0 = this.d.createWorker();
        t5 t50 = new t5(serializedSubscriber0, this.b, this.c, scheduler$Worker0);
        this.source.subscribe(t50);
    }
}

