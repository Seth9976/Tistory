package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class j2 extends AtomicReference implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public Object c;

    public j2(Observer observer0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = observer0;
            return;
        }
        super();
        this.b = observer0;
        this.c = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(((AtomicReference)this.c));
            DisposableHelper.dispose(this);
            return;
        }
        ((Disposable)this.c).dispose();
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a == 0 ? ((Disposable)this.c).isDisposed() : DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        DisposableHelper.dispose(this);
        this.b.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        DisposableHelper.dispose(this);
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.b.onNext(object0);
            return;
        }
        this.b.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(((AtomicReference)this.c), disposable0);
            return;
        }
        if(DisposableHelper.validate(((Disposable)this.c), disposable0)) {
            this.c = disposable0;
            this.b.onSubscribe(this);
        }
    }
}

