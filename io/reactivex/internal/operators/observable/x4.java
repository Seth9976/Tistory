package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class x4 extends AtomicReference implements Observer, Disposable {
    public final SerializedObserver a;
    public final BiFunction b;
    public final AtomicReference c;
    public final AtomicReference d;

    public x4(SerializedObserver serializedObserver0, BiFunction biFunction0) {
        this.c = new AtomicReference();
        this.d = new AtomicReference();
        this.a = serializedObserver0;
        this.b = biFunction0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.c);
        DisposableHelper.dispose(this.d);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.c.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        DisposableHelper.dispose(this.d);
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.d);
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object2;
        SerializedObserver serializedObserver0 = this.a;
        Object object1 = this.get();
        if(object1 != null) {
            try {
                object2 = ObjectHelper.requireNonNull(this.b.apply(object0, object1), "The combiner returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.dispose();
                serializedObserver0.onError(throwable0);
                return;
            }
            serializedObserver0.onNext(object2);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.c, disposable0);
    }
}

