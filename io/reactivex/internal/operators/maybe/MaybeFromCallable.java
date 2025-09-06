package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class MaybeFromCallable extends Maybe implements Callable {
    public final Callable a;

    public MaybeFromCallable(Callable callable0) {
        this.a = callable0;
    }

    @Override
    public Object call() throws Exception {
        return this.a.call();
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        Object object0;
        Disposable disposable0 = Disposables.empty();
        maybeObserver0.onSubscribe(disposable0);
        if(!disposable0.isDisposed()) {
            try {
                object0 = this.a.call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                if(!disposable0.isDisposed()) {
                    maybeObserver0.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            if(!disposable0.isDisposed()) {
                if(object0 == null) {
                    maybeObserver0.onComplete();
                    return;
                }
                maybeObserver0.onSuccess(object0);
            }
        }
    }
}

