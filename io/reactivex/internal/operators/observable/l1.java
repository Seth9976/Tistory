package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

public final class l1 implements Emitter, Disposable {
    public final Observer a;
    public final BiFunction b;
    public final Consumer c;
    public Object d;
    public volatile boolean e;
    public boolean f;
    public boolean g;

    public l1(Observer observer0, BiFunction biFunction0, Consumer consumer0, Object object0) {
        this.a = observer0;
        this.b = biFunction0;
        this.c = consumer0;
        this.d = object0;
    }

    public final void a(Object object0) {
        try {
            this.c.accept(object0);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override  // io.reactivex.Emitter
    public final void onComplete() {
        if(!this.f) {
            this.f = true;
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.Emitter
    public final void onError(Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f = true;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(!this.f) {
            if(this.g) {
                this.onError(new IllegalStateException("onNext already called in this generate turn"));
                return;
            }
            if(object0 == null) {
                this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.g = true;
            this.a.onNext(object0);
        }
    }
}

