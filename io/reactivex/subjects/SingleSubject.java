package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubject extends Single implements SingleObserver {
    public final AtomicReference a;
    public final AtomicBoolean b;
    public Object c;
    public Throwable d;
    public static final m[] e;
    public static final m[] f;

    static {
        SingleSubject.e = new m[0];
        SingleSubject.f = new m[0];
    }

    public SingleSubject() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(SingleSubject.e);
    }

    public final void c(m m0) {
        m[] arr_m1;
        while(true) {
            AtomicReference atomicReference0 = this.a;
            m[] arr_m = (m[])atomicReference0.get();
            int v = arr_m.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_m[v1] == m0) {
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
                arr_m1 = SingleSubject.e;
            }
            else {
                m[] arr_m2 = new m[v - 1];
                System.arraycopy(arr_m, 0, arr_m2, 0, v1);
                System.arraycopy(arr_m, v1 + 1, arr_m2, v1, v - v1 - 1);
                arr_m1 = arr_m2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_m, arr_m1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_m);
        }
    }

    @CheckReturnValue
    @NonNull
    public static SingleSubject create() {
        return new SingleSubject();
    }

    @Nullable
    public Throwable getThrowable() {
        return this.a.get() == SingleSubject.f ? this.d : null;
    }

    @Nullable
    public Object getValue() {
        return this.a.get() == SingleSubject.f ? this.c : null;
    }

    public boolean hasObservers() {
        return ((m[])this.a.get()).length != 0;
    }

    public boolean hasThrowable() {
        return this.a.get() == SingleSubject.f && this.d != null;
    }

    public boolean hasValue() {
        return this.a.get() == SingleSubject.f && this.c != null;
    }

    @Override  // io.reactivex.SingleObserver
    public void onError(@NonNull Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.d = throwable0;
            m[] arr_m = (m[])this.a.getAndSet(SingleSubject.f);
            for(int v = 0; v < arr_m.length; ++v) {
                arr_m[v].a.onError(throwable0);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public void onSubscribe(@NonNull Disposable disposable0) {
        if(this.a.get() == SingleSubject.f) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.SingleObserver
    public void onSuccess(@NonNull Object object0) {
        ObjectHelper.requireNonNull(object0, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = object0;
            m[] arr_m = (m[])this.a.getAndSet(SingleSubject.f);
            for(int v = 0; v < arr_m.length; ++v) {
                arr_m[v].a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(@NonNull SingleObserver singleObserver0) {
        m m0 = new m(singleObserver0, this);
        singleObserver0.onSubscribe(m0);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            m[] arr_m = (m[])atomicReference0.get();
            if(arr_m == SingleSubject.f) {
                Throwable throwable0 = this.d;
                if(throwable0 != null) {
                    singleObserver0.onError(throwable0);
                    return;
                }
                singleObserver0.onSuccess(this.c);
                return;
            }
            m[] arr_m1 = new m[arr_m.length + 1];
            System.arraycopy(arr_m, 0, arr_m1, 0, arr_m.length);
            arr_m1[arr_m.length] = m0;
            do {
                if(atomicReference0.compareAndSet(arr_m, arr_m1)) {
                    if(m0.isDisposed()) {
                        this.c(m0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_m);
        }
    }
}

