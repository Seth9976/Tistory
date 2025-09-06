package ed;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends AtomicReference implements SingleObserver {
    public final l a;
    public volatile Object b;

    public k(l l0) {
        this.a = l0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        l l0 = this.a;
        AtomicReference atomicReference0 = l0.f;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!l0.d.addThrowable(throwable0)) {
                    break;
                }
                if(!l0.c) {
                    l0.g.cancel();
                    l0.a();
                }
                l0.b();
                return;
            }
        }
        while(atomicReference0.get() == this);
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        this.b = object0;
        this.a.b();
    }
}

