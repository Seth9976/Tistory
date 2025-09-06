package io.reactivex.internal.operators.parallel;

import fd.h;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class ParallelFromPublisher extends ParallelFlowable {
    public final Publisher a;
    public final int b;
    public final int c;

    public ParallelFromPublisher(Publisher publisher0, int v, int v1) {
        this.a = publisher0;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.b;
    }

    @Override  // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber[] arr_subscriber) {
        if(!this.validate(arr_subscriber)) {
            return;
        }
        h h0 = new h(arr_subscriber, this.c);
        this.a.subscribe(h0);
    }
}

