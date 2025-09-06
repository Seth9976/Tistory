package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;

public final class w0 extends DisposableSubscriber {
    public final x0 b;
    public final long c;
    public final Object d;
    public boolean e;
    public final AtomicBoolean f;

    public w0(x0 x00, long v, Object object0) {
        this.f = new AtomicBoolean();
        this.b = x00;
        this.c = v;
        this.d = object0;
    }

    public final void a() {
        if(this.f.compareAndSet(false, true)) {
            x0 x00 = this.b;
            Object object0 = this.d;
            if(this.c == x00.e) {
                if(x00.get() != 0L) {
                    x00.a.onNext(object0);
                    BackpressureHelper.produced(x00, 1L);
                    return;
                }
                x00.cancel();
                MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver value due to lack of requests");
                x00.a.onError(missingBackpressureException0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.e) {
            return;
        }
        this.e = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.e) {
            return;
        }
        this.e = true;
        this.cancel();
        this.a();
    }
}

