package io.reactivex.internal.operators.maybe;

import ed.d;
import gd.a0;
import gd.c;
import gd.r;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

public final class y extends AtomicReference implements MaybeObserver, Disposable {
    public final int a;
    public final Object b;
    public final Object c;

    public y(int v, Object object0, Object object1) {
        this.a = v;
        super();
        this.c = object0;
        this.b = object1;
    }

    public y(MaybeObserver maybeObserver0, int v) {
        this.a = v;
        switch(v) {
            case 5: {
                super();
                this.c = maybeObserver0;
                this.b = new d(this, 3);
                return;
            }
            case 6: {
                super();
                this.c = maybeObserver0;
                this.b = new a0(this, 4);
                return;
            }
            default: {
                super();
                this.b = maybeObserver0;
                this.c = new SequentialDisposable();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(this);
                return;
            }
            case 1: {
                DisposableHelper.dispose(this);
                return;
            }
            case 2: {
                DisposableHelper.dispose(this);
                ((SequentialDisposable)this.c).dispose();
                return;
            }
            case 3: {
                DisposableHelper.dispose(this);
                return;
            }
            case 4: {
                DisposableHelper.dispose(this);
                return;
            }
            case 5: {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(((d)this.b));
                return;
            }
            default: {
                DisposableHelper.dispose(this);
                SubscriptionHelper.cancel(((a0)this.b));
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 1: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 2: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 3: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 4: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 5: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            default: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                NoSuchElementException noSuchElementException0 = new NoSuchElementException();
                ((SingleObserver)this.c).onError(noSuchElementException0);
                return;
            }
            case 1: {
                ((MaybeObserver)this.c).onComplete();
                return;
            }
            case 2: {
                ((MaybeObserver)this.b).onComplete();
                return;
            }
            case 3: {
                Disposable disposable0 = (Disposable)this.get();
                if(disposable0 != DisposableHelper.DISPOSED && this.compareAndSet(disposable0, null)) {
                    r r0 = new r(((MaybeObserver)this.c), this, 4);
                    ((MaybeSource)this.b).subscribe(r0);
                }
                return;
            }
            case 4: {
                Disposable disposable1 = (Disposable)this.get();
                if(disposable1 != DisposableHelper.DISPOSED && this.compareAndSet(disposable1, null)) {
                    c c0 = new c(10, ((SingleObserver)this.c), this);
                    ((SingleSource)this.b).subscribe(c0);
                }
                return;
            }
            case 5: {
                DisposableHelper.dispose(((d)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onComplete();
                }
                return;
            }
            default: {
                SubscriptionHelper.cancel(((a0)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onComplete();
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((SingleObserver)this.c).onError(throwable0);
                return;
            }
            case 1: {
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            case 2: {
                ((MaybeObserver)this.b).onError(throwable0);
                return;
            }
            case 3: {
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            case 4: {
                ((SingleObserver)this.c).onError(throwable0);
                return;
            }
            case 5: {
                DisposableHelper.dispose(((d)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                SubscriptionHelper.cancel(((a0)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((SingleObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 2: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 3: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 4: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((SingleObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 5: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        SingleSource singleSource1;
        SingleSource singleSource0;
        switch(this.a) {
            case 0: {
                try {
                    singleSource0 = (SingleSource)ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper returned a null SingleSource");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.onError(throwable0);
                    return;
                }
                if(!this.isDisposed()) {
                    singleSource0.subscribe(new c(8, ((SingleObserver)this.c), this));
                    return;
                }
                return;
            }
            case 1: {
                try {
                    singleSource1 = (SingleSource)ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper returned a null SingleSource");
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    this.onError(throwable1);
                    return;
                }
                singleSource1.subscribe(new c(9, this, ((MaybeObserver)this.c)));
                return;
            }
            case 2: {
                ((MaybeObserver)this.b).onSuccess(object0);
                return;
            }
            case 3: {
                ((MaybeObserver)this.c).onSuccess(object0);
                return;
            }
            case 4: {
                ((SingleObserver)this.c).onSuccess(object0);
                return;
            }
            case 5: {
                DisposableHelper.dispose(((d)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onSuccess(object0);
                }
                return;
            }
            default: {
                SubscriptionHelper.cancel(((a0)this.b));
                if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                    ((MaybeObserver)this.c).onSuccess(object0);
                }
            }
        }
    }
}

