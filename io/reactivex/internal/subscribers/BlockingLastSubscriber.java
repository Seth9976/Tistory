package io.reactivex.internal.subscribers;

public final class BlockingLastSubscriber extends BlockingBaseSubscriber {
    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        this.a = null;
        this.b = throwable0;
        this.countDown();
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        this.a = object0;
    }
}

