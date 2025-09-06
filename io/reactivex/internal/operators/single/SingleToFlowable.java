package io.reactivex.internal.operators.single;

import gd.c0;
import io.reactivex.Flowable;
import io.reactivex.SingleSource;
import org.reactivestreams.Subscriber;

public final class SingleToFlowable extends Flowable {
    public final SingleSource b;

    public SingleToFlowable(SingleSource singleSource0) {
        this.b = singleSource0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        c0 c00 = new c0(subscriber0);  // 初始化器: Lio/reactivex/internal/subscriptions/DeferredScalarSubscription;-><init>(Lorg/reactivestreams/Subscriber;)V
        this.b.subscribe(c00);
    }
}

