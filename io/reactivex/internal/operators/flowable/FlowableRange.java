package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableRange extends Flowable {
    public final int b;
    public final int c;

    public FlowableRange(int v, int v1) {
        this.b = v;
        this.c = v + v1;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        int v = this.c;
        int v1 = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            subscriber0.onSubscribe(new u3(((ConditionalSubscriber)subscriber0), v1, v, 0));
            return;
        }
        subscriber0.onSubscribe(new u3(subscriber0, v1, v, 1));
    }
}

