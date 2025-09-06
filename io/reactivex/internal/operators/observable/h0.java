package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class h0 extends AtomicReference implements Observer, SingleObserver, Disposable {
    public final Observer a;
    public SingleSource b;
    public boolean c;

    public h0(Observer observer0, SingleSource singleSource0) {
        this.a = observer0;
        this.b = singleSource0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.c = true;
        DisposableHelper.replace(this, null);
        SingleSource singleSource0 = this.b;
        this.b = null;
        singleSource0.subscribe(this);
    }

    @Override  // io.reactivex.Observer, io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0) && !this.c) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        this.a.onNext(object0);
        this.a.onComplete();
    }
}

