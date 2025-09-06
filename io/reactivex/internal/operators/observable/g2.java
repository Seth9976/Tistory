package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class g2 extends AtomicReference implements Disposable {
    public final Observer a;

    public g2(Observer observer0, h2 h20) {
        this.a = observer0;
        this.lazySet(h20);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        h2 h20 = (h2)this.getAndSet(null);
        if(h20 != null) {
            h20.a(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }
}

