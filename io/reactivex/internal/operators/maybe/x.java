package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class x extends AtomicReference implements MaybeObserver, Disposable {
    public final MaybeObserver a;
    public final Function b;
    public final Function c;
    public final Callable d;
    public Disposable e;

    public x(MaybeObserver maybeObserver0, Function function0, Function function1, Callable callable0) {
        this.a = maybeObserver0;
        this.b = function0;
        this.c = function1;
        this.d = callable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        MaybeSource maybeSource0;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.d.call(), "The onCompleteSupplier returned a null MaybeSource");
        }
        catch(Exception exception0) {
            Exceptions.throwIfFatal(exception0);
            this.a.onError(exception0);
            return;
        }
        maybeSource0.subscribe(new w(this, 0));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        MaybeSource maybeSource0;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.c.apply(throwable0), "The onErrorMapper returned a null MaybeSource");
        }
        catch(Exception exception0) {
            Exceptions.throwIfFatal(exception0);
            CompositeException compositeException0 = new CompositeException(new Throwable[]{throwable0, exception0});
            this.a.onError(compositeException0);
            return;
        }
        maybeSource0.subscribe(new w(this, 0));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        MaybeSource maybeSource0;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The onSuccessMapper returned a null MaybeSource");
        }
        catch(Exception exception0) {
            Exceptions.throwIfFatal(exception0);
            this.a.onError(exception0);
            return;
        }
        maybeSource0.subscribe(new w(this, 0));
    }
}

