package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import org.reactivestreams.Subscriber;

public class DeferredScalarSubscription extends BasicIntQueueSubscription {
    protected final Subscriber downstream;
    protected Object value;

    public DeferredScalarSubscription(Subscriber subscriber0) {
        this.downstream = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        this.set(4);
        this.value = null;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.lazySet(0x20);
        this.value = null;
    }

    public final void complete(Object object0) {
        int v = this.get();
        do {
            if(v == 8) {
                this.value = object0;
                this.lazySet(16);
                Subscriber subscriber0 = this.downstream;
                subscriber0.onNext(object0);
                if(this.get() != 4) {
                    subscriber0.onComplete();
                }
                return;
            }
            if((v & -3) != 0) {
                return;
            }
            if(v == 2) {
                this.lazySet(3);
                Subscriber subscriber1 = this.downstream;
                subscriber1.onNext(object0);
                if(this.get() != 4) {
                    subscriber1.onComplete();
                }
                return;
            }
            this.value = object0;
            if(this.compareAndSet(0, 1)) {
                return;
            }
            v = this.get();
        }
        while(v != 4);
        this.value = null;
    }

    public final boolean isCancelled() {
        return this.get() == 4;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.get() != 16;
    }

    public void onSuccess(Object object0) {
        this.complete(object0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final Object poll() {
        if(this.get() == 16) {
            this.lazySet(0x20);
            Object object0 = this.value;
            this.value = null;
            return object0;
        }
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            while(true) {
                int v1 = this.get();
                if((v1 & -2) != 0) {
                    return;
                }
                if(v1 == 1) {
                    if(this.compareAndSet(1, 3)) {
                        Object object0 = this.value;
                        if(object0 != null) {
                            this.value = null;
                            Subscriber subscriber0 = this.downstream;
                            subscriber0.onNext(object0);
                            if(this.get() != 4) {
                                subscriber0.onComplete();
                            }
                        }
                    }
                    return;
                }
                if(this.compareAndSet(0, 2)) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.lazySet(8);
            return 2;
        }
        return 0;
    }

    public final boolean tryCancel() {
        return this.getAndSet(4) != 4;
    }
}

