package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class h2 extends AtomicReference implements Observer, Disposable {
    public final AtomicBoolean a;
    public final AtomicReference b;
    public final AtomicReference c;
    public Throwable d;
    public static final g2[] e;
    public static final g2[] f;

    static {
        h2.e = new g2[0];
        h2.f = new g2[0];
    }

    public h2(AtomicReference atomicReference0) {
        this.a = new AtomicBoolean();
        this.b = atomicReference0;
        this.c = new AtomicReference();
        this.lazySet(h2.e);
    }

    public final void a(g2 g20) {
        do {
            g2[] arr_g2 = (g2[])this.get();
            int v = arr_g2.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_g2[v1] == g20) {
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
            g2[] arr_g21 = h2.e;
            if(v != 1) {
                arr_g21 = new g2[v - 1];
                System.arraycopy(arr_g2, 0, arr_g21, 0, v1);
                System.arraycopy(arr_g2, v1 + 1, arr_g21, v1, v - v1 - 1);
            }
        }
        while(!this.compareAndSet(arr_g2, arr_g21));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.getAndSet(h2.f);
        while(!this.b.compareAndSet(this, null) && this.b.get() == this) {
        }
        DisposableHelper.dispose(this.c);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == h2.f;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.c.lazySet(DisposableHelper.DISPOSED);
        g2[] arr_g2 = (g2[])this.getAndSet(h2.f);
        for(int v = 0; v < arr_g2.length; ++v) {
            arr_g2[v].a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.d = throwable0;
        this.c.lazySet(DisposableHelper.DISPOSED);
        g2[] arr_g2 = (g2[])this.getAndSet(h2.f);
        for(int v = 0; v < arr_g2.length; ++v) {
            arr_g2[v].a.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        g2[] arr_g2 = (g2[])this.get();
        for(int v = 0; v < arr_g2.length; ++v) {
            arr_g2[v].a.onNext(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.c, disposable0);
    }
}

