package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class o6 extends AtomicInteger implements FlowableSubscriber, Runnable, Subscription {
    public final Subscriber a;
    public final int b;
    public final AtomicReference c;
    public final AtomicInteger d;
    public final MpscLinkedQueue e;
    public final AtomicThrowable f;
    public final AtomicBoolean g;
    public final Callable h;
    public final AtomicLong i;
    public Subscription j;
    public volatile boolean k;
    public UnicastProcessor l;
    public long m;
    public static final q n;
    public static final Object o;

    static {
        o6.n = new q(null, 2);
        o6.o = new Object();
    }

    public o6(Subscriber subscriber0, int v, Callable callable0) {
        this.a = subscriber0;
        this.b = v;
        this.c = new AtomicReference();
        this.d = new AtomicInteger(1);
        this.e = new MpscLinkedQueue();
        this.f = new AtomicThrowable();
        this.g = new AtomicBoolean();
        this.h = callable0;
        this.i = new AtomicLong();
    }

    public final void a() {
        Disposable disposable0 = (Disposable)this.c.getAndSet(o6.n);
        if(disposable0 != null && disposable0 != o6.n) {
            disposable0.dispose();
        }
    }

    public final void b() {
        Publisher publisher0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        MpscLinkedQueue mpscLinkedQueue0 = this.e;
        AtomicThrowable atomicThrowable0 = this.f;
        long v = this.m;
        int v1 = 1;
        while(true) {
            if(this.d.get() == 0) {
                mpscLinkedQueue0.clear();
                this.l = null;
                return;
            }
            UnicastProcessor unicastProcessor0 = this.l;
            boolean z = this.k;
            if(z && atomicThrowable0.get() != null) {
                mpscLinkedQueue0.clear();
                Throwable throwable0 = atomicThrowable0.terminate();
                if(unicastProcessor0 != null) {
                    this.l = null;
                    unicastProcessor0.onError(throwable0);
                }
                subscriber0.onError(throwable0);
                return;
            }
            Object object0 = mpscLinkedQueue0.poll();
            if(z && object0 == null) {
                Throwable throwable1 = atomicThrowable0.terminate();
                if(throwable1 == null) {
                    if(unicastProcessor0 != null) {
                        this.l = null;
                        unicastProcessor0.onComplete();
                    }
                    subscriber0.onComplete();
                    return;
                }
                if(unicastProcessor0 != null) {
                    this.l = null;
                    unicastProcessor0.onError(throwable1);
                }
                subscriber0.onError(throwable1);
                return;
            }
            if(object0 == null) {
                this.m = v;
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    continue;
                }
                return;
            }
            if(object0 == o6.o) {
                if(unicastProcessor0 != null) {
                    this.l = null;
                    unicastProcessor0.onComplete();
                }
                if(this.g.get()) {
                }
                else if(v == this.i.get()) {
                    this.j.cancel();
                    this.a();
                    atomicThrowable0.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                    this.k = true;
                }
                else {
                    UnicastProcessor unicastProcessor1 = UnicastProcessor.create(this.b, this);
                    this.l = unicastProcessor1;
                    this.d.getAndIncrement();
                    try {
                        publisher0 = (Publisher)ObjectHelper.requireNonNull(this.h.call(), "The other Callable returned a null Publisher");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        atomicThrowable0.addThrowable(throwable2);
                        this.k = true;
                        continue;
                    }
                    q q0 = new q(this, 2);
                    AtomicReference atomicReference0 = this.c;
                    do {
                        if(atomicReference0.compareAndSet(null, q0)) {
                            publisher0.subscribe(q0);
                            ++v;
                            subscriber0.onNext(unicastProcessor1);
                            break;
                        }
                    }
                    while(atomicReference0.get() == null);
                }
            }
            else {
                unicastProcessor0.onNext(object0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.g.compareAndSet(false, true)) {
            this.a();
            if(this.d.decrementAndGet() == 0) {
                this.j.cancel();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a();
        this.k = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a();
        if(this.f.addThrowable(throwable0)) {
            this.k = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.e.offer(object0);
        this.b();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.j, subscription0)) {
            this.j = subscription0;
            this.a.onSubscribe(this);
            this.e.offer(o6.o);
            this.b();
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        BackpressureHelper.add(this.i, v);
    }

    @Override
    public final void run() {
        if(this.d.decrementAndGet() == 0) {
            this.j.cancel();
        }
    }
}

