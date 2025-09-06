package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

public final class b0 extends BasicIntQueueSubscription {
    public final Subscriber a;
    public final Function b;
    public final c0[] c;
    public final SpscLinkedArrayQueue d;
    public final Object[] e;
    public final boolean f;
    public boolean g;
    public int h;
    public int i;
    public volatile boolean j;
    public final AtomicLong k;
    public volatile boolean l;
    public final AtomicReference m;

    public b0(Subscriber subscriber0, Function function0, boolean z, int v, int v1) {
        this.a = subscriber0;
        this.b = function0;
        c0[] arr_c0 = new c0[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_c0[v2] = new c0(this, v2, v1);
        }
        this.c = arr_c0;
        this.e = new Object[v];
        this.d = new SpscLinkedArrayQueue(v1);
        this.k = new AtomicLong();
        this.m = new AtomicReference();
        this.f = z;
    }

    public final void a() {
        c0[] arr_c0 = this.c;
        for(int v = 0; v < arr_c0.length; ++v) {
            c0 c00 = arr_c0[v];
            c00.getClass();
            SubscriptionHelper.cancel(c00);
        }
    }

    public final boolean b(boolean z, boolean z1, Subscriber subscriber0, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
        if(this.j) {
            this.a();
            spscLinkedArrayQueue0.clear();
            return true;
        }
        if(z) {
            if(!this.f) {
                Throwable throwable1 = ExceptionHelper.terminate(this.m);
                if(throwable1 != null && throwable1 != ExceptionHelper.TERMINATED) {
                    this.a();
                    spscLinkedArrayQueue0.clear();
                    subscriber0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    this.a();
                    subscriber0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                this.a();
                Throwable throwable0 = ExceptionHelper.terminate(this.m);
                if(throwable0 != null && throwable0 != ExceptionHelper.TERMINATED) {
                    subscriber0.onError(throwable0);
                    return true;
                }
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public final void c(int v) {
        synchronized(this) {
            Object[] arr_object = this.e;
            if(arr_object[v] == null) {
                this.l = true;
            }
            else {
                int v2 = this.i + 1;
                if(v2 == arr_object.length) {
                    this.l = true;
                    this.drain();
                    return;
                }
                this.i = v2;
                return;
            }
        }
        this.drain();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.j = true;
        this.a();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.d.clear();
    }

    public final void drain() {
        Object object1;
        int v = 1;
        if(this.getAndIncrement() != 0) {
            return;
        }
        if(this.g) {
            Subscriber subscriber0 = this.a;
            SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.d;
            do {
                if(this.j) {
                    spscLinkedArrayQueue0.clear();
                    return;
                }
                Throwable throwable0 = (Throwable)this.m.get();
                if(throwable0 != null) {
                    spscLinkedArrayQueue0.clear();
                    subscriber0.onError(throwable0);
                    return;
                }
                boolean z = this.l;
                boolean z1 = spscLinkedArrayQueue0.isEmpty();
                if(!z1) {
                    subscriber0.onNext(null);
                }
                if(z && z1) {
                    subscriber0.onComplete();
                    return;
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
            return;
        }
        Subscriber subscriber1 = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.d;
        int v1 = 1;
    alab1:
        while(true) {
            long v2 = this.k.get();
            long v3 = 0L;
            while(true) {
                int v4 = Long.compare(v3, v2);
                if(v4 != 0) {
                    boolean z2 = this.l;
                    Object object0 = spscLinkedArrayQueue1.poll();
                    if(this.b(z2, object0 == null, subscriber1, spscLinkedArrayQueue1)) {
                        break alab1;
                    }
                    if(object0 == null) {
                        goto label_48;
                    }
                    Object[] arr_object = (Object[])spscLinkedArrayQueue1.poll();
                    try {
                        object1 = ObjectHelper.requireNonNull(this.b.apply(arr_object), "The combiner returned a null value");
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.a();
                        ExceptionHelper.addThrowable(this.m, throwable1);
                        subscriber1.onError(ExceptionHelper.terminate(this.m));
                        return;
                    }
                    subscriber1.onNext(object1);
                    ((c0)object0).a();
                    ++v3;
                    continue;
                }
            label_48:
                if(v4 == 0 && this.b(this.l, spscLinkedArrayQueue1.isEmpty(), subscriber1, spscLinkedArrayQueue1)) {
                    break alab1;
                }
                if(v3 != 0L && v2 != 0x7FFFFFFFFFFFFFFFL) {
                    this.k.addAndGet(-v3);
                }
                v1 = this.addAndGet(-v1);
                if(v1 != 0) {
                    break;
                }
                break alab1;
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.d;
        Object object0 = spscLinkedArrayQueue0.poll();
        if(object0 == null) {
            return null;
        }
        Object[] arr_object = (Object[])spscLinkedArrayQueue0.poll();
        Object object1 = ObjectHelper.requireNonNull(this.b.apply(arr_object), "The combiner returned a null value");
        ((c0)object0).a();
        return object1;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.k, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        boolean z = false;
        if((v & 4) != 0) {
            return 0;
        }
        if((v & 2) != 0) {
            z = true;
        }
        this.g = z;
        return v & 2;
    }
}

