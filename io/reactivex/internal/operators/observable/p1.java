package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class p1 extends AtomicReference implements Observer, Disposable {
    public final AtomicInteger a;
    public final boolean b;
    public final int c;

    public p1(JoinSupport observableGroupJoin$JoinSupport0, boolean z, int v) {
        this.a = (AtomicInteger)observableGroupJoin$JoinSupport0;
        this.b = z;
        this.c = v;
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
        ((JoinSupport)this.a).innerClose(this.b, this);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        ((JoinSupport)this.a).innerCloseError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(DisposableHelper.dispose(this)) {
            ((JoinSupport)this.a).innerClose(this.b, this);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

