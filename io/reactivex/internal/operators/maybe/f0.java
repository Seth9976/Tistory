package io.reactivex.internal.operators.maybe;

import gd.r;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class f0 extends AtomicReference implements MaybeObserver, Disposable {
    public final MaybeObserver a;
    public final Function b;
    public final boolean c;

    public f0(MaybeObserver maybeObserver0, Function function0, boolean z) {
        this.a = maybeObserver0;
        this.b = function0;
        this.c = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        MaybeSource maybeSource0;
        MaybeObserver maybeObserver0 = this.a;
        if(!this.c && !(throwable0 instanceof Exception)) {
            maybeObserver0.onError(throwable0);
            return;
        }
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.b.apply(throwable0), "The resumeFunction returned a null MaybeSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            maybeObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
        DisposableHelper.replace(this, null);
        maybeSource0.subscribe(new r(maybeObserver0, this, 3));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.a.onSuccess(object0);
    }
}

