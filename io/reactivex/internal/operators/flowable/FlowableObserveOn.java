package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableObserveOn extends a {
    public final Scheduler b;
    public final boolean c;
    public final int d;

    public FlowableObserveOn(Flowable flowable0, Scheduler scheduler0, boolean z, int v) {
        super(flowable0);
        this.b = scheduler0;
        this.c = z;
        this.d = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Worker scheduler$Worker0 = this.b.createWorker();
        int v = this.d;
        boolean z = this.c;
        if(subscriber0 instanceof ConditionalSubscriber) {
            d3 d30 = new d3(((ConditionalSubscriber)subscriber0), scheduler$Worker0, z, v);
            this.source.subscribe(d30);
            return;
        }
        e3 e30 = new e3(subscriber0, scheduler$Worker0, z, v);
        this.source.subscribe(e30);
    }
}

