package io.reactivex.internal.operators.maybe;

import cd.b;
import gd.f0;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.Iterator;

public final class MaybeZipIterable extends Maybe {
    public final Iterable a;
    public final Function b;

    public MaybeZipIterable(Iterable iterable0, Function function0) {
        this.a = iterable0;
        this.b = function0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        int v1;
        MaybeSource[] arr_maybeSource;
        try {
            arr_maybeSource = new MaybeSource[8];
            v1 = 0;
            Iterator iterator0 = this.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_18;
                }
                Object object0 = iterator0.next();
                if(((MaybeSource)object0) == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver0);
                    return;
                }
                if(v1 == arr_maybeSource.length) {
                    arr_maybeSource = (MaybeSource[])Arrays.copyOf(arr_maybeSource, (v1 >> 2) + v1);
                }
                arr_maybeSource[v1] = (MaybeSource)object0;
                ++v1;
            }
        }
        catch(Throwable throwable0) {
        }
        Exceptions.throwIfFatal(throwable0);
        EmptyDisposable.error(throwable0, maybeObserver0);
        return;
    label_18:
        if(v1 == 0) {
            EmptyDisposable.complete(maybeObserver0);
            return;
        }
        if(v1 == 1) {
            arr_maybeSource[0].subscribe(new a0(0, maybeObserver0, new b(this, 15)));
            return;
        }
        f0 f00 = new f0(v1, maybeObserver0, this.b);
        maybeObserver0.onSubscribe(f00);
        for(int v = 0; v < v1 && !f00.isDisposed(); ++v) {
            arr_maybeSource[v].subscribe(((l0[])f00.d)[v]);
        }
    }
}

