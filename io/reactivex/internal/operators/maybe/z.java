package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class z extends AtomicReference implements MaybeObserver, Disposable {
    public final MaybeObserver a;
    public final Function b;
    public Disposable c;

    public z(MaybeObserver maybeObserver0, Function function0) {
        this.a = maybeObserver0;
        this.b = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
        this.c.dispose();
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
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        MaybeSource maybeSource0;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null MaybeSource");
        }
        catch(Exception exception0) {
            Exceptions.throwIfFatal(exception0);
            this.a.onError(exception0);
            return;
        }
        if(!this.isDisposed()) {
            maybeSource0.subscribe(new w(this, 1));
        }
    }
}

