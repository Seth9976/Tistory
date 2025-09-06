package io.reactivex.internal.operators.flowable;

import io.reactivex.Notification;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.plugins.RxJavaPlugins;

public final class z2 extends SinglePostCompleteSubscriber {
    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.complete(Notification.createOnComplete());
    }

    @Override  // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
    public final void onDrop(Object object0) {
        if(((Notification)object0).isOnError()) {
            RxJavaPlugins.onError(((Notification)object0).getError());
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.complete(Notification.createOnError(throwable0));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.produced;
        Notification notification0 = Notification.createOnNext(object0);
        this.downstream.onNext(notification0);
    }
}

