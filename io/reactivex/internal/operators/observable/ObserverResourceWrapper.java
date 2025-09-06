package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObserverResourceWrapper extends AtomicReference implements Observer, Disposable {
    public final Observer a;
    public final AtomicReference b;

    public ObserverResourceWrapper(Observer observer0) {
        this.b = new AtomicReference();
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.b);
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        this.dispose();
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        this.dispose();
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this.b, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    public void setResource(Disposable disposable0) {
        DisposableHelper.set(this, disposable0);
    }
}

