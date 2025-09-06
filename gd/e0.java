package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class e0 extends AtomicReference implements SingleObserver, Disposable {
    public final SingleObserver a;
    public final Consumer b;
    public final boolean c;
    public Disposable d;

    public e0(SingleObserver singleObserver0, Object object0, boolean z, Consumer consumer0) {
        super(object0);
        this.a = singleObserver0;
        this.c = z;
        this.b = consumer0;
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

    @Override  // io.reactivex.SingleObserver
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

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        this.d = DisposableHelper.DISPOSED;
        SingleObserver singleObserver0 = this.a;
        boolean z = this.c;
        if(z) {
            Object object1 = this.getAndSet(this);
            if(object1 != this) {
                try {
                    this.b.accept(object1);
                    goto label_12;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    singleObserver0.onError(throwable0);
                }
            }
            return;
        }
    label_12:
        singleObserver0.onSuccess(object0);
        if(!z) {
            this.a();
        }
    }
}

