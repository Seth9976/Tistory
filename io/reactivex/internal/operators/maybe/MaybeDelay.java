package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class MaybeDelay extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public MaybeDelay(MaybeSource maybeSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        super(maybeSource0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver0) {
        j j0 = new j(maybeObserver0, this.a, this.b, this.c);
        this.source.subscribe(j0);
    }
}

