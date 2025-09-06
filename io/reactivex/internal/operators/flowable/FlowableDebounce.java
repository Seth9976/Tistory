package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableDebounce extends a {
    public final Function b;

    public FlowableDebounce(Flowable flowable0, Function function0) {
        super(flowable0);
        this.b = function0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        x0 x00 = new x0(new SerializedSubscriber(subscriber0), this.b);
        this.source.subscribe(x00);
    }
}

