package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import java.util.concurrent.TimeUnit;

public final class b extends Worker {
    public final ListCompositeDisposable a;
    public final CompositeDisposable b;
    public final ListCompositeDisposable c;
    public final d d;
    public volatile boolean e;

    public b(d d0) {
        this.d = d0;
        ListCompositeDisposable listCompositeDisposable0 = new ListCompositeDisposable();
        this.a = listCompositeDisposable0;
        CompositeDisposable compositeDisposable0 = new CompositeDisposable();
        this.b = compositeDisposable0;
        ListCompositeDisposable listCompositeDisposable1 = new ListCompositeDisposable();
        this.c = listCompositeDisposable1;
        listCompositeDisposable1.add(listCompositeDisposable0);
        listCompositeDisposable1.add(compositeDisposable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.e) {
            this.e = true;
            this.c.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0) {
        return this.e ? EmptyDisposable.INSTANCE : this.d.scheduleActual(runnable0, 0L, TimeUnit.MILLISECONDS, this.a);
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return this.e ? EmptyDisposable.INSTANCE : this.d.scheduleActual(runnable0, v, timeUnit0, this.b);
    }
}

