package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class FlowableIntervalRange extends Flowable {
    public final Scheduler b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final TimeUnit g;

    public FlowableIntervalRange(long v, long v1, long v2, long v3, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.e = v2;
        this.f = v3;
        this.g = timeUnit0;
        this.b = scheduler0;
        this.c = v;
        this.d = v1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        t2 t20 = new t2(subscriber0, this.c, this.d);
        subscriber0.onSubscribe(t20);
        Scheduler scheduler0 = this.b;
        AtomicReference atomicReference0 = t20.d;
        if(scheduler0 instanceof TrampolineScheduler) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            DisposableHelper.setOnce(atomicReference0, scheduler$Worker0);
            scheduler$Worker0.schedulePeriodically(t20, this.e, this.f, this.g);
            return;
        }
        DisposableHelper.setOnce(atomicReference0, scheduler0.schedulePeriodicallyDirect(t20, this.e, this.f, this.g));
    }
}

