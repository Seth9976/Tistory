package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class y4 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final z4[] c;
    public final AtomicReferenceArray d;
    public final AtomicReference e;
    public final AtomicThrowable f;
    public volatile boolean g;

    public y4(Observer observer0, Function function0, int v) {
        this.a = observer0;
        this.b = function0;
        z4[] arr_z4 = new z4[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_z4[v1] = new z4(this, v1);
        }
        this.c = arr_z4;
        this.d = new AtomicReferenceArray(v);
        this.e = new AtomicReference();
        this.f = new AtomicThrowable();
    }

    public final void a(int v) {
        for(int v1 = 0; true; ++v1) {
            z4[] arr_z4 = this.c;
            if(v1 >= arr_z4.length) {
                break;
            }
            if(v1 != v) {
                z4 z40 = arr_z4[v1];
                z40.getClass();
                DisposableHelper.dispose(z40);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.e);
        z4[] arr_z4 = this.c;
        for(int v = 0; v < arr_z4.length; ++v) {
            z4 z40 = arr_z4[v];
            z40.getClass();
            DisposableHelper.dispose(z40);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.e.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.g) {
            this.g = true;
            this.a(-1);
            HalfSerializer.onComplete(this.a, this, this.f);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.g) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.g = true;
        this.a(-1);
        HalfSerializer.onError(this.a, throwable0, this, this.f);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object2;
        if(this.g) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray0 = this.d;
        int v = atomicReferenceArray0.length();
        Object[] arr_object = new Object[v + 1];
        int v1 = 0;
        arr_object[0] = object0;
        while(v1 < v) {
            Object object1 = atomicReferenceArray0.get(v1);
            if(object1 == null) {
                return;
            }
            ++v1;
            arr_object[v1] = object1;
        }
        try {
            object2 = ObjectHelper.requireNonNull(this.b.apply(arr_object), "combiner returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.dispose();
            this.onError(throwable0);
            return;
        }
        HalfSerializer.onNext(this.a, object2, this, this.f);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.e, disposable0);
    }
}

