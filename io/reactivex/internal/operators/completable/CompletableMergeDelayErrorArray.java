package io.reactivex.internal.operators.completable;

import dd.a;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeDelayErrorArray extends Completable {
    public final CompletableSource[] a;

    public CompletableMergeDelayErrorArray(CompletableSource[] arr_completableSource) {
        this.a = arr_completableSource;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        CompletableSource[] arr_completableSource = this.a;
        AtomicInteger atomicInteger0 = new AtomicInteger(arr_completableSource.length + 1);
        AtomicThrowable atomicThrowable0 = new AtomicThrowable();
        completableObserver0.onSubscribe(compositeDisposable0);
        for(int v = 0; v < arr_completableSource.length; ++v) {
            CompletableSource completableSource0 = arr_completableSource[v];
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            if(completableSource0 == null) {
                atomicThrowable0.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger0.decrementAndGet();
            }
            else {
                completableSource0.subscribe(new a(completableObserver0, compositeDisposable0, atomicThrowable0, atomicInteger0));
            }
        }
        if(atomicInteger0.decrementAndGet() == 0) {
            Throwable throwable0 = atomicThrowable0.terminate();
            if(throwable0 == null) {
                completableObserver0.onComplete();
                return;
            }
            completableObserver0.onError(throwable0);
        }
    }
}

