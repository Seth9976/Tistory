package io.reactivex.internal.schedulers;

import androidx.core.app.o;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public final class r extends u {
    public final Runnable a;
    public final long b;
    public final TimeUnit c;

    public r(Runnable runnable0, long v, TimeUnit timeUnit0) {
        this.a = runnable0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.internal.schedulers.u
    public final Disposable a(Worker scheduler$Worker0, CompletableObserver completableObserver0) {
        return scheduler$Worker0.schedule(new o(this.a, completableObserver0, false, 26), this.b, this.c);
    }
}

