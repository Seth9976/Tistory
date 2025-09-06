package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.flowable.x3;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l2 extends AtomicBoolean implements Observer, Disposable {
    public final Observer a;
    public final ObservableRefCount b;
    public final x3 c;
    public Disposable d;

    public l2(Observer observer0, ObservableRefCount observableRefCount0, x3 x30) {
        this.a = observer0;
        this.b = observableRefCount0;
        this.c = x30;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
        if(this.compareAndSet(false, true)) {
            ObservableRefCount observableRefCount0 = this.b;
            x3 x30 = this.c;
            synchronized(observableRefCount0) {
                if(observableRefCount0.f != null && observableRefCount0.f == x30) {
                    long v1 = x30.c - 1L;
                    x30.c = v1;
                    if(v1 == 0L && x30.d) {
                        if(observableRefCount0.c == 0L) {
                            observableRefCount0.e(x30);
                            return;
                        }
                        SequentialDisposable sequentialDisposable0 = new SequentialDisposable();
                        x30.b = sequentialDisposable0;
                        sequentialDisposable0.replace(observableRefCount0.e.scheduleDirect(x30, observableRefCount0.c, observableRefCount0.d));
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.compareAndSet(false, true)) {
            this.b.d(this.c);
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.compareAndSet(false, true)) {
            this.b.d(this.c);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

