package io.reactivex.internal.operators.observable;

import dd.z;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

public final class ObservableTimer extends Observable {
    public final Scheduler a;
    public final long b;
    public final TimeUnit c;

    public ObservableTimer(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        this.b = v;
        this.c = timeUnit0;
        this.a = scheduler0;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        z z0 = new z(observer0, 3);
        observer0.onSubscribe(z0);
        DisposableHelper.trySet(z0, this.a.scheduleDirect(z0, this.b, this.c));
    }
}

