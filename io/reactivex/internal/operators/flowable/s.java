package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.subscribers.DisposableSubscriber;

public final class s extends DisposableSubscriber {
    public final int b;
    public final QueueDrainSubscriber c;

    public s(QueueDrainSubscriber queueDrainSubscriber0, int v) {
        this.b = v;
        super();
        this.c = queueDrainSubscriber0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.b != 0) {
            ((m6)this.c).onComplete();
            return;
        }
        ((r)this.c).onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.b != 0) {
            ((m6)this.c).f0(throwable0);
            return;
        }
        ((r)this.c).onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.b != 0) {
            ((m6)this.c).g0(object0);
            return;
        }
        ((r)this.c).d0();
    }
}

