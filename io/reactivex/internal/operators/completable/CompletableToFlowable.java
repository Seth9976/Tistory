package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import org.reactivestreams.Subscriber;

public final class CompletableToFlowable extends Flowable {
    public final CompletableSource b;

    public CompletableToFlowable(CompletableSource completableSource0) {
        this.b = completableSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SubscriberCompletableObserver subscriberCompletableObserver0 = new SubscriberCompletableObserver(subscriber0);
        this.b.subscribe(subscriberCompletableObserver0);
    }
}

