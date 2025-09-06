package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;

public final class k implements MaybeObserver, Disposable {
    public final int a;
    public Disposable b;
    public final Object c;
    public final Object d;

    public k(int v, MaybeObserver maybeObserver0, Object object0) {
        this.a = v;
        this.c = maybeObserver0;
        this.d = object0;
        super();
    }

    public k(MaybeObserver maybeObserver0, Publisher publisher0) {
        this.a = 0;
        super();
        this.c = new l(maybeObserver0);
        this.d = publisher0;
    }

    public void a() {
        try {
            ((MaybePeek)this.d).e.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    public void b(Throwable throwable0) {
        try {
            ((MaybePeek)this.d).c.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
        }
        this.b = DisposableHelper.DISPOSED;
        ((MaybeObserver)this.c).onError(throwable0);
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                this.b.dispose();
                this.b = DisposableHelper.DISPOSED;
                SubscriptionHelper.cancel(((l)this.c));
                return;
            }
            case 1: {
                this.b.dispose();
                return;
            }
            case 2: {
                this.b.dispose();
                this.b = DisposableHelper.DISPOSED;
                return;
            }
            default: {
                try {
                    ((MaybePeek)this.d).f.run();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    RxJavaPlugins.onError(throwable0);
                }
                this.b.dispose();
                this.b = DisposableHelper.DISPOSED;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return ((l)this.c).get() == SubscriptionHelper.CANCELLED;
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

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                this.b = DisposableHelper.DISPOSED;
                ((Publisher)this.d).subscribe(((l)this.c));
                return;
            }
            case 1: {
                ((MaybeObserver)this.c).onComplete();
                return;
            }
            case 2: {
                MaybeObserver maybeObserver0 = (MaybeObserver)this.c;
                this.b = DisposableHelper.DISPOSED;
                try {
                    ((BiConsumer)this.d).accept(null, null);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    maybeObserver0.onError(throwable1);
                    return;
                }
                maybeObserver0.onComplete();
                return;
            }
            default: {
                DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
                if(this.b != disposableHelper0) {
                    try {
                        ((MaybePeek)this.d).d.run();
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.b(throwable0);
                        return;
                    }
                    this.b = disposableHelper0;
                    ((MaybeObserver)this.c).onComplete();
                    this.a();
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                this.b = DisposableHelper.DISPOSED;
                ((l)this.c).c = throwable0;
                ((Publisher)this.d).subscribe(((l)this.c));
                return;
            }
            case 1: {
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            case 2: {
                try {
                    this.b = DisposableHelper.DISPOSED;
                    ((BiConsumer)this.d).accept(null, throwable0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    throwable0 = new CompositeException(new Throwable[]{throwable0, throwable1});
                }
                ((MaybeObserver)this.c).onError(throwable0);
                return;
            }
            default: {
                if(this.b == DisposableHelper.DISPOSED) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.b(throwable0);
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((l)this.c).a.onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(DisposableHelper.validate(this.b, disposable0)) {
                    this.b = disposable0;
                    ((MaybeObserver)this.c).onSubscribe(this);
                }
                return;
            }
            default: {
                MaybeObserver maybeObserver0 = (MaybeObserver)this.c;
                if(DisposableHelper.validate(this.b, disposable0)) {
                    try {
                        ((MaybePeek)this.d).a.accept(disposable0);
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        disposable0.dispose();
                        this.b = DisposableHelper.DISPOSED;
                        EmptyDisposable.error(throwable0, maybeObserver0);
                        return;
                    }
                    this.b = disposable0;
                    maybeObserver0.onSubscribe(this);
                }
            }
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        switch(this.a) {
            case 0: {
                this.b = DisposableHelper.DISPOSED;
                ((l)this.c).b = object0;
                ((Publisher)this.d).subscribe(((l)this.c));
                return;
            }
            case 1: {
                ((MaybeObserver)this.c).onSuccess(object0);
                try {
                    ((Consumer)this.d).accept(object0);
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    RxJavaPlugins.onError(throwable1);
                }
                return;
            }
            case 2: {
                MaybeObserver maybeObserver0 = (MaybeObserver)this.c;
                this.b = DisposableHelper.DISPOSED;
                try {
                    ((BiConsumer)this.d).accept(object0, null);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    maybeObserver0.onError(throwable2);
                    return;
                }
                maybeObserver0.onSuccess(object0);
                return;
            }
            default: {
                DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
                if(this.b != disposableHelper0) {
                    try {
                        ((MaybePeek)this.d).b.accept(object0);
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        this.b(throwable0);
                        return;
                    }
                    this.b = disposableHelper0;
                    ((MaybeObserver)this.c).onSuccess(object0);
                    this.a();
                }
            }
        }
    }
}

