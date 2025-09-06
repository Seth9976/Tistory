package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishSubject extends Subject {
    public final AtomicReference a;
    public Throwable b;
    public static final e[] c;
    public static final e[] d;

    static {
        PublishSubject.c = new e[0];
        PublishSubject.d = new e[0];
    }

    public PublishSubject() {
        this.a = new AtomicReference(PublishSubject.d);
    }

    @CheckReturnValue
    @NonNull
    public static PublishSubject create() {
        return new PublishSubject();
    }

    public final void d(e e0) {
        while(true) {
            AtomicReference atomicReference0 = this.a;
            e[] arr_e = (e[])atomicReference0.get();
            if(arr_e == PublishSubject.c) {
                break;
            }
            e[] arr_e1 = PublishSubject.d;
            if(arr_e == arr_e1) {
                break;
            }
            int v = arr_e.length;
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_e[v1] == e0) {
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
            if(v != 1) {
                arr_e1 = new e[v - 1];
                System.arraycopy(arr_e, 0, arr_e1, 0, v1);
                System.arraycopy(arr_e, v1 + 1, arr_e1, v1, v - v1 - 1);
            }
            do {
                if(atomicReference0.compareAndSet(arr_e, arr_e1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_e);
        }
    }

    @Override  // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        return this.a.get() == PublishSubject.c ? this.b : null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.a.get() == PublishSubject.c && this.b == null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return ((e[])this.a.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.a.get() == PublishSubject.c && this.b != null;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        AtomicReference atomicReference0 = this.a;
        Object object0 = atomicReference0.get();
        e[] arr_e = PublishSubject.c;
        if(object0 == arr_e) {
            return;
        }
        e[] arr_e1 = (e[])atomicReference0.getAndSet(arr_e);
        for(int v = 0; v < arr_e1.length; ++v) {
            e e0 = arr_e1[v];
            if(!e0.get()) {
                e0.a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.a;
        Object object0 = atomicReference0.get();
        e[] arr_e = PublishSubject.c;
        if(object0 == arr_e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.b = throwable0;
        e[] arr_e1 = (e[])atomicReference0.getAndSet(arr_e);
        for(int v = 0; v < arr_e1.length; ++v) {
            e e0 = arr_e1[v];
            if(e0.get()) {
                RxJavaPlugins.onError(throwable0);
            }
            else {
                e0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        e[] arr_e = (e[])this.a.get();
        for(int v = 0; v < arr_e.length; ++v) {
            e e0 = arr_e[v];
            if(!e0.get()) {
                e0.a.onNext(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(this.a.get() == PublishSubject.c) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        e e0 = new e(observer0, this);
        observer0.onSubscribe(e0);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            e[] arr_e = (e[])atomicReference0.get();
            if(arr_e == PublishSubject.c) {
                Throwable throwable0 = this.b;
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                observer0.onComplete();
                return;
            }
            e[] arr_e1 = new e[arr_e.length + 1];
            System.arraycopy(arr_e, 0, arr_e1, 0, arr_e.length);
            arr_e1[arr_e.length] = e0;
            do {
                if(atomicReference0.compareAndSet(arr_e, arr_e1)) {
                    if(e0.get()) {
                        this.d(e0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_e);
        }
    }
}

