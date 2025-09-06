package io.reactivex.internal.operators.single;

import gd.m;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class SingleEquals extends Single {
    public final SingleSource a;
    public final SingleSource b;

    public SingleEquals(SingleSource singleSource0, SingleSource singleSource1) {
        this.a = singleSource0;
        this.b = singleSource1;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        AtomicInteger atomicInteger0 = new AtomicInteger();
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        singleObserver0.onSubscribe(compositeDisposable0);
        Object[] arr_object = {0, 0};
        m m0 = new m(0, compositeDisposable0, arr_object, singleObserver0, atomicInteger0);
        this.a.subscribe(m0);
        m m1 = new m(1, compositeDisposable0, arr_object, singleObserver0, atomicInteger0);
        this.b.subscribe(m1);
    }
}

