package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SequentialDisposable extends AtomicReference implements Disposable {
    public SequentialDisposable() {
    }

    public SequentialDisposable(Disposable disposable0) {
        this.lazySet(disposable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    public boolean replace(Disposable disposable0) {
        return DisposableHelper.replace(this, disposable0);
    }

    public boolean update(Disposable disposable0) {
        return DisposableHelper.set(this, disposable0);
    }
}

