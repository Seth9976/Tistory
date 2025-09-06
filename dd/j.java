package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference implements CompletableObserver, Disposable, Runnable {
    public final CompletableObserver a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;
    public Throwable f;

    public j(CompletableObserver completableObserver0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        this.a = completableObserver0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        DisposableHelper.replace(this, this.d.scheduleDirect(this, this.b, this.c));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.f = throwable0;
        DisposableHelper.replace(this, this.d.scheduleDirect(this, (this.e ? this.b : 0L), this.c));
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        Throwable throwable0 = this.f;
        this.f = null;
        CompletableObserver completableObserver0 = this.a;
        if(throwable0 != null) {
            completableObserver0.onError(throwable0);
            return;
        }
        completableObserver0.onComplete();
    }
}

