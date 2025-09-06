package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 extends AtomicReference implements Observer {
    public final int a;
    public final Observer b;
    public final AtomicInteger c;

    public b0(Observer observer0, AtomicInteger atomicInteger0, int v) {
        this.a = v;
        super();
        this.b = observer0;
        this.c = atomicInteger0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            ((d0)this.c).g = false;
            ((d0)this.c).a();
            return;
        }
        ((c0)this.c).i = false;
        ((c0)this.c).a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            ((d0)this.c).dispose();
            ((SerializedObserver)this.b).onError(throwable0);
            return;
        }
        c0 c00 = (c0)this.c;
        if(c00.d.addThrowable(throwable0)) {
            if(!c00.f) {
                c00.h.dispose();
            }
            c00.i = false;
            c00.a();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            ((SerializedObserver)this.b).onNext(object0);
            return;
        }
        this.b.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.replace(this, disposable0);
            return;
        }
        DisposableHelper.replace(this, disposable0);
    }
}

