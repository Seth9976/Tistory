package io.reactivex.internal.operators.single;

import dd.z;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class SingleTimer extends Single {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public SingleTimer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        z z0 = new z(singleObserver0, 1);
        singleObserver0.onSubscribe(z0);
        DisposableHelper.replace(z0, this.c.scheduleDirect(z0, this.a, this.b));
    }
}

