package ed;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeSource;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e extends AtomicInteger implements FlowableSubscriber, Subscription {
    public final int a;
    public final Subscriber b;
    public final Function c;
    public final int d;
    public final AtomicLong e;
    public final AtomicThrowable f;
    public final SpscArrayQueue g;
    public final ErrorMode h;
    public Subscription i;
    public volatile boolean j;
    public volatile boolean k;
    public long l;
    public int m;
    public Object n;
    public volatile int o;
    public final AtomicReference p;

    public e(int v, int v1, Function function0, ErrorMode errorMode0, Subscriber subscriber0) {
        this.a = v1;
        if(v1 != 1) {
            super();
            this.b = subscriber0;
            this.c = function0;
            this.d = v;
            this.h = errorMode0;
            this.e = new AtomicLong();
            this.f = new AtomicThrowable();
            this.p = new d(this, 0);
            this.g = new SpscArrayQueue(v);
            return;
        }
        super();
        this.b = subscriber0;
        this.c = function0;
        this.d = v;
        this.h = errorMode0;
        this.e = new AtomicLong();
        this.f = new AtomicThrowable();
        this.p = new f(this, 0);
        this.g = new SpscArrayQueue(v);
    }

    public final void a() {
        MaybeSource maybeSource0;
        SingleSource singleSource0;
        if(this.a != 0) {
            if(this.getAndIncrement() == 0) {
                Subscriber subscriber0 = this.b;
                ErrorMode errorMode0 = this.h;
                SpscArrayQueue spscArrayQueue0 = this.g;
                AtomicThrowable atomicThrowable0 = this.f;
                AtomicLong atomicLong0 = this.e;
                int v = this.d - (this.d >> 1);
                int v1 = 1;
                while(true) {
                    if(this.k) {
                        spscArrayQueue0.clear();
                        this.n = null;
                    }
                    else {
                        int v2 = this.o;
                        if(atomicThrowable0.get() != null && (errorMode0 == ErrorMode.IMMEDIATE || errorMode0 == ErrorMode.BOUNDARY && v2 == 0)) {
                            spscArrayQueue0.clear();
                            this.n = null;
                            subscriber0.onError(atomicThrowable0.terminate());
                            return;
                        }
                        switch(v2) {
                            case 0: {
                                boolean z = this.j;
                                Object object0 = spscArrayQueue0.poll();
                                if(z && object0 == null) {
                                    Throwable throwable0 = atomicThrowable0.terminate();
                                    if(throwable0 == null) {
                                        subscriber0.onComplete();
                                        return;
                                    }
                                    subscriber0.onError(throwable0);
                                    return;
                                }
                                if(object0 != null) {
                                    int v3 = this.m + 1;
                                    if(v3 == v) {
                                        this.m = 0;
                                        this.i.request(((long)v));
                                    }
                                    else {
                                        this.m = v3;
                                    }
                                    try {
                                        singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.c.apply(object0), "The mapper returned a null SingleSource");
                                    }
                                    catch(Throwable throwable1) {
                                        Exceptions.throwIfFatal(throwable1);
                                        this.i.cancel();
                                        spscArrayQueue0.clear();
                                        atomicThrowable0.addThrowable(throwable1);
                                        subscriber0.onError(atomicThrowable0.terminate());
                                        return;
                                    }
                                    this.o = 1;
                                    singleSource0.subscribe(((f)this.p));
                                }
                                break;
                            }
                            case 2: {
                                long v4 = this.l;
                                if(v4 != atomicLong0.get()) {
                                    Object object1 = this.n;
                                    this.n = null;
                                    subscriber0.onNext(object1);
                                    this.l = v4 + 1L;
                                    this.o = 0;
                                    continue;
                                }
                            }
                        }
                    }
                    v1 = this.addAndGet(-v1);
                    if(v1 == 0) {
                        break;
                    }
                }
            }
            return;
        }
        if(this.getAndIncrement() == 0) {
            Subscriber subscriber1 = this.b;
            ErrorMode errorMode1 = this.h;
            SpscArrayQueue spscArrayQueue1 = this.g;
            AtomicThrowable atomicThrowable1 = this.f;
            AtomicLong atomicLong1 = this.e;
            int v5 = this.d - (this.d >> 1);
            int v6 = 1;
            while(true) {
                if(this.k) {
                    spscArrayQueue1.clear();
                    this.n = null;
                }
                else {
                    int v7 = this.o;
                    if(atomicThrowable1.get() != null && (errorMode1 == ErrorMode.IMMEDIATE || errorMode1 == ErrorMode.BOUNDARY && v7 == 0)) {
                        spscArrayQueue1.clear();
                        this.n = null;
                        subscriber1.onError(atomicThrowable1.terminate());
                        return;
                    }
                    switch(v7) {
                        case 0: {
                            boolean z1 = this.j;
                            Object object2 = spscArrayQueue1.poll();
                            if(z1 && object2 == null) {
                                Throwable throwable2 = atomicThrowable1.terminate();
                                if(throwable2 == null) {
                                    subscriber1.onComplete();
                                    return;
                                }
                                subscriber1.onError(throwable2);
                                return;
                            }
                            if(object2 != null) {
                                int v8 = this.m + 1;
                                if(v8 == v5) {
                                    this.m = 0;
                                    this.i.request(((long)v5));
                                }
                                else {
                                    this.m = v8;
                                }
                                try {
                                    maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.c.apply(object2), "The mapper returned a null MaybeSource");
                                }
                                catch(Throwable throwable3) {
                                    Exceptions.throwIfFatal(throwable3);
                                    this.i.cancel();
                                    spscArrayQueue1.clear();
                                    atomicThrowable1.addThrowable(throwable3);
                                    subscriber1.onError(atomicThrowable1.terminate());
                                    return;
                                }
                                this.o = 1;
                                maybeSource0.subscribe(((d)this.p));
                            }
                            break;
                        }
                        case 2: {
                            long v9 = this.l;
                            if(v9 != atomicLong1.get()) {
                                Object object3 = this.n;
                                this.n = null;
                                subscriber1.onNext(object3);
                                this.l = v9 + 1L;
                                this.o = 0;
                                continue;
                            }
                        }
                    }
                }
                v6 = this.addAndGet(-v6);
                if(v6 == 0) {
                    break;
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(this.a != 0) {
            this.k = true;
            this.i.cancel();
            ((f)this.p).getClass();
            DisposableHelper.dispose(((f)this.p));
            if(this.getAndIncrement() == 0) {
                this.g.clear();
                this.n = null;
            }
            return;
        }
        this.k = true;
        this.i.cancel();
        ((d)this.p).getClass();
        DisposableHelper.dispose(((d)this.p));
        if(this.getAndIncrement() == 0) {
            this.g.clear();
            this.n = null;
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.j = true;
            this.a();
            return;
        }
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.f.addThrowable(throwable0)) {
                if(this.h == ErrorMode.IMMEDIATE) {
                    ((f)this.p).getClass();
                    DisposableHelper.dispose(((f)this.p));
                }
                this.j = true;
                this.a();
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(this.f.addThrowable(throwable0)) {
            if(this.h == ErrorMode.IMMEDIATE) {
                ((d)this.p).getClass();
                DisposableHelper.dispose(((d)this.p));
            }
            this.j = true;
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(!this.g.offer(object0)) {
                this.i.cancel();
                this.onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            this.a();
            return;
        }
        if(!this.g.offer(object0)) {
            this.i.cancel();
            this.onError(new MissingBackpressureException("queue full?!"));
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.i, subscription0)) {
                this.i = subscription0;
                this.b.onSubscribe(this);
                subscription0.request(((long)this.d));
            }
            return;
        }
        if(SubscriptionHelper.validate(this.i, subscription0)) {
            this.i = subscription0;
            this.b.onSubscribe(this);
            subscription0.request(((long)this.d));
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(this.a != 0) {
            BackpressureHelper.add(this.e, v);
            this.a();
            return;
        }
        BackpressureHelper.add(this.e, v);
        this.a();
    }
}

