package gd;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends AtomicReference implements SingleObserver, Disposable {
    public final int a;
    public final Object b;
    public Object c;

    public h(int v, Object object0, Object object1) {
        this.a = v;
        super();
        this.b = object0;
        this.c = object1;
    }

    public h(SingleObserver singleObserver0) {
        this.a = 3;
        super();
        this.b = singleObserver0;
        this.c = new a0(this, 0);
    }

    public h(SingleObserver singleObserver0, Action action0) {
        this.a = 1;
        super();
        this.b = singleObserver0;
        this.lazySet(action0);
    }

    public void a(Throwable throwable0) {
        Disposable disposable0 = (Disposable)this.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(disposable0 != disposableHelper0) {
            Disposable disposable1 = (Disposable)this.getAndSet(disposableHelper0);
            if(disposable1 != disposableHelper0) {
                if(disposable1 != null) {
                    disposable1.dispose();
                }
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(this);
                return;
            }
            case 1: {
                Action action0 = (Action)this.getAndSet(null);
                if(action0 != null) {
                    try {
                        action0.run();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        RxJavaPlugins.onError(throwable0);
                    }
                    ((Disposable)this.c).dispose();
                }
                return;
            }
            case 2: {
                DisposableHelper.dispose(this);
                return;
            }
            default: {
                DisposableHelper.dispose(this);
                a0 a00 = (a0)this.c;
                a00.getClass();
                SubscriptionHelper.cancel(a00);
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
                return ((Disposable)this.c).isDisposed();
            }
            case 2: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            default: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onError(throwable0);
                return;
            }
            case 2: {
                ((MaybeObserver)this.b).onError(throwable0);
                return;
            }
            default: {
                a0 a00 = (a0)this.c;
                a00.getClass();
                SubscriptionHelper.cancel(a00);
                if(((Disposable)this.get()) != DisposableHelper.DISPOSED && ((Disposable)this.getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                    ((SingleObserver)this.b).onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((SingleObserver)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(((Disposable)this.c), disposable0)) {
                    this.c = disposable0;
                    ((SingleObserver)this.b).onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.setOnce(this, disposable0)) {
                    ((MaybeObserver)this.b).onSubscribe(this);
                }
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        MaybeSource maybeSource0;
        switch(this.a) {
            case 0: {
                ResumeSingleObserver resumeSingleObserver0 = new ResumeSingleObserver(this, ((SingleObserver)this.b));
                ((SingleSource)this.c).subscribe(resumeSingleObserver0);
                return;
            }
            case 1: {
                ((SingleObserver)this.b).onSuccess(object0);
                return;
            }
            case 2: {
                try {
                    maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The mapper returned a null MaybeSource");
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    this.onError(throwable0);
                    return;
                }
                if(!this.isDisposed()) {
                    maybeSource0.subscribe(new r(0, ((MaybeObserver)this.b), this));
                    return;
                }
                return;
            }
            default: {
                a0 a00 = (a0)this.c;
                a00.getClass();
                SubscriptionHelper.cancel(a00);
                if(((Disposable)this.getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                    ((SingleObserver)this.b).onSuccess(object0);
                }
            }
        }
    }
}

