package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

public final class BlockingFirstSubscriber extends BlockingBaseSubscriber {
    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.a == null) {
            this.b = throwable0;
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
        this.countDown();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.a == null) {
            this.a = object0;
            this.c.cancel();
            this.countDown();
        }
    }
}

