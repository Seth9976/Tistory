package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class DisposableLambdaObserver implements Observer, Disposable {
    public final Observer a;
    public final Consumer b;
    public final Action c;
    public Disposable d;

    public DisposableLambdaObserver(Observer observer0, Consumer consumer0, Action action0) {
        this.a = observer0;
        this.b = consumer0;
        this.c = action0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable disposable0 = this.d;
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(disposable0 != disposableHelper0) {
            try {
                this.d = disposableHelper0;
                this.c.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(this.d != disposableHelper0) {
            this.d = disposableHelper0;
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(this.d != disposableHelper0) {
            this.d = disposableHelper0;
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        Observer observer0;
        try {
            observer0 = this.a;
            this.b.accept(disposable0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            disposable0.dispose();
            this.d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            observer0.onSubscribe(this);
        }
    }
}

