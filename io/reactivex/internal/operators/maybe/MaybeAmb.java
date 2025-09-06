package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MaybeAmb extends Maybe {
    public final MaybeSource[] a;
    public final Iterable b;

    public MaybeAmb(MaybeSource[] arr_maybeSource, Iterable iterable0) {
        this.a = arr_maybeSource;
        this.b = iterable0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        int v;
        MaybeSource[] arr_maybeSource = this.a;
        if(arr_maybeSource == null) {
            try {
                arr_maybeSource = new MaybeSource[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((MaybeSource)object0) == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver0);
                        return;
                    }
                    if(v == arr_maybeSource.length) {
                        MaybeSource[] arr_maybeSource1 = new MaybeSource[(v >> 2) + v];
                        System.arraycopy(arr_maybeSource, 0, arr_maybeSource1, 0, v);
                        arr_maybeSource = arr_maybeSource1;
                    }
                    arr_maybeSource[v] = (MaybeSource)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, maybeObserver0);
            return;
        }
        else {
            v = arr_maybeSource.length;
        }
    label_22:
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        maybeObserver0.onSubscribe(compositeDisposable0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        for(int v1 = 0; v1 < v; ++v1) {
            MaybeSource maybeSource0 = arr_maybeSource[v1];
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            if(maybeSource0 == null) {
                compositeDisposable0.dispose();
                NullPointerException nullPointerException0 = new NullPointerException("One of the MaybeSources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    maybeObserver0.onError(nullPointerException0);
                    return;
                }
                RxJavaPlugins.onError(nullPointerException0);
                return;
            }
            maybeSource0.subscribe(new b(maybeObserver0, compositeDisposable0, atomicBoolean0));
        }
        if(v == 0) {
            maybeObserver0.onComplete();
        }
    }
}

