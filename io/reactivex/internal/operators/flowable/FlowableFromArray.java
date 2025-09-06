package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableFromArray extends Flowable {
    public final Object[] b;

    public FlowableFromArray(Object[] arr_object) {
        this.b = arr_object;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Object[] arr_object = this.b;
        if(subscriber0 instanceof ConditionalSubscriber) {
            subscriber0.onSubscribe(new b2(((ConditionalSubscriber)subscriber0), arr_object, 0));
            return;
        }
        subscriber0.onSubscribe(new b2(subscriber0, arr_object, 1));
    }
}

