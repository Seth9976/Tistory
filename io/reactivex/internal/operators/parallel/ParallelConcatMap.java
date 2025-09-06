package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelConcatMap extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Function b;
    public final int c;
    public final ErrorMode d;

    public ParallelConcatMap(ParallelFlowable parallelFlowable0, Function function0, int v, ErrorMode errorMode0) {
        this.a = parallelFlowable0;
        this.b = (Function)ObjectHelper.requireNonNull(function0, "mapper");
        this.c = v;
        this.d = (ErrorMode)ObjectHelper.requireNonNull(errorMode0, "errorMode");
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
            arr_subscriber1[v] = FlowableConcatMap.subscribe(arr_subscriber[v], this.b, this.c, this.d);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

