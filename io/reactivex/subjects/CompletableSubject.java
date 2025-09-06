package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubject extends Completable implements CompletableObserver {
    public final AtomicReference a;
    public final AtomicBoolean b;
    public Throwable c;
    public static final c[] d;
    public static final c[] e;

    static {
        CompletableSubject.d = new c[0];
        CompletableSubject.e = new c[0];
    }

    public CompletableSubject() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(CompletableSubject.d);
    }

    @CheckReturnValue
    @NonNull
    public static CompletableSubject create() {
        return new CompletableSubject();
    }

    public final void d(c c0) {
        c[] arr_c1;
        while(true) {
            AtomicReference atomicReference0 = this.a;
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
                arr_c1 = CompletableSubject.d;
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

    @Nullable
    public Throwable getThrowable() {
        return this.a.get() == CompletableSubject.e ? this.c : null;
    }

    public boolean hasComplete() {
        return this.a.get() == CompletableSubject.e && this.c == null;
    }

    public boolean hasObservers() {
        return ((c[])this.a.get()).length != 0;
    }

    public boolean hasThrowable() {
        return this.a.get() == CompletableSubject.e && this.c != null;
    }

    @Override  // io.reactivex.CompletableObserver
    public void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            c[] arr_c = (c[])this.a.getAndSet(CompletableSubject.e);
            for(int v = 0; v < arr_c.length; ++v) {
                arr_c[v].a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = throwable0;
            c[] arr_c = (c[])this.a.getAndSet(CompletableSubject.e);
            for(int v = 0; v < arr_c.length; ++v) {
                arr_c[v].a.onError(throwable0);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        if(this.a.get() == CompletableSubject.e) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        c c0 = new c(completableObserver0, this);
        completableObserver0.onSubscribe(c0);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            c[] arr_c = (c[])atomicReference0.get();
            if(arr_c == CompletableSubject.e) {
                Throwable throwable0 = this.c;
                if(throwable0 != null) {
                    completableObserver0.onError(throwable0);
                    return;
                }
                completableObserver0.onComplete();
                return;
            }
            c[] arr_c1 = new c[arr_c.length + 1];
            System.arraycopy(arr_c, 0, arr_c1, 0, arr_c.length);
            arr_c1[arr_c.length] = c0;
            do {
                if(atomicReference0.compareAndSet(arr_c, arr_c1)) {
                    if(c0.isDisposed()) {
                        this.d(c0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_c);
        }
    }
}

