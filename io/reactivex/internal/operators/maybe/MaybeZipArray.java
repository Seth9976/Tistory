package io.reactivex.internal.operators.maybe;

import cd.b;
import gd.f0;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;

public final class MaybeZipArray extends Maybe {
    public final MaybeSource[] a;
    public final Function b;

    public MaybeZipArray(MaybeSource[] arr_maybeSource, Function function0) {
        this.a = arr_maybeSource;
        this.b = function0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        MaybeSource[] arr_maybeSource = this.a;
        if(arr_maybeSource.length == 1) {
            arr_maybeSource[0].subscribe(new a0(0, maybeObserver0, new b(this, 14)));
            return;
        }
        f0 f00 = new f0(arr_maybeSource.length, maybeObserver0, this.b);
        maybeObserver0.onSubscribe(f00);
        for(int v = 0; true; ++v) {
            if(v >= arr_maybeSource.length || f00.isDisposed()) {
                return;
            }
            MaybeSource maybeSource0 = arr_maybeSource[v];
            if(maybeSource0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                if(f00.getAndSet(0) > 0) {
                    f00.a(v);
                    ((MaybeObserver)f00.b).onError(nullPointerException0);
                    return;
                }
                RxJavaPlugins.onError(nullPointerException0);
                return;
            }
            maybeSource0.subscribe(((l0[])f00.d)[v]);
        }
    }
}

