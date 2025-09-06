package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class f0 extends AtomicReference implements CompletableObserver, Observer, Disposable {
    public final Observer a;
    public CompletableSource b;
    public boolean c;

    public f0(Observer observer0, CompletableSource completableSource0) {
        this.a = observer0;
        this.b = completableSource0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.c) {
            this.a.onComplete();
            return;
        }
        this.c = true;
        DisposableHelper.replace(this, null);
        CompletableSource completableSource0 = this.b;
        this.b = null;
        completableSource0.subscribe(this);
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0) && !this.c) {
            this.a.onSubscribe(this);
        }
    }
}

