package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class MaybeUsing extends Maybe {
    public final Callable a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public MaybeUsing(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        this.a = callable0;
        this.b = function0;
        this.c = consumer0;
        this.d = z;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        MaybeSource maybeSource0;
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
            EmptyDisposable.error(throwable0, maybeObserver0);
            return;
        }
        try {
            maybeSource0 = (MaybeSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The sourceSupplier returned a null MaybeSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            if(z) {
                try {
                    consumer0.accept(object0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    EmptyDisposable.error(new CompositeException(new Throwable[]{throwable1, throwable2}), maybeObserver0);
                    return;
                }
            }
            EmptyDisposable.error(throwable1, maybeObserver0);
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
        maybeSource0.subscribe(new k0(maybeObserver0, object0, consumer0, z));
    }
}

