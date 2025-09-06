package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class o2 extends AtomicReference implements Observer {
    public final int a;
    public final AtomicInteger b;

    public o2(AtomicInteger atomicInteger0, int v) {
        this.a = v;
        this.b = atomicInteger0;
        super();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(((p2)this.b).f);
                HalfSerializer.onComplete(((p2)this.b).b, ((p2)this.b), ((p2)this.b).d);
                return;
            }
            case 1: {
                DisposableHelper.dispose(((p2)this.b).f);
                HalfSerializer.onComplete(((p2)this.b).b, ((p2)this.b), ((p2)this.b).d);
                return;
            }
            default: {
                DisposableHelper.dispose(((z3)this.b).b);
                HalfSerializer.onComplete(((z3)this.b).a, ((z3)this.b), ((z3)this.b).d);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(((p2)this.b).f);
                HalfSerializer.onError(((p2)this.b).b, throwable0, ((p2)this.b), ((p2)this.b).d);
                return;
            }
            case 1: {
                DisposableHelper.dispose(((p2)this.b).f);
                HalfSerializer.onError(((p2)this.b).b, throwable0, ((p2)this.b), ((p2)this.b).d);
                return;
            }
            default: {
                DisposableHelper.dispose(((z3)this.b).b);
                HalfSerializer.onError(((z3)this.b).a, throwable0, ((z3)this.b), ((z3)this.b).d);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                ((p2)this.b).a();
                return;
            }
            case 1: {
                ((p2)this.b).a();
                return;
            }
            default: {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(((z3)this.b).b);
                HalfSerializer.onComplete(((z3)this.b).a, ((z3)this.b), ((z3)this.b).d);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 1: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }
}

