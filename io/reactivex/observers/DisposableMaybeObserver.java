package io.reactivex.observers;

import io.reactivex.MaybeObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DisposableMaybeObserver implements MaybeObserver, Disposable {
    public final AtomicReference a;

    public DisposableMaybeObserver() {
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

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(@NonNull Disposable disposable0) {
        Class class0 = this.getClass();
        boolean z = !EndConsumerHelper.setOnce(this.a, disposable0, class0);
    }
}

