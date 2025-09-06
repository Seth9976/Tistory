package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class SingleDefer extends Single {
    public final Callable a;

    public SingleDefer(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        SingleSource singleSource0;
        try {
            singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.a.call(), "The singleSupplier returned a null SingleSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        singleSource0.subscribe(singleObserver0);
    }
}

