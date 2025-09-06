package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableWithLatestFrom extends a {
    public final BiFunction b;
    public final Publisher c;

    public FlowableWithLatestFrom(Flowable flowable0, BiFunction biFunction0, Publisher publisher0) {
        super(flowable0);
        this.b = biFunction0;
        this.c = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        u6 u60 = new u6(serializedSubscriber0, this.b);
        serializedSubscriber0.onSubscribe(u60);
        u4 u40 = new u4(u60, 1);
        this.c.subscribe(u40);
        this.source.subscribe(u60);
    }
}

