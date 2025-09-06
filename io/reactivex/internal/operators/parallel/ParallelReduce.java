package io.reactivex.internal.operators.parallel;

import fd.a;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

public final class ParallelReduce extends ParallelFlowable {
    public final ParallelFlowable a;
    public final Callable b;
    public final BiFunction c;

    public ParallelReduce(ParallelFlowable parallelFlowable0, Callable callable0, BiFunction biFunction0) {
        this.a = parallelFlowable0;
        this.b = callable0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.a.parallelism();
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber[] arr_subscriber) {
        Object object0;
        if(!this.validate(arr_subscriber)) {
            return;
        }
        Subscriber[] arr_subscriber1 = new Subscriber[arr_subscriber.length];
        for(int v1 = 0; v1 < arr_subscriber.length; ++v1) {
            try {
                object0 = ObjectHelper.requireNonNull(this.b.call(), "The initialSupplier returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                for(int v = 0; v < arr_subscriber.length; ++v) {
                    EmptySubscription.error(throwable0, arr_subscriber[v]);
                }
                return;
            }
            arr_subscriber1[v1] = new a(arr_subscriber[v1], object0, this.c, 1);
        }
        this.a.subscribe(arr_subscriber1);
    }
}

