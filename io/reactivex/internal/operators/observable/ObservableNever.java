package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableNever extends Observable {
    public static final Observable INSTANCE;

    static {
        ObservableNever.INSTANCE = new ObservableNever();  // 初始化器: Lio/reactivex/Observable;-><init>()V
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        observer0.onSubscribe(EmptyDisposable.NEVER);
    }
}

