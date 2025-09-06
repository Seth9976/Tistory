package org.reactivestreams;

public interface Subscriber {
    void onComplete();

    void onError(Throwable arg1);

    void onNext(Object arg1);

    void onSubscribe(Subscription arg1);
}

