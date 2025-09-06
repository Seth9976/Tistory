package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class r extends AtomicReference implements MaybeObserver {
    public final MaybeObserver a;
    public final BiFunction b;
    public Object c;

    public r(MaybeObserver maybeObserver0, BiFunction biFunction0) {
        this.a = maybeObserver0;
        this.b = biFunction0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        Object object2;
        MaybeObserver maybeObserver0;
        try {
            maybeObserver0 = this.a;
            Object object1 = this.c;
            this.c = null;
            object2 = ObjectHelper.requireNonNull(this.b.apply(object1, object0), "The resultSelector returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            maybeObserver0.onError(throwable0);
            return;
        }
        maybeObserver0.onSuccess(object2);
    }
}

