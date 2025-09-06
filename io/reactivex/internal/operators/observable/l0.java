package io.reactivex.internal.operators.observable;

import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l0 extends DisposableObserver {
    public final m0 b;
    public final long c;
    public final Object d;
    public boolean e;
    public final AtomicBoolean f;

    public l0(m0 m00, long v, Object object0) {
        this.f = new AtomicBoolean();
        this.b = m00;
        this.c = v;
        this.d = object0;
    }

    public final void a() {
        if(this.f.compareAndSet(false, true)) {
            m0 m00 = this.b;
            Object object0 = this.d;
            if(this.c == m00.e) {
                m00.a.onNext(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.e) {
            return;
        }
        this.e = true;
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.e = true;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.e) {
            return;
        }
        this.e = true;
        this.dispose();
        this.a();
    }
}

