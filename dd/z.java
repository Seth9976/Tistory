package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class z extends AtomicReference implements Disposable, Runnable {
    public final int a;
    public final Object b;

    public z(Object object0, int v) {
        this.a = v;
        super();
        this.b = object0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(this);
                return;
            }
            case 1: {
                DisposableHelper.dispose(this);
                return;
            }
            case 2: {
                DisposableHelper.dispose(this);
                return;
            }
            default: {
                DisposableHelper.dispose(this);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 1: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 2: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            default: {
                return this.get() == DisposableHelper.DISPOSED;
            }
        }
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onComplete();
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onSuccess(0L);
                return;
            }
            case 2: {
                ((MaybeObserver)this.b).onSuccess(0L);
                return;
            }
            default: {
                if(!this.isDisposed()) {
                    ((Observer)this.b).onNext(0L);
                    this.lazySet(EmptyDisposable.INSTANCE);
                    ((Observer)this.b).onComplete();
                }
            }
        }
    }
}

