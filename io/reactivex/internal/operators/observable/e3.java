package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class e3 extends AtomicInteger implements Observer {
    public final Observer a;
    public final SequentialDisposable b;
    public final ObservableSource c;
    public final Predicate d;
    public long e;

    public e3(Observer observer0, long v, Predicate predicate0, SequentialDisposable sequentialDisposable0, ObservableSource observableSource0) {
        this.a = observer0;
        this.b = sequentialDisposable0;
        this.c = observableSource0;
        this.d = predicate0;
        this.e = v;
    }

    public final void a() {
        if(this.getAndIncrement() == 0) {
            int v = 1;
            while(true) {
                if(this.b.isDisposed()) {
                    return;
                }
                this.c.subscribe(this);
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        long v = this.e;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            this.e = v - 1L;
        }
        Observer observer0 = this.a;
        if(Long.compare(v, 0L) == 0) {
            observer0.onError(throwable0);
            return;
        }
        try {
            if(!this.d.test(throwable0)) {
                goto label_13;
            }
            goto label_15;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            observer0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
    label_13:
        observer0.onError(throwable0);
        return;
    label_15:
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        this.b.replace(disposable0);
    }
}

