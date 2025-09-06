package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class g implements Observer, Disposable {
    public final int a;
    public final Observer b;
    public final Predicate c;
    public Disposable d;
    public boolean e;

    public g(Observer observer0, Predicate predicate0, int v) {
        this.a = v;
        this.b = observer0;
        this.c = predicate0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.d.dispose();
                return;
            }
            case 1: {
                this.d.dispose();
                return;
            }
            case 2: {
                this.d.dispose();
                return;
            }
            case 3: {
                this.d.dispose();
                return;
            }
            default: {
                this.d.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.d.isDisposed();
            }
            case 1: {
                return this.d.isDisposed();
            }
            case 2: {
                return this.d.isDisposed();
            }
            case 3: {
                return this.d.isDisposed();
            }
            default: {
                return this.d.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    this.e = true;
                    this.b.onNext(Boolean.TRUE);
                    this.b.onComplete();
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    this.b.onNext(Boolean.FALSE);
                    this.b.onComplete();
                }
                return;
            }
            case 2: {
                this.b.onComplete();
                return;
            }
            case 3: {
                if(!this.e) {
                    this.e = true;
                    this.b.onComplete();
                }
                return;
            }
            default: {
                if(!this.e) {
                    this.e = true;
                    this.b.onComplete();
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.b.onError(throwable0);
                return;
            }
            case 1: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.b.onError(throwable0);
                return;
            }
            case 2: {
                this.b.onError(throwable0);
                return;
            }
            case 3: {
                if(!this.e) {
                    this.e = true;
                    this.b.onError(throwable0);
                    return;
                }
                RxJavaPlugins.onError(throwable0);
                return;
            }
            default: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.b.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Observer observer0;
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    try {
                        if(!this.c.test(object0)) {
                            goto label_26;
                        }
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.d.dispose();
                        this.onError(throwable1);
                    }
                    return;
                label_26:
                    this.e = true;
                    this.d.dispose();
                    this.b.onNext(Boolean.FALSE);
                    this.b.onComplete();
                    return;
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    try {
                        if(this.c.test(object0)) {
                            goto label_40;
                        }
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.d.dispose();
                        this.onError(throwable2);
                    }
                    return;
                label_40:
                    this.e = true;
                    this.d.dispose();
                    this.b.onNext(Boolean.TRUE);
                    this.b.onComplete();
                    return;
                }
                return;
            }
            case 2: {
                Observer observer1 = this.b;
                if(this.e) {
                    observer1.onNext(object0);
                    return;
                }
                try {
                    if(!this.c.test(object0)) {
                        goto label_57;
                    }
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    this.d.dispose();
                    observer1.onError(throwable3);
                }
                return;
            label_57:
                this.e = true;
                observer1.onNext(object0);
                return;
            }
            case 3: {
                if(!this.e) {
                    Observer observer2 = this.b;
                    observer2.onNext(object0);
                    try {
                        if(this.c.test(object0)) {
                            goto label_71;
                        }
                    }
                    catch(Throwable throwable4) {
                        Exceptions.throwIfFatal(throwable4);
                        this.d.dispose();
                        this.onError(throwable4);
                    }
                    return;
                label_71:
                    this.e = true;
                    this.d.dispose();
                    observer2.onComplete();
                    return;
                }
                return;
            }
            default: {
                if(!this.e) {
                    try {
                        boolean z = this.c.test(object0);
                        observer0 = this.b;
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.d.dispose();
                        this.onError(throwable0);
                        return;
                    }
                    if(!z) {
                        this.e = true;
                        this.d.dispose();
                        observer0.onComplete();
                        return;
                    }
                    observer0.onNext(object0);
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            case 3: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    this.b.onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    this.b.onSubscribe(this);
                }
            }
        }
    }
}

