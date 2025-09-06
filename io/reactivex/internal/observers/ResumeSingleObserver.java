package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ResumeSingleObserver implements SingleObserver {
    public final AtomicReference a;
    public final SingleObserver b;

    public ResumeSingleObserver(AtomicReference atomicReference0, SingleObserver singleObserver0) {
        this.a = atomicReference0;
        this.b = singleObserver0;
    }

    @Override  // io.reactivex.SingleObserver
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable0) {
        DisposableHelper.replace(this.a, disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
        this.b.onSuccess(object0);
    }
}

