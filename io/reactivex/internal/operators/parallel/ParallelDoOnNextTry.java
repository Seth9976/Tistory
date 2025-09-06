package io.reactivex.internal.operators.parallel;

import fd.c;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelDoOnNextTry extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Consumer b;
    public final BiFunction c;

    public ParallelDoOnNextTry(ParallelFlowable parallelFlowable0, Consumer consumer0, BiFunction biFunction0) {
        this.a = parallelFlowable0;
        this.b = consumer0;
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
            Consumer consumer0 = this.b;
            arr_subscriber1[v] = subscriber0 instanceof ConditionalSubscriber ? new c(0, biFunction0, consumer0, ((ConditionalSubscriber)subscriber0)) : new c(1, biFunction0, consumer0, subscriber0);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

