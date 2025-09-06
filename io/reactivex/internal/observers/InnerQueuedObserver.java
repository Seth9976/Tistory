package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedObserver extends AtomicReference implements Observer, Disposable {
    public final InnerQueuedObserverSupport a;
    public final int b;
    public SimpleQueue c;
    public volatile boolean d;
    public int e;

    public InnerQueuedObserver(InnerQueuedObserverSupport innerQueuedObserverSupport0, int v) {
        this.a = innerQueuedObserverSupport0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.e;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    public boolean isDone() {
        return this.d;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        this.a.innerComplete(this);
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        this.a.innerError(this, throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        InnerQueuedObserverSupport innerQueuedObserverSupport0 = this.a;
        if(this.e == 0) {
            innerQueuedObserverSupport0.innerNext(this, object0);
            return;
        }
        innerQueuedObserverSupport0.drain();
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            if(disposable0 instanceof QueueDisposable) {
                int v = ((QueueDisposable)disposable0).requestFusion(3);
                if(v == 1) {
                    this.e = 1;
                    this.c = (QueueDisposable)disposable0;
                    this.d = true;
                    this.a.innerComplete(this);
                    return;
                }
                if(v == 2) {
                    this.e = 2;
                    this.c = (QueueDisposable)disposable0;
                    return;
                }
            }
            this.c = QueueDrainHelper.createQueue(-this.b);
        }
    }

    public SimpleQueue queue() {
        return this.c;
    }

    public void setDone() {
        this.d = true;
    }
}

