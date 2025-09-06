package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f extends AtomicInteger implements MaybeObserver, Subscription {
    public final Subscriber a;
    public final AtomicLong b;
    public final AtomicReference c;
    public final SequentialDisposable d;
    public final Iterator e;
    public long f;

    public f(Subscriber subscriber0, Iterator iterator0) {
        this.a = subscriber0;
        this.e = iterator0;
        this.b = new AtomicLong();
        this.d = new SequentialDisposable();
        this.c = new AtomicReference(NotificationLite.COMPLETE);
    }

    public final void a() {
        MaybeSource maybeSource0;
        Iterator iterator0 = this.e;
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
                label_19:
                    if(!sequentialDisposable0.isDisposed()) {
                        try {
                            if(iterator0.hasNext()) {
                                goto label_26;
                            }
                            else {
                                goto label_35;
                            }
                            continue;
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            subscriber0.onError(throwable0);
                            return;
                        }
                        try {
                        label_26:
                            Object object1 = iterator0.next();
                            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(object1, "The source Iterator returned a null MaybeSource");
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            subscriber0.onError(throwable1);
                            return;
                        }
                        maybeSource0.subscribe(this);
                        continue;
                    label_35:
                        subscriber0.onComplete();
                    }
                }
                else {
                    long v = this.f;
                    if(v != this.b.get()) {
                        this.f = v + 1L;
                        atomicReference0.lazySet(null);
                        subscriber0.onNext(object0);
                        goto label_19;
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
        this.a.onError(throwable0);
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

