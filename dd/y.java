package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class y implements CompletableObserver {
    public final CompositeDisposable a;
    public final AtomicBoolean b;
    public final CompletableObserver c;

    public y(CompletableObserver completableObserver0, CompositeDisposable compositeDisposable0, AtomicBoolean atomicBoolean0) {
        this.a = compositeDisposable0;
        this.b = atomicBoolean0;
        this.c = completableObserver0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.onComplete();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        this.a.add(disposable0);
    }
}

