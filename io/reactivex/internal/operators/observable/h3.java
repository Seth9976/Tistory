package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class h3 extends AtomicReference implements Observer, Disposable, Runnable {
    public final SerializedObserver a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final AtomicReference e;
    public Disposable f;

    public h3(SerializedObserver serializedObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.e = new AtomicReference();
        this.a = serializedObserver0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
    }

    public abstract void a();

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.e);
        this.f.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        DisposableHelper.dispose(this.e);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.e);
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.lazySet(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            this.a.onSubscribe(this);
            Disposable disposable1 = this.d.schedulePeriodicallyDirect(this, this.b, this.b, this.c);
            DisposableHelper.replace(this.e, disposable1);
        }
    }
}

