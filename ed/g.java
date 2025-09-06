package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends AtomicReference implements CompletableObserver {
    public final h a;

    public g(h h0) {
        this.a = h0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        h h0 = this.a;
        AtomicReference atomicReference0 = h0.e;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!h0.f) {
                    break;
                }
                Throwable throwable0 = h0.d.terminate();
                if(throwable0 == null) {
                    h0.a.onComplete();
                    return;
                }
                h0.a.onError(throwable0);
                return;
            }
        }
        while(atomicReference0.get() == this);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        h h0 = this.a;
        AtomicReference atomicReference0 = h0.e;
        while(true) {
            if(!atomicReference0.compareAndSet(this, null)) {
                if(atomicReference0.get() != this) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
            }
            else if(h0.d.addThrowable(throwable0)) {
                if(h0.c) {
                    if(!h0.f) {
                        break;
                    }
                    Throwable throwable1 = h0.d.terminate();
                    h0.a.onError(throwable1);
                    return;
                }
                h0.dispose();
                Throwable throwable2 = h0.d.terminate();
                if(throwable2 == ExceptionHelper.TERMINATED) {
                    break;
                }
                h0.a.onError(throwable2);
                return;
            }
            else {
                RxJavaPlugins.onError(throwable0);
                return;
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

