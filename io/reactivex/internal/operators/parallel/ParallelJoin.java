package io.reactivex.internal.operators.parallel;

import fd.j;
import io.reactivex.Flowable;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelJoin extends Flowable {
    public final ParallelFlowable b;
    public final int c;
    public final boolean d;

    public ParallelJoin(ParallelFlowable parallelFlowable0, int v, boolean z) {
        this.b = parallelFlowable0;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        j j0 = this.d ? new j(subscriber0, this.b.parallelism(), this.c, 1) : new j(subscriber0, this.b.parallelism(), this.c, 0);
        subscriber0.onSubscribe(j0);
        this.b.subscribe(j0.b);
    }
}

