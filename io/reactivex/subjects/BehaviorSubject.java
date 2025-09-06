package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class BehaviorSubject extends Subject {
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference e;
    public long f;
    public static final Object[] g;
    public static final b[] h;
    public static final b[] i;

    static {
        BehaviorSubject.g = new Object[0];
        BehaviorSubject.h = new b[0];
        BehaviorSubject.i = new b[0];
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock0.readLock();
        this.d = reentrantReadWriteLock0.writeLock();
        this.b = new AtomicReference(BehaviorSubject.h);
        this.a = new AtomicReference();
        this.e = new AtomicReference();
    }

    @CheckReturnValue
    @NonNull
    public static BehaviorSubject create() {
        return new BehaviorSubject();
    }

    @CheckReturnValue
    @NonNull
    public static BehaviorSubject createDefault(Object object0) {
        BehaviorSubject behaviorSubject0 = new BehaviorSubject();
        Object object1 = ObjectHelper.requireNonNull(object0, "defaultValue is null");
        behaviorSubject0.a.lazySet(object1);
        return behaviorSubject0;
    }

    public final void d(b b0) {
        b[] arr_b1;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            b[] arr_b = (b[])atomicReference0.get();
            int v = arr_b.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_b[v1] == b0) {
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
                arr_b1 = BehaviorSubject.h;
            }
            else {
                b[] arr_b2 = new b[v - 1];
                System.arraycopy(arr_b, 0, arr_b2, 0, v1);
                System.arraycopy(arr_b, v1 + 1, arr_b2, v1, v - v1 - 1);
                arr_b1 = arr_b2;
            }
            do {
                if(atomicReference0.compareAndSet(arr_b, arr_b1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_b);
        }
    }

    @Override  // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object object0 = this.a.get();
        return NotificationLite.isError(object0) ? NotificationLite.getError(object0) : null;
    }

    @Nullable
    public Object getValue() {
        Object object0 = this.a.get();
        return NotificationLite.isComplete(object0) || NotificationLite.isError(object0) ? null : object0;
    }

    @Deprecated
    public Object[] getValues() {
        Object[] arr_object = this.getValues(BehaviorSubject.g);
        return arr_object == BehaviorSubject.g ? new Object[0] : arr_object;
    }

    @Deprecated
    public Object[] getValues(Object[] arr_object) {
        Object object0 = this.a.get();
        if(object0 != null && !NotificationLite.isComplete(object0) && !NotificationLite.isError(object0)) {
            if(arr_object.length == 0) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), 1);
                arr_object[0] = object0;
            }
            else {
                arr_object[0] = object0;
                if(arr_object.length != 1) {
                    arr_object[1] = null;
                    return arr_object;
                }
            }
            return arr_object;
        }
        if(arr_object.length != 0) {
            arr_object[0] = null;
        }
        return arr_object;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.a.get());
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return ((b[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.a.get());
    }

    public boolean hasValue() {
        Object object0 = this.a.get();
        return object0 != null && !NotificationLite.isComplete(object0) && !NotificationLite.isError(object0);
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        AtomicReference atomicReference0 = this.e;
        Throwable throwable0 = ExceptionHelper.TERMINATED;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                Object object0 = NotificationLite.complete();
                b[] arr_b = (b[])this.b.getAndSet(BehaviorSubject.i);
                if(arr_b != BehaviorSubject.i) {
                    this.d.lock();
                    ++this.f;
                    this.a.lazySet(object0);
                    this.d.unlock();
                }
                for(int v = 0; v < arr_b.length; ++v) {
                    arr_b[v].a(object0, this.f);
                }
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.e;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                Object object0 = NotificationLite.error(throwable0);
                b[] arr_b = (b[])this.b.getAndSet(BehaviorSubject.i);
                if(arr_b != BehaviorSubject.i) {
                    this.d.lock();
                    ++this.f;
                    this.a.lazySet(object0);
                    this.d.unlock();
                }
                for(int v = 0; v < arr_b.length; ++v) {
                    arr_b[v].a(object0, this.f);
                }
                return;
            }
        }
        while(atomicReference0.get() == null);
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.e.get() != null) {
            return;
        }
        this.d.lock();
        ++this.f;
        this.a.lazySet(object0);
        this.d.unlock();
        b[] arr_b = (b[])this.b.get();
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v].a(object0, this.f);
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(this.e.get() != null) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0;
        b b0 = new b(observer0, this);
        observer0.onSubscribe(b0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            b[] arr_b = (b[])atomicReference0.get();
            if(arr_b == BehaviorSubject.i) {
                Throwable throwable0 = (Throwable)this.e.get();
                if(throwable0 == ExceptionHelper.TERMINATED) {
                    observer0.onComplete();
                    return;
                }
                observer0.onError(throwable0);
                return;
            }
            b[] arr_b1 = new b[arr_b.length + 1];
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            arr_b1[arr_b.length] = b0;
            do {
                if(atomicReference0.compareAndSet(arr_b, arr_b1)) {
                    if(b0.g) {
                        this.d(b0);
                        return;
                    }
                    if(!b0.g) {
                        __monitor_enter(b0);
                        if(b0.g) {
                            __monitor_exit(b0);
                            return;
                        }
                        if(b0.c) {
                            __monitor_exit(b0);
                            return;
                        }
                        try {
                            b0.b.c.lock();
                            b0.h = b0.b.f;
                            Object object0 = b0.b.a.get();
                            b0.b.c.unlock();
                            b0.d = object0 != null;
                            b0.c = true;
                        }
                        catch(Throwable throwable1) {
                            __monitor_exit(b0);
                            throw throwable1;
                        }
                        __monitor_exit(b0);
                        if(object0 != null && !b0.test(object0)) {
                            while(!b0.g) {
                                synchronized(b0) {
                                    appendOnlyLinkedArrayList0 = b0.e;
                                    if(appendOnlyLinkedArrayList0 == null) {
                                        b0.d = false;
                                        return;
                                    }
                                    b0.e = null;
                                }
                                appendOnlyLinkedArrayList0.forEachWhile(b0);
                            }
                            return;
                        }
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_b);
        }
    }
}

