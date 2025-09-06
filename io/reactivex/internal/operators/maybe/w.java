package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class w implements MaybeObserver {
    public final int a;
    public final AtomicReference b;

    public w(AtomicReference atomicReference0, int v) {
        this.a = v;
        this.b = atomicReference0;
        super();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            ((z)this.b).a.onComplete();
            return;
        }
        ((x)this.b).a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            ((z)this.b).a.onError(throwable0);
            return;
        }
        ((x)this.b).a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(((z)this.b), disposable0);
            return;
        }
        DisposableHelper.setOnce(((x)this.b), disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        if(this.a != 0) {
            ((z)this.b).a.onSuccess(object0);
            return;
        }
        ((x)this.b).a.onSuccess(object0);
    }
}

