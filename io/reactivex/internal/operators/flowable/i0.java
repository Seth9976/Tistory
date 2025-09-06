package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;

public final class i0 extends SubscriptionArbiter implements FlowableSubscriber {
    public final f0 h;
    public long i;

    public i0(f0 f00) {
        super(false);
        this.h = f00;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        long v = this.i;
        if(v != 0L) {
            this.i = 0L;
            this.produced(v);
        }
        this.h.innerComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        long v = this.i;
        if(v != 0L) {
            this.i = 0L;
            this.produced(v);
        }
        this.h.innerError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.i;
        this.h.innerNext(object0);
    }
}

