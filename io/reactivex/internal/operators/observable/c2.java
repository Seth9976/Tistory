package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class c2 implements Observer {
    public final Observer a;
    public final Function b;
    public final boolean c;
    public final SequentialDisposable d;
    public boolean e;
    public boolean f;

    public c2(Observer observer0, Function function0, boolean z) {
        this.a = observer0;
        this.b = function0;
        this.c = z;
        this.d = new SequentialDisposable();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.f) {
            return;
        }
        this.f = true;
        this.e = true;
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        ObservableSource observableSource0;
        Observer observer0 = this.a;
        if(this.e) {
            if(this.f) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            observer0.onError(throwable0);
            return;
        }
        this.e = true;
        if(this.c && !(throwable0 instanceof Exception)) {
            observer0.onError(throwable0);
            return;
        }
        try {
            observableSource0 = (ObservableSource)this.b.apply(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            observer0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
        if(observableSource0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Observable is null");
            nullPointerException0.initCause(throwable0);
            observer0.onError(nullPointerException0);
            return;
        }
        observableSource0.subscribe(this);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.f) {
            return;
        }
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        this.d.replace(disposable0);
    }
}

