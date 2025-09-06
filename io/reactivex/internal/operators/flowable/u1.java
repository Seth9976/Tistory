package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class u1 extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final Subscriber a;
    public final Function b;
    public final boolean c;
    public final int d;
    public final int e;
    public volatile SimplePlainQueue f;
    public volatile boolean g;
    public final AtomicThrowable h;
    public volatile boolean i;
    public final AtomicReference j;
    public final AtomicLong k;
    public Subscription l;
    public long m;
    public long n;
    public int o;
    public int p;
    public final int q;
    public static final t1[] r;
    public static final t1[] s;

    static {
        u1.r = new t1[0];
        u1.s = new t1[0];
    }

    public u1(Subscriber subscriber0, Function function0, boolean z, int v, int v1) {
        this.h = new AtomicThrowable();
        AtomicReference atomicReference0 = new AtomicReference();
        this.j = atomicReference0;
        this.k = new AtomicLong();
        this.a = subscriber0;
        this.b = function0;
        this.c = z;
        this.d = v;
        this.e = v1;
        this.q = Math.max(1, v >> 1);
        atomicReference0.lazySet(u1.r);
    }

    public final boolean a() {
        if(this.i) {
            SimplePlainQueue simplePlainQueue0 = this.f;
            if(simplePlainQueue0 != null) {
                simplePlainQueue0.clear();
            }
            return true;
        }
        if(!this.c && this.h.get() != null) {
            SimplePlainQueue simplePlainQueue1 = this.f;
            if(simplePlainQueue1 != null) {
                simplePlainQueue1.clear();
            }
            Throwable throwable0 = this.h.terminate();
            if(throwable0 != ExceptionHelper.TERMINATED) {
                this.a.onError(throwable0);
            }
            return true;
        }
        return false;
    }

    public final void b() {
        if(this.getAndIncrement() == 0) {
            this.c();
        }
    }

    public final void c() {
        long v14;
        int v13;
        Object object4;
        int v11;
        Subscriber subscriber0 = this.a;
        int v = 1;
        while(true) {
            if(this.a()) {
                return;
            }
            SimplePlainQueue simplePlainQueue0 = this.f;
            long v1 = this.k.get();
            boolean z = v1 == 0x7FFFFFFFFFFFFFFFL;
            long v2 = 0L;
            if(simplePlainQueue0 != null) {
                while(true) {
                    long v3 = 0L;
                    Object object0;
                    for(object0 = null; v1 != 0L; object0 = object1) {
                        Object object1 = simplePlainQueue0.poll();
                        if(this.a()) {
                            return;
                        }
                        if(object1 == null) {
                            object0 = null;
                            break;
                        }
                        subscriber0.onNext(object1);
                        ++v2;
                        ++v3;
                        --v1;
                    }
                    if(v3 != 0L) {
                        v1 = z ? 0x7FFFFFFFFFFFFFFFL : this.k.addAndGet(-v3);
                    }
                    if(v1 == 0L || object0 == null) {
                        break;
                    }
                }
            }
            boolean z1 = this.g;
            SimplePlainQueue simplePlainQueue1 = this.f;
            t1[] arr_t1 = (t1[])this.j.get();
            int v4 = arr_t1.length;
            if(z1 && (simplePlainQueue1 == null || simplePlainQueue1.isEmpty()) && v4 == 0) {
                Throwable throwable0 = this.h.terminate();
                if(throwable0 != ExceptionHelper.TERMINATED) {
                    if(throwable0 == null) {
                        subscriber0.onComplete();
                        return;
                    }
                    subscriber0.onError(throwable0);
                }
                return;
            }
            if(v4 == 0) {
                v14 = v2;
                v13 = 0;
            }
            else {
                long v5 = this.n;
                int v6 = this.o;
                if(v4 <= v6 || arr_t1[v6].a != v5) {
                    if(v4 <= v6) {
                        v6 = 0;
                    }
                    for(int v7 = 0; v7 < v4 && arr_t1[v6].a != v5; ++v7) {
                        ++v6;
                        v6 = v6 == v4 ? 0 : v6 + 1;
                    }
                    this.o = v6;
                    this.n = arr_t1[v6].a;
                }
                int v8 = v6;
                int v9 = 0;
                int v10 = 0;
            alab1:
                while(true) {
                    if(v10 < v4) {
                        if(this.a()) {
                            return;
                        }
                        t1 t10 = arr_t1[v8];
                        Object object2 = null;
                        while(true) {
                            if(this.a()) {
                                return;
                            }
                            SimpleQueue simpleQueue0 = t10.f;
                            if(simpleQueue0 == null) {
                                v11 = v4;
                                break;
                            }
                            v11 = v4;
                            Object object3 = object2;
                            long v12 = 0L;
                            while(v1 != 0L) {
                                try {
                                    object4 = simpleQueue0.poll();
                                }
                                catch(Throwable throwable1) {
                                    Exceptions.throwIfFatal(throwable1);
                                    SubscriptionHelper.cancel(t10);
                                    this.h.addThrowable(throwable1);
                                    if(!this.c) {
                                        this.l.cancel();
                                    }
                                    if(this.a()) {
                                        return;
                                    }
                                    this.e(t10);
                                    v9 = 1;
                                    v10 += 2;
                                    v4 = v11;
                                    continue alab1;
                                }
                                if(object4 == null) {
                                    object3 = null;
                                    break;
                                }
                                subscriber0.onNext(object4);
                                if(this.a()) {
                                    return;
                                }
                                --v1;
                                ++v12;
                                object3 = object4;
                            }
                            if(v12 != 0L) {
                                v1 = z ? 0x7FFFFFFFFFFFFFFFL : this.k.addAndGet(-v12);
                                t10.a(v12);
                            }
                            if(v1 == 0L || object3 == null) {
                                break;
                            }
                            v4 = v11;
                            object2 = object3;
                        }
                        if(t10.e && (t10.f == null || t10.f.isEmpty())) {
                            this.e(t10);
                            if(this.a()) {
                                return;
                            }
                            ++v2;
                            v9 = 1;
                        }
                        if(v1 == 0L) {
                            v13 = v9;
                            break;
                        }
                        else {
                            v8 = v8 + 1 == v11 ? 0 : v8 + 1;
                            ++v10;
                            v4 = v11;
                            continue;
                        }
                    }
                    v13 = v9;
                    break;
                }
                this.o = v8;
                this.n = arr_t1[v8].a;
                v14 = v2;
            }
            if(v14 != 0L && !this.i) {
                this.l.request(v14);
            }
            if(v13 == 0) {
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.i) {
            this.i = true;
            this.l.cancel();
            AtomicReference atomicReference0 = this.j;
            t1[] arr_t1 = (t1[])atomicReference0.get();
            t1[] arr_t11 = u1.s;
            if(arr_t1 != arr_t11) {
                t1[] arr_t12 = (t1[])atomicReference0.getAndSet(arr_t11);
                if(arr_t12 != arr_t11) {
                    for(int v = 0; v < arr_t12.length; ++v) {
                        t1 t10 = arr_t12[v];
                        t10.getClass();
                        SubscriptionHelper.cancel(t10);
                    }
                    Throwable throwable0 = this.h.terminate();
                    if(throwable0 != null && throwable0 != ExceptionHelper.TERMINATED) {
                        RxJavaPlugins.onError(throwable0);
                    }
                }
            }
            if(this.getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue0 = this.f;
                if(simplePlainQueue0 != null) {
                    simplePlainQueue0.clear();
                }
            }
        }
    }

    public final SimplePlainQueue d() {
        SimplePlainQueue simplePlainQueue0 = this.f;
        if(simplePlainQueue0 == null) {
            simplePlainQueue0 = this.d == 0x7FFFFFFF ? new SpscLinkedArrayQueue(this.e) : new SpscArrayQueue(this.d);
            this.f = simplePlainQueue0;
        }
        return simplePlainQueue0;
    }

    public final void e(t1 t10) {
        t1[] arr_t11;
        while(true) {
            AtomicReference atomicReference0 = this.j;
            t1[] arr_t1 = (t1[])atomicReference0.get();
            int v = arr_t1.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_t1[v1] == t10) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v == 1) {
                arr_t11 = u1.r;
            }
            else {
                t1[] arr_t12 = new t1[v - 1];
                System.arraycopy(arr_t1, 0, arr_t12, 0, v1);
                System.arraycopy(arr_t1, v1 + 1, arr_t12, v1, v - v1 - 1);
                arr_t11 = arr_t12;
            }
            do {
                if(atomicReference0.compareAndSet(arr_t1, arr_t11)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_t1);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.g) {
            return;
        }
        this.g = true;
        this.b();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(this.h.addThrowable(throwable0)) {
            this.g = true;
            if(!this.c) {
                t1[] arr_t1 = (t1[])this.j.getAndSet(u1.s);
                for(int v = 0; v < arr_t1.length; ++v) {
                    t1 t10 = arr_t1[v];
                    t10.getClass();
                    SubscriptionHelper.cancel(t10);
                }
            }
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object1;
        Publisher publisher0;
        if(this.g) {
            return;
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.l.cancel();
            this.onError(throwable0);
            return;
        }
        if(publisher0 instanceof Callable) {
            try {
                object1 = ((Callable)publisher0).call();
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.h.addThrowable(throwable1);
                this.b();
                return;
            }
            if(object1 != null) {
                if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                    if(!this.d().offer(object1)) {
                        this.onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                    if(this.getAndIncrement() == 0) {
                        this.c();
                        return;
                    }
                    return;
                }
                else {
                    long v = this.k.get();
                    SimplePlainQueue simplePlainQueue0 = this.f;
                    if(v == 0L || simplePlainQueue0 != null && !simplePlainQueue0.isEmpty()) {
                        if(simplePlainQueue0 == null) {
                            simplePlainQueue0 = this.d();
                        }
                        if(!simplePlainQueue0.offer(object1)) {
                            this.onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    }
                    else {
                        this.a.onNext(object1);
                        if(v != 0x7FFFFFFFFFFFFFFFL) {
                            this.k.decrementAndGet();
                        }
                        if(this.d != 0x7FFFFFFF && !this.i) {
                            int v1 = this.p + 1;
                            this.p = v1;
                            int v2 = this.q;
                            if(v1 == v2) {
                                this.p = 0;
                                this.l.request(((long)v2));
                            }
                        }
                    }
                    if(this.decrementAndGet() == 0) {
                        return;
                    }
                }
                this.c();
                return;
            }
            if(this.d == 0x7FFFFFFF || this.i) {
                return;
            }
            int v3 = this.p + 1;
            this.p = v3;
            int v4 = this.q;
            if(v3 != v4) {
                return;
            }
            this.p = 0;
            this.l.request(((long)v4));
            return;
        }
        long v5 = this.m;
        this.m = v5 + 1L;
        t1 t10 = new t1(this, v5);
        while(true) {
            AtomicReference atomicReference0 = this.j;
            t1[] arr_t1 = (t1[])atomicReference0.get();
            if(arr_t1 == u1.s) {
                SubscriptionHelper.cancel(t10);
                return;
            }
            t1[] arr_t11 = new t1[arr_t1.length + 1];
            System.arraycopy(arr_t1, 0, arr_t11, 0, arr_t1.length);
            arr_t11[arr_t1.length] = t10;
            do {
                if(atomicReference0.compareAndSet(arr_t1, arr_t11)) {
                    publisher0.subscribe(t10);
                    return;
                }
            }
            while(atomicReference0.get() == arr_t1);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.l, subscription0)) {
            this.l = subscription0;
            this.a.onSubscribe(this);
            if(!this.i) {
                int v = this.d;
                if(v == 0x7FFFFFFF) {
                    subscription0.request(0x7FFFFFFFFFFFFFFFL);
                    return;
                }
                subscription0.request(((long)v));
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.k, v);
            this.b();
        }
    }
}

