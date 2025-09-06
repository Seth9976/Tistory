package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

public final class b2 extends BasicQueueSubscription {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final int d;
    public final Subscriber e;

    public b2(Subscriber subscriber0, Object[] arr_object, int v) {
        this.d = v;
        super();
        this.a = arr_object;
        this.e = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c = true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.b = this.a.length;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        int v = this.b;
        Object[] arr_object = this.a;
        if(v == arr_object.length) {
            return null;
        }
        this.b = v + 1;
        return ObjectHelper.requireNonNull(arr_object[v], "array element is null");
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v) && BackpressureHelper.add(this, v) == 0L) {
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                if(this.d == 0) {
                    Object[] arr_object1 = this.a;
                    ConditionalSubscriber conditionalSubscriber0 = (ConditionalSubscriber)this.e;
                    for(int v2 = this.b; v2 != arr_object1.length; ++v2) {
                        if(this.c) {
                            return;
                        }
                        Object object1 = arr_object1[v2];
                        if(object1 == null) {
                            conditionalSubscriber0.onError(new NullPointerException("The element at index " + v2 + " is null"));
                            return;
                        }
                        conditionalSubscriber0.tryOnNext(object1);
                    }
                    if(!this.c) {
                        conditionalSubscriber0.onComplete();
                    }
                }
                else {
                    Object[] arr_object = this.a;
                    Subscriber subscriber0 = this.e;
                    for(int v1 = this.b; v1 != arr_object.length; ++v1) {
                        if(this.c) {
                            return;
                        }
                        Object object0 = arr_object[v1];
                        if(object0 == null) {
                            subscriber0.onError(new NullPointerException("The element at index " + v1 + " is null"));
                            return;
                        }
                        subscriber0.onNext(object0);
                    }
                    if(!this.c) {
                        subscriber0.onComplete();
                    }
                }
            }
            else if(this.d != 0) {
                Object[] arr_object2 = this.a;
                int v3 = this.b;
                Subscriber subscriber1 = this.e;
                do {
                    long v4 = 0L;
                    while(true) {
                        if(v4 != v && v3 != arr_object2.length) {
                            if(this.c) {
                                return;
                            }
                            Object object2 = arr_object2[v3];
                            if(object2 == null) {
                                subscriber1.onError(new NullPointerException("The element at index " + v3 + " is null"));
                                return;
                            }
                            subscriber1.onNext(object2);
                            ++v4;
                            ++v3;
                        }
                        else {
                            if(v3 == arr_object2.length) {
                                if(this.c) {
                                    return;
                                }
                                subscriber1.onComplete();
                                return;
                            }
                            long v5 = this.get();
                            if(v4 == v5) {
                                break;
                            }
                            v = v5;
                        }
                    }
                    this.b = v3;
                    v = this.addAndGet(-v4);
                }
                while(v != 0L);
            }
            else {
                Object[] arr_object3 = this.a;
                int v6 = this.b;
                ConditionalSubscriber conditionalSubscriber1 = (ConditionalSubscriber)this.e;
            alab1:
                while(true) {
                    long v7 = 0L;
                    while(true) {
                        if(v7 != v && v6 != arr_object3.length) {
                            if(this.c) {
                                break alab1;
                            }
                            Object object3 = arr_object3[v6];
                            if(object3 == null) {
                                conditionalSubscriber1.onError(new NullPointerException("The element at index " + v6 + " is null"));
                                return;
                            }
                            if(conditionalSubscriber1.tryOnNext(object3)) {
                                ++v7;
                            }
                            ++v6;
                            continue;
                        }
                        if(v6 == arr_object3.length) {
                            if(this.c) {
                                break alab1;
                            }
                            conditionalSubscriber1.onComplete();
                            return;
                        }
                        long v8 = this.get();
                        if(v7 != v8) {
                            v = v8;
                            continue;
                        }
                        this.b = v6;
                        v = this.addAndGet(-v7);
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

