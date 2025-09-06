package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements SingleObserver {
    public final CompositeDisposable a;
    public final SingleObserver b;
    public final AtomicBoolean c;
    public Disposable d;

    public a(SingleObserver singleObserver0, CompositeDisposable compositeDisposable0, AtomicBoolean atomicBoolean0) {
        this.b = singleObserver0;
        this.a = compositeDisposable0;
        this.c = atomicBoolean0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        if(this.c.compareAndSet(false, true)) {
            this.a.delete(this.d);
            this.a.dispose();
            this.b.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        this.d = disposable0;
        this.a.add(disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        if(this.c.compareAndSet(false, true)) {
            this.a.delete(this.d);
            this.a.dispose();
            this.b.onSuccess(object0);
        }
    }
}

