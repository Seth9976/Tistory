package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class y implements Observer, Disposable {
    public final int a;
    public Object b;
    public Object c;
    public Disposable d;
    public boolean e;
    public final Object f;

    public y(MaybeObserver maybeObserver0, BiFunction biFunction0) {
        this.a = 2;
        super();
        this.f = maybeObserver0;
        this.b = biFunction0;
    }

    public y(Observer observer0, Iterator iterator0, BiFunction biFunction0) {
        this.a = 4;
        super();
        this.f = observer0;
        this.b = iterator0;
        this.c = biFunction0;
    }

    public y(SingleObserver singleObserver0, Object object0) {
        this.a = 3;
        super();
        this.f = singleObserver0;
        this.c = object0;
    }

    public y(Object object0, Object object1, BiConsumer biConsumer0, int v) {
        this.a = v;
        this.f = object0;
        this.b = biConsumer0;
        this.c = object1;
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
                    ((Observer)this.f).onNext(this.c);
                    ((Observer)this.f).onComplete();
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    ((SingleObserver)this.f).onSuccess(this.c);
                }
                return;
            }
            case 2: {
                if(!this.e) {
                    this.e = true;
                    Object object0 = this.c;
                    this.c = null;
                    MaybeObserver maybeObserver0 = (MaybeObserver)this.f;
                    if(object0 != null) {
                        maybeObserver0.onSuccess(object0);
                        return;
                    }
                    maybeObserver0.onComplete();
                }
                return;
            }
            case 3: {
                if(!this.e) {
                    this.e = true;
                    Object object1 = this.b;
                    this.b = null;
                    if(object1 == null) {
                        object1 = this.c;
                    }
                    SingleObserver singleObserver0 = (SingleObserver)this.f;
                    if(object1 != null) {
                        singleObserver0.onSuccess(object1);
                        return;
                    }
                    singleObserver0.onError(new NoSuchElementException());
                }
                return;
            }
            default: {
                if(!this.e) {
                    this.e = true;
                    ((Observer)this.f).onComplete();
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
                ((Observer)this.f).onError(throwable0);
                return;
            }
            case 1: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                ((SingleObserver)this.f).onError(throwable0);
                return;
            }
            case 2: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.c = null;
                ((MaybeObserver)this.f).onError(throwable0);
                return;
            }
            case 3: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                ((SingleObserver)this.f).onError(throwable0);
                return;
            }
            default: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                ((Observer)this.f).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object3;
        Object object2;
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    try {
                        ((BiConsumer)this.b).accept(this.c, object0);
                        return;
                    }
                    catch(Throwable throwable3) {
                        this.d.dispose();
                        this.onError(throwable3);
                    }
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    try {
                        ((BiConsumer)this.b).accept(this.c, object0);
                        return;
                    }
                    catch(Throwable throwable4) {
                        this.d.dispose();
                        this.onError(throwable4);
                    }
                }
                return;
            }
            case 2: {
                if(!this.e) {
                    Object object4 = this.c;
                    if(object4 == null) {
                        this.c = object0;
                        return;
                    }
                    try {
                        this.c = ObjectHelper.requireNonNull(((BiFunction)this.b).apply(object4, object0), "The reducer returned a null value");
                        return;
                    }
                    catch(Throwable throwable5) {
                        Exceptions.throwIfFatal(throwable5);
                        this.d.dispose();
                        this.onError(throwable5);
                    }
                }
                return;
            }
            case 3: {
                if(!this.e) {
                    if(this.b != null) {
                        this.e = true;
                        this.d.dispose();
                        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                        ((SingleObserver)this.f).onError(illegalArgumentException0);
                        return;
                    }
                    this.b = object0;
                }
                return;
            }
            default: {
                Observer observer0 = (Observer)this.f;
                Iterator iterator0 = (Iterator)this.b;
                if(!this.e) {
                    try {
                        Object object1 = iterator0.next();
                        object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.e = true;
                        this.d.dispose();
                        observer0.onError(throwable0);
                        return;
                    }
                    try {
                        object3 = ObjectHelper.requireNonNull(((BiFunction)this.c).apply(object0, object2), "The zipper function returned a null value");
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.e = true;
                        this.d.dispose();
                        observer0.onError(throwable1);
                        return;
                    }
                    observer0.onNext(object3);
                    try {
                        if(!iterator0.hasNext()) {
                            goto label_30;
                        }
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.e = true;
                        this.d.dispose();
                        observer0.onError(throwable2);
                    }
                    return;
                label_30:
                    this.e = true;
                    this.d.dispose();
                    observer0.onComplete();
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
                    ((Observer)this.f).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((SingleObserver)this.f).onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((MaybeObserver)this.f).onSubscribe(this);
                }
                return;
            }
            case 3: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((SingleObserver)this.f).onSubscribe(this);
                }
                return;
            }
            default: {
                if(DisposableHelper.validate(this.d, disposable0)) {
                    this.d = disposable0;
                    ((Observer)this.f).onSubscribe(this);
                }
            }
        }
    }
}

