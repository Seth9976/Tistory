package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeSource;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class y1 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final boolean c;
    public final int d;
    public final AtomicLong e;
    public final CompositeDisposable f;
    public final AtomicInteger g;
    public final AtomicThrowable h;
    public final Function i;
    public final AtomicReference j;
    public Subscription k;
    public volatile boolean l;

    public y1(Subscriber subscriber0, Function function0, boolean z, int v, int v1) {
        this.a = v1;
        if(v1 != 1) {
            super();
            this.b = subscriber0;
            this.i = function0;
            this.c = z;
            this.d = v;
            this.e = new AtomicLong();
            this.f = new CompositeDisposable();
            this.h = new AtomicThrowable();
            this.g = new AtomicInteger(1);
            this.j = new AtomicReference();
            return;
        }
        super();
        this.b = subscriber0;
        this.i = function0;
        this.c = z;
        this.d = v;
        this.e = new AtomicLong();
        this.f = new CompositeDisposable();
        this.h = new AtomicThrowable();
        this.g = new AtomicInteger(1);
        this.j = new AtomicReference();
    }

    public final void a() {
        if(this.a != 0) {
            SpscLinkedArrayQueue spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)this.j.get();
            if(spscLinkedArrayQueue0 != null) {
                spscLinkedArrayQueue0.clear();
            }
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue1 = (SpscLinkedArrayQueue)this.j.get();
        if(spscLinkedArrayQueue1 != null) {
            spscLinkedArrayQueue1.clear();
        }
    }

    public final void b() {
        boolean z3;
        boolean z;
        if(this.a != 0) {
            Subscriber subscriber0 = this.b;
            AtomicInteger atomicInteger0 = this.g;
            AtomicReference atomicReference0 = this.j;
            int v = 1;
            do {
                long v1 = this.e.get();
                long v2;
                for(v2 = 0L; true; ++v2) {
                    int v3 = Long.compare(v2, v1);
                    z = false;
                    if(v3 == 0) {
                        break;
                    }
                    if(this.l) {
                        this.a();
                        return;
                    }
                    if(!this.c && ((Throwable)this.h.get()) != null) {
                        Throwable throwable0 = this.h.terminate();
                        this.a();
                        subscriber0.onError(throwable0);
                        return;
                    }
                    boolean z1 = atomicInteger0.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)atomicReference0.get();
                    Object object0 = spscLinkedArrayQueue0 == null ? null : spscLinkedArrayQueue0.poll();
                    if(z1 && object0 == null) {
                        Throwable throwable1 = this.h.terminate();
                        if(throwable1 != null) {
                            subscriber0.onError(throwable1);
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    subscriber0.onNext(object0);
                }
                if(v3 == 0) {
                    if(this.l) {
                        this.a();
                        return;
                    }
                    if(!this.c && ((Throwable)this.h.get()) != null) {
                        Throwable throwable2 = this.h.terminate();
                        this.a();
                        subscriber0.onError(throwable2);
                        return;
                    }
                    boolean z2 = atomicInteger0.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue1 = (SpscLinkedArrayQueue)atomicReference0.get();
                    if(spscLinkedArrayQueue1 == null || spscLinkedArrayQueue1.isEmpty()) {
                        z = true;
                    }
                    if(z2 && z) {
                        Throwable throwable3 = this.h.terminate();
                        if(throwable3 != null) {
                            subscriber0.onError(throwable3);
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                }
                if(v2 != 0L) {
                    BackpressureHelper.produced(this.e, v2);
                    if(this.d != 0x7FFFFFFF) {
                        this.k.request(v2);
                    }
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
            return;
        }
        Subscriber subscriber1 = this.b;
        AtomicInteger atomicInteger1 = this.g;
        AtomicReference atomicReference1 = this.j;
        int v4 = 1;
        do {
            long v5 = this.e.get();
            long v6;
            for(v6 = 0L; true; ++v6) {
                int v7 = Long.compare(v6, v5);
                z3 = false;
                if(v7 == 0) {
                    break;
                }
                if(this.l) {
                    this.a();
                    return;
                }
                if(!this.c && ((Throwable)this.h.get()) != null) {
                    Throwable throwable4 = this.h.terminate();
                    this.a();
                    subscriber1.onError(throwable4);
                    return;
                }
                boolean z4 = atomicInteger1.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue)atomicReference1.get();
                Object object1 = spscLinkedArrayQueue2 == null ? null : spscLinkedArrayQueue2.poll();
                if(z4 && object1 == null) {
                    Throwable throwable5 = this.h.terminate();
                    if(throwable5 != null) {
                        subscriber1.onError(throwable5);
                        return;
                    }
                    subscriber1.onComplete();
                    return;
                }
                if(object1 == null) {
                    break;
                }
                subscriber1.onNext(object1);
            }
            if(v7 == 0) {
                if(this.l) {
                    this.a();
                    return;
                }
                if(!this.c && ((Throwable)this.h.get()) != null) {
                    Throwable throwable6 = this.h.terminate();
                    this.a();
                    subscriber1.onError(throwable6);
                    return;
                }
                boolean z5 = atomicInteger1.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue)atomicReference1.get();
                if(spscLinkedArrayQueue3 == null || spscLinkedArrayQueue3.isEmpty()) {
                    z3 = true;
                }
                if(z5 && z3) {
                    Throwable throwable7 = this.h.terminate();
                    if(throwable7 != null) {
                        subscriber1.onError(throwable7);
                        return;
                    }
                    subscriber1.onComplete();
                    return;
                }
            }
            if(v6 != 0L) {
                BackpressureHelper.produced(this.e, v6);
                if(this.d != 0x7FFFFFFF) {
                    this.k.request(v6);
                }
            }
            v4 = this.addAndGet(-v4);
        }
        while(v4 != 0);
    }

    public final SpscLinkedArrayQueue c() {
        SpscLinkedArrayQueue spscLinkedArrayQueue1;
        SpscLinkedArrayQueue spscLinkedArrayQueue0;
        if(this.a != 0) {
            while(true) {
                AtomicReference atomicReference0 = this.j;
                spscLinkedArrayQueue0 = (SpscLinkedArrayQueue)atomicReference0.get();
                if(spscLinkedArrayQueue0 != null) {
                    break;
                }
                spscLinkedArrayQueue0 = new SpscLinkedArrayQueue(0x80);
            label_5:
                if(atomicReference0.compareAndSet(null, spscLinkedArrayQueue0)) {
                    break;
                }
                if(atomicReference0.get() != null) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_5;
            }
            return spscLinkedArrayQueue0;
        }
        while(true) {
            AtomicReference atomicReference1 = this.j;
            spscLinkedArrayQueue1 = (SpscLinkedArrayQueue)atomicReference1.get();
            if(spscLinkedArrayQueue1 != null) {
                break;
            }
            spscLinkedArrayQueue1 = new SpscLinkedArrayQueue(0x80);
        label_13:
            if(atomicReference1.compareAndSet(null, spscLinkedArrayQueue1)) {
                break;
            }
            if(atomicReference1.get() != null) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_13;
        }
        return spscLinkedArrayQueue1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            this.l = true;
            this.k.cancel();
            this.f.dispose();
            return;
        }
        this.l = true;
        this.k.cancel();
        this.f.dispose();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.g.decrementAndGet();
            if(this.getAndIncrement() == 0) {
                this.b();
            }
            return;
        }
        this.g.decrementAndGet();
        if(this.getAndIncrement() == 0) {
            this.b();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.g.decrementAndGet();
            if(this.h.addThrowable(throwable0)) {
                if(!this.c) {
                    this.f.dispose();
                }
                if(this.getAndIncrement() == 0) {
                    this.b();
                    return;
                }
            }
            else {
                RxJavaPlugins.onError(throwable0);
            }
            return;
        }
        this.g.decrementAndGet();
        if(this.h.addThrowable(throwable0)) {
            if(!this.c) {
                this.f.dispose();
            }
            if(this.getAndIncrement() == 0) {
                this.b();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        MaybeSource maybeSource0;
        SingleSource singleSource0;
        if(this.a != 0) {
            try {
                singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.i.apply(object0), "The mapper returned a null SingleSource");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.k.cancel();
                this.onError(throwable0);
                return;
            }
            this.g.getAndIncrement();
            z1 z10 = new z1(this, 0);
            if(!this.l && this.f.add(z10)) {
                singleSource0.subscribe(z10);
                return;
            }
            return;
        }
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.i.apply(object0), "The mapper returned a null MaybeSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            this.k.cancel();
            this.onError(throwable1);
            return;
        }
        this.g.getAndIncrement();
        x1 x10 = new x1(this, 0);
        if(!this.l && this.f.add(x10)) {
            maybeSource0.subscribe(x10);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.k, subscription0)) {
                this.k = subscription0;
                this.b.onSubscribe(this);
                int v = this.d;
                if(v == 0x7FFFFFFF) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                    return;
                }
                subscription0.request(((long)v));
            }
            return;
        }
        if(SubscriptionHelper.validate(this.k, subscription0)) {
            this.k = subscription0;
            this.b.onSubscribe(this);
            int v1 = this.d;
            if(v1 == 0x7FFFFFFF) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            subscription0.request(((long)v1));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(v)) {
                BackpressureHelper.add(this.e, v);
                if(this.getAndIncrement() == 0) {
                    this.b();
                }
            }
            return;
        }
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.e, v);
            if(this.getAndIncrement() == 0) {
                this.b();
            }
        }
    }
}

