package kd;

import androidx.core.app.o;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.schedulers.TestScheduler;
import java.util.concurrent.TimeUnit;

public final class e extends Worker {
    public volatile boolean a;
    public final TestScheduler b;

    public e(TestScheduler testScheduler0) {
        this.b = testScheduler0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.a = true;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.a;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final long now(TimeUnit timeUnit0) {
        return this.b.now(timeUnit0);
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0) {
        if(this.a) {
            return EmptyDisposable.INSTANCE;
        }
        long v = this.b.d;
        this.b.d = v + 1L;
        f f0 = new f(this, 0L, runnable0, v);
        this.b.c.add(f0);
        return Disposables.fromRunnable(new o(this, f0, false, 29));
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        if(this.a) {
            return EmptyDisposable.INSTANCE;
        }
        long v1 = this.b.e;
        long v2 = timeUnit0.toNanos(v);
        long v3 = this.b.d;
        this.b.d = v3 + 1L;
        f f0 = new f(this, v2 + v1, runnable0, v3);
        this.b.c.add(f0);
        return Disposables.fromRunnable(new o(this, f0, false, 29));
    }
}

