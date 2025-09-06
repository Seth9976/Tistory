package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class y1 implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final Function c;
    public final Callable d;
    public Disposable e;

    public y1(Observer observer0, Function function0, Function function1, Callable callable0) {
        this.a = observer0;
        this.b = function0;
        this.c = function1;
        this.d = callable0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        ObservableSource observableSource0;
        Observer observer0;
        try {
            observer0 = this.a;
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.d.call(), "The onComplete ObservableSource returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            observer0.onError(throwable0);
            return;
        }
        observer0.onNext(observableSource0);
        observer0.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        ObservableSource observableSource0;
        Observer observer0;
        try {
            observer0 = this.a;
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.c.apply(throwable0), "The onError ObservableSource returned is null");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            observer0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
        observer0.onNext(observableSource0);
        observer0.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        Observer observer0;
        try {
            observer0 = this.a;
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The onNext ObservableSource returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            observer0.onError(throwable0);
            return;
        }
        observer0.onNext(observableSource0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

