package io.reactivex.internal.operators.single;

import cd.b;
import gd.c;
import gd.f0;
import gd.g0;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class SingleZipIterable extends Single {
    public final Iterable a;
    public final Function b;

    public SingleZipIterable(Iterable iterable0, Function function0) {
        this.a = iterable0;
        this.b = function0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        int v1;
        SingleSource[] arr_singleSource;
        try {
            arr_singleSource = new SingleSource[8];
            v1 = 0;
            Iterator iterator0 = this.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_18;
                }
                Object object0 = iterator0.next();
                if(((SingleSource)object0) == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver0);
                    return;
                }
                if(v1 == arr_singleSource.length) {
                    arr_singleSource = (SingleSource[])Arrays.copyOf(arr_singleSource, (v1 >> 2) + v1);
                }
                arr_singleSource[v1] = (SingleSource)object0;
                ++v1;
            }
        }
        catch(Throwable throwable0) {
        }
        Exceptions.throwIfFatal(throwable0);
        EmptyDisposable.error(throwable0, singleObserver0);
        return;
    label_18:
        if(v1 == 0) {
            EmptyDisposable.error(new NoSuchElementException(), singleObserver0);
            return;
        }
        if(v1 == 1) {
            arr_singleSource[0].subscribe(new c(6, singleObserver0, new b(this, 11)));
            return;
        }
        f0 f00 = new f0(v1, singleObserver0, this.b);
        singleObserver0.onSubscribe(f00);
        for(int v = 0; v < v1 && !f00.isDisposed(); ++v) {
            arr_singleSource[v].subscribe(((g0[])f00.d)[v]);
        }
    }
}

