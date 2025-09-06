package io.reactivex.internal.observers;

public final class BlockingLastObserver extends BlockingBaseObserver {
    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        this.a = null;
        this.b = throwable0;
        this.countDown();
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        this.a = object0;
    }
}

