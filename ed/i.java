package ed;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends AtomicReference implements MaybeObserver {
    public final j a;
    public volatile Object b;

    public i(j j0) {
        this.a = j0;
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        j j0 = this.a;
        AtomicReference atomicReference0 = j0.f;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                j0.b();
                return;
            }
        }
        while(atomicReference0.get() == this);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        j j0 = this.a;
        AtomicReference atomicReference0 = j0.f;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!j0.d.addThrowable(throwable0)) {
                    break;
                }
                if(!j0.c) {
                    j0.g.cancel();
                    j0.a();
                }
                j0.b();
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

