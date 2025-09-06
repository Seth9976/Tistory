package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class ParallelFromArray extends ParallelFlowable {
    public final Publisher[] a;

    public ParallelFromArray(Publisher[] arr_publisher) {
        this.a = arr_publisher;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.a.length;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber[] arr_subscriber) {
        if(!this.validate(arr_subscriber)) {
            return;
        }
        for(int v = 0; v < arr_subscriber.length; ++v) {
            this.a[v].subscribe(arr_subscriber[v]);
        }
    }
}

