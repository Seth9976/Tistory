package io.reactivex.internal.operators.observable;

import dd.e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class z1 extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final AtomicReference b;
    public final e c;
    public final AtomicThrowable d;
    public volatile boolean e;
    public volatile boolean f;

    public z1(Observer observer0) {
        this.a = observer0;
        this.b = new AtomicReference();
        this.c = new e(this, 5);
        this.d = new AtomicThrowable();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.b);
        DisposableHelper.dispose(this.c);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.b.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.e = true;
        if(this.f) {
            HalfSerializer.onComplete(this.a, this, this.d);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.c);
        HalfSerializer.onError(this.a, throwable0, this, this.d);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        HalfSerializer.onNext(this.a, object0, this, this.d);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.b, disposable0);
    }
}

