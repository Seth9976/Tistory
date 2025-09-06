package io.reactivex.internal.operators.completable;

import dd.d;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableCache extends Completable implements CompletableObserver {
    public final CompletableSource a;
    public final AtomicReference b;
    public final AtomicBoolean c;
    public Throwable d;
    public static final d[] e;
    public static final d[] f;

    static {
        CompletableCache.e = new d[0];
        CompletableCache.f = new d[0];
    }

    public CompletableCache(CompletableSource completableSource0) {
        this.a = completableSource0;
        this.b = new AtomicReference(CompletableCache.e);
        this.c = new AtomicBoolean();
    }

    public final void d(d d0) {
        d[] arr_d1;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            d[] arr_d = (d[])atomicReference0.get();
            int v = arr_d.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_d[v1] == d0) {
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
                arr_d1 = CompletableCache.e;
            }
            else {
                d[] arr_d2 = new d[v - 1];
                System.arraycopy(arr_d, 0, arr_d2, 0, v1);
                System.arraycopy(arr_d, v1 + 1, arr_d2, v1, v - v1 - 1);
                arr_d1 = arr_d2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_d, arr_d1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_d);
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public void onComplete() {
        d[] arr_d = (d[])this.b.getAndSet(CompletableCache.f);
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(!d0.get()) {
                d0.a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        this.d = throwable0;
        d[] arr_d = (d[])this.b.getAndSet(CompletableCache.f);
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(!d0.get()) {
                d0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        d d0 = new d(this, completableObserver0);
        completableObserver0.onSubscribe(d0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            d[] arr_d = (d[])atomicReference0.get();
            if(arr_d == CompletableCache.f) {
                Throwable throwable0 = this.d;
                if(throwable0 != null) {
                    completableObserver0.onError(throwable0);
                    return;
                }
                completableObserver0.onComplete();
                return;
            }
            d[] arr_d1 = new d[arr_d.length + 1];
            System.arraycopy(arr_d, 0, arr_d1, 0, arr_d.length);
            arr_d1[arr_d.length] = d0;
            do {
                if(atomicReference0.compareAndSet(arr_d, arr_d1)) {
                    if(d0.get()) {
                        this.d(d0);
                    }
                    if(this.c.compareAndSet(false, true)) {
                        this.a.subscribe(this);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_d);
        }
    }
}

