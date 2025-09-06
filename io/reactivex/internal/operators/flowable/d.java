package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;

public final class d extends DefaultSubscriber {
    public volatile Object b;

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.b = NotificationLite.complete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.b = NotificationLite.error(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.b = object0;
    }
}

