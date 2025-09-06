package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCache extends Maybe implements MaybeObserver {
    public final AtomicReference a;
    public final AtomicReference b;
    public Object c;
    public Throwable d;
    public static final c[] e;
    public static final c[] f;

    static {
        MaybeCache.e = new c[0];
        MaybeCache.f = new c[0];
    }

    public MaybeCache(MaybeSource maybeSource0) {
        this.a = new AtomicReference(maybeSource0);
        this.b = new AtomicReference(MaybeCache.e);
    }

    public final void a(c c0) {
        c[] arr_c1;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            c[] arr_c = (c[])atomicReference0.get();
            int v = arr_c.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_c[v1] == c0) {
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
                arr_c1 = MaybeCache.e;
            }
            else {
                c[] arr_c2 = new c[v - 1];
                System.arraycopy(arr_c, 0, arr_c2, 0, v1);
                System.arraycopy(arr_c, v1 + 1, arr_c2, v1, v - v1 - 1);
                arr_c1 = arr_c2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_c, arr_c1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_c);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public void onComplete() {
        c[] arr_c = (c[])this.b.getAndSet(MaybeCache.f);
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v];
            if(!c0.isDisposed()) {
                c0.a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public void onError(Throwable throwable0) {
        this.d = throwable0;
        c[] arr_c = (c[])this.b.getAndSet(MaybeCache.f);
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v];
            if(!c0.isDisposed()) {
                c0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable0) {
    }

    @Override  // io.reactivex.MaybeObserver
    public void onSuccess(Object object0) {
        this.c = object0;
        c[] arr_c = (c[])this.b.getAndSet(MaybeCache.f);
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v];
            if(!c0.isDisposed()) {
                c0.a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        c c0 = new c(maybeObserver0, this);
        maybeObserver0.onSubscribe(c0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            c[] arr_c = (c[])atomicReference0.get();
            if(arr_c == MaybeCache.f) {
                if(!c0.isDisposed()) {
                    Throwable throwable0 = this.d;
                    if(throwable0 != null) {
                        maybeObserver0.onError(throwable0);
                        return;
                    }
                    Object object0 = this.c;
                    if(object0 != null) {
                        maybeObserver0.onSuccess(object0);
                        return;
                    }
                    maybeObserver0.onComplete();
                }
                return;
            }
            c[] arr_c1 = new c[arr_c.length + 1];
            System.arraycopy(arr_c, 0, arr_c1, 0, arr_c.length);
            arr_c1[arr_c.length] = c0;
            do {
                if(atomicReference0.compareAndSet(arr_c, arr_c1)) {
                    if(c0.isDisposed()) {
                        this.a(c0);
                        return;
                    }
                    MaybeSource maybeSource0 = (MaybeSource)this.a.getAndSet(null);
                    if(maybeSource0 != null) {
                        maybeSource0.subscribe(this);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_c);
        }
    }
}

