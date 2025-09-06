package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class ObservableEmpty extends Observable implements ScalarCallable {
    public static final Observable INSTANCE;

    static {
        ObservableEmpty.INSTANCE = new ObservableEmpty();  // 初始化器: Lio/reactivex/Observable;-><init>()V
    }

    @Override  // io.reactivex.internal.fuseable.ScalarCallable
    public Object call() {
        return null;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        EmptyDisposable.complete(observer0);
    }
}

