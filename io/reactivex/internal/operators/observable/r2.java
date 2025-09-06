package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class r2 extends AtomicInteger implements Disposable {
    public final w2 a;
    public final Observer b;
    public Serializable c;
    public volatile boolean d;

    public r2(w2 w20, Observer observer0) {
        this.a = w20;
        this.b = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.d) {
            this.d = true;
            this.a.a(this);
            this.c = null;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }
}

