package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableAmb extends Observable {
    public final ObservableSource[] a;
    public final Iterable b;

    public ObservableAmb(ObservableSource[] arr_observableSource, Iterable iterable0) {
        this.a = arr_observableSource;
        this.b = iterable0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observer observer1;
        int v1;
        ObservableSource[] arr_observableSource = this.a;
        if(arr_observableSource == null) {
            try {
                arr_observableSource = new ObservableSource[8];
                v1 = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_23;
                    }
                    Object object0 = iterator0.next();
                    if(((ObservableSource)object0) == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), observer0);
                        return;
                    }
                    if(v1 == arr_observableSource.length) {
                        ObservableSource[] arr_observableSource1 = new ObservableSource[(v1 >> 2) + v1];
                        System.arraycopy(arr_observableSource, 0, arr_observableSource1, 0, v1);
                        arr_observableSource = arr_observableSource1;
                    }
                    arr_observableSource[v1] = (ObservableSource)object0;
                    ++v1;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        else {
            v1 = arr_observableSource.length;
        }
    label_23:
        if(v1 == 0) {
            EmptyDisposable.complete(observer0);
            return;
        }
        if(v1 == 1) {
            arr_observableSource[0].subscribe(observer0);
            return;
        }
        i i0 = new i(observer0, v1);
        j[] arr_j = i0.b;
        for(int v2 = 0; true; ++v2) {
            observer1 = i0.a;
            if(v2 >= arr_j.length) {
                break;
            }
            arr_j[v2] = new j(i0, v2 + 1, observer1);
        }
        AtomicInteger atomicInteger0 = i0.c;
        atomicInteger0.lazySet(0);
        observer1.onSubscribe(i0);
        for(int v = 0; v < arr_j.length && atomicInteger0.get() == 0; ++v) {
            arr_observableSource[v].subscribe(arr_j[v]);
        }
    }
}

