package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e extends AtomicInteger implements MaybeObserver, Subscription {
    public final Subscriber a;
    public final AtomicLong b;
    public final AtomicReference c;
    public final SequentialDisposable d;
    public final MaybeSource[] e;
    public final AtomicThrowable f;
    public int g;
    public long h;

    public e(Subscriber subscriber0, MaybeSource[] arr_maybeSource) {
        this.a = subscriber0;
        this.e = arr_maybeSource;
        this.b = new AtomicLong();
        this.d = new SequentialDisposable();
        this.c = new AtomicReference(NotificationLite.COMPLETE);
        this.f = new AtomicThrowable();
    }

    public final void a() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.c;
        do {
            SequentialDisposable sequentialDisposable0 = this.d;
            if(sequentialDisposable0.isDisposed()) {
                atomicReference0.lazySet(null);
                return;
            }
            Object object0 = atomicReference0.get();
            if(object0 != null) {
                Subscriber subscriber0 = this.a;
                if(object0 == NotificationLite.COMPLETE) {
                    atomicReference0.lazySet(null);
                label_18:
                    if(!sequentialDisposable0.isDisposed()) {
                        int v1 = this.g;
                        MaybeSource[] arr_maybeSource = this.e;
                        if(v1 == arr_maybeSource.length) {
                            AtomicThrowable atomicThrowable0 = this.f;
                            if(((Throwable)atomicThrowable0.get()) != null) {
                                subscriber0.onError(atomicThrowable0.terminate());
                                return;
                            }
                            subscriber0.onComplete();
                            return;
                        }
                        this.g = v1 + 1;
                        arr_maybeSource[v1].subscribe(this);
                    }
                }
                else {
                    long v = this.h;
                    if(v != this.b.get()) {
                        this.h = v + 1L;
                        atomicReference0.lazySet(null);
                        subscriber0.onNext(object0);
                        goto label_18;
                    }
                }
            }
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.dispose();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.c.lazySet(NotificationLite.COMPLETE);
        this.a();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.c.lazySet(NotificationLite.COMPLETE);
        if(this.f.addThrowable(throwable0)) {
            this.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        this.d.replace(disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.c.lazySet(object0);
        this.a();
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.b, v);
            this.a();
        }
    }
}

