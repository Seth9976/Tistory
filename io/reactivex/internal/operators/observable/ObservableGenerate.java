package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

public final class ObservableGenerate extends Observable {
    public final Callable a;
    public final BiFunction b;
    public final Consumer c;

    public ObservableGenerate(Callable callable0, BiFunction biFunction0, Consumer consumer0) {
        this.a = callable0;
        this.b = biFunction0;
        this.c = consumer0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object0;
        try {
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        BiFunction biFunction0 = this.b;
        l1 l10 = new l1(observer0, biFunction0, this.c, object0);
        observer0.onSubscribe(l10);
        Object object1 = l10.d;
        if(l10.e) {
            l10.d = null;
            l10.a(object1);
            return;
        }
        while(true) {
            if(l10.e) {
                l10.d = null;
                l10.a(object1);
                return;
            }
            try {
                l10.g = false;
                object1 = biFunction0.apply(object1, l10);
                if(!l10.f) {
                    continue;
                }
                goto label_29;
            }
            catch(Throwable throwable1) {
            }
            break;
        }
        Exceptions.throwIfFatal(throwable1);
        l10.d = null;
        l10.e = true;
        l10.onError(throwable1);
        l10.a(object1);
        return;
    label_29:
        l10.e = true;
        l10.d = null;
        l10.a(object1);
    }
}

