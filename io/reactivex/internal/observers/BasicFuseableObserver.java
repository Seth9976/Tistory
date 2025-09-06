package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class BasicFuseableObserver implements Observer, QueueDisposable {
    protected boolean done;
    protected final Observer downstream;
    protected QueueDisposable qd;
    protected int sourceMode;
    protected Disposable upstream;

    public BasicFuseableObserver(Observer observer0) {
        this.downstream = observer0;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() [...] // Inlined contents

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.qd.clear();
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    public final void fail(Throwable throwable0) {
        Exceptions.throwIfFatal(throwable0);
        this.upstream.dispose();
        this.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qd.isEmpty();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.done = true;
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.upstream, disposable0)) {
            this.upstream = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                this.qd = (QueueDisposable)disposable0;
            }
            this.downstream.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int v) {
        return this.transitiveBoundaryFusion(v);
    }

    public final int transitiveBoundaryFusion(int v) {
        QueueDisposable queueDisposable0 = this.qd;
        if(queueDisposable0 != null && (v & 4) == 0) {
            int v1 = queueDisposable0.requestFusion(v);
            if(v1 != 0) {
                this.sourceMode = v1;
            }
            return v1;
        }
        return 0;
    }
}

