package io.reactivex.internal.operators.completable;

import dd.a;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeDelayErrorIterable extends Completable {
    public final Iterable a;

    public CompletableMergeDelayErrorIterable(Iterable iterable0) {
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
        AtomicThrowable atomicThrowable0 = new AtomicThrowable();
        while(true) {
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            try {
                if(!iterator0.hasNext()) {
                    break;
                }
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                atomicThrowable0.addThrowable(throwable1);
                break;
            }
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            try {
                Object object0 = iterator0.next();
                completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(object0, "The iterator returned a null CompletableSource");
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                atomicThrowable0.addThrowable(throwable2);
                break;
            }
            if(compositeDisposable0.isDisposed()) {
                return;
            }
            atomicInteger0.getAndIncrement();
            completableSource0.subscribe(new a(completableObserver0, compositeDisposable0, atomicThrowable0, atomicInteger0));
        }
        if(atomicInteger0.decrementAndGet() == 0) {
            Throwable throwable3 = atomicThrowable0.terminate();
            if(throwable3 == null) {
                completableObserver0.onComplete();
                return;
            }
            completableObserver0.onError(throwable3);
        }
    }
}

