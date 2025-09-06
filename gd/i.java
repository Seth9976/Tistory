package gd;

import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class i implements SingleObserver, Disposable {
    public final int a;
    public Disposable b;
    public final Object c;
    public final Object d;

    public i(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.d = object1;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.b.dispose();
                return;
            }
            case 1: {
                this.b.dispose();
                return;
            }
            case 2: {
                this.b.dispose();
                return;
            }
            default: {
                Disposable disposable0 = this.b;
                this.b = DisposableHelper.DISPOSED;
                disposable0.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.b.isDisposed();
            }
            case 1: {
                return this.b.isDisposed();
            }
            case 2: {
                return this.b.isDisposed();
            }
            default: {
                return this.b.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            case 1: {
                ((SingleObserver)this.c).onError(throwable0);
                return;
            }
            case 2: {
                ((SingleObserver)this.c).onError(throwable0);
                try {
                    ((Action)this.d).run();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    RxJavaPlugins.onError(throwable1);
                }
                return;
            }
            default: {
                ((MaybeObserver)this.c).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((SingleObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((SingleObserver)this.c).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
            }
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Notification notification0;
        switch(this.a) {
            case 0: {
                MaybeObserver maybeObserver1 = (MaybeObserver)this.c;
                try {
                    notification0 = (Notification)ObjectHelper.requireNonNull(((Function)this.d).apply(object0), "The selector returned a null Notification");
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    maybeObserver1.onError(throwable1);
                    return;
                }
                if(notification0.isOnNext()) {
                    maybeObserver1.onSuccess(notification0.getValue());
                    return;
                }
                if(notification0.isOnComplete()) {
                    maybeObserver1.onComplete();
                    return;
                }
                maybeObserver1.onError(notification0.getError());
                return;
            }
            case 1: {
                ((SingleObserver)this.c).onSuccess(object0);
                try {
                    ((Consumer)this.d).accept(object0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    RxJavaPlugins.onError(throwable2);
                }
                return;
            }
            case 2: {
                ((SingleObserver)this.c).onSuccess(object0);
                try {
                    ((Action)this.d).run();
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    RxJavaPlugins.onError(throwable3);
                }
                return;
            }
            default: {
                MaybeObserver maybeObserver0 = (MaybeObserver)this.c;
                try {
                    if(((Predicate)this.d).test(object0)) {
                        goto label_8;
                    }
                    goto label_10;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    maybeObserver0.onError(throwable0);
                    return;
                }
            label_8:
                maybeObserver0.onSuccess(object0);
                return;
            label_10:
                maybeObserver0.onComplete();
            }
        }
    }
}

