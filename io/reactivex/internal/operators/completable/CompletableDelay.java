package io.reactivex.internal.operators.completable;

import dd.j;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

public final class CompletableDelay extends Completable {
    public final CompletableSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public CompletableDelay(CompletableSource completableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        this.a = completableSource0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        j j0 = new j(completableObserver0, this.b, this.c, this.d, this.e);
        this.a.subscribe(j0);
    }
}

