package io.reactivex.internal.operators.parallel;

import fd.d;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelFilter extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Predicate b;

    public ParallelFilter(ParallelFlowable parallelFlowable0, Predicate predicate0) {
        this.a = parallelFlowable0;
        this.b = predicate0;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.a.parallelism();
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber[] arr_subscriber) {
        if(!this.validate(arr_subscriber)) {
            return;
        }
        Subscriber[] arr_subscriber1 = new Subscriber[arr_subscriber.length];
        for(int v = 0; v < arr_subscriber.length; ++v) {
            Subscriber subscriber0 = arr_subscriber[v];
            Predicate predicate0 = this.b;
            arr_subscriber1[v] = subscriber0 instanceof ConditionalSubscriber ? new d(((ConditionalSubscriber)subscriber0), predicate0, 0) : new d(subscriber0, predicate0, 1);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

