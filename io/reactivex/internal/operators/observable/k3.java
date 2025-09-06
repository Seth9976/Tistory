package io.reactivex.internal.operators.observable;

import dd.n;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

public abstract class k3 extends AtomicReference implements Observer, Disposable {
    public final SerializedObserver a;
    public final ObservableSource b;
    public final AtomicReference c;
    public Disposable d;

    public k3(SerializedObserver serializedObserver0, ObservableSource observableSource0) {
        this.c = new AtomicReference();
        this.a = serializedObserver0;
        this.b = observableSource0;
    }

    public abstract void a();

    public abstract void b();

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.c);
        this.d.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        DisposableHelper.dispose(this.c);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.c);
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.lazySet(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
            if(this.c.get() == null) {
                n n0 = new n(this, 2);
                this.b.subscribe(n0);
            }
        }
    }
}

