package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableRange extends Observable {
    public final int a;
    public final long b;

    public ObservableRange(int v, int v1) {
        this.a = v;
        this.b = ((long)v) + ((long)v1);
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observer observer1;
        k2 k20 = new k2(observer0, ((long)this.a), this.b, 0);
        observer0.onSubscribe(k20);
        if(!k20.e) {
            for(long v = k20.d; true; ++v) {
                observer1 = k20.b;
                if(Long.compare(v, k20.c) == 0 || k20.get() != 0) {
                    break;
                }
                observer1.onNext(((int)v));
            }
            if(k20.get() == 0) {
                k20.lazySet(1);
                observer1.onComplete();
            }
        }
    }
}

