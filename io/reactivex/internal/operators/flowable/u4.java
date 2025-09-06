package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class u4 implements FlowableSubscriber {
    public final int a;
    public final AtomicReference b;

    public u4(AtomicReference atomicReference0, int v) {
        this.a = v;
        this.b = atomicReference0;
        super();
    }

    private final void a() {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            return;
        }
        ((t4)this.b).e.cancel();
        ((t4)this.b).a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            SubscriptionHelper.cancel(((u6)this.b).c);
            ((u6)this.b).a.onError(throwable0);
            return;
        }
        ((t4)this.b).e.cancel();
        ((t4)this.b).a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            ((u6)this.b).lazySet(object0);
            return;
        }
        ((t4)this.b).c();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.setOnce(((u6)this.b).e, subscription0)) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        SubscriptionHelper.setOnce(((t4)this.b).d, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

