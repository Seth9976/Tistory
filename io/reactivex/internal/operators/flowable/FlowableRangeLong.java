package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableRangeLong extends Flowable {
    public final long b;
    public final long c;

    public FlowableRangeLong(long v, long v1) {
        this.b = v;
        this.c = v + v1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        if(subscriber0 instanceof ConditionalSubscriber) {
            subscriber0.onSubscribe(new v3(((ConditionalSubscriber)subscriber0), this.b, this.c, 0));
            return;
        }
        subscriber0.onSubscribe(new v3(subscriber0, this.b, this.c, 1));
    }
}

