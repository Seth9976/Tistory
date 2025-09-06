package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class BehaviorProcessor extends FlowableProcessor {
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference e;
    public final AtomicReference f;
    public long g;
    public static final Object[] h;
    public static final b[] i;
    public static final b[] j;

    static {
        BehaviorProcessor.h = new Object[0];
        BehaviorProcessor.i = new b[0];
        BehaviorProcessor.j = new b[0];
    }

    public BehaviorProcessor() {
        this.e = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock0.readLock();
        this.d = reentrantReadWriteLock0.writeLock();
        this.b = new AtomicReference(BehaviorProcessor.i);
        this.f = new AtomicReference();
    }

    @CheckReturnValue
    @NonNull
    public static BehaviorProcessor create() {
        return new BehaviorProcessor();
    }

    @CheckReturnValue
    @NonNull
    public static BehaviorProcessor createDefault(Object object0) {
        ObjectHelper.requireNonNull(object0, "defaultValue is null");
        BehaviorProcessor behaviorProcessor0 = new BehaviorProcessor();
        Object object1 = ObjectHelper.requireNonNull(object0, "defaultValue is null");
        behaviorProcessor0.e.lazySet(object1);
        return behaviorProcessor0;
    }

    public final void e(b b0) {
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
                arr_b1 = BehaviorProcessor.i;
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

    public final void f(Object object0) {
        this.d.lock();
        ++this.g;
        this.e.lazySet(object0);
        this.d.unlock();
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        Object object0 = this.e.get();
        return NotificationLite.isError(object0) ? NotificationLite.getError(object0) : null;
    }

    @Nullable
    public Object getValue() {
        Object object0 = this.e.get();
        return NotificationLite.isComplete(object0) || NotificationLite.isError(object0) ? null : object0;
    }

    @Deprecated
    public Object[] getValues() {
        Object[] arr_object = this.getValues(BehaviorProcessor.h);
        return arr_object == BehaviorProcessor.h ? new Object[0] : arr_object;
    }

    @Deprecated
    public Object[] getValues(Object[] arr_object) {
        Object object0 = this.e.get();
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

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.e.get());
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return ((b[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return NotificationLite.isError(this.e.get());
    }

    public boolean hasValue() {
        Object object0 = this.e.get();
        return object0 != null && !NotificationLite.isComplete(object0) && !NotificationLite.isError(object0);
    }

    public boolean offer(Object object0) {
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        b[] arr_b = (b[])this.b.get();
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            if(arr_b[v1].get() == 0L) {
                return false;
            }
        }
        this.f(object0);
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v].a(object0, this.g);
        }
        return true;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference atomicReference0 = this.f;
        Throwable throwable0 = ExceptionHelper.TERMINATED;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                Object object0 = NotificationLite.complete();
                AtomicReference atomicReference1 = this.b;
                b[] arr_b = (b[])atomicReference1.get();
                b[] arr_b1 = BehaviorProcessor.j;
                if(arr_b != arr_b1) {
                    arr_b = (b[])atomicReference1.getAndSet(arr_b1);
                    if(arr_b != arr_b1) {
                        this.f(object0);
                    }
                }
                for(int v = 0; v < arr_b.length; ++v) {
                    arr_b[v].a(object0, this.g);
                }
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.f;
        do {
            if(atomicReference0.compareAndSet(null, throwable0)) {
                Object object0 = NotificationLite.error(throwable0);
                AtomicReference atomicReference1 = this.b;
                b[] arr_b = (b[])atomicReference1.get();
                b[] arr_b1 = BehaviorProcessor.j;
                if(arr_b != arr_b1) {
                    arr_b = (b[])atomicReference1.getAndSet(arr_b1);
                    if(arr_b != arr_b1) {
                        this.f(object0);
                    }
                }
                for(int v = 0; v < arr_b.length; ++v) {
                    arr_b[v].a(object0, this.g);
                }
                return;
            }
        }
        while(atomicReference0.get() == null);
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.f.get() != null) {
            return;
        }
        this.f(object0);
        b[] arr_b = (b[])this.b.get();
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v].a(object0, this.g);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(this.f.get() != null) {
            subscription0.cancel();
            return;
        }
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0;
        b b0 = new b(subscriber0, this);
        subscriber0.onSubscribe(b0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            b[] arr_b = (b[])atomicReference0.get();
            if(arr_b == BehaviorProcessor.j) {
                Throwable throwable0 = (Throwable)this.f.get();
                if(throwable0 == ExceptionHelper.TERMINATED) {
                    subscriber0.onComplete();
                    return;
                }
                subscriber0.onError(throwable0);
                return;
            }
            b[] arr_b1 = new b[arr_b.length + 1];
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            arr_b1[arr_b.length] = b0;
            do {
                if(atomicReference0.compareAndSet(arr_b, arr_b1)) {
                    if(b0.g) {
                        this.e(b0);
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
                            b0.h = b0.b.g;
                            Object object0 = b0.b.e.get();
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

