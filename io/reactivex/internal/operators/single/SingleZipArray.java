package io.reactivex.internal.operators.single;

import cd.b;
import gd.c;
import gd.f0;
import gd.g0;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleZipArray extends Single {
    public final SingleSource[] a;
    public final Function b;

    public SingleZipArray(SingleSource[] arr_singleSource, Function function0) {
        this.a = arr_singleSource;
        this.b = function0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        SingleSource[] arr_singleSource = this.a;
        if(arr_singleSource.length == 1) {
            arr_singleSource[0].subscribe(new c(6, singleObserver0, new b(this, 10)));
            return;
        }
        f0 f00 = new f0(arr_singleSource.length, singleObserver0, this.b);
        singleObserver0.onSubscribe(f00);
        for(int v = 0; true; ++v) {
            if(v >= arr_singleSource.length || f00.isDisposed()) {
                return;
            }
            SingleSource singleSource0 = arr_singleSource[v];
            if(singleSource0 == null) {
                f00.c(new NullPointerException("One of the sources is null"), v);
                return;
            }
            singleSource0.subscribe(((g0[])f00.d)[v]);
        }
    }
}

