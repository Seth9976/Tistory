package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class a2 extends BasicIntQueueSubscription implements FlowableSubscriber {
    public final Subscriber a;
    public final Function b;
    public final int c;
    public final int d;
    public final AtomicLong e;
    public Subscription f;
    public SimpleQueue g;
    public volatile boolean h;
    public volatile boolean i;
    public final AtomicReference j;
    public Iterator k;
    public int l;
    public int m;

    public a2(Subscriber subscriber0, Function function0, int v) {
        this.a = subscriber0;
        this.b = function0;
        this.c = v;
        this.d = v - (v >> 2);
        this.j = new AtomicReference();
        this.e = new AtomicLong();
    }

    public final boolean a(boolean z, boolean z1, Subscriber subscriber0, SimpleQueue simpleQueue0) {
        if(this.i) {
            this.k = null;
            simpleQueue0.clear();
            return true;
        }
        if(z) {
            if(((Throwable)this.j.get()) != null) {
                Throwable throwable0 = ExceptionHelper.terminate(this.j);
                this.k = null;
                simpleQueue0.clear();
                subscriber0.onError(throwable0);
                return true;
            }
            if(z1) {
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.i) {
            this.i = true;
            this.f.cancel();
            if(this.getAndIncrement() == 0) {
                this.g.clear();
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.k = null;
        this.g.clear();
    }

    public final void drain() {
        Object object2;
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        SimpleQueue simpleQueue0 = this.g;
        boolean z = this.m != 1;
        Iterator iterator0 = this.k;
        int v = 1;
        while(true) {
            if(iterator0 == null) {
                try {
                    boolean z1 = this.h;
                    object0 = simpleQueue0.poll();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.f.cancel();
                    ExceptionHelper.addThrowable(this.j, throwable0);
                    Throwable throwable1 = ExceptionHelper.terminate(this.j);
                    this.k = null;
                    simpleQueue0.clear();
                    subscriber0.onError(throwable1);
                    return;
                }
                if(this.a(z1, object0 == null, subscriber0, simpleQueue0)) {
                    return;
                }
                if(object0 != null) {
                    try {
                        iterator0 = ((Iterable)this.b.apply(object0)).iterator();
                        if(iterator0.hasNext()) {
                            goto label_41;
                        }
                        else {
                            goto label_32;
                        }
                        goto label_42;
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.f.cancel();
                        ExceptionHelper.addThrowable(this.j, throwable2);
                        subscriber0.onError(ExceptionHelper.terminate(this.j));
                        return;
                    }
                label_32:
                    if(z) {
                        int v1 = this.l + 1;
                        if(v1 == this.d) {
                            this.l = 0;
                            this.f.request(((long)v1));
                        }
                        else {
                            this.l = v1;
                        }
                    }
                    iterator0 = null;
                    continue;
                label_41:
                    this.k = iterator0;
                }
            }
        label_42:
            if(iterator0 == null) {
            label_87:
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
            else {
                long v2 = this.e.get();
                long v3 = 0L;
                while(v3 != v2) {
                    if(this.a(this.h, false, subscriber0, simpleQueue0)) {
                        return;
                    }
                    try {
                        Object object1 = iterator0.next();
                        object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
                    }
                    catch(Throwable throwable3) {
                        Exceptions.throwIfFatal(throwable3);
                        this.k = null;
                        this.f.cancel();
                        ExceptionHelper.addThrowable(this.j, throwable3);
                        subscriber0.onError(ExceptionHelper.terminate(this.j));
                        return;
                    }
                    subscriber0.onNext(object2);
                    if(this.a(this.h, false, subscriber0, simpleQueue0)) {
                        return;
                    }
                    try {
                        ++v3;
                        if(!iterator0.hasNext()) {
                            goto label_71;
                        }
                        goto label_81;
                    }
                    catch(Throwable throwable4) {
                        Exceptions.throwIfFatal(throwable4);
                        this.k = null;
                        this.f.cancel();
                        ExceptionHelper.addThrowable(this.j, throwable4);
                        subscriber0.onError(ExceptionHelper.terminate(this.j));
                        return;
                    }
                label_71:
                    if(z) {
                        int v4 = this.l + 1;
                        if(v4 == this.d) {
                            this.l = 0;
                            this.f.request(((long)v4));
                        }
                        else {
                            this.l = v4;
                        }
                    }
                    this.k = null;
                    iterator0 = null;
                    break;
                label_81:
                    if(false) {
                        break;
                    }
                }
                if(v3 == v2 && this.a(this.h, simpleQueue0.isEmpty() && iterator0 == null, subscriber0, simpleQueue0)) {
                    return;
                }
                if(v3 != 0L && v2 != 0x7FFFFFFFFFFFFFFFL) {
                    this.e.addAndGet(-v3);
                }
                if(iterator0 != null) {
                    goto label_87;
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.k == null && this.g.isEmpty();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.h) {
            return;
        }
        this.h = true;
        this.drain();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(!this.h && ExceptionHelper.addThrowable(this.j, throwable0)) {
            this.h = true;
            this.drain();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.h) {
            return;
        }
        if(this.m == 0 && !this.g.offer(object0)) {
            this.onError(new MissingBackpressureException("Queue is full?!"));
            return;
        }
        this.drain();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            if(subscription0 instanceof QueueSubscription) {
                int v = ((QueueSubscription)subscription0).requestFusion(3);
                if(v == 1) {
                    this.m = 1;
                    this.g = (QueueSubscription)subscription0;
                    this.h = true;
                    this.a.onSubscribe(this);
                    return;
                }
                if(v == 2) {
                    this.m = 2;
                    this.g = (QueueSubscription)subscription0;
                    this.a.onSubscribe(this);
                    subscription0.request(((long)this.c));
                    return;
                }
            }
            this.g = new SpscArrayQueue(this.c);
            this.a.onSubscribe(this);
            subscription0.request(((long)this.c));
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Iterator iterator0 = this.k;
        while(iterator0 == null) {
            Object object0 = this.g.poll();
            if(object0 == null) {
                return null;
            }
            iterator0 = ((Iterable)this.b.apply(object0)).iterator();
            if(iterator0.hasNext()) {
                this.k = iterator0;
                if(true) {
                    break;
                }
            }
            else {
                iterator0 = null;
            }
        }
        Object object1 = iterator0.next();
        Object object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
        if(!iterator0.hasNext()) {
            this.k = null;
        }
        return object2;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        return (v & 1) == 0 || this.m != 1 ? 0 : 1;
    }
}

