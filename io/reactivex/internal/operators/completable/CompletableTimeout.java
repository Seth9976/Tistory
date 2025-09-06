package io.reactivex.internal.operators.completable;

import androidx.appcompat.view.menu.e;
import dd.y;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CompletableTimeout extends Completable {
    public final CompletableSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final CompletableSource e;

    public CompletableTimeout(CompletableSource completableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, CompletableSource completableSource1) {
        this.a = completableSource0;
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = completableSource1;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        completableObserver0.onSubscribe(compositeDisposable0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        e e0 = new e(1, this, atomicBoolean0, compositeDisposable0, completableObserver0);
        compositeDisposable0.add(this.d.scheduleDirect(e0, this.b, this.c));
        y y0 = new y(completableObserver0, compositeDisposable0, atomicBoolean0);
        this.a.subscribe(y0);
    }
}

