package io.reactivex.internal.operators.completable;

import dd.a;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CompletableAmb extends Completable {
    public final CompletableSource[] a;
    public final Iterable b;

    public CompletableAmb(CompletableSource[] arr_completableSource, Iterable iterable0) {
        this.a = arr_completableSource;
        this.b = iterable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        int v;
        CompletableSource[] arr_completableSource = this.a;
        if(arr_completableSource == null) {
            try {
                arr_completableSource = new CompletableSource[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((CompletableSource)object0) == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), completableObserver0);
                        return;
                    }
                    if(v == arr_completableSource.length) {
                        CompletableSource[] arr_completableSource1 = new CompletableSource[(v >> 2) + v];
                        System.arraycopy(arr_completableSource, 0, arr_completableSource1, 0, v);
                        arr_completableSource = arr_completableSource1;
                    }
                    arr_completableSource[v] = (CompletableSource)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            Exceptions.throwIfFatal(throwable0);
            EmptyDisposable.error(throwable0, completableObserver0);
            return;
        }
        else {
            v = arr_completableSource.length;
        }
    label_22:
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        completableObserver0.onSubscribe(compositeDisposable0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        for(int v1 = 0; v1 < v; ++v1) {
            CompletableSource completableSource0 = arr_completableSource[v1];
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            if(completableSource0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    compositeDisposable0.dispose();
                    completableObserver0.onError(nullPointerException0);
                    return;
                }
                RxJavaPlugins.onError(nullPointerException0);
                return;
            }
            completableSource0.subscribe(new a(completableObserver0, compositeDisposable0, atomicBoolean0));
        }
        if(v == 0) {
            completableObserver0.onComplete();
        }
    }
}

