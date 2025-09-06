package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements MaybeObserver {
    public final MaybeObserver a;
    public final AtomicBoolean b;
    public final CompositeDisposable c;
    public Disposable d;

    public b(MaybeObserver maybeObserver0, CompositeDisposable compositeDisposable0, AtomicBoolean atomicBoolean0) {
        this.a = maybeObserver0;
        this.c = compositeDisposable0;
        this.b = atomicBoolean0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            this.c.delete(this.d);
            this.c.dispose();
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.b.compareAndSet(false, true)) {
            this.c.delete(this.d);
            this.c.dispose();
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        this.d = disposable0;
        this.c.add(disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        if(this.b.compareAndSet(false, true)) {
            this.c.delete(this.d);
            this.c.dispose();
            this.a.onSuccess(object0);
        }
    }
}

