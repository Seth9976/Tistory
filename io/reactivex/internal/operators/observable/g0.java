package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class g0 extends AtomicReference implements MaybeObserver, Observer, Disposable {
    public final Observer a;
    public MaybeSource b;
    public boolean c;

    public g0(Observer observer0, MaybeSource maybeSource0) {
        this.a = observer0;
        this.b = maybeSource0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.c) {
            this.a.onComplete();
            return;
        }
        this.c = true;
        DisposableHelper.replace(this, null);
        MaybeSource maybeSource0 = this.b;
        this.b = null;
        maybeSource0.subscribe(this);
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0) && !this.c) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.a.onNext(object0);
        this.a.onComplete();
    }
}

