package io.reactivex.internal.operators.maybe;

import androidx.core.app.o;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class MaybeSubscribeOn extends a {
    public final Scheduler a;

    public MaybeSubscribeOn(MaybeSource maybeSource0, Scheduler scheduler0) {
        super(maybeSource0);
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        y y0 = new y(maybeObserver0, 2);
        maybeObserver0.onSubscribe(y0);
        o o0 = new o(24, y0, this.source);
        Disposable disposable0 = this.a.scheduleDirect(o0);
        ((SequentialDisposable)y0.c).replace(disposable0);
    }
}

