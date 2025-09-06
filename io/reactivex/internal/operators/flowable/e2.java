package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class e2 extends AtomicLong implements Emitter, Subscription {
    public final Subscriber a;
    public final BiFunction b;
    public final Consumer c;
    public Object d;
    public volatile boolean e;
    public boolean f;
    public boolean g;

    public e2(Subscriber subscriber0, BiFunction biFunction0, Consumer consumer0, Object object0) {
        this.a = subscriber0;
        this.b = biFunction0;
        this.c = consumer0;
        this.d = object0;
    }

    public final void a(Object object0) {
        try {
            this.c.accept(object0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.e) {
            this.e = true;
            if(BackpressureHelper.add(this, 1L) == 0L) {
                Object object0 = this.d;
                this.d = null;
                this.a(object0);
            }
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onComplete() {
        if(!this.f) {
            this.f = true;
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(!this.f) {
            if(this.g) {
                this.onError(new IllegalStateException("onNext already called in this generate turn"));
                return;
            }
            if(object0 == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.g = true;
            this.a.onNext(object0);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(!SubscriptionHelper.validate(v)) {
            return;
        }
        if(BackpressureHelper.add(this, v) != 0L) {
            return;
        }
        Object object0 = this.d;
        BiFunction biFunction0 = this.b;
        do {
            long v1 = 0L;
            while(true) {
                if(v1 == v) {
                    long v2 = this.get();
                    if(v1 == v2) {
                        break;
                    }
                    v = v2;
                }
                else {
                    if(this.e) {
                        this.d = null;
                        this.a(object0);
                        return;
                    }
                    try {
                        this.g = false;
                        object0 = biFunction0.apply(object0, this);
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.e = true;
                        this.d = null;
                        this.onError(throwable0);
                        this.a(object0);
                        return;
                    }
                    if(this.f) {
                        this.e = true;
                        this.d = null;
                        this.a(object0);
                        return;
                    }
                    ++v1;
                }
            }
            this.d = object0;
            v = this.addAndGet(-v1);
        }
        while(v != 0L);
    }
}

