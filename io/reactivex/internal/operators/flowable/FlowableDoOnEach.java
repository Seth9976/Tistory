package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableDoOnEach extends a {
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;

    public FlowableDoOnEach(Flowable flowable0, Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        super(flowable0);
        this.b = consumer0;
        this.c = consumer1;
        this.d = action0;
        this.e = action1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        if(subscriber0 instanceof ConditionalSubscriber) {
            m1 m10 = new m1(((ConditionalSubscriber)subscriber0), this.b, this.c, this.d, this.e);
            this.source.subscribe(m10);
            return;
        }
        n1 n10 = new n1(subscriber0, this.b, this.c, this.d, this.e);
        this.source.subscribe(n10);
    }
}

