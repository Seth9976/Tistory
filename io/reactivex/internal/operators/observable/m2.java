package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class m2 extends AtomicInteger implements Observer {
    public final Observer a;
    public final SequentialDisposable b;
    public final ObservableSource c;
    public long d;

    public m2(Observer observer0, long v, SequentialDisposable sequentialDisposable0, ObservableSource observableSource0) {
        this.a = observer0;
        this.b = sequentialDisposable0;
        this.c = observableSource0;
        this.d = v;
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
        long v = this.d;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            this.d = v - 1L;
        }
        if(v != 0L) {
            this.a();
            return;
        }
        this.a.onComplete();
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

