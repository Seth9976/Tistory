package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public abstract class SinglePostCompleteSubscriber extends AtomicLong implements FlowableSubscriber, Subscription {
    protected final Subscriber downstream;
    protected long produced;
    protected Subscription upstream;
    protected Object value;

    public SinglePostCompleteSubscriber(Subscriber subscriber0) {
        this.downstream = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(Object object0) {
        long v = this.produced;
        if(v != 0L) {
            BackpressureHelper.produced(this, v);
        }
        while(true) {
            long v1 = this.get();
            if((v1 & 0x8000000000000000L) != 0L) {
                this.onDrop(object0);
                return;
            }
            if((v1 & 0x7FFFFFFFFFFFFFFFL) != 0L) {
                this.lazySet(0x8000000000000001L);
                this.downstream.onNext(object0);
                this.downstream.onComplete();
                return;
            }
            this.value = object0;
            if(this.compareAndSet(0L, 0x8000000000000000L)) {
                return;
            }
            this.value = null;
        }
    }

    public void onDrop(Object object0) {
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.upstream, subscription0)) {
            this.upstream = subscription0;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(Object object0) {
        this.complete(object0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            while(true) {
                long v1 = this.get();
                if((v1 & 0x8000000000000000L) != 0L) {
                    if(!this.compareAndSet(0x8000000000000000L, 0x8000000000000001L)) {
                        break;
                    }
                    this.downstream.onNext(this.value);
                    this.downstream.onComplete();
                    return;
                }
                if(this.compareAndSet(v1, BackpressureHelper.addCap(v1, v))) {
                    this.upstream.request(v);
                    return;
                }
            }
        }
    }
}

