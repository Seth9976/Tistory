package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.internal.operators.flowable.v2;
import org.reactivestreams.Publisher;

public final class MaybeDelaySubscriptionOtherPublisher extends a {
    public final Publisher a;

    public MaybeDelaySubscriptionOtherPublisher(MaybeSource maybeSource0, Publisher publisher0) {
        super(maybeSource0);
        this.a = publisher0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        v2 v20 = new v2(maybeObserver0, this.source);
        this.a.subscribe(v20);
    }
}

