package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import java.util.concurrent.atomic.AtomicReference;

public final class x2 implements ObservableSource {
    public final AtomicReference a;
    public final BufferSupplier b;

    public x2(AtomicReference atomicReference0, BufferSupplier observableReplay$BufferSupplier0) {
        this.a = atomicReference0;
        this.b = observableReplay$BufferSupplier0;
    }

    @Override  // io.reactivex.ObservableSource
    public final void subscribe(Observer observer0) {
        w2 w20;
        while(true) {
            w20 = (w2)this.a.get();
            if(w20 != null) {
                break;
            }
            w2 w21 = new w2(this.b.call());
            AtomicReference atomicReference0 = this.a;
        label_4:
            if(atomicReference0.compareAndSet(null, w21)) {
                w20 = w21;
                break;
            }
            if(atomicReference0.get() != null) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        r2 r20 = new r2(w20, observer0);
        observer0.onSubscribe(r20);
        while(true) {
            AtomicReference atomicReference1 = w20.c;
            r2[] arr_r2 = (r2[])atomicReference1.get();
            if(arr_r2 == w2.f) {
                break;
            }
            r2[] arr_r21 = new r2[arr_r2.length + 1];
            System.arraycopy(arr_r2, 0, arr_r21, 0, arr_r2.length);
            arr_r21[arr_r2.length] = r20;
        label_17:
            if(atomicReference1.compareAndSet(arr_r2, arr_r21)) {
                break;
            }
            if(atomicReference1.get() != arr_r2) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_17;
        }
        if(r20.d) {
            w20.a(r20);
            return;
        }
        w20.a.replay(r20);
    }
}

