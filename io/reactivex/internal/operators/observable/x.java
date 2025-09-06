package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.flowable.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class x extends AtomicInteger implements Disposable {
    public final Observer a;
    public final ObservableCache b;
    public y c;
    public int d;
    public long e;
    public volatile boolean f;

    public x(Observer observer0, ObservableCache observableCache0) {
        this.a = observer0;
        this.b = observableCache0;
        this.c = observableCache0.e;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        x[] arr_x1;
        if(!this.f) {
            this.f = true;
            ObservableCache observableCache0 = this.b;
            while(true) {
                AtomicReference atomicReference0 = observableCache0.c;
                x[] arr_x = (x[])atomicReference0.get();
                int v = arr_x.length;
                if(v == 0) {
                    break;
                }
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_x[v1] == this) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 >= 0) {
                    if(v == 1) {
                        arr_x1 = ObservableCache.j;
                    }
                    else {
                        x[] arr_x2 = new x[v - 1];
                        System.arraycopy(arr_x, 0, arr_x2, 0, v1);
                        System.arraycopy(arr_x, v1 + 1, arr_x2, v1, v - v1 - 1);
                        arr_x1 = arr_x2;
                    }
                label_22:
                    if(!atomicReference0.compareAndSet(arr_x, arr_x1)) {
                        if(atomicReference0.get() != arr_x) {
                            continue;
                        }
                        if(false) {
                            break;
                        }
                        goto label_22;
                    }
                }
                break;
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f;
    }
}

