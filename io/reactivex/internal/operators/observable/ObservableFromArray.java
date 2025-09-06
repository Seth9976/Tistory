package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableFromArray extends Observable {
    public final Object[] a;

    public ObservableFromArray(Object[] arr_object) {
        this.a = arr_object;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        i1 i10 = new i1(observer0, this.a);
        observer0.onSubscribe(i10);
        if(i10.d) {
            return;
        }
        Object[] arr_object = i10.b;
        for(int v = 0; v < arr_object.length && !i10.e; ++v) {
            Object object0 = arr_object[v];
            if(object0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("The element at index " + v + " is null");
                i10.a.onError(nullPointerException0);
                return;
            }
            i10.a.onNext(object0);
        }
        if(!i10.e) {
            i10.a.onComplete();
        }
    }
}

