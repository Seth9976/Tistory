package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class x6 extends AtomicInteger implements Subscription {
    public final Subscriber a;
    public final y6[] b;
    public final Function c;
    public final AtomicLong d;
    public final AtomicThrowable e;
    public final boolean f;
    public volatile boolean g;
    public final Object[] h;

    public x6(Subscriber subscriber0, Function function0, boolean z, int v, int v1) {
        this.a = subscriber0;
        this.c = function0;
        this.f = z;
        y6[] arr_y6 = new y6[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_y6[v2] = new y6(this, v1);
        }
        this.h = new Object[v];
        this.b = arr_y6;
        this.d = new AtomicLong();
        this.e = new AtomicThrowable();
    }

    public final void a() {
        y6[] arr_y6 = this.b;
        for(int v = 0; v < arr_y6.length; ++v) {
            y6 y60 = arr_y6[v];
            y60.getClass();
            SubscriptionHelper.cancel(y60);
        }
    }

    public final void b() {
        Object object2;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        y6[] arr_y6 = this.b;
        Object[] arr_object = this.h;
        int v = 1;
        do {
            long v1 = this.d.get();
            long v2 = 0L;
            int v3;
            while((v3 = Long.compare(v1, v2)) != 0) {
                if(this.g) {
                    return;
                }
                if(!this.f && this.e.get() != null) {
                    this.a();
                    subscriber0.onError(this.e.terminate());
                    return;
                }
                boolean z = false;
                int v4 = 0;
                while(v4 < arr_y6.length) {
                    y6 y60 = arr_y6[v4];
                    if(arr_object[v4] == null) {
                        try {
                            boolean z1 = y60.f;
                            Object object0 = y60.d == null ? null : y60.d.poll();
                            if(z1 && object0 == null) {
                                this.a();
                                if(((Throwable)this.e.get()) != null) {
                                    subscriber0.onError(this.e.terminate());
                                    return;
                                }
                                subscriber0.onComplete();
                                return;
                            }
                            if(object0 == null) {
                                goto label_42;
                            }
                            else {
                                arr_object[v4] = object0;
                            }
                            goto label_43;
                        }
                        catch(Throwable throwable0) {
                        }
                        Exceptions.throwIfFatal(throwable0);
                        this.e.addThrowable(throwable0);
                        if(!this.f) {
                            this.a();
                            subscriber0.onError(this.e.terminate());
                            return;
                        }
                        z = true;
                        goto label_43;
                    label_42:
                        z = true;
                    }
                label_43:
                    ++v4;
                }
                if(z) {
                    break;
                }
                try {
                    Object object1 = arr_object.clone();
                    object2 = ObjectHelper.requireNonNull(this.c.apply(object1), "The zipper returned a null value");
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    this.a();
                    this.e.addThrowable(throwable1);
                    subscriber0.onError(this.e.terminate());
                    return;
                }
                subscriber0.onNext(object2);
                ++v2;
                Arrays.fill(arr_object, null);
            }
            if(v3 == 0) {
                if(this.g) {
                    return;
                }
                if(!this.f && this.e.get() != null) {
                    this.a();
                    subscriber0.onError(this.e.terminate());
                    return;
                }
                for(int v5 = 0; v5 < arr_y6.length; ++v5) {
                    y6 y61 = arr_y6[v5];
                    if(arr_object[v5] == null) {
                        try {
                            boolean z2 = y61.f;
                            Object object3 = y61.d == null ? null : y61.d.poll();
                            if(z2 && object3 == null) {
                                this.a();
                                if(((Throwable)this.e.get()) != null) {
                                    subscriber0.onError(this.e.terminate());
                                    return;
                                }
                                subscriber0.onComplete();
                                return;
                            }
                            if(object3 != null) {
                                arr_object[v5] = object3;
                            }
                            continue;
                        }
                        catch(Throwable throwable2) {
                        }
                        Exceptions.throwIfFatal(throwable2);
                        this.e.addThrowable(throwable2);
                        if(!this.f) {
                            this.a();
                            subscriber0.onError(this.e.terminate());
                            return;
                        }
                    }
                }
            }
            if(v2 != 0L) {
                for(int v6 = 0; v6 < arr_y6.length; ++v6) {
                    arr_y6[v6].request(v2);
                }
                if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.d.addAndGet(-v2);
                }
            }
            v = this.addAndGet(-v);
        }
        while(v != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.g) {
            this.g = true;
            this.a();
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.d, v);
            this.b();
        }
    }
}

