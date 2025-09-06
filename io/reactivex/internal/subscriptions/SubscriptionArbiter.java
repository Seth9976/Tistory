package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    public Subscription a;
    public long b;
    public final AtomicReference c;
    public final AtomicLong d;
    public final AtomicLong e;
    public final boolean f;
    public volatile boolean g;
    protected boolean unbounded;

    public SubscriptionArbiter(boolean z) {
        this.f = z;
        this.c = new AtomicReference();
        this.d = new AtomicLong();
        this.e = new AtomicLong();
    }

    public final void a() {
        int v = 1;
        long v1 = 0L;
        Subscription subscription0 = null;
        do {
            Subscription subscription1 = (Subscription)this.c.get();
            if(subscription1 != null) {
                subscription1 = (Subscription)this.c.getAndSet(null);
            }
            long v2 = this.d.get();
            if(v2 != 0L) {
                v2 = this.d.getAndSet(0L);
            }
            long v3 = this.e.get();
            if(v3 != 0L) {
                v3 = this.e.getAndSet(0L);
            }
            Subscription subscription2 = this.a;
            if(this.g) {
                if(subscription2 != null) {
                    subscription2.cancel();
                    this.a = null;
                }
                if(subscription1 != null) {
                    subscription1.cancel();
                }
            }
            else {
                long v4 = this.b;
                if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                    v4 = BackpressureHelper.addCap(v4, v2);
                    if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                        v4 -= v3;
                        if(v4 < 0L) {
                            SubscriptionHelper.reportMoreProduced(v4);
                            v4 = 0L;
                        }
                    }
                    this.b = v4;
                }
                if(subscription1 != null) {
                    if(subscription2 != null && this.f) {
                        subscription2.cancel();
                    }
                    this.a = subscription1;
                    if(v4 != 0L) {
                        v1 = BackpressureHelper.addCap(v1, v4);
                        subscription0 = subscription1;
                    }
                }
                else if(subscription2 != null && v2 != 0L) {
                    v1 = BackpressureHelper.addCap(v1, v2);
                    subscription0 = subscription2;
                }
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
        if(v1 != 0L) {
            subscription0.request(v1);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
        if(!this.g) {
            this.g = true;
            if(this.getAndIncrement() == 0) {
                this.a();
            }
        }
    }

    public final boolean isCancelled() {
        return this.g;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public void onSubscribe(Subscription subscription0) {
        this.setSubscription(subscription0);
    }

    public final void produced(long v) {
        if(this.unbounded) {
            return;
        }
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            long v1 = this.b;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                long v2 = v1 - v;
                if(v2 < 0L) {
                    SubscriptionHelper.reportMoreProduced(v2);
                    v2 = 0L;
                }
                this.b = v2;
            }
            if(this.decrementAndGet() == 0) {
                return;
            }
            this.a();
            return;
        }
        BackpressureHelper.add(this.e, v);
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(!SubscriptionHelper.validate(v) || this.unbounded) {
            return;
        }
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            long v1 = this.b;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                long v2 = BackpressureHelper.addCap(v1, v);
                this.b = v2;
                if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                    this.unbounded = true;
                }
            }
            Subscription subscription0 = this.a;
            if(this.decrementAndGet() != 0) {
                this.a();
            }
            if(subscription0 != null) {
                subscription0.request(v);
            }
            return;
        }
        BackpressureHelper.add(this.d, v);
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }

    public final void setSubscription(Subscription subscription0) {
        if(this.g) {
            subscription0.cancel();
            return;
        }
        ObjectHelper.requireNonNull(subscription0, "s is null");
        if(this.get() == 0 && this.compareAndSet(0, 1)) {
            Subscription subscription1 = this.a;
            if(subscription1 != null && this.f) {
                subscription1.cancel();
            }
            this.a = subscription0;
            long v = this.b;
            if(this.decrementAndGet() != 0) {
                this.a();
            }
            if(v != 0L) {
                subscription0.request(v);
            }
            return;
        }
        Subscription subscription2 = (Subscription)this.c.getAndSet(subscription0);
        if(subscription2 != null && this.f) {
            subscription2.cancel();
        }
        if(this.getAndIncrement() == 0) {
            this.a();
        }
    }
}

