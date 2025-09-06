package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class q extends AtomicReference implements CompletableObserver {
    public final r a;

    public q(r r0) {
        this.a = r0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        r r0 = this.a;
        AtomicReference atomicReference0 = r0.e;
        do {
            if(atomicReference0.compareAndSet(this, null)) {
                if(!r0.f) {
                    break;
                }
                Throwable throwable0 = r0.d.terminate();
                if(throwable0 == null) {
                    r0.a.onComplete();
                    return;
                }
                r0.a.onError(throwable0);
                return;
            }
        }
        while(atomicReference0.get() == this);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        r r0 = this.a;
        AtomicReference atomicReference0 = r0.e;
        while(true) {
            if(!atomicReference0.compareAndSet(this, null)) {
                if(atomicReference0.get() != this) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
            }
            else if(r0.d.addThrowable(throwable0)) {
                if(r0.c) {
                    if(!r0.f) {
                        break;
                    }
                    Throwable throwable1 = r0.d.terminate();
                    r0.a.onError(throwable1);
                    return;
                }
                r0.dispose();
                Throwable throwable2 = r0.d.terminate();
                if(throwable2 == ExceptionHelper.TERMINATED) {
                    break;
                }
                r0.a.onError(throwable2);
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

