package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableWindowTimed extends a {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final long f;
    public final int g;
    public final boolean h;

    public FlowableWindowTimed(Flowable flowable0, long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0, long v2, int v3, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = scheduler0;
        this.f = v2;
        this.g = v3;
        this.h = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        long v = this.b;
        long v1 = this.c;
        if(v == v1) {
            long v2 = this.f;
            if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                r6 r60 = new r6(serializedSubscriber0, v, this.d, this.e, this.g);
                this.source.subscribe(r60);
                return;
            }
            q6 q60 = new q6(serializedSubscriber0, v, this.d, this.e, this.g, v2, this.h);
            this.source.subscribe(q60);
            return;
        }
        Worker scheduler$Worker0 = this.e.createWorker();
        t6 t60 = new t6(serializedSubscriber0, v, v1, this.d, scheduler$Worker0, this.g);
        this.source.subscribe(t60);
    }
}

