package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class AsyncProcessor extends FlowableProcessor {
    public final AtomicReference b;
    public Throwable c;
    public Object d;
    public static final a[] e;
    public static final a[] f;

    static {
        AsyncProcessor.e = new a[0];
        AsyncProcessor.f = new a[0];
    }

    public AsyncProcessor() {
        this.b = new AtomicReference(AsyncProcessor.e);
    }

    @CheckReturnValue
    @NonNull
    public static AsyncProcessor create() {
        return new AsyncProcessor();
    }

    public final void e(a a0) {
        a[] arr_a1;
        while(true) {
            AtomicReference atomicReference0 = this.b;
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
                arr_a1 = AsyncProcessor.e;
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

    @Override  // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.b.get() == AsyncProcessor.f ? this.c : null;
    }

    @Nullable
    public Object getValue() {
        return this.b.get() == AsyncProcessor.f ? this.d : null;
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

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.b.get() == AsyncProcessor.f && this.c == null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return ((a[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.b.get() == AsyncProcessor.f && this.c != null;
    }

    public boolean hasValue() {
        return this.b.get() == AsyncProcessor.f && this.d != null;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference atomicReference0 = this.b;
        Object object0 = atomicReference0.get();
        a[] arr_a = AsyncProcessor.f;
        if(object0 == arr_a) {
            return;
        }
        Object object1 = this.d;
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

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.b;
        Object object0 = atomicReference0.get();
        a[] arr_a = AsyncProcessor.f;
        if(object0 == arr_a) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = null;
        this.c = throwable0;
        a[] arr_a1 = (a[])atomicReference0.getAndSet(arr_a);
        for(int v = 0; v < arr_a1.length; ++v) {
            arr_a1[v].onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.get() == AsyncProcessor.f) {
            return;
        }
        this.d = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(this.b.get() == AsyncProcessor.f) {
            subscription0.cancel();
            return;
        }
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        a a0 = new a(subscriber0, this);
        subscriber0.onSubscribe(a0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            a[] arr_a = (a[])atomicReference0.get();
            if(arr_a == AsyncProcessor.f) {
                Throwable throwable0 = this.c;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                Object object0 = this.d;
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
                    if(a0.isCancelled()) {
                        this.e(a0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_a);
        }
    }
}

