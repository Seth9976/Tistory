package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CancellableDisposable extends AtomicReference implements Disposable {
    public CancellableDisposable(Cancellable cancellable0) {
        super(cancellable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        if(this.get() != null) {
            Cancellable cancellable0 = (Cancellable)this.getAndSet(null);
            if(cancellable0 != null) {
                try {
                    cancellable0.cancel();
                }
                catch(Exception exception0) {
                    Exceptions.throwIfFatal(exception0);
                    RxJavaPlugins.onError(exception0);
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == null;
    }
}

