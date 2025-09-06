package io.reactivex.internal.operators.single;

import gd.a;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SingleAmb extends Single {
    public final SingleSource[] a;
    public final Iterable b;

    public SingleAmb(SingleSource[] arr_singleSource, Iterable iterable0) {
        this.a = arr_singleSource;
        this.b = iterable0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        int v;
        SingleSource[] arr_singleSource = this.a;
        if(arr_singleSource == null) {
            try {
                arr_singleSource = new SingleSource[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((SingleSource)object0) == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver0);
                        return;
                    }
                    if(v == arr_singleSource.length) {
                        SingleSource[] arr_singleSource1 = new SingleSource[(v >> 2) + v];
                        System.arraycopy(arr_singleSource, 0, arr_singleSource1, 0, v);
                        arr_singleSource = arr_singleSource1;
                    }
                    arr_singleSource[v] = (SingleSource)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        else {
            v = arr_singleSource.length;
        }
    label_22:
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        singleObserver0.onSubscribe(compositeDisposable0);
        for(int v1 = 0; v1 < v; ++v1) {
            SingleSource singleSource0 = arr_singleSource[v1];
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            if(singleSource0 == null) {
                compositeDisposable0.dispose();
                NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    singleObserver0.onError(nullPointerException0);
                    return;
                }
                RxJavaPlugins.onError(nullPointerException0);
                return;
            }
            singleSource0.subscribe(new a(singleObserver0, compositeDisposable0, atomicBoolean0));
        }
    }
}

