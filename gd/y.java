package gd;

import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class y extends AtomicReference implements SingleObserver, Disposable, Runnable {
    public final SingleObserver a;
    public final Scheduler b;
    public Object c;
    public Throwable d;

    public y(SingleObserver singleObserver0, Scheduler scheduler0) {
        this.a = singleObserver0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.d = throwable0;
        DisposableHelper.replace(this, this.b.scheduleDirect(this));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        this.c = object0;
        DisposableHelper.replace(this, this.b.scheduleDirect(this));
    }

    @Override
    public final void run() {
        Throwable throwable0 = this.d;
        SingleObserver singleObserver0 = this.a;
        if(throwable0 != null) {
            singleObserver0.onError(throwable0);
            return;
        }
        singleObserver0.onSuccess(this.c);
    }
}

