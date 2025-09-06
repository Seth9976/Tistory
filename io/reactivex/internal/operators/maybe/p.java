package io.reactivex.internal.operators.maybe;

import gd.f0;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends AtomicReference implements MaybeObserver {
    public final f0 a;
    public Object b;

    public p(f0 f00) {
        this.a = f00;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.a.b();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        f0 f00 = this.a;
        if(f00.getAndSet(0) > 0) {
            p p0 = (p)f00.c;
            if(this == p0) {
                ((p)f00.d).getClass();
                DisposableHelper.dispose(((p)f00.d));
            }
            else {
                p0.getClass();
                DisposableHelper.dispose(p0);
            }
            ((SingleObserver)f00.b).onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.b = object0;
        this.a.b();
    }
}

