package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

public final class c2 extends BasicQueueSubscription {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final int d;
    public final Subscriber e;

    public c2(Subscriber subscriber0, Iterator iterator0, int v) {
        this.d = v;
        super();
        this.a = iterator0;
        this.e = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.b = true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.a = null;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.a == null || !this.a.hasNext();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Iterator iterator0 = this.a;
        if(iterator0 == null) {
            return null;
        }
        if(!this.c) {
            this.c = true;
        }
        else if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = this.a.next();
        return ObjectHelper.requireNonNull(object0, "Iterator.next() returned a null value");
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        Object object3;
        Object object2;
        Object object0;
        Object object1;
        if(SubscriptionHelper.validate(v) && BackpressureHelper.add(this, v) == 0L) {
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                if(this.d == 0) {
                    Iterator iterator1 = this.a;
                    ConditionalSubscriber conditionalSubscriber0 = (ConditionalSubscriber)this.e;
                    while(!this.b) {
                        try {
                            object1 = iterator1.next();
                        }
                        catch(Throwable throwable2) {
                            Exceptions.throwIfFatal(throwable2);
                            conditionalSubscriber0.onError(throwable2);
                            return;
                        }
                        if(this.b) {
                            break;
                        }
                        if(object1 == null) {
                            conditionalSubscriber0.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        conditionalSubscriber0.tryOnNext(object1);
                        if(this.b) {
                            break;
                        }
                        try {
                            if(iterator1.hasNext()) {
                                continue;
                            }
                        }
                        catch(Throwable throwable3) {
                            Exceptions.throwIfFatal(throwable3);
                            conditionalSubscriber0.onError(throwable3);
                            return;
                        }
                        if(this.b) {
                            break;
                        }
                        conditionalSubscriber0.onComplete();
                        return;
                    }
                }
                else {
                    Iterator iterator0 = this.a;
                    Subscriber subscriber0 = this.e;
                    while(!this.b) {
                        try {
                            object0 = iterator0.next();
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            subscriber0.onError(throwable0);
                            return;
                        }
                        if(this.b) {
                            break;
                        }
                        if(object0 == null) {
                            subscriber0.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        subscriber0.onNext(object0);
                        if(this.b) {
                            break;
                        }
                        try {
                            if(iterator0.hasNext()) {
                                continue;
                            }
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            subscriber0.onError(throwable1);
                            return;
                        }
                        if(this.b) {
                            break;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                }
            }
            else if(this.d != 0) {
                Iterator iterator2 = this.a;
                Subscriber subscriber1 = this.e;
                do {
                    long v1 = 0L;
                    while(true) {
                        if(v1 == v) {
                            long v2 = this.get();
                            if(v1 == v2) {
                                break;
                            }
                            v = v2;
                        }
                        else {
                            if(this.b) {
                                return;
                            }
                            try {
                                object2 = iterator2.next();
                            }
                            catch(Throwable throwable4) {
                                Exceptions.throwIfFatal(throwable4);
                                subscriber1.onError(throwable4);
                                return;
                            }
                            if(this.b) {
                                return;
                            }
                            if(object2 == null) {
                                subscriber1.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            subscriber1.onNext(object2);
                            if(this.b) {
                                return;
                            }
                            try {
                                if(!iterator2.hasNext()) {
                                    goto label_75;
                                }
                                goto label_78;
                            }
                            catch(Throwable throwable5) {
                                Exceptions.throwIfFatal(throwable5);
                                subscriber1.onError(throwable5);
                                return;
                            }
                        label_75:
                            if(this.b) {
                                return;
                            }
                            subscriber1.onComplete();
                            return;
                        label_78:
                            ++v1;
                        }
                    }
                    v = this.addAndGet(-v1);
                }
                while(v != 0L);
            }
            else {
                Iterator iterator3 = this.a;
                ConditionalSubscriber conditionalSubscriber1 = (ConditionalSubscriber)this.e;
            alab1:
                while(true) {
                    long v3 = 0L;
                    while(true) {
                        if(v3 != v) {
                            if(this.b) {
                                break alab1;
                            }
                            try {
                                object3 = iterator3.next();
                            }
                            catch(Throwable throwable6) {
                                Exceptions.throwIfFatal(throwable6);
                                conditionalSubscriber1.onError(throwable6);
                                return;
                            }
                            if(this.b) {
                                break alab1;
                            }
                            if(object3 == null) {
                                conditionalSubscriber1.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean z = conditionalSubscriber1.tryOnNext(object3);
                            if(this.b) {
                                break alab1;
                            }
                            try {
                                if(!iterator3.hasNext()) {
                                    goto label_110;
                                }
                                goto label_113;
                            }
                            catch(Throwable throwable7) {
                                Exceptions.throwIfFatal(throwable7);
                                conditionalSubscriber1.onError(throwable7);
                                return;
                            }
                        label_110:
                            if(this.b) {
                                break alab1;
                            }
                            conditionalSubscriber1.onComplete();
                            return;
                        label_113:
                            if(!z) {
                                continue;
                            }
                            ++v3;
                            continue;
                        }
                        long v4 = this.get();
                        if(v3 != v4) {
                            v = v4;
                            continue;
                        }
                        v = this.addAndGet(-v3);
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

