package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Iterator;

public final class ObservableFromIterable extends Observable {
    public final Iterable a;

    public ObservableFromIterable(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Object object1;
        Iterator iterator0;
        try {
            iterator0 = this.a.iterator();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        try {
            if(!iterator0.hasNext()) {
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            EmptyDisposable.error(throwable1, observer0);
            return;
        }
    label_12:
        EmptyDisposable.complete(observer0);
        return;
    label_14:
        j1 j10 = new j1(observer0, iterator0);
        observer0.onSubscribe(j10);
        if(!j10.d) {
            while(!j10.c) {
                try {
                    Object object0 = j10.b.next();
                    object1 = ObjectHelper.requireNonNull(object0, "The iterator returned a null value");
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    j10.a.onError(throwable2);
                    return;
                }
                j10.a.onNext(object1);
                if(j10.c) {
                    break;
                }
                try {
                    if(!j10.b.hasNext()) {
                        goto label_33;
                    }
                    goto label_36;
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    j10.a.onError(throwable3);
                    return;
                }
            label_33:
                if(j10.c) {
                    break;
                }
                j10.a.onComplete();
                return;
            label_36:
                if(false) {
                    break;
                }
            }
        }
    }
}

