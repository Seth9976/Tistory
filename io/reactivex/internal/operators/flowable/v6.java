package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class v6 extends AtomicInteger implements ConditionalSubscriber, Subscription {
    public final Subscriber a;
    public final Function b;
    public final w6[] c;
    public final AtomicReferenceArray d;
    public final AtomicReference e;
    public final AtomicLong f;
    public final AtomicThrowable g;
    public volatile boolean h;

    public v6(Subscriber subscriber0, Function function0, int v) {
        this.a = subscriber0;
        this.b = function0;
        w6[] arr_w6 = new w6[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_w6[v1] = new w6(this, v1);
        }
        this.c = arr_w6;
        this.d = new AtomicReferenceArray(v);
        this.e = new AtomicReference();
        this.f = new AtomicLong();
        this.g = new AtomicThrowable();
    }

    public final void a(int v) {
        for(int v1 = 0; true; ++v1) {
            w6[] arr_w6 = this.c;
            if(v1 >= arr_w6.length) {
                break;
            }
            if(v1 != v) {
                w6 w60 = arr_w6[v1];
                w60.getClass();
                SubscriptionHelper.cancel(w60);
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.cancel(this.e);
        w6[] arr_w6 = this.c;
        for(int v = 0; v < arr_w6.length; ++v) {
            w6 w60 = arr_w6[v];
            w60.getClass();
            SubscriptionHelper.cancel(w60);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.h) {
            this.h = true;
            this.a(-1);
            HalfSerializer.onComplete(this.a, this, this.g);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.h) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.h = true;
        this.a(-1);
        HalfSerializer.onError(this.a, throwable0, this, this.g);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0) && !this.h) {
            ((Subscription)this.e.get()).request(1L);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.e, this.f, subscription0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.e, this.f, v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        Object object2;
        if(this.h) {
            return false;
        }
        AtomicReferenceArray atomicReferenceArray0 = this.d;
        int v = atomicReferenceArray0.length();
        Object[] arr_object = new Object[v + 1];
        arr_object[0] = object0;
        int v1 = 0;
        while(v1 < v) {
            Object object1 = atomicReferenceArray0.get(v1);
            if(object1 == null) {
                return false;
            }
            ++v1;
            arr_object[v1] = object1;
        }
        try {
            object2 = ObjectHelper.requireNonNull(this.b.apply(arr_object), "The combiner returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.cancel();
            this.onError(throwable0);
            return false;
        }
        HalfSerializer.onNext(this.a, object2, this, this.g);
        return true;
    }
}

