package io.reactivex.internal.operators.completable;

import dd.h;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CompletableMergeArray extends Completable {
    public final CompletableSource[] a;

    public CompletableMergeArray(CompletableSource[] arr_completableSource) {
        this.a = arr_completableSource;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        CompletableSource[] arr_completableSource = this.a;
        h h0 = new h(completableObserver0, atomicBoolean0, compositeDisposable0, arr_completableSource.length + 1);
        completableObserver0.onSubscribe(compositeDisposable0);
        for(int v = 0; v < arr_completableSource.length; ++v) {
            CompletableSource completableSource0 = arr_completableSource[v];
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            if(completableSource0 == null) {
                compositeDisposable0.dispose();
                h0.onError(new NullPointerException("A completable source is null"));
                return;
            }
            completableSource0.subscribe(h0);
        }
        h0.onComplete();
    }
}

