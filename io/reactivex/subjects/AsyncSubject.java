package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class AsyncSubject extends Subject {
    public final AtomicReference a;
    public Throwable b;
    public Object c;
    public static final a[] d;
    public static final a[] e;

    static {
        AsyncSubject.d = new a[0];
        AsyncSubject.e = new a[0];
    }

    public AsyncSubject() {
        this.a = new AtomicReference(AsyncSubject.d);
    }

    @CheckReturnValue
    @NonNull
    public static AsyncSubject create() {
        return new AsyncSubject();
    }

    public final void d(a a0) {
        a[] arr_a1;
        while(true) {
            AtomicReference atomicReference0 = this.a;
            a[] arr_a = (a[])atomicReference0.get();
            int v = arr_a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_a[v1] == a0) {
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
                arr_a1 = AsyncSubject.d;
            }
            else {
                a[] arr_a2 = new a[v - 1];
                System.arraycopy(arr_a, 0, arr_a2, 0, v1);
                System.arraycopy(arr_a, v1 + 1, arr_a2, v1, v - v1 - 1);
                arr_a1 = arr_a2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_a, arr_a1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_a);
        }
    }

    @Override  // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        return this.a.get() == AsyncSubject.e ? this.b : null;
    }

    @Nullable
    public Object getValue() {
        return this.a.get() == AsyncSubject.e ? this.c : null;
    }

    @Deprecated
    public Object[] getValues() {
        Object object0 = this.getValue();
        return object0 == null ? new Object[0] : new Object[]{object0};
    }

    @Deprecated
    public Object[] getValues(Object[] arr_object) {
        Object object0 = this.getValue();
        if(object0 == null) {
            if(arr_object.length != 0) {
                arr_object[0] = null;
            }
            return arr_object;
        }
        if(arr_object.length == 0) {
            arr_object = Arrays.copyOf(arr_object, 1);
        }
        arr_object[0] = object0;
        if(arr_object.length != 1) {
            arr_object[1] = null;
        }
        return arr_object;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.a.get() == AsyncSubject.e && this.b == null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return ((a[])this.a.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.a.get() == AsyncSubject.e && this.b != null;
    }

    public boolean hasValue() {
        return this.a.get() == AsyncSubject.e && this.c != null;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        AtomicReference atomicReference0 = this.a;
        Object object0 = atomicReference0.get();
        a[] arr_a = AsyncSubject.e;
        if(object0 == arr_a) {
            return;
        }
        Object object1 = this.c;
        a[] arr_a1 = (a[])atomicReference0.getAndSet(arr_a);
        int v = 0;
        if(object1 == null) {
            while(v < arr_a1.length) {
                arr_a1[v].onComplete();
                ++v;
            }
            return;
        }
        while(v < arr_a1.length) {
            arr_a1[v].complete(object1);
            ++v;
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.a;
        Object object0 = atomicReference0.get();
        a[] arr_a = AsyncSubject.e;
        if(object0 == arr_a) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = null;
        this.b = throwable0;
        a[] arr_a1 = (a[])atomicReference0.getAndSet(arr_a);
        for(int v = 0; v < arr_a1.length; ++v) {
            arr_a1[v].onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.a.get() == AsyncSubject.e) {
            return;
        }
        this.c = object0;
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(this.a.get() == AsyncSubject.e) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        a a0 = new a(observer0, this);
        observer0.onSubscribe(a0);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            a[] arr_a = (a[])atomicReference0.get();
            if(arr_a == AsyncSubject.e) {
                Throwable throwable0 = this.b;
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                Object object0 = this.c;
                if(object0 != null) {
                    a0.complete(object0);
                    return;
                }
                a0.onComplete();
                return;
            }
            a[] arr_a1 = new a[arr_a.length + 1];
            System.arraycopy(arr_a, 0, arr_a1, 0, arr_a.length);
            arr_a1[arr_a.length] = a0;
            do {
                if(atomicReference0.compareAndSet(arr_a, arr_a1)) {
                    if(a0.isDisposed()) {
                        this.d(a0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_a);
        }
    }
}

