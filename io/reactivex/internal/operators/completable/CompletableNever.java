package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableNever extends Completable {
    public static final Completable INSTANCE;

    static {
        CompletableNever.INSTANCE = new CompletableNever();  // 初始化器: Lio/reactivex/Completable;-><init>()V
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        completableObserver0.onSubscribe(EmptyDisposable.NEVER);
    }
}

