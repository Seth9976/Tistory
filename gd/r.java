package gd;

import dd.c;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.maybe.MaybeDoOnTerminate;
import io.reactivex.internal.operators.maybe.f0;
import io.reactivex.internal.operators.maybe.y;
import java.util.concurrent.atomic.AtomicReference;

public final class r implements MaybeObserver {
    public final int a;
    public final MaybeObserver b;
    public final Object c;

    public r(int v, MaybeObserver maybeObserver0, Object object0) {
        this.a = v;
        this.c = object0;
        this.b = maybeObserver0;
        super();
    }

    public r(MaybeObserver maybeObserver0, AtomicReference atomicReference0, int v) {
        this.a = v;
        this.b = maybeObserver0;
        this.c = atomicReference0;
        super();
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        MaybeObserver maybeObserver0;
        switch(this.a) {
            case 0: {
                this.b.onComplete();
                return;
            }
            case 1: {
                this.b.onComplete();
                return;
            }
            case 2: {
                try {
                    maybeObserver0 = this.b;
                    ((MaybeDoOnTerminate)this.c).b.run();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    maybeObserver0.onError(throwable0);
                    return;
                }
                maybeObserver0.onComplete();
                return;
            }
            case 3: {
                this.b.onComplete();
                return;
            }
            default: {
                this.b.onComplete();
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b.onError(throwable0);
                return;
            }
            case 1: {
                this.b.onError(throwable0);
                return;
            }
            case 2: {
                try {
                    ((MaybeDoOnTerminate)this.c).b.run();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                this.b.onError(throwable0);
                return;
            }
            case 3: {
                this.b.onError(throwable0);
                return;
            }
            default: {
                this.b.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.replace(((h)this.c), disposable0);
                return;
            }
            case 1: {
                DisposableHelper.replace(((c)this.c), disposable0);
                return;
            }
            case 2: {
                this.b.onSubscribe(disposable0);
                return;
            }
            case 3: {
                DisposableHelper.setOnce(((f0)this.c), disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(((y)this.c), disposable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        MaybeObserver maybeObserver0;
        switch(this.a) {
            case 0: {
                this.b.onSuccess(object0);
                return;
            }
            case 1: {
                this.b.onSuccess(object0);
                return;
            }
            case 2: {
                try {
                    maybeObserver0 = this.b;
                    ((MaybeDoOnTerminate)this.c).b.run();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    maybeObserver0.onError(throwable0);
                    return;
                }
                maybeObserver0.onSuccess(object0);
                return;
            }
            case 3: {
                this.b.onSuccess(object0);
                return;
            }
            default: {
                this.b.onSuccess(object0);
            }
        }
    }
}

