package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class SingleFromCallable extends Single {
    public final Callable a;

    public SingleFromCallable(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Object object0;
        Disposable disposable0 = Disposables.empty();
        singleObserver0.onSubscribe(disposable0);
        if(disposable0.isDisposed()) {
            return;
        }
        try {
            object0 = ObjectHelper.requireNonNull(this.a.call(), "The callable returned a null value");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            if(!disposable0.isDisposed()) {
                singleObserver0.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(!disposable0.isDisposed()) {
            singleObserver0.onSuccess(object0);
        }
    }
}

