package io.reactivex.internal.operators.parallel;

import fd.k;
import fd.l;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelMap extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Function b;

    public ParallelMap(ParallelFlowable parallelFlowable0, Function function0) {
        this.a = parallelFlowable0;
        this.b = function0;
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
            Function function0 = this.b;
            arr_subscriber1[v] = subscriber0 instanceof ConditionalSubscriber ? new k(((ConditionalSubscriber)subscriber0), function0) : new l(subscriber0, function0, 0);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

