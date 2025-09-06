package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class u1 extends AtomicReference implements Disposable, Runnable {
    public final Observer a;
    public final long b;
    public long c;

    public u1(Observer observer0, long v, long v1) {
        this.a = observer0;
        this.c = v;
        this.b = v1;
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
        if(!this.isDisposed()) {
            long v = this.c;
            Observer observer0 = this.a;
            observer0.onNext(v);
            if(v == this.b) {
                DisposableHelper.dispose(this);
                observer0.onComplete();
                return;
            }
            this.c = v + 1L;
        }
    }
}

