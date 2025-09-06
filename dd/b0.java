package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 extends AtomicReference implements CompletableObserver, Disposable {
    public final CompletableObserver a;
    public final Consumer b;
    public final boolean c;
    public Disposable d;

    public b0(CompletableObserver completableObserver0, Object object0, Consumer consumer0, boolean z) {
        super(object0);
        this.a = completableObserver0;
        this.b = consumer0;
        this.c = z;
    }

    public final void a() {
        Object object0 = this.getAndSet(this);
        if(object0 != this) {
            try {
                this.b.accept(object0);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
        this.d = DisposableHelper.DISPOSED;
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.d = DisposableHelper.DISPOSED;
        CompletableObserver completableObserver0 = this.a;
        boolean z = this.c;
        if(z) {
            Object object0 = this.getAndSet(this);
            if(object0 != this) {
                try {
                    this.b.accept(object0);
                    goto label_12;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    completableObserver0.onError(throwable0);
                }
            }
            return;
        }
    label_12:
        completableObserver0.onComplete();
        if(!z) {
            this.a();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.d = DisposableHelper.DISPOSED;
        boolean z = this.c;
        if(z) {
            Object object0 = this.getAndSet(this);
            if(object0 != this) {
                try {
                    this.b.accept(object0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                goto label_12;
            }
            return;
        }
    label_12:
        this.a.onError(throwable0);
        if(!z) {
            this.a();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

