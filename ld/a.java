package ld;

import io.reactivex.FlowableSubscriber;
import org.reactivestreams.Subscription;

public enum a implements FlowableSubscriber {
    INSTANCE;

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
    }
}

