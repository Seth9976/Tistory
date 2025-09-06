package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class m extends AtomicReference implements Observer, Disposable {
    public final n a;

    public m(n n0) {
        this.a = n0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.lazySet(DisposableHelper.DISPOSED);
        n n0 = this.a;
        n0.e.delete(this);
        if(n0.e.size() == 0) {
            DisposableHelper.dispose(n0.f);
            n0.h = true;
            n0.b();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.lazySet(DisposableHelper.DISPOSED);
        DisposableHelper.dispose(this.a.f);
        this.a.e.delete(this);
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        Collection collection0;
        n n0 = this.a;
        n0.getClass();
        try {
            collection0 = (Collection)ObjectHelper.requireNonNull(n0.b.call(), "The bufferSupplier returned a null Collection");
            observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(n0.d.apply(object0), "The bufferClose returned a null ObservableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            DisposableHelper.dispose(n0.f);
            n0.onError(throwable0);
            return;
        }
        long v = n0.k;
        n0.k = v + 1L;
        synchronized(n0) {
            LinkedHashMap linkedHashMap0 = n0.l;
            if(linkedHashMap0 == null) {
                return;
            }
            linkedHashMap0.put(v, collection0);
        }
        o o0 = new o(n0, v);
        n0.e.add(o0);
        observableSource0.subscribe(o0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

