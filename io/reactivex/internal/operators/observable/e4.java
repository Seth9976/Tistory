package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e4 extends AtomicReference implements Observer, Disposable, TimeoutSelectorSupport {
    public final Observer a;
    public final Function b;
    public final SequentialDisposable c;
    public final AtomicLong d;
    public final AtomicReference e;
    public ObservableSource f;

    public e4(ObservableSource observableSource0, Observer observer0, Function function0) {
        this.a = observer0;
        this.b = function0;
        this.c = new SequentialDisposable();
        this.f = observableSource0;
        this.d = new AtomicLong();
        this.e = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.e);
        DisposableHelper.dispose(this);
        this.c.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.d.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.c.dispose();
            this.a.onComplete();
            this.c.dispose();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
            this.c.dispose();
            this.a.onError(throwable0);
            this.c.dispose();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        ObservableSource observableSource0;
        AtomicLong atomicLong0 = this.d;
        long v = atomicLong0.get();
        if(v != 0x7FFFFFFFFFFFFFFFL && atomicLong0.compareAndSet(v, v + 1L)) {
            SequentialDisposable sequentialDisposable0 = this.c;
            Disposable disposable0 = (Disposable)sequentialDisposable0.get();
            if(disposable0 != null) {
                disposable0.dispose();
            }
            Observer observer0 = this.a;
            observer0.onNext(object0);
            try {
                observableSource0 = (ObservableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The itemTimeoutIndicator returned a null ObservableSource.");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Disposable)this.e.get()).dispose();
                atomicLong0.getAndSet(0x7FFFFFFFFFFFFFFFL);
                observer0.onError(throwable0);
                return;
            }
            d4 d40 = new d4(v + 1L, this);
            if(sequentialDisposable0.replace(d40)) {
                observableSource0.subscribe(d40);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this.e, disposable0);
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutSupport
    public final void onTimeout(long v) {
        if(this.d.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            DisposableHelper.dispose(this.e);
            ObservableSource observableSource0 = this.f;
            this.f = null;
            observableSource0.subscribe(new i2(this.a, this, 1));
        }
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutSelectorSupport
    public final void onTimeoutError(long v, Throwable throwable0) {
        if(this.d.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
            DisposableHelper.dispose(this);
            this.a.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }
}

