package io.reactivex.internal.operators.completable;

import dd.s;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeIterable extends Completable {
    public final Iterable a;

    public CompletableMergeIterable(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompletableSource completableSource0;
        Iterator iterator0;
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        completableObserver0.onSubscribe(compositeDisposable0);
        try {
            iterator0 = (Iterator)ObjectHelper.requireNonNull(this.a.iterator(), "The source iterator returned is null");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            completableObserver0.onError(throwable0);
            return;
        }
        AtomicInteger atomicInteger0 = new AtomicInteger(1);
        s s0 = new s(completableObserver0, compositeDisposable0, atomicInteger0);
        while(true) {
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            try {
                if(!iterator0.hasNext()) {
                    goto label_19;
                }
                goto label_21;
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                compositeDisposable0.dispose();
                s0.onError(throwable1);
                return;
            }
        label_19:
            s0.onComplete();
            return;
        label_21:
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            try {
                Object object0 = iterator0.next();
                completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(object0, "The iterator returned a null CompletableSource");
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                compositeDisposable0.dispose();
                s0.onError(throwable2);
                return;
            }
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            atomicInteger0.getAndIncrement();
            completableSource0.subscribe(s0);
        }
    }
}

