package ed;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class s extends AtomicReference implements MaybeObserver {
    public final t a;
    public volatile Object b;

    public s(t t0) {
        this.a = t0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        t t0 = this.a;
        AtomicReference atomicReference0 = t0.e;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                t0.b();
                return;
            }
        }
        while(atomicReference0.get() == this);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        t t0 = this.a;
        AtomicReference atomicReference0 = t0.e;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!t0.d.addThrowable(throwable0)) {
                    break;
                }
                if(!t0.c) {
                    t0.f.dispose();
                    t0.a();
                }
                t0.b();
                return;
            }
        }
        while(atomicReference0.get() == this);
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        this.b = object0;
        this.a.b();
    }
}

