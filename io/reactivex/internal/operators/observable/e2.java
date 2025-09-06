package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class e2 implements Observer, Disposable {
    public final AtomicReference a;
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final AtomicReference d;
    public static final d2[] e;
    public static final d2[] f;

    static {
        e2.e = new d2[0];
        e2.f = new d2[0];
    }

    public e2(AtomicReference atomicReference0) {
        this.d = new AtomicReference();
        this.b = new AtomicReference(e2.e);
        this.a = atomicReference0;
        this.c = new AtomicBoolean();
    }

    public final void a(d2 d20) {
        d2[] arr_d21;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            d2[] arr_d2 = (d2[])atomicReference0.get();
            int v = arr_d2.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_d2[v1].equals(d20)) {
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
                arr_d21 = e2.e;
            }
            else {
                d2[] arr_d22 = new d2[v - 1];
                System.arraycopy(arr_d2, 0, arr_d22, 0, v1);
                System.arraycopy(arr_d2, v1 + 1, arr_d22, v1, v - v1 - 1);
                arr_d21 = arr_d22;
            }
            do {
                if(atomicReference0.compareAndSet(arr_d2, arr_d21)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_d2);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(((d2[])this.b.getAndSet(e2.f)) != e2.f) {
            while(!this.a.compareAndSet(this, null) && this.a.get() == this) {
            }
            DisposableHelper.dispose(this.d);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b.get() == e2.f;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        while(!this.a.compareAndSet(this, null) && this.a.get() == this) {
        }
        d2[] arr_d2 = (d2[])this.b.getAndSet(e2.f);
        for(int v = 0; v < arr_d2.length; ++v) {
            arr_d2[v].a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        while(!this.a.compareAndSet(this, null) && this.a.get() == this) {
        }
        d2[] arr_d2 = (d2[])this.b.getAndSet(e2.f);
        if(arr_d2.length != 0) {
            for(int v = 0; v < arr_d2.length; ++v) {
                arr_d2[v].a.onError(throwable0);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        d2[] arr_d2 = (d2[])this.b.get();
        for(int v = 0; v < arr_d2.length; ++v) {
            arr_d2[v].a.onNext(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.d, disposable0);
    }
}

