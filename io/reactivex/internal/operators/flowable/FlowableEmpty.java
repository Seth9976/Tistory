package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

public final class FlowableEmpty extends Flowable implements ScalarCallable {
    public static final Flowable INSTANCE;

    static {
        FlowableEmpty.INSTANCE = new FlowableEmpty();  // 初始化器: Lio/reactivex/Flowable;-><init>()V
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return null;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        EmptySubscription.complete(subscriber0);
    }
}

