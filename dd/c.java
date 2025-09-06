package dd;

import gd.r;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference implements CompletableObserver, Disposable {
    public final int a;
    public final Object b;
    public final Object c;

    public c(int v, Object object0, Object object1) {
        this.a = v;
        super();
        this.b = object0;
        this.c = object1;
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
            default: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                b b0 = new b(this, ((CompletableObserver)this.b), 0);
                ((CompletableSource)this.c).subscribe(b0);
                return;
            }
            case 1: {
                ResumeSingleObserver resumeSingleObserver0 = new ResumeSingleObserver(this, ((SingleObserver)this.b));
                ((SingleSource)this.c).subscribe(resumeSingleObserver0);
                return;
            }
            default: {
                r r0 = new r(1, ((MaybeObserver)this.b), this);
                ((MaybeSource)this.c).subscribe(r0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((CompletableObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            default: {
                ((MaybeObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((CompletableObserver)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((SingleObserver)this.b).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((MaybeObserver)this.b).onSubscribe(this);
                }
            }
        }
    }
}

