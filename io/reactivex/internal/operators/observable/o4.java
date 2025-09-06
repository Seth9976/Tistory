package io.reactivex.internal.operators.observable;

import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;

public final class o4 extends DisposableObserver {
    public final p4 b;
    public final UnicastSubject c;
    public boolean d;

    public o4(p4 p40, UnicastSubject unicastSubject0) {
        this.b = p40;
        this.c = unicastSubject0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.b.M(this);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.b.g.dispose();
        this.b.f.dispose();
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.dispose();
        this.onComplete();
    }
}

