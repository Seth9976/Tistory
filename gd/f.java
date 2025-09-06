package gd;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends AtomicReference implements Observer, Disposable {
    public final SingleObserver a;
    public final SingleSource b;
    public boolean c;

    public f(SingleObserver singleObserver0, SingleSource singleSource0) {
        this.a = singleObserver0;
        this.b = singleSource0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        ResumeSingleObserver resumeSingleObserver0 = new ResumeSingleObserver(this, this.a);
        this.b.subscribe(resumeSingleObserver0);
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ((Disposable)this.get()).dispose();
        this.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.set(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }
}

