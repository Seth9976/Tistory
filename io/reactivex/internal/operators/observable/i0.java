package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class i0 implements Observer, Disposable {
    public final int a;
    public final Object b;
    public long c;
    public Disposable d;

    public i0(Observer observer0, long v) {
        this.a = 1;
        super();
        this.b = observer0;
        this.c = v;
    }

    public i0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.d.dispose();
                return;
            }
            case 1: {
                this.d.dispose();
                return;
            }
            default: {
                this.d.dispose();
                this.d = DisposableHelper.DISPOSED;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.d.isDisposed();
            }
            case 1: {
                return this.d.isDisposed();
            }
            default: {
                return this.d.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                ((Observer)this.b).onNext(this.c);
                ((Observer)this.b).onComplete();
                return;
            }
            case 1: {
                ((Observer)this.b).onComplete();
                return;
            }
            default: {
                this.d = DisposableHelper.DISPOSED;
                ((SingleObserver)this.b).onSuccess(this.c);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((Observer)this.b).onError(throwable0);
                return;
            }
            case 1: {
                ((Observer)this.b).onError(throwable0);
                return;
            }
            default: {
                this.d = DisposableHelper.DISPOSED;
                ((SingleObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                ++this.c;
                return;
            }
            case 1: {
                long v = this.c;
                if(v != 0L) {
                    this.c = v - 1L;
                    return;
                }
                ((Observer)this.b).onNext(object0);
                return;
            }
            default: {
                ++this.c;
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((Observer)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((Observer)this.b).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((SingleObserver)this.b).onSubscribe(this);
                }
            }
        }
    }
}

