package io.reactivex.disposables;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SerialDisposable implements Disposable {
    public final AtomicReference a;

    public SerialDisposable() {
        this.a = new AtomicReference();
    }

    public SerialDisposable(@Nullable Disposable disposable0) {
        this.a = new AtomicReference(disposable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.a);
    }

    @Nullable
    public Disposable get() {
        Disposable disposable0 = (Disposable)this.a.get();
        return disposable0 == DisposableHelper.DISPOSED ? Disposables.disposed() : disposable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.a.get()));
    }

    public boolean replace(@Nullable Disposable disposable0) {
        return DisposableHelper.replace(this.a, disposable0);
    }

    public boolean set(@Nullable Disposable disposable0) {
        return DisposableHelper.set(this.a, disposable0);
    }
}

