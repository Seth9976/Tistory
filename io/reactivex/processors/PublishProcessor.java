package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class PublishProcessor extends FlowableProcessor {
    public final AtomicReference b;
    public Throwable c;
    public static final d[] d;
    public static final d[] e;

    static {
        PublishProcessor.d = new d[0];
        PublishProcessor.e = new d[0];
    }

    public PublishProcessor() {
        this.b = new AtomicReference(PublishProcessor.e);
    }

    @CheckReturnValue
    @NonNull
    public static PublishProcessor create() {
        return new PublishProcessor();
    }

    public final void e(d d0) {
        while(true) {
            AtomicReference atomicReference0 = this.b;
            d[] arr_d = (d[])atomicReference0.get();
            if(arr_d == PublishProcessor.d) {
                break;
            }
            d[] arr_d1 = PublishProcessor.e;
            if(arr_d == arr_d1) {
                break;
            }
            int v = arr_d.length;
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
            if(v != 1) {
                arr_d1 = new d[v - 1];
                System.arraycopy(arr_d, 0, arr_d1, 0, v1);
                System.arraycopy(arr_d, v1 + 1, arr_d1, v1, v - v1 - 1);
            }
            do {
                if(atomicReference0.compareAndSet(arr_d, arr_d1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_d);
        }
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.b.get() == PublishProcessor.d ? this.c : null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.b.get() == PublishProcessor.d && this.c == null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return ((d[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.b.get() == PublishProcessor.d && this.c != null;
    }

    public boolean offer(Object object0) {
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        d[] arr_d = (d[])this.b.get();
        for(int v1 = 0; v1 < arr_d.length; ++v1) {
            if(arr_d[v1].get() == 0L) {
                return false;
            }
        }
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d[v].a(object0);
        }
        return true;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        AtomicReference atomicReference0 = this.b;
        Object object0 = atomicReference0.get();
        d[] arr_d = PublishProcessor.d;
        if(object0 == arr_d) {
            return;
        }
        d[] arr_d1 = (d[])atomicReference0.getAndSet(arr_d);
        for(int v = 0; v < arr_d1.length; ++v) {
            d d0 = arr_d1[v];
            if(d0.get() != 0x8000000000000000L) {
                d0.a.onComplete();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference0 = this.b;
        Object object0 = atomicReference0.get();
        d[] arr_d = PublishProcessor.d;
        if(object0 == arr_d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = throwable0;
        d[] arr_d1 = (d[])atomicReference0.getAndSet(arr_d);
        for(int v = 0; v < arr_d1.length; ++v) {
            d d0 = arr_d1[v];
            if(d0.get() == 0x8000000000000000L) {
                RxJavaPlugins.onError(throwable0);
            }
            else {
                d0.a.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        d[] arr_d = (d[])this.b.get();
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d[v].a(object0);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(this.b.get() == PublishProcessor.d) {
            subscription0.cancel();
            return;
        }
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        d d0 = new d(subscriber0, this);
        subscriber0.onSubscribe(d0);
        while(true) {
            AtomicReference atomicReference0 = this.b;
            d[] arr_d = (d[])atomicReference0.get();
            if(arr_d == PublishProcessor.d) {
                Throwable throwable0 = this.c;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            d[] arr_d1 = new d[arr_d.length + 1];
            System.arraycopy(arr_d, 0, arr_d1, 0, arr_d.length);
            arr_d1[arr_d.length] = d0;
            do {
                if(atomicReference0.compareAndSet(arr_d, arr_d1)) {
                    if(d0.get() == 0x8000000000000000L) {
                        this.e(d0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == arr_d);
        }
    }
}

