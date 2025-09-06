package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Collection;

public final class w1 implements Observer, Disposable {
    public final int a;
    public Disposable b;
    public Object c;
    public final Object d;

    public w1(Object object0, int v) {
        this.a = v;
        this.d = object0;
        super();
    }

    public w1(Object object0, Collection collection0, int v) {
        this.a = v;
        this.d = object0;
        this.c = collection0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.b.dispose();
                this.b = DisposableHelper.DISPOSED;
                return;
            }
            case 1: {
                this.c = null;
                this.b.dispose();
                return;
            }
            case 2: {
                this.b.dispose();
                return;
            }
            default: {
                this.b.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.b == DisposableHelper.DISPOSED;
            }
            case 1: {
                return this.b.isDisposed();
            }
            case 2: {
                return this.b.isDisposed();
            }
            default: {
                return this.b.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.b = DisposableHelper.DISPOSED;
                Object object0 = this.c;
                MaybeObserver maybeObserver0 = (MaybeObserver)this.d;
                if(object0 != null) {
                    this.c = null;
                    maybeObserver0.onSuccess(object0);
                    return;
                }
                maybeObserver0.onComplete();
                return;
            }
            case 1: {
                Object object1 = this.c;
                Observer observer0 = (Observer)this.d;
                if(object1 != null) {
                    this.c = null;
                    observer0.onNext(object1);
                }
                observer0.onComplete();
                return;
            }
            case 2: {
                Collection collection1 = (Collection)this.c;
                this.c = null;
                ((Observer)this.d).onNext(collection1);
                ((Observer)this.d).onComplete();
                return;
            }
            default: {
                Collection collection0 = (Collection)this.c;
                this.c = null;
                ((SingleObserver)this.d).onSuccess(collection0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b = DisposableHelper.DISPOSED;
                this.c = null;
                ((MaybeObserver)this.d).onError(throwable0);
                return;
            }
            case 1: {
                this.c = null;
                ((Observer)this.d).onError(throwable0);
                return;
            }
            case 2: {
                this.c = null;
                ((Observer)this.d).onError(throwable0);
                return;
            }
            default: {
                this.c = null;
                ((SingleObserver)this.d).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                this.c = object0;
                return;
            }
            case 1: {
                this.c = object0;
                return;
            }
            case 2: {
                ((Collection)this.c).add(object0);
                return;
            }
            default: {
                ((Collection)this.c).add(object0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((MaybeObserver)this.d).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((Observer)this.d).onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((Observer)this.d).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((SingleObserver)this.d).onSubscribe(this);
                }
            }
        }
    }
}

