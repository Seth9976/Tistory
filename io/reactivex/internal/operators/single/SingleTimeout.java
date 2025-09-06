package io.reactivex.internal.operators.single;

import gd.b0;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class SingleTimeout extends Single {
    public final SingleSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final SingleSource e;

    public SingleTimeout(SingleSource singleSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, SingleSource singleSource1) {
        this.a = singleSource0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = singleSource1;
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        b0 b00 = new b0(singleObserver0, this.e, this.b, this.c);
        singleObserver0.onSubscribe(b00);
        Disposable disposable0 = this.d.scheduleDirect(b00, this.b, this.c);
        DisposableHelper.replace(b00.b, disposable0);
        this.a.subscribe(b00);
    }
}

