package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;

public final class e extends DefaultObserver {
    public volatile Object b;

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.b = NotificationLite.complete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.b = NotificationLite.error(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.b = object0;
    }
}

