package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public abstract class DeferredScalarObserver extends DeferredScalarDisposable implements Observer {
    protected Disposable upstream;

    public DeferredScalarObserver(Observer observer0) {
        super(observer0);
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.Observer
    public void onComplete() {
        Object object0 = this.value;
        if(object0 != null) {
            this.value = null;
            this.complete(object0);
            return;
        }
        this.complete();
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.Observer
    public void onError(Throwable throwable0) {
        this.value = null;
        this.error(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.upstream, disposable0)) {
            this.upstream = disposable0;
            this.downstream.onSubscribe(this);
        }
    }
}

