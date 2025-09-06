package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

public final class a0 implements MaybeObserver, Disposable {
    public final int a;
    public final MaybeObserver b;
    public final Function c;
    public Disposable d;

    public a0(int v, MaybeObserver maybeObserver0, Function function0) {
        this.a = v;
        this.b = maybeObserver0;
        this.c = function0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.d.dispose();
            return;
        }
        Disposable disposable0 = this.d;
        this.d = DisposableHelper.DISPOSED;
        disposable0.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        this.b.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        Object object0;
        MaybeObserver maybeObserver0;
        if(this.a != 0) {
            try {
                maybeObserver0 = this.b;
                object0 = ObjectHelper.requireNonNull(this.c.apply(throwable0), "The valueSupplier returned a null value");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                maybeObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
            maybeObserver0.onSuccess(object0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.d, disposable0)) {
                this.d = disposable0;
                this.b.onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.b.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        Object object1;
        MaybeObserver maybeObserver0;
        if(this.a != 0) {
            this.b.onSuccess(object0);
            return;
        }
        try {
            maybeObserver0 = this.b;
            object1 = ObjectHelper.requireNonNull(this.c.apply(object0), "The mapper returned a null item");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            maybeObserver0.onError(throwable0);
            return;
        }
        maybeObserver0.onSuccess(object1);
    }
}

