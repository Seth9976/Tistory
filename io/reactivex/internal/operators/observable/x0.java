package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class x0 extends BasicIntQueueDisposable implements Observer {
    public final Observer a;
    public final Action b;
    public Disposable c;
    public QueueDisposable d;
    public boolean e;

    public x0(Observer observer0, Action action0) {
        this.a = observer0;
        this.b = action0;
    }

    public final void a() {
        if(this.compareAndSet(0, 1)) {
            try {
                this.b.run();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                RxJavaPlugins.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.d.clear();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.dispose();
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.a.onComplete();
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
        this.a();
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            if(disposable0 instanceof QueueDisposable) {
                this.d = (QueueDisposable)disposable0;
            }
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0 = this.d.poll();
        if(object0 == null && this.e) {
            this.a();
        }
        return object0;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        QueueDisposable queueDisposable0 = this.d;
        boolean z = false;
        if(queueDisposable0 != null && (v & 4) == 0) {
            int v1 = queueDisposable0.requestFusion(v);
            if(v1 != 0) {
                if(v1 == 1) {
                    z = true;
                }
                this.e = z;
            }
            return v1;
        }
        return 0;
    }
}

