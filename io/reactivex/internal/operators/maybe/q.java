package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

public final class q implements MaybeObserver, Disposable {
    public final int a;
    public final MaybeObserver b;
    public final Predicate c;
    public Disposable d;

    public q(MaybeObserver maybeObserver0, Predicate predicate0, int v) {
        this.a = v;
        this.b = maybeObserver0;
        this.c = predicate0;
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
        MaybeObserver maybeObserver0;
        if(this.a != 0) {
            try {
                maybeObserver0 = this.b;
                if(this.c.test(throwable0)) {
                    goto label_8;
                }
                goto label_10;
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                maybeObserver0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                return;
            }
        label_8:
            maybeObserver0.onComplete();
            return;
        label_10:
            maybeObserver0.onError(throwable0);
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
        MaybeObserver maybeObserver0;
        if(this.a != 0) {
            this.b.onSuccess(object0);
            return;
        }
        try {
            maybeObserver0 = this.b;
            if(this.c.test(object0)) {
                goto label_10;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            maybeObserver0.onError(throwable0);
            return;
        }
    label_10:
        maybeObserver0.onSuccess(object0);
        return;
    label_12:
        maybeObserver0.onComplete();
    }
}

