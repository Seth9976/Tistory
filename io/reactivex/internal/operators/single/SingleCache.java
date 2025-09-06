package io.reactivex.internal.operators.single;

import gd.b;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCache extends Single implements SingleObserver {
    public final SingleSource a;
    public final AtomicInteger b;
    public final AtomicReference c;
    public Object d;
    public Throwable e;
    public static final b[] f;
    public static final b[] g;

    static {
        SingleCache.f = new b[0];
        SingleCache.g = new b[0];
    }

    public SingleCache(SingleSource singleSource0) {
        this.a = singleSource0;
        this.b = new AtomicInteger();
        this.c = new AtomicReference(SingleCache.f);
    }

    public final void c(b b0) {
        b[] arr_b1;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            b[] arr_b = (b[])atomicReference0.get();
            int v = arr_b.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_b[v1] == b0) {
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
                arr_b1 = SingleCache.f;
            }
            else {
                b[] arr_b2 = new b[v - 1];
                System.arraycopy(arr_b, 0, arr_b2, 0, v1);
                System.arraycopy(arr_b, v1 + 1, arr_b2, v1, v - v1 - 1);
                arr_b1 = arr_b2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_b, arr_b1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_b);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public void onError(Throwable throwable0) {
        this.e = throwable0;
        b[] arr_b = (b[])this.c.getAndSet(SingleCache.g);
        for(int v = 0; v < arr_b.length; ++v) {
            b b0 = arr_b[v];
            if(!b0.get()) {
                b0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable0) {
    }

    @Override  // io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
        this.d = object0;
        b[] arr_b = (b[])this.c.getAndSet(SingleCache.g);
        for(int v = 0; v < arr_b.length; ++v) {
            b b0 = arr_b[v];
            if(!b0.get()) {
                b0.a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        b b0 = new b(singleObserver0, this);
        singleObserver0.onSubscribe(b0);
        while(true) {
            AtomicReference atomicReference0 = this.c;
            b[] arr_b = (b[])atomicReference0.get();
            if(arr_b == SingleCache.g) {
                Throwable throwable0 = this.e;
                if(throwable0 != null) {
                    singleObserver0.onError(throwable0);
                    return;
                }
                singleObserver0.onSuccess(this.d);
                return;
            }
            b[] arr_b1 = new b[arr_b.length + 1];
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            arr_b1[arr_b.length] = b0;
            do {
                if(atomicReference0.compareAndSet(arr_b, arr_b1)) {
                    if(b0.get()) {
                        this.c(b0);
                    }
                    if(this.b.getAndIncrement() == 0) {
                        this.a.subscribe(this);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_b);
        }
    }
}

