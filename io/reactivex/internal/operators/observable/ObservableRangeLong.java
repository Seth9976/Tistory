package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;

public final class ObservableRangeLong extends Observable {
    public final long a;
    public final long b;

    public ObservableRangeLong(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        Observer observer1;
        k2 k20 = new k2(observer0, this.a, this.a + this.b, 1);
        observer0.onSubscribe(k20);
        if(!k20.e) {
            for(long v = k20.d; true; ++v) {
                observer1 = k20.b;
                if(Long.compare(v, k20.c) == 0 || k20.get() != 0) {
                    break;
                }
                observer1.onNext(v);
            }
            if(k20.get() == 0) {
                k20.lazySet(1);
                observer1.onComplete();
            }
        }
    }
}

