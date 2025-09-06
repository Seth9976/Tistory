package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class l implements CompletableObserver, Disposable, Runnable {
    public final CompletableObserver a;
    public final Scheduler b;
    public Disposable c;
    public volatile boolean d;

    public l(CompletableObserver completableObserver0, Scheduler scheduler0) {
        this.a = completableObserver0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d = true;
        this.b.scheduleDirect(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override
    public final void run() {
        this.c.dispose();
        this.c = DisposableHelper.DISPOSED;
    }
}

