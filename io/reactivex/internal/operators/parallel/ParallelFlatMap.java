package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelFlatMap extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Function b;
    public final boolean c;
    public final int d;
    public final int e;

    public ParallelFlatMap(ParallelFlowable parallelFlowable0, Function function0, boolean z, int v, int v1) {
        this.a = parallelFlowable0;
        this.b = function0;
        this.c = z;
        this.d = v;
        this.e = v1;
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
            arr_subscriber1[v] = FlowableFlatMap.subscribe(arr_subscriber[v], this.b, this.c, this.d, this.e);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

