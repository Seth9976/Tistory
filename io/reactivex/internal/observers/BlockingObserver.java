package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

public final class BlockingObserver extends AtomicReference implements Observer, Disposable {
    public static final Object TERMINATED;
    public final Queue a;

    static {
        BlockingObserver.TERMINATED = new Object();
    }

    public BlockingObserver(Queue queue0) {
        this.a = queue0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        if(DisposableHelper.dispose(this)) {
            this.a.offer(BlockingObserver.TERMINATED);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        Object object0 = NotificationLite.complete();
        this.a.offer(object0);
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        Object object0 = NotificationLite.error(throwable0);
        this.a.offer(object0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        this.a.offer(object0);
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.setOnce(this, disposable0);
    }
}

