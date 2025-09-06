package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.flowable.y;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCache extends a implements Observer {
    public final AtomicBoolean a;
    public final int b;
    public final AtomicReference c;
    public volatile long d;
    public final y e;
    public y f;
    public int g;
    public Throwable h;
    public volatile boolean i;
    public static final x[] j;
    public static final x[] k;

    static {
        ObservableCache.j = new x[0];
        ObservableCache.k = new x[0];
    }

    public ObservableCache(Observable observable0, int v) {
        super(observable0);
        this.b = v;
        this.a = new AtomicBoolean();
        y y0 = new y(v, 1);
        this.e = y0;
        this.f = y0;
        this.c = new AtomicReference(ObservableCache.j);
    }

    public final void d(x x0) {
        if(x0.getAndIncrement() != 0) {
            return;
        }
        long v = x0.e;
        int v1 = x0.d;
        y y0 = x0.c;
        Observer observer0 = x0.a;
        int v2 = this.b;
        int v3 = 1;
        while(true) {
            if(x0.f) {
                x0.c = null;
                return;
            }
            boolean z = Long.compare(this.d, v) == 0;
            if(this.i && z) {
                x0.c = null;
                Throwable throwable0 = this.h;
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                observer0.onComplete();
                return;
            }
            if(z) {
                x0.e = v;
                x0.d = v1;
                x0.c = y0;
                v3 = x0.addAndGet(-v3);
                if(v3 == 0) {
                    break;
                }
            }
            else {
                if(v1 == v2) {
                    y0 = (y)y0.b;
                    v1 = 0;
                }
                observer0.onNext(y0.a[v1]);
                ++v1;
                ++v;
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        this.i = true;
        x[] arr_x = (x[])this.c.getAndSet(ObservableCache.k);
        for(int v = 0; v < arr_x.length; ++v) {
            this.d(arr_x[v]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        this.h = throwable0;
        this.i = true;
        x[] arr_x = (x[])this.c.getAndSet(ObservableCache.k);
        for(int v = 0; v < arr_x.length; ++v) {
            this.d(arr_x[v]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        int v = this.g;
        if(v == this.b) {
            y y0 = new y(v, 1);
            y0.a[0] = object0;
            this.g = 1;
            this.f.b = y0;
            this.f = y0;
        }
        else {
            this.f.a[v] = object0;
            this.g = v + 1;
        }
        ++this.d;
        x[] arr_x = (x[])this.c.get();
        for(int v1 = 0; v1 < arr_x.length; ++v1) {
            this.d(arr_x[v1]);
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        x x0 = new x(observer0, this);
        observer0.onSubscribe(x0);
        while(true) {
            AtomicReference atomicReference0 = this.c;
            x[] arr_x = (x[])atomicReference0.get();
            if(arr_x == ObservableCache.k) {
                break;
            }
            x[] arr_x1 = new x[arr_x.length + 1];
            System.arraycopy(arr_x, 0, arr_x1, 0, arr_x.length);
            arr_x1[arr_x.length] = x0;
        label_8:
            if(atomicReference0.compareAndSet(arr_x, arr_x1)) {
                break;
            }
            if(atomicReference0.get() != arr_x) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_8;
        }
        if(!this.a.get() && this.a.compareAndSet(false, true)) {
            this.source.subscribe(this);
            return;
        }
        this.d(x0);
    }
}

