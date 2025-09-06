package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class m3 implements Publisher {
    public final AtomicReference a;
    public final int b;

    public m3(AtomicReference atomicReference0, int v) {
        this.a = atomicReference0;
        this.b = v;
    }

    @Override  // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber0) {
        o3 o31;
        n3 n30 = new n3(subscriber0);
        subscriber0.onSubscribe(n30);
        while(true) {
            o3 o30 = (o3)this.a.get();
            if(o30 != null && !o30.isDisposed()) {
                o31 = o30;
                goto label_10;
            }
            o3 o32 = new o3(this.a, this.b);
            AtomicReference atomicReference0 = this.a;
        alab1:
            do {
                if(atomicReference0.compareAndSet(o30, o32)) {
                    o31 = o32;
                }
                else {
                    continue;
                }
                while(true) {
                label_10:
                    AtomicReference atomicReference1 = o31.c;
                    n3[] arr_n3 = (n3[])atomicReference1.get();
                    if(arr_n3 == o3.j) {
                        break alab1;
                    }
                    n3[] arr_n31 = new n3[arr_n3.length + 1];
                    System.arraycopy(arr_n3, 0, arr_n31, 0, arr_n3.length);
                    arr_n31[arr_n3.length] = n30;
                label_16:
                    if(atomicReference1.compareAndSet(arr_n3, arr_n31)) {
                        break;
                    }
                    if(atomicReference1.get() != arr_n3) {
                        continue;
                    }
                    if(false) {
                        break;
                    }
                    goto label_16;
                }
                if(n30.get() == 0x8000000000000000L) {
                    o31.c(n30);
                }
                else {
                    n30.b = o31;
                }
                o31.b();
                return;
            }
            while(atomicReference0.get() == o30);
        }
    }
}

