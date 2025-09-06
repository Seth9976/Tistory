package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class MaybeFromAction extends Maybe implements Callable {
    public final Action a;

    public MaybeFromAction(Action action0) {
        this.a = action0;
    }

    @Override
    public Object call() throws Exception {
        this.a.run();
        return null;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        Disposable disposable0 = Disposables.empty();
        maybeObserver0.onSubscribe(disposable0);
        if(!disposable0.isDisposed()) {
            try {
                this.a.run();
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
                maybeObserver0.onComplete();
            }
        }
    }
}

