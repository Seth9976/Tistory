package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class q0 implements Observer, Disposable {
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Worker d;
    public final boolean e;
    public Disposable f;

    public q0(Observer observer0, long v, TimeUnit timeUnit0, Worker scheduler$Worker0, boolean z) {
        this.a = observer0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler$Worker0;
        this.e = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        o0 o00 = new o0(this);
        this.d.schedule(o00, this.b, this.c);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        p0 p00 = new p0(this, throwable0);
        this.d.schedule(p00, (this.e ? this.b : 0L), this.c);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        t3 t30 = new t3(1, this, object0);
        this.d.schedule(t30, this.b, this.c);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

