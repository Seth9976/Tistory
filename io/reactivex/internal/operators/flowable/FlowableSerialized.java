package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableSerialized extends a {
    public FlowableSerialized(Flowable flowable0) {
        super(flowable0);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        this.source.subscribe(serializedSubscriber0);
    }
}

