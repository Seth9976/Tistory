package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

public final class u3 extends BasicQueueSubscription {
    public final int a;
    public int b;
    public volatile boolean c;
    public final int d;
    public final Subscriber e;

    public u3(Subscriber subscriber0, int v, int v1, int v2) {
        this.d = v2;
        super();
        this.b = v;
        this.a = v1;
        this.e = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c = true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.b = this.a;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.b == this.a;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        int v = this.b;
        if(v == this.a) {
            return null;
        }
        this.b = v + 1;
        return v;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v) && BackpressureHelper.add(this, v) == 0L) {
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                if(this.d == 0) {
                    int v3 = this.a;
                    ConditionalSubscriber conditionalSubscriber0 = (ConditionalSubscriber)this.e;
                    for(int v4 = this.b; v4 != v3; ++v4) {
                        if(this.c) {
                            return;
                        }
                        conditionalSubscriber0.tryOnNext(v4);
                    }
                    if(!this.c) {
                        conditionalSubscriber0.onComplete();
                    }
                }
                else {
                    int v1 = this.a;
                    Subscriber subscriber0 = this.e;
                    for(int v2 = this.b; v2 != v1; ++v2) {
                        if(this.c) {
                            return;
                        }
                        subscriber0.onNext(v2);
                    }
                    if(!this.c) {
                        subscriber0.onComplete();
                    }
                }
            }
            else if(this.d != 0) {
                int v5 = this.a;
                int v6 = this.b;
                Subscriber subscriber1 = this.e;
                do {
                    long v7 = 0L;
                    while(true) {
                        if(v7 != v && v6 != v5) {
                            if(this.c) {
                                return;
                            }
                            subscriber1.onNext(v6);
                            ++v7;
                            ++v6;
                        }
                        else {
                            if(v6 == v5) {
                                if(this.c) {
                                    return;
                                }
                                subscriber1.onComplete();
                                return;
                            }
                            long v8 = this.get();
                            if(v7 == v8) {
                                break;
                            }
                            v = v8;
                        }
                    }
                    this.b = v6;
                    v = this.addAndGet(-v7);
                }
                while(v != 0L);
            }
            else {
                int v9 = this.a;
                int v10 = this.b;
                ConditionalSubscriber conditionalSubscriber1 = (ConditionalSubscriber)this.e;
            alab1:
                while(true) {
                    long v11 = 0L;
                    while(true) {
                        if(v11 != v && v10 != v9) {
                            if(this.c) {
                                break alab1;
                            }
                            if(conditionalSubscriber1.tryOnNext(v10)) {
                                ++v11;
                            }
                            ++v10;
                            continue;
                        }
                        if(v10 == v9) {
                            if(this.c) {
                                break alab1;
                            }
                            conditionalSubscriber1.onComplete();
                            return;
                        }
                        long v12 = this.get();
                        if(v11 != v12) {
                            v = v12;
                            continue;
                        }
                        this.b = v10;
                        v = this.addAndGet(-v11);
                        if(v != 0L) {
                            break;
                        }
                        break alab1;
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        return v & 1;
    }
}

