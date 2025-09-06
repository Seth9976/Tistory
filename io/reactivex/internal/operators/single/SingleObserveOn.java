package io.reactivex.internal.operators.single;

import gd.y;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleObserveOn extends Single {
    public final SingleSource a;
    public final Scheduler b;

    public SingleObserveOn(SingleSource singleSource0, Scheduler scheduler0) {
        this.a = singleSource0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        y y0 = new y(singleObserver0, this.b);
        this.a.subscribe(y0);
    }
}

