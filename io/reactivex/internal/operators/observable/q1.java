package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class q1 extends AtomicReference implements Observer, Disposable {
    public final AtomicInteger a;
    public final boolean b;

    public q1(JoinSupport observableGroupJoin$JoinSupport0, boolean z) {
        this.a = (AtomicInteger)observableGroupJoin$JoinSupport0;
        this.b = z;
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
        ((JoinSupport)this.a).innerComplete(this);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        ((JoinSupport)this.a).innerError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ((JoinSupport)this.a).innerValue(this.b, object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

