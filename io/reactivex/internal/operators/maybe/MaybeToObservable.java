package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

public final class MaybeToObservable extends Observable implements HasUpstreamMaybeSource {
    public final MaybeSource a;

    public MaybeToObservable(MaybeSource maybeSource0) {
        this.a = maybeSource0;
    }

    public static MaybeObserver create(Observer observer0) {
        return new i0(observer0);  // 初始化器: Lio/reactivex/internal/observers/DeferredScalarDisposable;-><init>(Lio/reactivex/Observer;)V
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        MaybeObserver maybeObserver0 = MaybeToObservable.create(observer0);
        this.a.subscribe(maybeObserver0);
    }
}

