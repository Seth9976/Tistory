package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class z extends AtomicReference implements Observer {
    public final a0 a;
    public final int b;

    public z(a0 a00, int v) {
        this.a = a00;
        this.b = v;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        a0 a00 = this.a;
        int v = this.b;
        synchronized(a00) {
            Object[] arr_object = a00.d;
            if(arr_object == null) {
                return;
            }
            boolean z = arr_object[v] == null;
            if(z) {
                a00.h = true;
            }
            else {
                int v2 = a00.k + 1;
                a00.k = v2;
                if(v2 == arr_object.length) {
                    a00.h = true;
                }
            }
        }
        if(z) {
            a00.a();
        }
        a00.c();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        int v = 1;
        a0 a00 = this.a;
        int v1 = this.b;
        if(a00.i.addThrowable(throwable0)) {
            if(a00.f) {
                synchronized(a00) {
                    Object[] arr_object = a00.d;
                    if(arr_object != null) {
                        int v2 = arr_object[v1] == null ? 1 : 0;
                        if(v2 == 0) {
                            int v3 = a00.k + 1;
                            a00.k = v3;
                            if(v3 == arr_object.length) {
                                a00.h = true;
                            }
                        }
                        else {
                            a00.h = true;
                        }
                        v = v2;
                        goto label_24;
                    }
                }
                return;
            }
        label_24:
            if(v != 0) {
                a00.a();
            }
            a00.c();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        boolean z;
        a0 a00 = this.a;
        int v = this.b;
        synchronized(a00) {
            Object[] arr_object = a00.d;
            if(arr_object == null) {
                return;
            }
            int v2 = a00.j;
            if(arr_object[v] == null) {
                ++v2;
                a00.j = v2;
            }
            arr_object[v] = object0;
            if(v2 == arr_object.length) {
                Object object1 = arr_object.clone();
                a00.e.offer(object1);
                z = true;
            }
            else {
                z = false;
            }
        }
        if(z) {
            a00.c();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

