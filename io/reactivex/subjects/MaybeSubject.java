package io.reactivex.subjects;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSubject extends Maybe implements MaybeObserver {
    public final AtomicReference a;
    public final AtomicBoolean b;
    public Object c;
    public Throwable d;
    public static final d[] e;
    public static final d[] f;

    static {
        MaybeSubject.e = new d[0];
        MaybeSubject.f = new d[0];
    }

    public MaybeSubject() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(MaybeSubject.e);
    }

    public final void a(d d0) {
        d[] arr_d1;
        while(true) {
            AtomicReference atomicReference0 = this.a;
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
                arr_d1 = MaybeSubject.e;
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

    @CheckReturnValue
    @NonNull
    public static MaybeSubject create() {
        return new MaybeSubject();
    }

    @Nullable
    public Throwable getThrowable() {
        return this.a.get() == MaybeSubject.f ? this.d : null;
    }

    @Nullable
    public Object getValue() {
        return this.a.get() == MaybeSubject.f ? this.c : null;
    }

    public boolean hasComplete() {
        return this.a.get() == MaybeSubject.f && this.c == null && this.d == null;
    }

    public boolean hasObservers() {
        return ((d[])this.a.get()).length != 0;
    }

    public boolean hasThrowable() {
        return this.a.get() == MaybeSubject.f && this.d != null;
    }

    public boolean hasValue() {
        return this.a.get() == MaybeSubject.f && this.c != null;
    }

    @Override  // io.reactivex.MaybeObserver
    public void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            d[] arr_d = (d[])this.a.getAndSet(MaybeSubject.f);
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.d = throwable0;
            d[] arr_d = (d[])this.a.getAndSet(MaybeSubject.f);
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].a.onError(throwable0);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable0) {
        if(this.a.get() == MaybeSubject.f) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public void onSuccess(Object object0) {
        ObjectHelper.requireNonNull(object0, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = object0;
            d[] arr_d = (d[])this.a.getAndSet(MaybeSubject.f);
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        d d0 = new d(maybeObserver0, this);
        maybeObserver0.onSubscribe(d0);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            d[] arr_d = (d[])atomicReference0.get();
            if(arr_d == MaybeSubject.f) {
                Throwable throwable0 = this.d;
                if(throwable0 != null) {
                    maybeObserver0.onError(throwable0);
                    return;
                }
                Object object0 = this.c;
                if(object0 == null) {
                    maybeObserver0.onComplete();
                    return;
                }
                maybeObserver0.onSuccess(object0);
                return;
            }
            d[] arr_d1 = new d[arr_d.length + 1];
            System.arraycopy(arr_d, 0, arr_d1, 0, arr_d.length);
            arr_d1[arr_d.length] = d0;
            do {
                if(atomicReference0.compareAndSet(arr_d, arr_d1)) {
                    if(d0.isDisposed()) {
                        this.a(d0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_d);
        }
    }
}

