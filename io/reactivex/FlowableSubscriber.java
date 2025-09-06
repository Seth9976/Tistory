package io.reactivex;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public interface FlowableSubscriber extends Subscriber {
    @Override  // org.reactivestreams.Subscriber
    void onSubscribe(@NonNull Subscription arg1);
}

