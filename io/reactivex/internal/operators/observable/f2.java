package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.concurrent.atomic.AtomicReference;

public final class f2 implements ObservableSource {
    public final AtomicReference a;

    public f2(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // io.reactivex.ObservableSource
    public final void subscribe(Observer observer0) {
        e2 e21;
        d2 d20 = new d2(observer0);
        observer0.onSubscribe(d20);
        while(true) {
            AtomicReference atomicReference0 = this.a;
            e2 e20 = (e2)atomicReference0.get();
            if(e20 != null && !e20.isDisposed()) {
                e21 = e20;
                goto label_10;
            }
            e2 e22 = new e2(atomicReference0);
        alab1:
            do {
                if(atomicReference0.compareAndSet(e20, e22)) {
                    e21 = e22;
                }
                else {
                    continue;
                }
                while(true) {
                label_10:
                    AtomicReference atomicReference1 = e21.b;
                    d2[] arr_d2 = (d2[])atomicReference1.get();
                    if(arr_d2 == e2.f) {
                        break alab1;
                    }
                    d2[] arr_d21 = new d2[arr_d2.length + 1];
                    System.arraycopy(arr_d2, 0, arr_d21, 0, arr_d2.length);
                    arr_d21[arr_d2.length] = d20;
                label_16:
                    if(atomicReference1.compareAndSet(arr_d2, arr_d21)) {
                        break;
                    }
                    if(atomicReference1.get() != arr_d2) {
                        continue;
                    }
                    if(false) {
                        break;
                    }
                    goto label_16;
                }
                if(!d20.compareAndSet(null, e21)) {
                    e21.a(d20);
                }
                return;
            }
            while(atomicReference0.get() == e20);
        }
    }
}

