package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicReference;

public final class z4 extends AtomicReference implements Observer {
    public final y4 a;
    public final int b;
    public boolean c;

    public z4(y4 y40, int v) {
        this.a = y40;
        this.b = v;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        y4 y40 = this.a;
        int v = this.b;
        if(!this.c) {
            y40.g = true;
            y40.a(v);
            HalfSerializer.onComplete(y40.a, y40, y40.f);
            return;
        }
        y40.getClass();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.g = true;
        DisposableHelper.dispose(this.a.e);
        this.a.a(this.b);
        HalfSerializer.onError(this.a.a, throwable0, this.a, this.a.f);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(!this.c) {
            this.c = true;
        }
        this.a.d.set(this.b, object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

