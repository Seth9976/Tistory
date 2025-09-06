package io.reactivex.internal.observers;

public final class BlockingFirstObserver extends BlockingBaseObserver {
    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        if(this.a == null) {
            this.b = throwable0;
        }
        this.countDown();
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        if(this.a == null) {
            this.a = object0;
            this.c.dispose();
            this.countDown();
        }
    }
}

