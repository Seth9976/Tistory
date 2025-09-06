package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class a0 extends BasicQueueDisposable implements CompletableObserver {
    public final Observer a;
    public Disposable b;

    public a0(Observer observer0) {
        this.a = observer0;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.b.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.b, disposable0)) {
            this.b = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        return v & 2;
    }
}

