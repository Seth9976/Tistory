package io.reactivex.internal.operators.parallel;

import fd.l;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Subscriber;

public final class ParallelPeek extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Consumer b;
    public final Consumer c;
    public final Consumer d;
    public final Action e;
    public final Action f;
    public final Consumer g;
    public final LongConsumer h;
    public final Action i;

    public ParallelPeek(ParallelFlowable parallelFlowable0, Consumer consumer0, Consumer consumer1, Consumer consumer2, Action action0, Action action1, Consumer consumer3, LongConsumer longConsumer0, Action action2) {
        this.a = parallelFlowable0;
        this.b = (Consumer)ObjectHelper.requireNonNull(consumer0, "onNext is null");
        this.c = (Consumer)ObjectHelper.requireNonNull(consumer1, "onAfterNext is null");
        this.d = (Consumer)ObjectHelper.requireNonNull(consumer2, "onError is null");
        this.e = (Action)ObjectHelper.requireNonNull(action0, "onComplete is null");
        this.f = (Action)ObjectHelper.requireNonNull(action1, "onAfterTerminated is null");
        this.g = (Consumer)ObjectHelper.requireNonNull(consumer3, "onSubscribe is null");
        this.h = (LongConsumer)ObjectHelper.requireNonNull(longConsumer0, "onRequest is null");
        this.i = (Action)ObjectHelper.requireNonNull(action2, "onCancel is null");
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
            arr_subscriber1[v] = new l(arr_subscriber[v], this, 2);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

