package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class SafeObserver implements Observer, Disposable {
    public final Observer a;
    public Disposable b;
    public boolean c;

    public SafeObserver(@NonNull Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.b.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        Observer observer0 = this.a;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                observer0.onSubscribe(EmptyDisposable.INSTANCE);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable0}));
                return;
            }
            try {
                observer0.onError(nullPointerException0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable1}));
            }
            return;
        }
        try {
            observer0.onComplete();
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            RxJavaPlugins.onError(throwable2);
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(@NonNull Throwable throwable0) {
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        Observer observer0 = this.a;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                observer0.onSubscribe(EmptyDisposable.INSTANCE);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0, throwable1}));
                return;
            }
            try {
                observer0.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0}));
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, nullPointerException0, throwable2}));
            }
            return;
        }
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            observer0.onError(throwable0);
        }
        catch(Throwable throwable3) {
            Exceptions.throwIfFatal(throwable3);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable3}));
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(@NonNull Object object0) {
        if(this.c) {
            return;
        }
        Observer observer0 = this.a;
        if(this.b == null) {
            this.c = true;
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                observer0.onSubscribe(EmptyDisposable.INSTANCE);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable0}));
                return;
            }
            try {
                observer0.onError(nullPointerException0);
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                RxJavaPlugins.onError(new CompositeException(new Throwable[]{nullPointerException0, throwable1}));
            }
            return;
        }
        if(object0 == null) {
            NullPointerException nullPointerException1 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.b.dispose();
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                this.onError(new CompositeException(new Throwable[]{nullPointerException1, throwable2}));
                return;
            }
            this.onError(nullPointerException1);
            return;
        }
        try {
            observer0.onNext(object0);
        }
        catch(Throwable throwable3) {
            Exceptions.throwIfFatal(throwable3);
            try {
                this.b.dispose();
            }
            catch(Throwable throwable4) {
                Exceptions.throwIfFatal(throwable4);
                this.onError(new CompositeException(new Throwable[]{throwable3, throwable4}));
                return;
            }
            this.onError(throwable3);
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable0) {
        if(DisposableHelper.validate(this.b, disposable0)) {
            try {
                this.b = disposable0;
                this.a.onSubscribe(this);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.c = true;
                try {
                    disposable0.dispose();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                    return;
                }
                RxJavaPlugins.onError(throwable0);
            }
        }
    }
}

