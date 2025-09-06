package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

public final class FlowableNever extends Flowable {
    public static final Flowable INSTANCE;

    static {
        FlowableNever.INSTANCE = new FlowableNever();  // 初始化器: Lio/reactivex/Flowable;-><init>()V
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        subscriber0.onSubscribe(EmptySubscription.INSTANCE);
    }
}

