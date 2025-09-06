package io.reactivex.internal.operators.observable;

import androidx.appcompat.widget.a;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class j4 extends AtomicBoolean implements Observer, Disposable {
    public final Observer a;
    public final Scheduler b;
    public Disposable c;

    public j4(Observer observer0, Scheduler scheduler0) {
        this.a = observer0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.compareAndSet(false, true)) {
            a a0 = new a(this, 17);
            this.b.scheduleDirect(a0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.get()) {
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.get()) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(!this.get()) {
            this.a.onNext(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

