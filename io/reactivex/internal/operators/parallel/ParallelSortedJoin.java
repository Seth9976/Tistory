package io.reactivex.internal.operators.parallel;

import fd.v;
import io.reactivex.Flowable;
import io.reactivex.parallel.ParallelFlowable;
import java.util.Comparator;
import org.reactivestreams.Subscriber;

public final class ParallelSortedJoin extends Flowable {
    public final ParallelFlowable b;
    public final Comparator c;

    public ParallelSortedJoin(ParallelFlowable parallelFlowable0, Comparator comparator0) {
        this.b = parallelFlowable0;
        this.c = comparator0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        v v0 = new v(subscriber0, this.b.parallelism(), this.c);
        subscriber0.onSubscribe(v0);
        this.b.subscribe(v0.b);
    }
}

