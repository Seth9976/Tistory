package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public final class ConnectConsumer implements Consumer {
    public Disposable disposable;

    public void accept(Disposable disposable0) throws Exception {
        this.disposable = disposable0;
    }

    @Override  // io.reactivex.functions.Consumer
    public void accept(Object object0) throws Exception {
        this.accept(((Disposable)object0));
    }
}

