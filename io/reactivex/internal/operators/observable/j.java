package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference implements Observer {
    public final i a;
    public final int b;
    public final Observer c;
    public boolean d;

    public j(i i0, int v, Observer observer0) {
        this.a = i0;
        this.b = v;
        this.c = observer0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Observer observer0 = this.c;
        if(this.d) {
            observer0.onComplete();
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            observer0.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        Observer observer0 = this.c;
        if(this.d) {
            observer0.onError(throwable0);
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            observer0.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Observer observer0 = this.c;
        if(this.d) {
            observer0.onNext(object0);
            return;
        }
        if(this.a.a(this.b)) {
            this.d = true;
            observer0.onNext(object0);
            return;
        }
        ((Disposable)this.get()).dispose();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

