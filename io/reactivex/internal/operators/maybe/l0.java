package io.reactivex.internal.operators.maybe;

import gd.f0;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class l0 extends AtomicReference implements MaybeObserver {
    public final f0 a;
    public final int b;

    public l0(f0 f00, int v) {
        this.a = f00;
        this.b = v;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        f0 f00 = this.a;
        if(f00.getAndSet(0) > 0) {
            f00.a(this.b);
            ((MaybeObserver)f00.b).onComplete();
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        f0 f00 = this.a;
        if(f00.getAndSet(0) > 0) {
            f00.a(this.b);
            ((MaybeObserver)f00.b).onError(throwable0);
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
        Object object1;
        f0 f00 = this.a;
        MaybeObserver maybeObserver0 = (MaybeObserver)f00.b;
        Object[] arr_object = (Object[])f00.e;
        arr_object[this.b] = object0;
        if(f00.decrementAndGet() == 0) {
            try {
                object1 = ObjectHelper.requireNonNull(((Function)f00.c).apply(arr_object), "The zipper returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                maybeObserver0.onError(throwable0);
                return;
            }
            maybeObserver0.onSuccess(object1);
        }
    }
}

