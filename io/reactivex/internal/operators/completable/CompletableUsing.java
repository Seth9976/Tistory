package io.reactivex.internal.operators.completable;

import dd.b0;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class CompletableUsing extends Completable {
    public final Callable a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public CompletableUsing(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        this.a = callable0;
        this.b = function0;
        this.c = consumer0;
        this.d = z;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompletableSource completableSource0;
        Object object0;
        Consumer consumer0;
        boolean z;
        try {
            z = this.d;
            consumer0 = this.c;
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, completableObserver0);
            return;
        }
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The completableFunction returned a null CompletableSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            if(z) {
                try {
                    consumer0.accept(object0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    EmptyDisposable.error(new CompositeException(new Throwable[]{throwable1, throwable2}), completableObserver0);
                    return;
                }
            }
            EmptyDisposable.error(throwable1, completableObserver0);
            if(!z) {
                try {
                    consumer0.accept(object0);
                    return;
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    RxJavaPlugins.onError(throwable3);
                }
            }
            return;
        }
        completableSource0.subscribe(new b0(completableObserver0, object0, consumer0, z));
    }
}

