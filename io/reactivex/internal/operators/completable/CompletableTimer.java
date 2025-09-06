package io.reactivex.internal.operators.completable;

import dd.z;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class CompletableTimer extends Completable {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public CompletableTimer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        z z0 = new z(completableObserver0, 0);
        completableObserver0.onSubscribe(z0);
        DisposableHelper.replace(z0, this.c.scheduleDirect(z0, this.a, this.b));
    }
}

