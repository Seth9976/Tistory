package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class t1 extends AtomicReference implements Disposable, Runnable {
    public final Observer a;
    public long b;

    public t1(Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override
    public final void run() {
        if(this.get() != DisposableHelper.DISPOSED) {
            long v = this.b;
            this.b = v + 1L;
            this.a.onNext(v);
        }
    }
}

