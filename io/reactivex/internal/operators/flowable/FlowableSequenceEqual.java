package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiPredicate;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableSequenceEqual extends Flowable {
    interface EqualCoordinatorHelper {
        void drain();

        void innerError(Throwable arg1);
    }

    public final Publisher b;
    public final Publisher c;
    public final BiPredicate d;
    public final int e;

    public FlowableSequenceEqual(Publisher publisher0, Publisher publisher1, BiPredicate biPredicate0, int v) {
        this.b = publisher0;
        this.c = publisher1;
        this.d = biPredicate0;
        this.e = v;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        a5 a50 = new a5(subscriber0, this.e, this.d);
        subscriber0.onSubscribe(a50);
        this.b.subscribe(a50.b);
        this.c.subscribe(a50.c);
    }
}

