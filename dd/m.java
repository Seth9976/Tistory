package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class m extends AtomicInteger implements CompletableObserver, Disposable {
    public final CompletableObserver a;
    public final Action b;
    public Disposable c;

    public m(CompletableObserver completableObserver0, Action action0) {
        this.a = completableObserver0;
        this.b = action0;
    }

    public final void a() {
        if(this.compareAndSet(0, 1)) {
            try {
                this.b.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.dispose();
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.a.onComplete();
        this.a();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
        this.a();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

