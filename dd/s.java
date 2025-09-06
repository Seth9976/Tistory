package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class s extends AtomicBoolean implements CompletableObserver {
    public final CompositeDisposable a;
    public final CompletableObserver b;
    public final AtomicInteger c;

    public s(CompletableObserver completableObserver0, CompositeDisposable compositeDisposable0, AtomicInteger atomicInteger0) {
        this.b = completableObserver0;
        this.a = compositeDisposable0;
        this.c = atomicInteger0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.c.decrementAndGet() == 0 && this.compareAndSet(false, true)) {
            this.b.onComplete();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.dispose();
        if(this.compareAndSet(false, true)) {
            this.b.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        this.a.add(disposable0);
    }
}

