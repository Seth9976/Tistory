package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class k implements Observer, Disposable {
    public final Observer a;
    public final int b;
    public final Callable c;
    public Collection d;
    public int e;
    public Disposable f;

    public k(Observer observer0, int v, Callable callable0) {
        this.a = observer0;
        this.b = v;
        this.c = callable0;
    }

    public final boolean a() {
        try {
            this.d = (Collection)ObjectHelper.requireNonNull(this.c.call(), "Empty buffer supplied");
            return true;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.d = null;
            Disposable disposable0 = this.f;
            Observer observer0 = this.a;
            if(disposable0 == null) {
                EmptyDisposable.error(throwable0, observer0);
                return false;
            }
            disposable0.dispose();
            observer0.onError(throwable0);
            return false;
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Collection collection0 = this.d;
        if(collection0 != null) {
            this.d = null;
            Observer observer0 = this.a;
            if(!collection0.isEmpty()) {
                observer0.onNext(collection0);
            }
            observer0.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.d = null;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Collection collection0 = this.d;
        if(collection0 != null) {
            collection0.add(object0);
            int v = this.e + 1;
            this.e = v;
            if(v >= this.b) {
                this.a.onNext(collection0);
                this.e = 0;
                this.a();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

