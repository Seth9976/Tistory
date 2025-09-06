package gd;

import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class z extends AtomicReference implements SingleObserver, Disposable, Runnable {
    public final int a;
    public final SingleObserver b;
    public final Object c;
    public Object d;

    public z(SingleObserver singleObserver0, Scheduler scheduler0) {
        this.a = 1;
        super();
        this.b = singleObserver0;
        this.c = scheduler0;
    }

    public z(SingleObserver singleObserver0, SingleSource singleSource0) {
        this.a = 0;
        super();
        this.b = singleObserver0;
        this.d = singleSource0;
        this.c = new SequentialDisposable();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            Disposable disposable0 = (Disposable)this.getAndSet(DisposableHelper.DISPOSED);
            if(disposable0 != DisposableHelper.DISPOSED) {
                this.d = disposable0;
                ((Scheduler)this.c).scheduleDirect(this);
            }
            return;
        }
        DisposableHelper.dispose(this);
        ((SequentialDisposable)this.c).dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.setOnce(this, disposable0)) {
                this.b.onSubscribe(this);
            }
            return;
        }
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        if(this.a != 0) {
            this.b.onSuccess(object0);
            return;
        }
        this.b.onSuccess(object0);
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ((Disposable)this.d).dispose();
            return;
        }
        ((SingleSource)this.d).subscribe(this);
    }
}

