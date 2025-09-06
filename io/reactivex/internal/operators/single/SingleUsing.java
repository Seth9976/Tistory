package io.reactivex.internal.operators.single;

import gd.e0;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class SingleUsing extends Single {
    public final Callable a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public SingleUsing(Callable callable0, Function function0, Consumer consumer0, boolean z) {
        this.a = callable0;
        this.b = function0;
        this.c = consumer0;
        this.d = z;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        SingleSource singleSource0;
        Object object0;
        boolean z;
        Consumer consumer0;
        try {
            consumer0 = this.c;
            z = this.d;
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        try {
            singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The singleFunction returned a null SingleSource");
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            if(z) {
                try {
                    consumer0.accept(object0);
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    throwable1 = new CompositeException(new Throwable[]{throwable1, throwable2});
                }
            }
            EmptyDisposable.error(throwable1, singleObserver0);
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
        singleSource0.subscribe(new e0(singleObserver0, object0, z, consumer0));
    }
}

