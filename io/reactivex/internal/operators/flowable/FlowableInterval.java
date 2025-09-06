package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class FlowableInterval extends Flowable {
    public final Scheduler b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    public FlowableInterval(long v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        s2 s20 = new s2(subscriber0);
        subscriber0.onSubscribe(s20);
        Scheduler scheduler0 = this.b;
        AtomicReference atomicReference0 = s20.c;
        if(scheduler0 instanceof TrampolineScheduler) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            DisposableHelper.setOnce(atomicReference0, scheduler$Worker0);
            scheduler$Worker0.schedulePeriodically(s20, this.c, this.d, this.e);
            return;
        }
        DisposableHelper.setOnce(atomicReference0, scheduler0.schedulePeriodicallyDirect(s20, this.c, this.d, this.e));
    }
}

