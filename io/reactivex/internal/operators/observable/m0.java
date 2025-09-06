package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class m0 implements Observer, Disposable {
    public final SerializedObserver a;
    public final Function b;
    public Disposable c;
    public final AtomicReference d;
    public volatile long e;
    public boolean f;

    public m0(SerializedObserver serializedObserver0, Function function0) {
        this.d = new AtomicReference();
        this.a = serializedObserver0;
        this.b = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.dispose();
        DisposableHelper.dispose(this.d);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference0 = this.d;
        Disposable disposable0 = (Disposable)atomicReference0.get();
        if(disposable0 != DisposableHelper.DISPOSED) {
            if(((l0)disposable0) != null) {
                ((l0)disposable0).a();
            }
            DisposableHelper.dispose(atomicReference0);
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        DisposableHelper.dispose(this.d);
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        if(this.f) {
            return;
        }
        long v = this.e + 1L;
        this.e = v;
        Disposable disposable0 = (Disposable)this.d.get();
        if(disposable0 != null) {
            disposable0.dispose();
        }
        try {
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The ObservableSource supplied is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.dispose();
            this.a.onError(throwable0);
            return;
        }
        l0 l00 = new l0(this, v, object0);
        AtomicReference atomicReference0 = this.d;
        do {
            if(atomicReference0.compareAndSet(disposable0, l00)) {
                observableSource0.subscribe(l00);
                return;
            }
        }
        while(atomicReference0.get() == disposable0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

