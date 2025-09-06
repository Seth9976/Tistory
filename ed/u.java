package ed;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class u extends AtomicReference implements SingleObserver {
    public final v a;
    public volatile Object b;

    public u(v v0) {
        this.a = v0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        v v0 = this.a;
        AtomicReference atomicReference0 = v0.e;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!v0.d.addThrowable(throwable0)) {
                    break;
                }
                if(!v0.c) {
                    v0.f.dispose();
                    v0.a();
                }
                v0.b();
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

