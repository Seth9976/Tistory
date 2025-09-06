package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

public final class i implements Disposable {
    public final Observer a;
    public final j[] b;
    public final AtomicInteger c;

    public i(Observer observer0, int v) {
        this.c = new AtomicInteger();
        this.a = observer0;
        this.b = new j[v];
    }

    public final boolean a(int v) {
        AtomicInteger atomicInteger0 = this.c;
        int v1 = atomicInteger0.get();
        if(v1 == 0) {
            if(atomicInteger0.compareAndSet(0, v)) {
                j[] arr_j = this.b;
                for(int v2 = 0; v2 < arr_j.length; ++v2) {
                    if(v2 + 1 != v) {
                        j j0 = arr_j[v2];
                        j0.getClass();
                        DisposableHelper.dispose(j0);
                    }
                }
                return true;
            }
            return false;
        }
        return v1 == v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        AtomicInteger atomicInteger0 = this.c;
        if(atomicInteger0.get() != -1) {
            atomicInteger0.lazySet(-1);
            j[] arr_j = this.b;
            for(int v = 0; v < arr_j.length; ++v) {
                j j0 = arr_j[v];
                j0.getClass();
                DisposableHelper.dispose(j0);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == -1;
    }
}

