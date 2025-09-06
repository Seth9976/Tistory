package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.plugins.RxJavaPlugins;

public final class CompletableFromAction extends Completable {
    public final Action a;

    public CompletableFromAction(Action action0) {
        this.a = action0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        Disposable disposable0 = Disposables.empty();
        completableObserver0.onSubscribe(disposable0);
        try {
            this.a.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            if(!disposable0.isDisposed()) {
                completableObserver0.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(!disposable0.isDisposed()) {
            completableObserver0.onComplete();
        }
    }
}

