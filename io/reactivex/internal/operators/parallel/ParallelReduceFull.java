package io.reactivex.internal.operators.parallel;

import fd.o;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelReduceFull extends Flowable {
    public final ParallelFlowable b;
    public final BiFunction c;

    public ParallelReduceFull(ParallelFlowable parallelFlowable0, BiFunction biFunction0) {
        this.b = parallelFlowable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        o o0 = new o(subscriber0, this.b.parallelism(), this.c);
        subscriber0.onSubscribe(o0);
        this.b.subscribe(o0.a);
    }
}

