package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

public abstract class DefaultObserver implements Observer {
    public Disposable a;

    public final void cancel() {
        Disposable disposable0 = this.a;
        this.a = DisposableHelper.DISPOSED;
        disposable0.dispose();
    }

    public void onStart() {
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(@NonNull Disposable disposable0) {
        if(EndConsumerHelper.validate(this.a, disposable0, this.getClass())) {
            this.a = disposable0;
        }
    }
}

