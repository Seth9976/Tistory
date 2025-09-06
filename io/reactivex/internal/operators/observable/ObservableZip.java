package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableZip extends Observable {
    public final ObservableSource[] a;
    public final Iterable b;
    public final Function c;
    public final int d;
    public final boolean e;

    public ObservableZip(ObservableSource[] arr_observableSource, Iterable iterable0, Function function0, int v, boolean z) {
        this.a = arr_observableSource;
        this.b = iterable0;
        this.c = function0;
        this.d = v;
        this.e = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        int v1;
        ObservableSource[] arr_observableSource = this.a;
        if(arr_observableSource == null) {
            arr_observableSource = new ObservableSource[8];
            v1 = 0;
            for(Object object0: this.b) {
                if(v1 == arr_observableSource.length) {
                    ObservableSource[] arr_observableSource1 = new ObservableSource[(v1 >> 2) + v1];
                    System.arraycopy(arr_observableSource, 0, arr_observableSource1, 0, v1);
                    arr_observableSource = arr_observableSource1;
                }
                arr_observableSource[v1] = (ObservableSource)object0;
                ++v1;
            }
        }
        else {
            v1 = arr_observableSource.length;
        }
        if(v1 == 0) {
            EmptyDisposable.complete(observer0);
            return;
        }
        a5 a50 = new a5(v1, observer0, this.c, this.e);
        int v2 = this.d;
        b5[] arr_b5 = a50.c;
        for(int v3 = 0; v3 < arr_b5.length; ++v3) {
            arr_b5[v3] = new b5(a50, v2);
        }
        a50.lazySet(0);
        a50.a.onSubscribe(a50);
        for(int v = 0; v < arr_b5.length && !a50.f; ++v) {
            arr_observableSource[v].subscribe(arr_b5[v]);
        }
    }
}

