package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.plugins.RxJavaPlugins;

public class DeferredScalarDisposable extends BasicIntQueueDisposable {
    protected final Observer downstream;
    protected Object value;

    public DeferredScalarDisposable(Observer observer0) {
        this.downstream = observer0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.lazySet(0x20);
        this.value = null;
    }

    public final void complete() {
        if((this.get() & 54) != 0) {
            return;
        }
        this.lazySet(2);
        this.downstream.onComplete();
    }

    public final void complete(Object object0) {
        int v = this.get();
        if((v & 54) != 0) {
            return;
        }
        Observer observer0 = this.downstream;
        if(v == 8) {
            this.value = object0;
            this.lazySet(16);
            observer0.onNext(null);
        }
        else {
            this.lazySet(2);
            observer0.onNext(object0);
        }
        if(this.get() != 4) {
            observer0.onComplete();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.set(4);
        this.value = null;
    }

    public final void error(Throwable throwable0) {
        if((this.get() & 54) != 0) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.lazySet(2);
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == 4;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.get() != 16;
    }

    public void onComplete() {
        this.complete();
    }

    public void onError(Throwable throwable0) {
        this.error(throwable0);
    }

    public void onSuccess(Object object0) {
        this.complete(object0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final Object poll() throws Exception {
        if(this.get() == 16) {
            Object object0 = this.value;
            this.value = null;
            this.lazySet(0x20);
            return object0;
        }
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.lazySet(8);
            return 2;
        }
        return 0;
    }

    public final boolean tryDispose() {
        return this.getAndSet(4) != 4;
    }
}

