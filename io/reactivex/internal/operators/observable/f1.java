package io.reactivex.internal.operators.observable;

import dd.q;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class f1 extends AtomicInteger implements Observer, Disposable {
    public final CompletableObserver a;
    public final AtomicThrowable b;
    public final Function c;
    public final boolean d;
    public final CompositeDisposable e;
    public Disposable f;
    public volatile boolean g;

    public f1(CompletableObserver completableObserver0, Function function0, boolean z) {
        this.a = completableObserver0;
        this.c = function0;
        this.d = z;
        this.b = new AtomicThrowable();
        this.e = new CompositeDisposable();
        this.lazySet(1);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g = true;
        this.f.dispose();
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.decrementAndGet() == 0) {
            Throwable throwable0 = this.b.terminate();
            CompletableObserver completableObserver0 = this.a;
            if(throwable0 != null) {
                completableObserver0.onError(throwable0);
                return;
            }
            completableObserver0.onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.b;
        if(atomicThrowable0.addThrowable(throwable0)) {
            CompletableObserver completableObserver0 = this.a;
            if(!this.d) {
                this.dispose();
                if(this.getAndSet(0) > 0) {
                    completableObserver0.onError(atomicThrowable0.terminate());
                }
            }
            else if(this.decrementAndGet() == 0) {
                completableObserver0.onError(atomicThrowable0.terminate());
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        CompletableSource completableSource0;
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.c.apply(object0), "The mapper returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.f.dispose();
            this.onError(throwable0);
            return;
        }
        this.getAndIncrement();
        q q0 = new q(this, 4);
        if(!this.g && this.e.add(q0)) {
            completableSource0.subscribe(q0);
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

