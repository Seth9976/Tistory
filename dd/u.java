package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.plugins.RxJavaPlugins;

public final class u implements CompletableObserver, Disposable {
    public final CompletableObserver a;
    public Disposable b;
    public final CompletablePeek c;

    public u(CompletablePeek completablePeek0, CompletableObserver completableObserver0) {
        this.c = completablePeek0;
        this.a = completableObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        try {
            this.c.g.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
        this.b.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        CompletableObserver completableObserver0 = this.a;
        CompletablePeek completablePeek0 = this.c;
        if(this.b == DisposableHelper.DISPOSED) {
            return;
        }
        try {
            completablePeek0.d.run();
            completablePeek0.e.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            completableObserver0.onError(throwable0);
            return;
        }
        completableObserver0.onComplete();
        try {
            completablePeek0.f.run();
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(throwable1);
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        CompletablePeek completablePeek0 = this.c;
        if(this.b == DisposableHelper.DISPOSED) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        try {
            completablePeek0.c.accept(throwable0);
            completablePeek0.e.run();
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
        }
        this.a.onError(throwable0);
        try {
            completablePeek0.f.run();
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            RxJavaPlugins.onError(throwable2);
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        CompletableObserver completableObserver0;
        try {
            completableObserver0 = this.a;
            this.c.b.accept(disposable0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            disposable0.dispose();
            this.b = DisposableHelper.DISPOSED;
            EmptyDisposable.error(throwable0, completableObserver0);
            return;
        }
        if(DisposableHelper.validate(this.b, disposable0)) {
            this.b = disposable0;
            completableObserver0.onSubscribe(this);
        }
    }
}

