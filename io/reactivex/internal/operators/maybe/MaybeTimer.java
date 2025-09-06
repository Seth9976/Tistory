package io.reactivex.internal.operators.maybe;

import dd.z;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class MaybeTimer extends Maybe {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public MaybeTimer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        z z0 = new z(maybeObserver0, 2);
        maybeObserver0.onSubscribe(z0);
        DisposableHelper.replace(z0, this.c.scheduleDirect(z0, this.a, this.b));
    }
}

