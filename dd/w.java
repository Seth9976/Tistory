package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class w extends AtomicReference implements CompletableObserver, Disposable {
    public final CompletableObserver a;
    public final e b;
    public final AtomicBoolean c;

    public w(CompletableObserver completableObserver0) {
        this.a = completableObserver0;
        this.b = new e(this, 1);
        this.c = new AtomicBoolean();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.c.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.b);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.c.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.b);
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.c.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.b);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

