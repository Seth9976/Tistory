package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiFunction;
import org.reactivestreams.Publisher;

public final class FlowableReduceSeedSingle extends Single {
    public final Publisher a;
    public final Object b;
    public final BiFunction c;

    public FlowableReduceSeedSingle(Publisher publisher0, Object object0, BiFunction biFunction0) {
        this.a = publisher0;
        this.b = object0;
        this.c = biFunction0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        w2 w20 = new w2(singleObserver0, this.c, this.b);
        this.a.subscribe(w20);
    }
}

