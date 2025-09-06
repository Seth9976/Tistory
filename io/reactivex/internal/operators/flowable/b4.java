package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.io.Serializable;

public final class b4 extends SubscriptionArbiter implements FlowableSubscriber {
    public final SerializedSubscriber h;
    public final FlowableProcessor i;
    public final c4 j;
    public long k;
    public final int l;

    public b4(SerializedSubscriber serializedSubscriber0, FlowableProcessor flowableProcessor0, c4 c40, int v) {
        this.l = v;
        super(false);
        this.h = serializedSubscriber0;
        this.i = flowableProcessor0;
        this.j = c40;
    }

    public final void b(Serializable serializable0) {
        this.setSubscription(EmptySubscription.INSTANCE);
        long v = this.k;
        if(v != 0L) {
            this.k = 0L;
            this.produced(v);
        }
        this.j.request(1L);
        this.i.onNext(serializable0);
    }

    @Override  // io.reactivex.internal.subscriptions.SubscriptionArbiter
    public final void cancel() {
        super.cancel();
        this.j.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.l != 0) {
            this.j.cancel();
            this.h.onComplete();
            return;
        }
        this.b(0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.l != 0) {
            this.b(throwable0);
            return;
        }
        this.j.cancel();
        this.h.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        ++this.k;
        this.h.onNext(object0);
    }
}

