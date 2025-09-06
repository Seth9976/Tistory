package io.reactivex.internal.operators.single;

import gd.z;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleUnsubscribeOn extends Single {
    public final SingleSource a;
    public final Scheduler b;

    public SingleUnsubscribeOn(SingleSource singleSource0, Scheduler scheduler0) {
        this.a = singleSource0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        z z0 = new z(singleObserver0, this.b);
        this.a.subscribe(z0);
    }
}

