package io.reactivex.internal.operators.single;

import gd.z;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class SingleSubscribeOn extends Single {
    public final SingleSource a;
    public final Scheduler b;

    public SingleSubscribeOn(SingleSource singleSource0, Scheduler scheduler0) {
        this.a = singleSource0;
        this.b = scheduler0;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        z z0 = new z(singleObserver0, this.a);
        singleObserver0.onSubscribe(z0);
        Disposable disposable0 = this.b.scheduleDirect(z0);
        ((SequentialDisposable)z0.c).replace(disposable0);
    }
}

