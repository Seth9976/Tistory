package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.single.SingleCache;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b extends AtomicBoolean implements Disposable {
    public final SingleObserver a;
    public final SingleCache b;

    public b(SingleObserver singleObserver0, SingleCache singleCache0) {
        this.a = singleObserver0;
        this.b = singleCache0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.compareAndSet(false, true)) {
            this.b.c(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }
}

