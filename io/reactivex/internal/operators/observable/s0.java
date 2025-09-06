package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class s0 implements Observer, Disposable {
    public final int a;
    public Disposable b;
    public boolean c;
    public final Object d;
    public Object e;

    public s0(MaybeObserver maybeObserver0) {
        this.a = 1;
        super();
        this.d = maybeObserver0;
    }

    public s0(Observer observer0, Function function0) {
        this.a = 0;
        super();
        this.d = observer0;
        this.e = function0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            if(!this.c) {
                this.c = true;
                Object object0 = this.e;
                this.e = null;
                MaybeObserver maybeObserver0 = (MaybeObserver)this.d;
                if(object0 == null) {
                    maybeObserver0.onComplete();
                    return;
                }
                maybeObserver0.onSuccess(object0);
            }
            return;
        }
        if(!this.c) {
            this.c = true;
            ((Observer)this.d).onComplete();
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            if(this.c) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.c = true;
            ((MaybeObserver)this.d).onError(throwable0);
            return;
        }
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        ((Observer)this.d).onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Notification notification0;
        if(this.a != 0) {
            if(!this.c) {
                if(this.e != null) {
                    this.c = true;
                    this.b.dispose();
                    IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                    ((MaybeObserver)this.d).onError(illegalArgumentException0);
                    return;
                }
                this.e = object0;
            }
            return;
        }
        if(this.c) {
            if(object0 instanceof Notification && ((Notification)object0).isOnError()) {
                RxJavaPlugins.onError(((Notification)object0).getError());
                return;
            }
            return;
        }
        else {
            notification0 = (Notification)ObjectHelper.requireNonNull(((Function)this.e).apply(object0), "The selector returned a null Notification");
        }
        if(notification0.isOnError()) {
            this.b.dispose();
            this.onError(notification0.getError());
            return;
        }
        if(notification0.isOnComplete()) {
            this.b.dispose();
            this.onComplete();
            return;
        }
        Object object1 = notification0.getValue();
        ((Observer)this.d).onNext(object1);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            if(DisposableHelper.validate(this.b, disposable0)) {
                this.b = disposable0;
                ((MaybeObserver)this.d).onSubscribe(this);
            }
            return;
        }
        if(DisposableHelper.validate(this.b, disposable0)) {
            this.b = disposable0;
            ((Observer)this.d).onSubscribe(this);
        }
    }
}

