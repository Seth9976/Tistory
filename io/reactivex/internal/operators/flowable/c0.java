package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class c0 extends AtomicReference implements FlowableSubscriber {
    public final b0 a;
    public final int b;
    public final int c;
    public final int d;
    public int e;

    public c0(b0 b00, int v, int v1) {
        this.a = b00;
        this.b = v;
        this.c = v1;
        this.d = v1 - (v1 >> 2);
    }

    public final void a() {
        int v = this.e + 1;
        if(v == this.d) {
            this.e = 0;
            ((Subscription)this.get()).request(((long)v));
            return;
        }
        this.e = v;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.c(this.b);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        b0 b00 = this.a;
        int v = this.b;
        if(ExceptionHelper.addThrowable(b00.m, throwable0)) {
            if(!b00.f) {
                b00.a();
                b00.l = true;
                b00.drain();
                return;
            }
            b00.c(v);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        boolean z;
        b0 b00 = this.a;
        int v = this.b;
        synchronized(b00) {
            Object[] arr_object = b00.e;
            int v2 = b00.h;
            if(arr_object[v] == null) {
                ++v2;
                b00.h = v2;
            }
            arr_object[v] = object0;
            if(arr_object.length == v2) {
                c0 c00 = b00.c[v];
                Object object1 = arr_object.clone();
                b00.d.offer(c00, object1);
                z = false;
            }
            else {
                z = true;
            }
        }
        if(z) {
            b00.c[v].a();
            return;
        }
        b00.drain();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, ((long)this.c));
    }
}

