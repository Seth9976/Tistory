package io.reactivex.observers;

import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DisposableSingleObserver implements SingleObserver, Disposable {
    public final AtomicReference a;

    public DisposableSingleObserver() {
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.a);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a.get() == DisposableHelper.DISPOSED;
    }

    public void onStart() {
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(@NonNull Disposable disposable0) {
        Class class0 = this.getClass();
        boolean z = !EndConsumerHelper.setOnce(this.a, disposable0, class0);
    }
}

