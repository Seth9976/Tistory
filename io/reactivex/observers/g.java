package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public enum g implements Observer {
    INSTANCE;

    @Override  // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
    }
}

