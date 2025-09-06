package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class n2 extends AtomicInteger implements Observer {
    public final Observer a;
    public final SequentialDisposable b;
    public final ObservableSource c;
    public final BooleanSupplier d;

    public n2(Observer observer0, BooleanSupplier booleanSupplier0, SequentialDisposable sequentialDisposable0, ObservableSource observableSource0) {
        this.a = observer0;
        this.b = sequentialDisposable0;
        this.c = observableSource0;
        this.d = booleanSupplier0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Observer observer0;
        try {
            observer0 = this.a;
            if(this.d.getAsBoolean()) {
                goto label_7;
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            observer0.onError(throwable0);
            return;
        }
    label_7:
        observer0.onComplete();
        return;
    label_9:
        if(this.getAndIncrement() == 0) {
            int v = 1;
            while(true) {
                this.c.subscribe(this);
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
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

