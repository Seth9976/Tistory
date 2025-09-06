package io.reactivex.internal.operators.parallel;

import fd.c;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelMapTry extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Function b;
    public final BiFunction c;

    public ParallelMapTry(ParallelFlowable parallelFlowable0, Function function0, BiFunction biFunction0) {
        this.a = parallelFlowable0;
        this.b = function0;
        this.c = biFunction0;
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
            BiFunction biFunction0 = this.c;
            Function function0 = this.b;
            arr_subscriber1[v] = subscriber0 instanceof ConditionalSubscriber ? new c(2, biFunction0, function0, ((ConditionalSubscriber)subscriber0)) : new c(3, biFunction0, function0, subscriber0);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

