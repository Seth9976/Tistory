package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class a extends DeferredScalarDisposable {
    public final AsyncSubject a;

    public a(Observer observer0, AsyncSubject asyncSubject0) {
        super(observer0);
        this.a = asyncSubject0;
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public final void dispose() {
        if(this.tryDispose()) {
            this.a.d(this);
        }
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public final void onComplete() {
        if(!this.isDisposed()) {
            this.downstream.onComplete();
        }
    }

    @Override  // io.reactivex.internal.observers.DeferredScalarDisposable
    public final void onError(Throwable throwable0) {
        if(this.isDisposed()) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.downstream.onError(throwable0);
    }
}

