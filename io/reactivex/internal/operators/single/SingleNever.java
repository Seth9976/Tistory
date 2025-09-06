package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class SingleNever extends Single {
    public static final Single INSTANCE;

    static {
        SingleNever.INSTANCE = new SingleNever();  // 初始化器: Lio/reactivex/Single;-><init>()V
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        singleObserver0.onSubscribe(EmptyDisposable.NEVER);
    }
}

