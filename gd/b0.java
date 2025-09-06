package gd;

import ed.f;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 extends AtomicReference implements SingleObserver, Disposable, Runnable {
    public final SingleObserver a;
    public final AtomicReference b;
    public final f c;
    public SingleSource d;
    public final long e;
    public final TimeUnit f;

    public b0(SingleObserver singleObserver0, SingleSource singleSource0, long v, TimeUnit timeUnit0) {
        this.a = singleObserver0;
        this.d = singleSource0;
        this.e = v;
        this.f = timeUnit0;
        this.b = new AtomicReference();
        if(singleSource0 != null) {
            this.c = new f(singleObserver0, 2);
            return;
        }
        this.c = null;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.b);
        f f0 = this.c;
        if(f0 != null) {
            DisposableHelper.dispose(f0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        Disposable disposable0 = (Disposable)this.get();
        if(disposable0 != DisposableHelper.DISPOSED && this.compareAndSet(disposable0, DisposableHelper.DISPOSED)) {
            DisposableHelper.dispose(this.b);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Disposable disposable0 = (Disposable)this.get();
        if(disposable0 != DisposableHelper.DISPOSED && this.compareAndSet(disposable0, DisposableHelper.DISPOSED)) {
            DisposableHelper.dispose(this.b);
            this.a.onSuccess(object0);
        }
    }

    @Override
    public final void run() {
        Disposable disposable0 = (Disposable)this.get();
        if(disposable0 != DisposableHelper.DISPOSED && this.compareAndSet(disposable0, DisposableHelper.DISPOSED)) {
            if(disposable0 != null) {
                disposable0.dispose();
            }
            SingleSource singleSource0 = this.d;
            if(singleSource0 == null) {
                TimeoutException timeoutException0 = new TimeoutException(ExceptionHelper.timeoutMessage(this.e, this.f));
                this.a.onError(timeoutException0);
                return;
            }
            this.d = null;
            singleSource0.subscribe(this.c);
        }
    }
}

