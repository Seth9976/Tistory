package io.reactivex.internal.operators.flowable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import org.reactivestreams.Publisher;

public final class FlowableLastMaybe extends Maybe {
    public final Publisher a;

    public FlowableLastMaybe(Publisher publisher0) {
        this.a = publisher0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        v2 v20 = new v2(maybeObserver0);
        this.a.subscribe(v20);
    }
}

