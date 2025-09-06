package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class d2 extends AtomicReference implements Disposable {
    public final Observer a;

    public d2(Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object object0 = this.getAndSet(this);
        if(object0 != null && object0 != this) {
            ((e2)object0).a(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == this;
    }
}

