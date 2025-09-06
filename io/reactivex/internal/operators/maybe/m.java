package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class m extends AtomicReference implements MaybeObserver {
    public final int a;
    public final MaybeObserver b;

    public m(MaybeObserver maybeObserver0, int v) {
        this.a = v;
        super();
        this.b = maybeObserver0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.b.onComplete();
                return;
            }
            case 1: {
                this.b.onComplete();
                return;
            }
            default: {
                this.b.onComplete();
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b.onError(throwable0);
                return;
            }
            case 1: {
                this.b.onError(throwable0);
                return;
            }
            default: {
                this.b.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 1: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        switch(this.a) {
            case 0: {
                this.b.onSuccess(object0);
                return;
            }
            case 1: {
                this.b.onSuccess(object0);
                return;
            }
            default: {
                this.b.onSuccess(object0);
            }
        }
    }
}

