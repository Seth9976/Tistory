package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class g0 extends AtomicReference implements SingleObserver {
    public final f0 a;
    public final int b;

    public g0(f0 f00, int v) {
        this.a = f00;
        this.b = v;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.a.c(throwable0, this.b);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Object object1;
        f0 f00 = this.a;
        SingleObserver singleObserver0 = (SingleObserver)f00.b;
        Object[] arr_object = (Object[])f00.e;
        arr_object[this.b] = object0;
        if(f00.decrementAndGet() == 0) {
            try {
                object1 = ObjectHelper.requireNonNull(((Function)f00.c).apply(arr_object), "The zipper returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                singleObserver0.onError(throwable0);
                return;
            }
            singleObserver0.onSuccess(object1);
        }
    }
}

