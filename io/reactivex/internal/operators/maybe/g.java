package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.NoSuchElementException;

public final class g implements MaybeObserver, Disposable {
    public final int a;
    public final SingleObserver b;
    public final Object c;
    public Disposable d;

    public g(int v, SingleObserver singleObserver0, Object object0) {
        this.a = v;
        this.b = singleObserver0;
        this.c = object0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.d.dispose();
            this.d = DisposableHelper.DISPOSED;
            return;
        }
        this.d.dispose();
        this.d = DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            this.d = DisposableHelper.DISPOSED;
            SingleObserver singleObserver0 = this.b;
            Object object0 = this.c;
            if(object0 != null) {
                singleObserver0.onSuccess(object0);
                return;
            }
            singleObserver0.onError(new NoSuchElementException("The MaybeSource is empty"));
            return;
        }
        this.d = DisposableHelper.DISPOSED;
        this.b.onSuccess(Boolean.FALSE);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.d = DisposableHelper.DISPOSED;
            this.b.onError(throwable0);
            return;
        }
        this.d = DisposableHelper.DISPOSED;
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
        if(this.a != 0) {
            this.d = DisposableHelper.DISPOSED;
            this.b.onSuccess(object0);
            return;
        }
        this.d = DisposableHelper.DISPOSED;
        Boolean boolean0 = Boolean.valueOf(ObjectHelper.equals(object0, this.c));
        this.b.onSuccess(boolean0);
    }
}

