package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

public final class s implements MaybeObserver, Disposable {
    public final int a;
    public final Object b;
    public Object c;

    public s(CompletableObserver completableObserver0) {
        this.a = 1;
        super();
        this.b = completableObserver0;
    }

    public s(MaybeObserver maybeObserver0, Function function0, BiFunction biFunction0) {
        this.a = 0;
        super();
        this.c = new r(maybeObserver0, biFunction0);
        this.b = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            ((Disposable)this.c).dispose();
            this.c = DisposableHelper.DISPOSED;
            return;
        }
        DisposableHelper.dispose(((r)this.c));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a == 0 ? DisposableHelper.isDisposed(((Disposable)((r)this.c).get())) : ((Disposable)this.c).isDisposed();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            ((CompletableObserver)this.b).onComplete();
            return;
        }
        ((r)this.c).a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            ((CompletableObserver)this.b).onError(throwable0);
            return;
        }
        ((r)this.c).a.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(((Disposable)this.c), disposable0)) {
                this.c = disposable0;
                ((CompletableObserver)this.b).onSubscribe(this);
            }
            return;
        }
        r r0 = (r)this.c;
        if(DisposableHelper.setOnce(r0, disposable0)) {
            r0.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        MaybeSource maybeSource0;
        if(this.a != 0) {
            this.c = DisposableHelper.DISPOSED;
            ((CompletableObserver)this.b).onComplete();
            return;
        }
        r r0 = (r)this.c;
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper returned a null MaybeSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            r0.a.onError(throwable0);
            return;
        }
        if(DisposableHelper.replace(r0, null)) {
            r0.c = object0;
            maybeSource0.subscribe(r0);
        }
    }
}

