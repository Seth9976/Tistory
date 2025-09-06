package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicInteger;

public final class l4 extends AtomicInteger implements Observer, Disposable, Runnable {
    public final Observer a;
    public final long b;
    public final int c;
    public long d;
    public Disposable e;
    public UnicastSubject f;
    public volatile boolean g;

    public l4(Observer observer0, long v, int v1) {
        this.a = observer0;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        UnicastSubject unicastSubject0 = this.f;
        if(unicastSubject0 != null) {
            this.f = null;
            unicastSubject0.onComplete();
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        UnicastSubject unicastSubject0 = this.f;
        if(unicastSubject0 != null) {
            this.f = null;
            unicastSubject0.onError(throwable0);
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        UnicastSubject unicastSubject0 = this.f;
        if(unicastSubject0 == null && !this.g) {
            unicastSubject0 = UnicastSubject.create(this.c, this);
            this.f = unicastSubject0;
            this.a.onNext(unicastSubject0);
        }
        if(unicastSubject0 != null) {
            unicastSubject0.onNext(object0);
            long v = this.d + 1L;
            this.d = v;
            if(v >= this.b) {
                this.d = 0L;
                this.f = null;
                unicastSubject0.onComplete();
                if(this.g) {
                    this.e.dispose();
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        if(this.g) {
            this.e.dispose();
        }
    }
}

