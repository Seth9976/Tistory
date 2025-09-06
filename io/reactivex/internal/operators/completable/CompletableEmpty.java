package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableEmpty extends Completable {
    public static final Completable INSTANCE;

    static {
        CompletableEmpty.INSTANCE = new CompletableEmpty();  // 初始化器: Lio/reactivex/Completable;-><init>()V
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        EmptyDisposable.complete(completableObserver0);
    }
}

