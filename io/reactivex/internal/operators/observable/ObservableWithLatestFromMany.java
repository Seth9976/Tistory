package io.reactivex.internal.operators.observable;

import cd.b;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableWithLatestFromMany extends a {
    public final ObservableSource[] a;
    public final Iterable b;
    public final Function c;

    public ObservableWithLatestFromMany(@NonNull ObservableSource observableSource0, @NonNull Iterable iterable0, @NonNull Function function0) {
        super(observableSource0);
        this.a = null;
        this.b = iterable0;
        this.c = function0;
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource observableSource0, @NonNull ObservableSource[] arr_observableSource, @NonNull Function function0) {
        super(observableSource0);
        this.a = arr_observableSource;
        this.b = null;
        this.c = function0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        int v1;
        ObservableSource[] arr_observableSource = this.a;
        if(arr_observableSource == null) {
            try {
                arr_observableSource = new ObservableSource[8];
                v1 = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_18;
                    }
                    Object object0 = iterator0.next();
                    if(v1 == arr_observableSource.length) {
                        arr_observableSource = (ObservableSource[])Arrays.copyOf(arr_observableSource, (v1 >> 1) + v1);
                    }
                    arr_observableSource[v1] = (ObservableSource)object0;
                    ++v1;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, observer0);
            return;
        }
        else {
            v1 = arr_observableSource.length;
        }
    label_18:
        if(v1 == 0) {
            b b0 = new b(this, 16);
            new ObservableMap(this.source, b0).subscribeActual(observer0);
            return;
        }
        y4 y40 = new y4(observer0, this.c, v1);
        observer0.onSubscribe(y40);
        z4[] arr_z4 = y40.c;
        AtomicReference atomicReference0 = y40.e;
        for(int v = 0; v < v1 && !DisposableHelper.isDisposed(((Disposable)atomicReference0.get())) && !y40.g; ++v) {
            arr_observableSource[v].subscribe(arr_z4[v]);
        }
        this.source.subscribe(y40);
    }
}

