package io.reactivex.internal.operators.flowable;

import ed.d;
import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import org.reactivestreams.Subscriber;

public final class FlowableMergeWithMaybe extends a {
    public final MaybeSource b;

    public FlowableMergeWithMaybe(Flowable flowable0, MaybeSource maybeSource0) {
        super(flowable0);
        this.b = maybeSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        b3 b30 = new b3(subscriber0, 0);
        subscriber0.onSubscribe(b30);
        this.source.subscribe(b30);
        this.b.subscribe(((d)b30.o));
    }
}

